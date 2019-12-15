import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class startMenu extends JFrame {

private int w, h;

private Image manuBttImgs;
private JPanel contentPane;

	/**
	 * Launch the application.
	 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable()
	{
		public void run() 
		{
			try
			{
				startMenu frame = new startMenu(1280, 800);
				frame.setVisible(true);
				} catch (Exception e)
			{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public startMenu(int w, int h)
	{
		this.w = w;
		this.h = h;
		
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(843,538);
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
			}
		});
		newGameBtt.setBounds(630, 163, 165, 38);
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
			}
		});
		settingsBt.setBounds(630, 265, 165, 38);
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
			}
		});
		btnCredits.setBounds(630, 214, 165, 38);
		
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
				
			}
		});
		exitBt.setBounds(630, 316, 165, 38);
		contentPane.add(exitBt);
//---------------BG IMAGE LABEL-----------------------------------------------------		
		JLabel bgLabel = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/Images/IsometricCityBg.jpg")).getImage();
		bgLabel.setIcon(new ImageIcon(img));
			bgLabel.setSize(618,444);
		bgLabel.setLocation(0,81);
		contentPane.add(bgLabel);
//----------------NAME IMAGE--------------------------------------------------------		
		JLabel gameNameLabel = new JLabel();
		gameNameLabel.setForeground(Color.WHITE);
		gameNameLabel.setBackground(Color.WHITE);
		Image nameImg = new ImageIcon(this.getClass().getResource("/Images/theRideSharepane.png")).getImage();
		gameNameLabel.setIcon(new ImageIcon(nameImg));
		gameNameLabel.setSize(441, 68);
		gameNameLabel.setLocation(372,13);
		
		contentPane.add(gameNameLabel);
		
		
	}
}
