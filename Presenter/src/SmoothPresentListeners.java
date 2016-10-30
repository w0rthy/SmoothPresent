package smoothpresent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static smoothpresent.SmoothPresent.*;

class SmoothPresentKeyListener implements KeyListener {

    public SmoothPresentKeyListener() {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
            SmoothPresent.frame.dispose();
            System.exit(0);
        }
        
        if(changingSlide)
            return;
        if(e.getKeyCode() == KeyEvent.VK_RIGHT && slide != slides.size()-1){
            changeSlide(slide+1);
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT && slide != 0){
            changeSlide(slide-1);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

}

class SmoothPresentMouseListener implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(changingSlide)
            return;
        if(e.getButton()==MouseEvent.BUTTON1 && slide != slides.size()-1){
            changeSlide(slide+1);
        }
        else if(e.getButton()==MouseEvent.BUTTON3 && slide != 0){
            changeSlide(slide-1);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}