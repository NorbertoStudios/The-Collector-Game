import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;



public class IntroductionScreen extends JFrame implements Runnable{

	private JPanel contentPane;
	
	
	
//////////////////////////////////////////////////////
//Splash Screen Timer
	long amountOfTime = System.currentTimeMillis();

	Thread t;
	boolean runn; 

		
	
	public IntroductionScreen() {
		
		//System.out.print("IMMMMMMMMM RUNNING!!");
		
		t = new Thread(this);
		t.start();
		
		
		setSize(1280, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JTextPane gameTitle = new JTextPane();
		gameTitle.setLocation(new Point(1280/3,800/3)); ///CHANGE TO DEFAULT WIDTH AND H.
		gameTitle.setFont(new Font("Sitka Subheading", Font.BOLD, 50));
		gameTitle.setText("THE RIDE SHARE");
		
		JLabel introScreenLabel = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/introScreenBg.jpg")).getImage();
		introScreenLabel.setIcon(new ImageIcon(img));
		introScreenLabel.setSize(1280,800);
		introScreenLabel.setLocation(0,0);
		contentPane.add(introScreenLabel);
		
		
		gameTitle.setBackground(new Color(0, 0, 139));
		gameTitle.setSize(1280/4,800/2);  // Width/4 and H/2 to centerl Title
		contentPane.add(gameTitle);
		contentPane.setVisible(true);
		
		setVisible(true);
		
		
		

	}
	
	
	public void run()
	{
		runn = true;
		
		while(runn)
		{
				if(System.currentTimeMillis() - amountOfTime > 3000)
				{
					System.out.println("IM DONE");
					runn = false;

					
	//				new DisplayGame().start();  
					
					// call method able to Start the Screen in other to run SplashScreen
					
					
					setVisible(false);
					
				}
		
			System.out.println(System.currentTimeMillis() - amountOfTime + " Current TIme");
			
			
		}

	}
//	public static void main(String[] args) {
//		
//					IntroductionScreen frame = new IntroductionScreen();
//					frame.setVisible(true);
//	}
}

