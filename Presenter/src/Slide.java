package smoothpresent;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class Slide {
    
    public ArrayList<Element> elements;
    
    public Slide(){
        elements = new ArrayList<>();
    }
    
    public void drawSlide(Graphics2D g){
        for(Element e : elements){
            e.think();
            e.draw(g);
        }
    }
}
