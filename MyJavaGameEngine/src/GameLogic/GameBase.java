package GameLogic;////

import java.awt.event.*;

////    Created     10/19/19, 11:28 AM
////    By:         Norberto Studios
////    
public abstract class GameBase implements Runnable, KeyListener, MouseListener, MouseMotionListener
{
    protected abstract void inGameLoop();
    protected abstract void initialized();

    private Thread t;

    public boolean[] pressed = new boolean[1024];

    public GameBase()
    {
        initialized();

        t = new Thread(this);
        t.start();
    }

    public void run()
    {
        while(true)
        {
            inGameLoop();

            //repaint();

            try {
                t.sleep(16);
            } catch (Exception o) {
            }

        }
    }

    public void keyTyped(KeyEvent e)            {}
    public void keyPressed(KeyEvent e)          { pressed[e.getKeyCode()] = true;  }
    public void keyReleased(KeyEvent e)         { pressed[e.getKeyCode()] = false; }

    public void mouseClicked(MouseEvent e)      {}
    public void mousePressed(MouseEvent e)      {}
    public void mouseReleased(MouseEvent e)     {}
    public void mouseEntered(MouseEvent e)      {}
    public void mouseExited(MouseEvent e)       {}
    public void mouseDragged(MouseEvent e)      {}
    public void mouseMoved(MouseEvent e)        {}
}
