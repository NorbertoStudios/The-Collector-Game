package engine.math;////

////    Created     12/15/19, 9:30 PM
////    By:         Norberto Studios
////    
public class Vector2D
{
    private double x;
    private double y;

    // The Zero vector
    public Vector2D()
    {
        x = 0;
        y = 0;
    }

    public Vector2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Vector2D add(Vector2D other)
    {
        return new Vector2D(x + other.getX(), y + other.getY());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
