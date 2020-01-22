package engine.entities;////

import engine.cam.MainCamera;
import engine.math.Vector2D;

import java.awt.*;
import java.awt.image.BufferedImage;

////    Created     12/15/19, 10:21 PM
////    By:         Norberto Studios
////    
public class Player extends Creature
{

    public Player(BufferedImage texture, Vector2D position, Vector2D velocity) {

        super(texture, position, velocity);
        MainCamera.setValues((int)position.getX(),(int)position.getY());
    }

    @Override
    public void update(long elapsedTime) {

    }

    @Override
    public void draw(Graphics2D g) {

        g.drawImage(texture,(int)position.getX(), (int)position.getY(),32,32, null);
    }


    public Rectangle getBounds() {
        return new Rectangle((int) position.getX() + texture.getWidth() / 4,
                (int) position.getY() + 30,
                texture.getWidth() / 2,
                100);
    }

}
