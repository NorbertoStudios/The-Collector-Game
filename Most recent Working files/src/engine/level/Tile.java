package engine.level;////

import engine.cam.MainCamera;
import engine.math.Vector2D;
import engine.util.Assets;

import java.awt.*;
import java.util.ArrayList;

////    Created     12/15/19, 9:30 PM
////    By:         Norberto Studios
////    
public class Tile {
    public static Vector2D position;
    public int id;

    private int[][] map; // to layout the mapGrid

    public Tile(int x, int y, int id) {

        map = new int[Assets.mapData.length][Assets.mapData[0].length];
        position = new Vector2D(x, y);
        this.id = id;

//        System.out.println(rect);
    }

    // Collision

    public static Rectangle getBounds() {
        return new Rectangle((int)position.getX() * 32, (int)position.getY() * 32, 128, 128);
    }


    public void draw(Graphics2D g) {

        getBounds();
        g.drawImage(Assets.mapHashMap.get(id - 1),
                (int) position.getX() * 32 - MainCamera.x,
                (int) position.getY() * 32 - MainCamera.y,
                null);
        // g.drawRect((int)position.getX() * 64, (int)position.getY() * 64, 128, 128);
        // g.drawRect(getBounds().x,getBounds().y,getBounds().width,getBounds().height);
    }
}
