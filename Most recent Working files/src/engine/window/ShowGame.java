package engine.window;////

import engine.core.GameLoop;

import javax.swing.*;

////    Created     12/15/19, 8:45 PM
////    By:         Norberto Studios
////    
public class ShowGame
{
    public ShowGame()
    {
        SwingUtilities.invokeLater(()->
        {
            new GameLoop();
        });

    }
//
//    public static void main(String[] args) {
//        new ShowGame();
//    }
}
