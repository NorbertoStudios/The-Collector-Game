package GameLogic;////

import javax.swing.*;
import java.awt.event.*;

////    Created     10/19/19, 11:28 AM
////    By:         Norberto Studios
////    
public abstract class GameBase extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener
{
    public boolean[] pressed = new boolean[1024];

    protected abstract void inGameLoop();
    protected abstract void initialized();

    private Thread t;

    public static final int UP = KeyEvent.VK_UP;
    public static final int DN = KeyEvent.VK_DOWN;
    public static final int LT = KeyEvent.VK_LEFT;
    public static final int RT = KeyEvent.VK_RIGHT;



    public GameBase()
    {
        initialized();

        requestFocus();
        this.setFocusable(true);

        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);

        t = new Thread(this);
        t.start();
    }

    @Override
    public void run()
    {
        while(true)
        {
            inGameLoop();

            repaint();

            try {
                t.sleep(16);
            } catch (Exception o) {
            }

        }
    }

    @Override
    public void keyTyped(KeyEvent e)            {}
    @Override
    public void keyPressed(KeyEvent e)          { pressed[e.getKeyCode()] = true; }
    @Override
    public void keyReleased(KeyEvent e)         { pressed[e.getKeyCode()] = false; }
    @Override
    public void mouseClicked(MouseEvent e)      {}
    @Override
    public void mousePressed(MouseEvent e)      {}
    @Override
    public void mouseReleased(MouseEvent e)     {}
    @Override
    public void mouseEntered(MouseEvent e)      {}
    @Override
    public void mouseExited(MouseEvent e)       {}
    @Override
    public void mouseDragged(MouseEvent e)      {}
    @Override
    public void mouseMoved(MouseEvent e)        {}
}
