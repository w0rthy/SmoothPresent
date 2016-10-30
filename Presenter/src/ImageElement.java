package smoothpresent;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import static smoothpresent.SmoothPresent.frame;

class ImageElement implements Element {

    public BufferedImage img;
    public int x, y, w, h;
    private double tx, ty;
    private double ax, ay;

    public ImageElement(BufferedImage image, int xx, int yy, int ww, int hh){
        img = image;
        x = xx;
        y = yy;
        w = ww;
        h = hh;
    }
    
    @Override
    public void think() {
        if(Math.abs((int)ax - tx) > 2  || Math.abs((int)ay - ty) > 2){
            double dist = Math.sqrt(Math.pow(ax-tx, 2.0)+Math.pow(ay-ty, 2.0));
            double ang = Math.atan2(ty-ay, tx-ax);
            double vel = Math.pow(dist,0.5);
            ax += Math.cos(ang)*vel;
            ay += Math.sin(ang)*vel;
        }else{
            ax = tx;
            ay = ty;
        }
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.drawImage(img, (int)ax, (int)ay, w, h, null);
    }
    
    @Override
    public void end(){
        tx = (Math.random()-0.5)*2*500;
        if(tx >= 0)
            tx+=frame.getWidth();
        else
            tx-=frame.getWidth();
        
        ty = (Math.random()-0.5)*2*500;
        if(ty >= 0)
            ty+=frame.getWidth();
        else
            ty-=frame.getWidth();
    }

    @Override
    public void reset() {
        tx = x;
        ty = y;
        ax = (Math.random()-0.5)*2*500;
        if(ax >= 0)
            ax+=frame.getWidth();
        else
            ax-=frame.getWidth();
        
        ay = (Math.random()-0.5)*2*500;
        if(ay >= 0)
            ay+=frame.getWidth();
        else
            ay-=frame.getWidth();
    }
}
