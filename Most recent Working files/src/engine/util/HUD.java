package engine.util;////

import engine.core.GameLoop;
import engine.math.Vector2D;

import java.awt.*;

////    Created     10/30/19, 8:56 AM
////    By:         Norberto Studios
////    
public class HUD {
    private int score = 0;
    private int Collection = 0;


    public void addScore(int value, Vector2D position, GameLoop gameState) {
        gameState.getMessages().add(new Message(position, true,
                "+"+value+" score", Color.WHITE, false
        , Assets.fontMed,gameState));
        score += value;
    }

    public void addCollection(int value) {
        Collection += value;
    }

    public int getCollection() {
        return Collection;
    }

    public void delCollection() {
        Collection--;
    }

    public void drawCollection(Graphics g) {
        Vector2D collectionPos = new Vector2D(25, 25);

        g.drawImage(Assets.playerJewls, (int) collectionPos.getX(), (int) collectionPos.getY(), null);

        g.drawImage(Assets.numerals[10], (int) collectionPos.getX() + 80, (int) collectionPos.getY() +5, null);

        String livesToString = Integer.toString(Collection);

        Vector2D pos = new Vector2D(collectionPos.getX(), collectionPos.getY());

        for (int i = 0; i < livesToString.length(); i++) {

           int number = Integer.parseInt(livesToString.substring(i,i +1));

           if(number <= 0)
           {
               break;
           }
            g.drawImage(Assets.numerals[number],
                    (int) pos.getX() + 130, (int) pos.getY() + 5, null);
            pos.setX(pos.getX() + 20);
        }


    }

    public void drawScore(Graphics g) {

        Vector2D pos = new Vector2D(1024, 25);

//        g.setColor(Color.WHITE);
        g.setFont(Assets.fontBig);
        g.drawString("SCORE",(int)pos.getX()- 180,120);
//        g.setColor(Color.BLACK);

        String scoreToString = Integer.toString(score);

        for (int i = 0; i < scoreToString.length(); i++) {
            g.drawImage(Assets.numerals[Integer.parseInt(scoreToString.substring(i, i + 1))],
                    (int) pos.getX(), (int) pos.getY(), null);
            pos.setX(pos.getX() + 20);
        }
    }

}
