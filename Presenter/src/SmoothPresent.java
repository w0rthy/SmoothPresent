package smoothpresent;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class SmoothPresent {

    public static JFrame frame;
    public static BufferedImage buff;
    public static Graphics2D bg;
    public static ArrayList<Slide> slides;
    public static int slide = 0;
    public static boolean changingSlide = false;
    public static int nextSlide = 0;
    public static int CHARLIMIT = 75;
    
    public static void main(String[] args) {
        Fonts.initializeFonts();
        
        frame = new JFrame(){
            @Override
            public void paint(Graphics g){
                paintFrame((Graphics2D)g);
            }
        };
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        buff = new BufferedImage(frame.getWidth(), frame.getHeight(), BufferedImage.TYPE_INT_ARGB);
        bg = (Graphics2D)buff.getGraphics();
        frame.setUndecorated(true);
        frame.setAlwaysOnTop(true);
        frame.addKeyListener(new SmoothPresentKeyListener());
        frame.addMouseListener(new SmoothPresentMouseListener());
        frame.setVisible(true);
        
        slides = new ArrayList<>();
        Slide splash = new Slide();
        splash.elements.add(new TextElement("Smooth Present", frame.getWidth()/2, frame.getHeight()/2, Fonts.fonts[1], Color.BLACK));
        splash.elements.get(0).reset();
        slides.add(splash);
        
        LoadPresentation("presentation.bin");
        
        Slide end = new Slide();
        end.elements.add(new EndElement());
        slides.add(end);
        
        new Thread(){
            @Override
            public void run(){
                while(true){
                    frame.repaint();
                    try{Thread.sleep(1000/60);}catch(Throwable t){}
                }
            }
        }.start();
        
    }

    public static void paintFrame(Graphics2D g){
        int cv = (int)(Math.abs(Math.sin(System.currentTimeMillis()/1000.0))*48)+207;
        Color bcol = new Color(cv,cv,cv);
        bg.setColor(bcol);
        bg.fillRect(0, 0, buff.getWidth(), buff.getHeight());
        slides.get(slide).drawSlide(bg);
        
        //int zm = (int)Math.abs(Math.round(Math.sin(System.currentTimeMillis()/1000.0)*buff.getWidth()/50));
        //int zm2 = (int)Math.round(zm/2.0);
        int zm = 0;
        int zm2 = 0;
        
        g.drawImage(buff, -zm2 ,-zm2, buff.getWidth()+zm, buff.getHeight()+zm, null);
    }
    
    public static void changeSlide(int s){
        nextSlide = s;
        changingSlide = true;
        for(Element e : slides.get(slide).elements)
            e.end();
        
        new Thread(){
            @Override
            public void run(){
                try{Thread.sleep(1000);}catch(Throwable e){}
                changingSlide = false;
                for(Element e : slides.get(nextSlide).elements)
                    e.reset();
                slide = nextSlide;
            }
        }.start();
    }

    private static void LoadPresentation(String f) {
        try{
            EnhancedInputStream eis = new EnhancedInputStream(new FileInputStream(new File(f)));
            int numslides = eis.readCmpInt();
            for(int i = 1; i <= numslides; i++){
                Slide s = new Slide();
                int numelements = eis.readCmpInt();
                while(numelements > 0){
                    byte type = eis.readByte();
                    if(type == 0)//TEXT ELEMENT
                        AddTextElement(s, eis.readString(),
                                (int)(eis.readCmpFloat()*frame.getWidth()),
                                (int)(eis.readCmpFloat()*frame.getHeight()),
                                Fonts.fonts[eis.read()],
                                new Color(eis.read(),eis.read(),eis.read()));
                    else if(type == 1)//IMAGE ELEMENT
                        AddImageElement(s, eis.readString(),
                                (int)(eis.readCmpFloat()*frame.getWidth()),
                                (int)(eis.readCmpFloat()*frame.getHeight()),
                                (int)(eis.readCmpFloat()*frame.getWidth()),
                                (int)(eis.readCmpFloat()*frame.getWidth()));
                    numelements--;
                }
                slides.add(s);
            }
            
            eis.close();
        }catch(Exception t){t.printStackTrace();}
    }

    private static void AddTextElement(Slide s, String str, int x, int y, Font f, Color col) {
        int co = 0;
        int c = 0;
        int ca = 0;
        FontMetrics fm = new FontMetrics(f) {};
        for(int i = 0; i < str.length(); i++){
            c++;
            if(str.charAt(i) == '\n'){
                c=0;
                s.elements.add(new TextElement(str.substring(ca, i), x, y+co*(fm.getHeight()+4), f, col));
                
                ca = i+1;
                co++;
            }
            else if(c%CHARLIMIT==CHARLIMIT-1){
                c=0;
                for(int j = i; j > 0; j--)
                    if(str.charAt(j)==' '){
                        s.elements.add(new TextElement(str.substring(ca, j), x, y+co*(fm.getHeight()+4), f, col));
                        i = j+1;
                        ca = j+1;
                        co++;
                        break;
                    }
            }
        }
        s.elements.add(new TextElement(str.substring(ca), x, y+co*(fm.getHeight()+4), f, col));
        
    }

    private static void AddImageElement(Slide s, String readString, int x, int y, int w, int h) throws Exception {
        s.elements.add(new ImageElement(ImageIO.read(new File(readString)),x,y,w,h));
    }
    
}
