package Player;////

////    Created     10/19/19, 12:43 PM
////    By:         Norberto Studios
////    
public class Movement
{
    double x, y;
    int angle;

    public Movement(double x, double y, int angle)
    {
        System.out.println("IMHH");
        this.x      = x;
        this.y      = y;
        this.angle  = angle;
    }

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

}
