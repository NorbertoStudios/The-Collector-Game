package engine.util;////

import engine.graphics.ScreenManager;
import engine.level.TileManager;
import engine.level.TileMap;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

////    Created     12/15/19, 9:30 PM
////    By:         Norberto Studios
////    
public class Assets
{
    public static ScreenManager screen;

    public static BufferedImage introductionScreen;
    public static ImageIcon introductionScreenIcon;
    public static Image introductionScreenI;

    private static BufferedImage playerSheet;

    public static BufferedImage player;

    private static CropSpriteSheet playerCropSpriteSheet, mapCropSpriteSheet;

    public static HashMap<Integer, BufferedImage> playerHashMap, mapHashMap;


    private static BufferedImage mapTileSheet;

    private static TileManager mapManager;
    private static File tileMapXml;

    public static int[][] mapData;
    public static int mapTileSize;

    public static TileMap map;

    //Sounds
    public static Clip backgroundMusic, chooseYourCar;

    // HUD
    // HUD

    public static BufferedImage playerJewls;
    public static BufferedImage[] numerals = new BufferedImage[11];

    //Font
    public static Font fontBig;
    public static Font fontMed;


//    public static ArrayList<BufferedImage> treasure = new ArrayList<>();
//
//    public static BufferedImage[] treasureImage = new BufferedImage[15];


    /////////////////-INIT-CONSTRUCTOR-///////////////////////////

    public static void init()
    {

        ///??// Map ///???///

        mapTileSheet = Loader.ImageLoader("/SpriteSheet/mapSpriteSheet.png");

        tileMapXml = Loader.FileLoader("Resources/Map/Level.tmx"); // Get the xml file
        mapManager = new TileManager(tileMapXml);

        mapData = mapManager.getMapData(); // save the xml file data for use
        mapTileSize = mapManager.getMapTileSize(); // save the xml tile size from file data  // redundant *****

        mapCropSpriteSheet = new CropSpriteSheet(mapTileSheet, 128);
        mapHashMap = mapCropSpriteSheet.cropSpriteHashMap();

        map = new TileMap(mapData);

        ////--/// Player ///////////

//        playerSheet = Loader.ImageLoader("/SpriteSheets/Player.png");
//        playerCropSpriteSheet = new CropSpriteSheet(playerSheet, 64);
//
//        playerHashMap = playerCropSpriteSheet.cropSpriteHashMap();
//        player = playerHashMap.get(0);
        // Player needs a sprite sheet
        player = Loader.ImageLoader("/Images/carRed2_006.png");

        introductionScreen = Loader.ImageLoader("/Images/treasure04.gif");
        introductionScreenIcon = new ImageIcon("/Images/treasure04.gif", null);
//        introductionScreenI = new ImageIcon(this.getClass().getResource("/Images/playBtt.png")).getImage();

        // Sound
        backgroundMusic = Loader.loadClip("/Sounds/Loop/music.midi");
        chooseYourCar = Loader.loadClip("/Sounds/VFX/ChooseYourCar.wav");
        //chooseYourCar = Loader.loadClip("/Sounds/VFX/ChooseYourCar.wav");


        ///

        playerJewls = Loader.ImageLoader("/Images/hudJewel_blue.png");

        // letters
        for (int i = 0; i < numerals.length; i++) {
            numerals[i] = Loader.ImageLoader("/Images/numbers/hud" + (i) + ".png");

        }

        // font
        fontBig = Loader.loadFont("/Fonts/kenvector_future.ttf", 42);
        fontMed = Loader.loadFont("/Fonts/kenvector_future.ttf", 20);



//        for (int i = 0; i < treasureImage.length; i++) {
//
////            System.out.println("treasure0"+(i+1));
//            int x = i+1;
//              treasureImage[i] = Loader.ImageLoader("/Images/treasuregifs/treasure0" + (x) + ".gif");
//
//            //  treasure.add(treasureImage[i]);
//
//        }


        System.out.println("****** Assets Loaded Completed ******");
    }
}
