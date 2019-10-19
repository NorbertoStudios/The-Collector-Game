import javax.swing.*;

////    Created     10/19/19, 11:25 AM
////    By:         Norberto Studios
////    
public class RunGame
{
    public RunGame()
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UI.Window();
            }
        });
        System.out.println("Im Starting The Window Frame - RunGame");
    }
    public static void main(String[] args)
    {
        new RunGame();
    }
}
