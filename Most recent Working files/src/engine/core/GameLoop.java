package engine.core;////

import engine.cam.MainCamera;
import engine.entities.Player;
import engine.gameObjects.Collect;
import engine.input.InputManager;
import engine.level.TileMap;
import engine.math.Vector2D;
import engine.util.Assets;
import engine.util.Constants;
import engine.util.HUD;
import engine.util.Message;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

////    Created     12/15/19, 9:22 PM
////    By:         Norberto Studios
////    
public class GameLoop extends GameBase {


    private InputManager inputManager;

    private GameAction moveLeft;
    private GameAction moveRight;
    private GameAction moveDown;
    private GameAction moveUp;
    private GameAction jump;
    private GameAction exit;

    private TileMap map;

    private Player player;
    private HUD hud;
    private Collect collect;

    private ArrayList<Message> messages = new ArrayList<Message>();

    public GameLoop() {

    }

    private void initInput() {
        moveLeft = new GameAction("moveLeft");
        moveRight = new GameAction("moveRight");
        moveDown = new GameAction("moveDown");
        moveUp = new GameAction("moveUp");
        jump = new GameAction("jump", Constants.DETECT_INITIAL_PRESS_ONLY);
        exit = new GameAction("exit", Constants.DETECT_INITIAL_PRESS_ONLY);

        inputManager = new InputManager(Assets.screen.getFullScreenWindow());

        inputManager.mapToKey(moveLeft, KeyEvent.VK_LEFT);
        inputManager.mapToKey(moveRight, KeyEvent.VK_RIGHT);
        inputManager.mapToKey(moveDown, KeyEvent.VK_DOWN);
        inputManager.mapToKey(moveUp, KeyEvent.VK_UP);
        inputManager.mapToKey(jump, KeyEvent.VK_SPACE);
        inputManager.mapToKey(exit, KeyEvent.VK_ESCAPE);


        hud = new HUD();
        collect = new Collect();

        player = new Player(Assets.player, new Vector2D(640,400),new Vector2D());

    }

    private void checkInput() {
        if (exit.isPressed()) {
            System.out.println("I Have Pressed " + exit.getName());
            stop();
        }

//        if (player.isAlive()) {
        float velocityX = 0;

        if (velocityX == 0.0) {
        }

        if(moveDown.isPressed())
        {
            MainCamera.moveDown(2);
        }
        if(moveUp.isPressed())
        {
            MainCamera.moveUp(2);
        }
        if (moveLeft.isPressed()) {

            MainCamera.moveLeft(2);

        }
        if (moveRight.isPressed()) {

            MainCamera.moveRight(2);
        }

}


    @Override
    public void init() {

        map = Assets.map;
        initInput(); // init the game input

        Assets.screen.getFullScreenWindow().getGraphicsConfiguration();

    }

    @Override
    public void gameUpdate(long elapsed) {
        map.update();
        checkInput();

    }

    @Override
    public void gameDraw(Graphics2D g) {

        map.draw(g);
        hud.drawCollection(g);
        hud.drawScore(g);

        //collect.drawCollection(g);


        for (int i = 0; i < messages.size(); i++) {
            messages.get(i).draw(g);
        }

        player.draw(g);
    }


    public ArrayList<Message> getMessages() {
        return messages;
    }
}
