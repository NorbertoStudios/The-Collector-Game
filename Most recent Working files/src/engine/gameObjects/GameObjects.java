package engine.gameObjects;////

import engine.math.Vector2D;

import java.awt.*;

////    Created     12/15/19, 10:15 PM
////    By:         Norberto Studios
////    
public abstract class GameObjects
{
    protected Vector2D position;  // in pixels

    public abstract void update(long elapsedTime);
    public abstract void draw(Graphics2D g);

    public GameObjects(Vector2D position)
    {
        this.position = position;
    }

    public Vector2D getPosition()
    {
        return position;
    }
    public void setPosition(Vector2D position)
    {
        this.position = position;
    }

    public Vector2D getCenter()
    {
        return new Vector2D(position.getX()/2, position.getY()/2);
    }
}
