package smoothpresent;

import java.awt.Graphics2D;
import static smoothpresent.SmoothPresent.*;

class EndElement implements Element {

    public double size = 0;
    
    public EndElement() {
        
    }

    @Override
    public void end() {
        
    }

    @Override
    public void reset() {
        size = 0.0;
    }

    @Override
    public void think() {
        size = size+4;
    }

    @Override
    public void draw(Graphics2D g) {
        g.fillOval(frame.getWidth()/2-(int)(size/2.0), frame.getHeight()/2-(int)(size/2.0), (int)(size), (int)size);
    }

}
