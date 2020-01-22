package engine.level;////

import engine.cam.MainCamera;

import java.awt.*;
import java.util.ArrayList;

////    Created     12/15/19, 9:45 PM
////    By:         Norberto Studios
////    
public class TileMap {
    private static int[][] map; // to layout the mapGrid

    private static int index = 0; // index to access the images in the sprite Sheet

    private int xStart, xEnd, yStart, yEnd;

    public Tile tile;

    public static Rectangle rect;

    public static ArrayList<Rectangle> rectangleArrayList;

    // Constructor #2
    public TileMap(int[][] existingMap) {

        rectangleArrayList = new ArrayList<>();
        map = new int[existingMap.length][existingMap[0].length];

        tile = new Tile(0, 0, 0);

        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                map[y][x] = existingMap[y][x];

                index = map[y][x];

                if (index != 0) {
                    rectangleArrayList.add(new Rectangle(x * 32 - MainCamera.x, y * 32 - MainCamera.y, 128, 128));
                }
            }
        }
    }

    public void update() {

        xStart = Math.max(0, MainCamera.x / 32 - 2);
        xEnd = Math.min(1600, (MainCamera.x + 1280) / 32 +2);
        yStart = Math.max(0, MainCamera.y / 32 - 2);
        yEnd = Math.min(1600, (MainCamera.y + 800) / 32 + 2);

        if (xEnd >= 50) {
            xEnd = map.length;
        }
        if (yEnd >= map.length) {
            yEnd = map.length;
        }

    }


    public void draw(Graphics2D g) {

        for (int y = yStart; y < yEnd; y++) {
            for (int x = xStart; x < xEnd; x++) {

                index = map[y][x];

                if (index != 0) {
                    tile = new Tile(x, y, index);
//                    tile.update();
                    tile.draw(g);

                }
            }
        }

//        for (int i = 0; i < rectangleArrayList.size(); i++) {
//            g.drawRect(rectangleArrayList.get(i).x - MainCamera.x, rectangleArrayList.get(i).y - MainCamera.y,
//                    rectangleArrayList.get(i).width,
//                    rectangleArrayList.get(i).height);
//        }
    }

}


