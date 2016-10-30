package smoothpresent;

import java.awt.Graphics2D;

interface Element {
    
    abstract void end();
    abstract void reset();
    abstract void think();
    abstract void draw(Graphics2D g);
}
