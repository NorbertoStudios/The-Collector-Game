package menu;




import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class LoadingScreen extends JFrame implements Runnable{

	private JPanel contentPane;



	//////////////////////////////////////////////////////
//Splash Screen Timer
	long amountOfTime = System.currentTimeMillis();

	Thread t;
	boolean runn;



	public LoadingScreen() {

		//System.out.print("IMMMMMMMMM RUNNING!!");

		t = new Thread(this);
		t.start();


		setSize(1280, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255 ));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);



		JLabel gameTitle = new JLabel();
		gameTitle.setLocation(500,450); ///CHANGE TO DEFAULT WIDTH AND H.
		gameTitle.setFont(new Font("Sitka Subheading", Font.BOLD, 50));
		gameTitle.setText("Loading");

		JLabel introScreenLabel = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/Images/Loading01.gif")).getImage();
		introScreenLabel.setIcon(new ImageIcon(img));
		introScreenLabel.setSize(500,400);
		introScreenLabel.setLocation(350,100);
		contentPane.add(introScreenLabel);


		gameTitle.setBackground(new Color(255, 255, 255));
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
			if(System.currentTimeMillis() - amountOfTime > 3275)
			{


				System.out.println("IM DONE");

				BlackScreen();

				new Carshop();


				runn = false;
				// call method able to Start the Screen in other to run SplashScreen


				//setVisible(false);

			}

			//System.out.println(System.currentTimeMillis() - amountOfTime + " Current TIme");


		}

	}
	private void BlackScreen() {


		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setSize(1200, 800);
	}


//	public static void main(String[] args) {
//
//		IntroductionScreen frame = new IntroductionScreen();
//		//frame.setVisible(true);
//	}
}


