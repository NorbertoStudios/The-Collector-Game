package menu;

import engine.core.GameBase;
import engine.core.GameLoop;
import engine.graphics.ScreenManager;
import engine.util.Assets;
import engine.util.Constants;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class IntroductionScreen implements Runnable {

    private JPanel contentPane;

    //Splash Screen Timer
    long amountOfTime = System.currentTimeMillis();



    Thread t;
    boolean runn;


    public IntroductionScreen() {

        Assets.init(); // Init the game assets
        initDisplay();


        t = new Thread(this);
        t.start();


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

    public void run() {
        runn = true;


        while (runn) {

            Graphics2D g = Assets.screen.getGraphics();

            ////// THis is where we have to draw the backGround
            //g.clearRect(0, 0, Assets.screen.getWidth(), Assets.screen.getHeight());
            g.fillRect(0,0,Assets.screen.getWidth(),Assets.screen.getHeight());
            g.drawImage(new ImageIcon(this.getClass().getResource("/Images/treasure04.gif")).getImage(),
                    Assets.screen.getWidth()/4, -100,700,700,null);

            g.fillRect(Assets.screen.getWidth()/4, 500,Assets.screen.getWidth(),194);
            g.drawImage(new ImageIcon(this.getClass().getResource("/Images/The Collector White.png")).getImage(),
                    Assets.screen.getWidth()/4, 500,640,194,null);

//            Assets.screen.getFullScreenWindow().setForeground(Color.BLACK);
            //////

            g.dispose();
            Assets.screen.update();


            if (System.currentTimeMillis() - amountOfTime > 5000) {

                System.out.println("IM DONE");

                new startMenu();

                Assets.screen.restoreScreen();

//                try {
                runn = false;
//
//                } finally {
//                    System.out.println("Im Stoping Everything");
//
//                    System.exit(0);
//                }



//                GameLoop.stop();

                // call method able to Start the Screen in other to run SplashScreen

            }
        }

    }

    public static void main(String[] args) {

        IntroductionScreen frame = new IntroductionScreen();
    }
}

