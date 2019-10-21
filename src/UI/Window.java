package UI;////

import Graphics.Game;

import javax.swing.*;

////    Created     10/19/19, 11:39 AM
////    By:         Norberto Studios
////    
public class Window extends JFrame
{
    public Window()
    {
        setTitle("Game Window");
        setSize(900,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        add(new Game());

    }

}
