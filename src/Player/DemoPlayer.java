package Player;////

import java.awt.*;

////    Created     10/19/19, 12:31 PM
////    By:         Norberto Studios
////    
public class DemoPlayer
{
    double x,y;
    int angle;
    Graphics g2d;

    private final static int[] ybody = {20, -20, -20, 20};
    private final static int[] xbody = {35, 35, -35, -35};

    private int[] xp = new int[4];
    private int[] yp = new int[4];

    public DemoPlayer(double x, double y, int angle)
    {
        this.x = x;
        this.y = y;
        this.angle = angle;
    }


    ////// movement

    public void rotateLeft(int dAngle)
    {
        angle -= dAngle;
        if(angle < 0) {
            angle += 360;
        }
    }
    public void rotateRight(int dAngle)
    {
        angle += dAngle;
        if(angle >= 360) {
            angle -= 360;
        }
    }
    public void moveForward(int distance)
    {
        double radians = angle * Math.PI/180;

        double dx = distance * Math.cos(radians);
        double dy = distance * Math.sin(radians);

        x += dx;
        y += dy;
    }

    private void drawing(int[] xa, int[] yb)
    {
        double radians = angle * 3.14/180;

        double cos = Math.cos(radians);
        double sin = Math.sin(radians);

        for (int i = 0; i < 4; i++)
        {
            xp[i] =  (int)((xa[i] * cos - yb[i] * sin) + x);
            yp[i] =  (int)((yb[i] * cos + xa[i] * sin) + y);
        }
        g2d.drawPolygon(xp, yp, 4);
    }

    public void draw(Graphics g)
    {
        g2d = g;

        drawing(xbody, ybody);
    }

}
