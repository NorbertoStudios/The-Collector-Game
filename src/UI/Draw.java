package UI;////

import Player.*;

import javax.swing.*;
import java.awt.*;

////    Created     10/19/19, 12:18 PM
////    By:         Norberto Studios
////    
public class Draw extends JPanel
{
    DemoPlayer demoP;

    public Draw()
    {
        setBackground(Color.lightGray);
        demoP = new DemoPlayer(20,20);

    }


    public void paint(Graphics g)
    {
        demoP.draw(g);
    }

}
