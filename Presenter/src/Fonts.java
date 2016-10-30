package smoothpresent;

import java.awt.Font;
import java.awt.Toolkit;

abstract class Fonts {

    public static Font[] fonts;
    private static float ratio;
    
    private static int scale(int a){
        return (int)(a*ratio);
    }
    
    public static void initializeFonts(){
        ratio = Toolkit.getDefaultToolkit().getScreenSize().width/1080.0f;
        fonts = new Font[10];
        fonts[0] = new Font(Font.SANS_SERIF, Font.PLAIN, scale(16));//DEFAULT
        fonts[1] = new Font(Font.SANS_SERIF, Font.BOLD, scale(56));//TITLE/SPLASH
    }
    
}
