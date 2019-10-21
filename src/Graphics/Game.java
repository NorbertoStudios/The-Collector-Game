package Graphics;////

import GameLogic.GameBase;
import Player.DemoPlayer;

import java.awt.*;

////    Created     10/19/19, 1:51 PM
////    By:         Norberto Studios
////    
public class Game extends GameBase
{

    DemoPlayer demoP = new DemoPlayer(100,20,2);;

    public void initialized()
    {


    }

    @Override
    public void inGameLoop()
    {

        if(pressed[UP])    demoP.moveForward(4);
        if(pressed[LT])    demoP.rotateLeft(4);
        if(pressed[RT])    demoP.rotateRight(4);
    }

    @Override
    public void paint(Graphics g)
    {
        demoP.draw(g);
    }


}
