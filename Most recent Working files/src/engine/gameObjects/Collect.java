package engine.gameObjects;////

import engine.math.Vector2D;
import engine.util.Assets;
import engine.util.Loader;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

////    Created     12/19/19, 3:30 PM
////    By:         Norberto Studios
////    
public class Collect
{

    public void drawCollection(Graphics g) {
        Vector2D collectionPos = new Vector2D(25, 250);

        Vector2D pos = new Vector2D(collectionPos.getX(), collectionPos.getY());

        for (int i = 0; i < 14; i++) {



//            if(number <= 0)
//            {
//                break;
//            }
//            g.drawImage(Assets.treasure.get(i),
//                    (int) pos.getX() + 130,
//                    (int) pos.getY() + 5, null);
//            pos.setX(pos.getX() + 20);
        }


    }







}
