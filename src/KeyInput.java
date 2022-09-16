import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.Timer;

public class KeyInput implements KeyListener {

    Panel p;

    boolean restart = true;

    public KeyInput(Panel p){
        this.p = p;
    }

    public KeyInput() {
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_ENTER){
            Timer timer = new Timer(20, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    p.search();
                }
            });

            timer.start();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

}