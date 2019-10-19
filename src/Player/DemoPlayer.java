package Player;////

import java.awt.*;

////    Created     10/19/19, 12:31 PM
////    By:         Norberto Studios
////    
public class DemoPlayer
{
    int x,y;

    public DemoPlayer(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g)
    {
        g.drawRect(x,y,50,100);
    }
}
