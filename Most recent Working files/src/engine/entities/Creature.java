package engine.entities;////

import engine.gameObjects.GameObjects;
import engine.math.Vector2D;

import java.awt.*;
import java.awt.image.BufferedImage;

////    Created     12/15/19, 10:22 PM
////    By:         Norberto Studios
////    
public abstract class Creature extends GameObjects {

//    public Creature(Vector2D position) {
//        super(position);
//    }

    protected BufferedImage texture;
    protected Vector2D velocity;  // velocity (pixels per Milliseconds)

    protected double maxVelocity;

    protected int width;
    protected int height;

    public Creature(BufferedImage texture, Vector2D position, Vector2D velocity) {
        super(position);
        this.texture = texture;
        this.velocity = velocity;

        width = texture.getWidth();
        height = texture.getHeight();
    }

    @Override
    public void update(long elapsedTime) {

        position.setX(position.getX() + velocity.getX() * elapsedTime);
        position.setY(position.getY() + velocity.getY() * elapsedTime);

    }


    public Vector2D getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }

    // get current Sprite Image
    public BufferedImage getTexture() {
        return texture;
    }


}
