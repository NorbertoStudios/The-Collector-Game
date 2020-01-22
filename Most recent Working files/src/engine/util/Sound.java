package engine.util;////

import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

////    Created     10/30/19, 5:13 PM
////    By:         Norberto Studios
////    
public class Sound
{
    private Clip clip;

    private FloatControl volume;


    public Sound(Clip clip)
    {
        this.clip = clip;
        volume = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
    }

    public void play()
    {
        clip.setFramePosition(0);
        clip.start();
    }

    public void loop()
    {
        clip.setFramePosition(0);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop()
    {
        clip.stop();
    }

    public void changeVolume(float value)
    {
        volume.setValue(value);
    }

    public int getFramePosition()
    {
        return clip.getFramePosition();
    }


}
