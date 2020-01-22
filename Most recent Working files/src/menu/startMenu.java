package menu;


import engine.graphics.ScreenManager;
import engine.util.Assets;
import engine.util.Constants;
import engine.util.Sound;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class startMenu extends JFrame implements MouseListener  {

	JOptionPane pane = new JOptionPane();

	private Image manuBttImgs;
	private JPanel contentPane;

	private Sound backgroundSound;

	public startMenu()
	{
		System.out.println("IM NOT RUNNING!!!!...");

		backgroundSound = new Sound(Assets.backgroundMusic);
		backgroundSound.loop();
		backgroundSound.changeVolume(-5f);


		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280,800);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

//------------------NEW GAME BUTTON--------------------------------------

		JButton newGameBtt = new JButton("NEW GAME");
		newGameBtt.setFont(new Font("Footlight MT Light", Font.BOLD, 13));
		manuBttImgs = new ImageIcon(this.getClass().getResource("/Images/newGameBtt.png")).getImage();
		newGameBtt.setIcon(new ImageIcon(manuBttImgs));
		newGameBtt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

				new LoadingScreen();
				setVisible(false);
				System.out.println("Button Clicked!");
			}
		});
		newGameBtt.setBounds(750, 325, 165, 38);
		contentPane.add(newGameBtt);


//-----------------SETTINGS BUTTON-----------------------------------------
		JButton settingsBt = new JButton("SETTINGS");
		settingsBt.setFont(new Font("Footlight MT Light", Font.BOLD, 13));
		manuBttImgs = new ImageIcon(this.getClass().getResource("/Images/settingsBtt.png")).getImage();
		settingsBt.setIcon(new ImageIcon(manuBttImgs));
		settingsBt.setForeground(Color.BLUE);
		settingsBt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {

				//	settings1();

			}


		});


		settingsBt.setBounds(750, 375, 165, 38);
		contentPane.add(settingsBt);

//-----------------CREDITS BUTTOn--------------------------------------------
		JButton btnCredits = new JButton("CREDITS");
		manuBttImgs = new ImageIcon(this.getClass().getResource("/Images/creditsBtt.png")).getImage();
		btnCredits.setIcon(new ImageIcon(manuBttImgs));
		btnCredits.setFont(new Font("Footlight MT Light", Font.BOLD, 13));
		btnCredits.setForeground(Color.BLUE);
		btnCredits.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				UIManager.put("OptionPane.minimumSize",new Dimension(300,300));

				pane.showMessageDialog(null, "Yello");
			}
		});
		btnCredits.setBounds(750, 425, 165, 38);

		contentPane.add(btnCredits);
//---------------EXIT BUTTON-------------------------------------------------
		JButton exitBt = new JButton("EXIT");
		manuBttImgs = new ImageIcon(this.getClass().getResource("/Images/exitBtt.png")).getImage();
		exitBt.setIcon(new ImageIcon(manuBttImgs));
		exitBt.setFont(new Font("Footlight MT Light", Font.BOLD, 13));
		exitBt.setForeground(Color.BLUE);
		exitBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				System.exit(0);
			}
		});
		exitBt.setBounds(750, 475, 165, 38);
		contentPane.add(exitBt);
//---------------BG IMAGE LABEL-----------------------------------------------------
		JLabel bgLabel = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/Images/IsometricCityBg.jpg")).getImage();
		bgLabel.setIcon(new ImageIcon(img));
		bgLabel.setSize(618,444);
		bgLabel.setLocation(85,200);
		contentPane.add(bgLabel);
//----------------NAME IMAGE--------------------------------------------------------
		JLabel gameNameLabel = new JLabel();
		gameNameLabel.setForeground(Color.WHITE);
		gameNameLabel.setBackground(Color.WHITE);
		Image nameImg = new ImageIcon(this.getClass().getResource("/Images/TheCollector.png")).getImage();
		gameNameLabel.setIcon(new ImageIcon(nameImg));
		gameNameLabel.setSize(638, 271);
		gameNameLabel.setLocation(372,13);

		contentPane.add(gameNameLabel);

		contentPane.setVisible(true);
		setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {


	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	private void settings1() {

		System.out.println("IM The Setting");


		UIManager.put("OptionPane.minimumSize",new Dimension(500,500));

		pane.showMessageDialog(null, "Yello");


	}





}