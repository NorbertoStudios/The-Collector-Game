package engine.util;////

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

////    Created     12/15/19, 9:29 PM
////    By:         Norberto Studios
////    
public class Loader
{
    public static BufferedImage ImageLoader(String path)
    {
        try {
            return ImageIO.read(Loader.class.getResource(path));
        }catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("ImageLoader Image Not Found");
        }
        return null;
    }

    public static File FileLoader(String path)
    {
        try {
            return new File(path);
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("FileLoader File Not Found");
        }
        return null;
    }

    public static Font loadFont(String path, int size) {
        try {
            return Font.createFont(Font.TRUETYPE_FONT, Loader.class.getResourceAsStream(path)).deriveFont(Font.PLAIN, size);
        } catch (IOException | FontFormatException o) {
            o.printStackTrace();
            return null;
        }

    }

    public static Clip loadClip(String path) {

        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Loader.class.getResource(path)));
            return clip;
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
        return null;
    }

}
