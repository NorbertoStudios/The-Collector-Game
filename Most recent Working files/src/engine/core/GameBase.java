package engine.core;////

import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import engine.graphics.*;
import engine.util.Assets;
import engine.util.Constants;

////    Created     12/15/19, 8:57 PM
////    By:         Norberto Studios
////    
public abstract class GameBase implements Runnable {
    public abstract void init();

    public abstract void gameUpdate(long elapsed);

    public abstract void gameDraw(Graphics2D g);

    Thread t;
    private volatile boolean running;



    public GameBase() {

        initDisplay();
        init();
        start();
    }



    public void start() {
        t = new Thread(this);
        t.start();
    }


    public void run() {
        System.out.println("Thread Started");

        long startTime = System.currentTimeMillis();
        long currTime = startTime;

        running = true;

        while (running) {
//
            long elapsedTime = System.currentTimeMillis() - currTime;
            currTime += elapsedTime;

            gameUpdate(elapsedTime);

            Graphics2D g = Assets.screen.getGraphics();

            ////// THis is where we have to draw the backGround
          //  g.clearRect(0, 0, Assets.screen.getWidth(), Assets.screen.getHeight());
            g.setColor(Color.white);
            g.fillRect(0,0,Assets.screen.getWidth(),Assets.screen.getHeight());
            g.setColor(Color.BLACK);
            //////

            gameDraw(g);
            g.dispose();
            Assets.screen.update();

        }
    }

    public void initDisplay() {
        Assets.screen = new ScreenManager();
        DisplayMode displayMode = Assets.screen.findFirstCompatibleMode(Constants.POSSIBLE_MODES);
        Assets.screen.setFullScreen(displayMode);

        Window window = Assets.screen.getFullScreenWindow();
        window.setFont(new Font("Dialog", Font.PLAIN, 240));
        window.setBackground(Color.BLUE);
//        window.setForeground(new Color(255, 255, 255));
        window.setForeground(new Color(0, 0, 0));
    }


    public void stop() {

        try {
            running = false;
        } finally {
            System.out.println("Im Stoping Everything");
            Assets.screen.restoreScreen();
            System.exit(0);
        }
    }

}
