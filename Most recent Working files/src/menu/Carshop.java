package menu;


import engine.util.Assets;
import engine.util.Sound;
import engine.window.ShowGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Carshop extends JFrame {

    private JPanel contentPane;

    private Sound chooseYourCar;

    public Carshop() {

        setSize(1280, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JLabel carShop = new JLabel();
        carShop.setBounds(150,30,600,100); ///CHANGE TO DEFAULT WIDTH AND H.
        carShop.setFont(new Font("Sitka Subheading", Font.BOLD, 60));
        carShop.setForeground(Color.WHITE);
        carShop.setText("Choose Your Car");
        contentPane.add(carShop);

        JButton NewGame =  new JButton();
        NewGame.setBounds(600,300,150,50);
        Image NewGame1 = new ImageIcon(this.getClass().getResource("/Images/playBtt.png")).getImage();
        NewGame.setIcon(new ImageIcon(NewGame1));
        contentPane.add(NewGame);


        NewGame.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == NewGame) {

//                    new Level1();
                    new ShowGame();

                }
            }
        });



        chooseYourCar = new Sound(Assets.chooseYourCar);
        chooseYourCar.play();



        Image Vimg0 = new ImageIcon(this.getClass().getResource("/Images/V_carRed2_009.png")).getImage();
        Image Vimg1 = new ImageIcon(this.getClass().getResource("/Images/V_carBlack1_008.png")).getImage();
        Image Vimg2 = new ImageIcon(this.getClass().getResource("/Images/V_taxi_E.png")).getImage();
        Image Vimg3 = new ImageIcon(this.getClass().getResource("/Images/V_garbage_E.png")).getImage();
        Image Vimg4 = new ImageIcon(this.getClass().getResource("/Images/V_ambulance_E.png")).getImage();
        Image Vimg5 = new ImageIcon(this.getClass().getResource("/Images/V_police_E.png")).getImage();


        JLabel mycar = new JLabel();
        mycar.setBounds(425,140,225,400);
        Image mycar1 = new ImageIcon(this.getClass().getResource("/Images/V_carRed2_009.png")).getImage();
        mycar.setIcon(new ImageIcon(mycar1));
        contentPane.add(mycar);

        JButton T1Car1 =  new JButton();
        Image img0 = new ImageIcon(this.getClass().getResource("/Images/carRed2_009.png")).getImage();
        T1Car1.setIcon(new ImageIcon(img0));
        T1Car1.setBounds(50, 250, 50, 50);

        T1Car1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == T1Car1) {

                    mycar.setIcon(new ImageIcon(Vimg0));

                }
            }
        });



        JButton T1Car2 =  new JButton();
        Image img1 = new ImageIcon(this.getClass().getResource("/Images/carBlack1_008.png")).getImage();
        T1Car2.setIcon(new ImageIcon(img1));
        T1Car2.setBounds(150, 250, 50, 50);


        T1Car2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == T1Car2) {

                    mycar.setIcon(new ImageIcon(Vimg1));
                }
            }
        });


        JButton T1Car3 =  new JButton();
        Image img2 = new ImageIcon(this.getClass().getResource("/Images/taxi_E.png")).getImage();
        T1Car3.setIcon(new ImageIcon(img2));
        T1Car3.setBounds(250, 250, 50, 50);


        T1Car3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == T1Car3) {

                    mycar.setIcon(new ImageIcon(Vimg2));
                }
            }
        });



        JButton T2Car1 =  new JButton();
        Image img3 = new ImageIcon(this.getClass().getResource("/Images/garbage_E.png")).getImage();
        T2Car1.setIcon(new ImageIcon(img3));
        T2Car1.setBounds(50, 400, 50, 50);


        T2Car1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == T2Car1) {

                    mycar.setIcon(new ImageIcon(Vimg3));

                }
            }
        });

        JButton T2Car2 =  new JButton();
        Image img4 = new ImageIcon(this.getClass().getResource("/Images/ambulance_E.png")).getImage();
        T2Car2.setIcon(new ImageIcon(img4));
        T2Car2.setBounds(150, 400, 50, 50);



        T2Car2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == T2Car2) {



                    mycar.setIcon(new ImageIcon(Vimg4));
                }

            }
        });


        JButton T2Car3 =  new JButton();
        Image img5 = new ImageIcon(this.getClass().getResource("/Images/police_E.png")).getImage();
        T2Car3.setIcon(new ImageIcon(img5));
        T2Car3.setBounds(250, 400, 50, 50);


        T2Car3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == T2Car3) {

                    mycar.setIcon(new ImageIcon(Vimg5));
                }

            }
        });

        JLabel gameTitle = new JLabel();
        gameTitle.setBounds(125,0,1280/4,800/2 ); ///CHANGE TO DEFAULT WIDTH AND H.
        gameTitle.setFont(new Font("Sitka Subheading", Font.BOLD,40));
        gameTitle.setForeground(Color.WHITE);
        gameTitle.setText("Tier 1");

        contentPane.add(gameTitle);

        JLabel gameTitle2 = new JLabel();
        gameTitle2.setBounds(125,150,1280/4,800/2); ///CHANGE TO DEFAULT WIDTH AND H.
        gameTitle2.setFont(new Font("Sitka Subheading", Font.BOLD, 40));
        gameTitle2.setForeground(Color.WHITE);
        gameTitle2.setText("Tier 2");

        contentPane.add(gameTitle2);

        contentPane.add(T1Car1);
        contentPane.add(T1Car2);
        contentPane.add(T1Car3);

        contentPane.add(T2Car1);
        contentPane.add(T2Car2);
        contentPane.add(T2Car3);


        JLabel banner = new JLabel();
        banner.setBounds(50,10,225,400); ///CHANGE TO DEFAULT WIDTH AND H.
        Image banner1 = new ImageIcon(this.getClass().getResource("/Images/banner.png")).getImage();
        banner.setIcon(new ImageIcon(banner1));
        contentPane.add(banner);

        JLabel banner2 = new JLabel();
        banner2.setBounds(50,160,225,400); ///CHANGE TO DEFAULT WIDTH AND H.
        Image banner3 = new ImageIcon(this.getClass().getResource("/Images/banner.png")).getImage();
        banner2.setIcon(new ImageIcon(banner3));
        contentPane.add(banner2);


        JLabel arena = new JLabel();
        arena.setBounds(380,175,225,400); ///CHANGE TO DEFAULT WIDTH AND H.
        Image arena1 = new ImageIcon(this.getClass().getResource("/Images/blue-circle-arena.png")).getImage();
        arena.setIcon(new ImageIcon(arena1));
        contentPane.add(arena);


        JLabel introScreenLabel = new JLabel();
        Image img = new ImageIcon(this.getClass().getResource("/Images/city.gif")).getImage();
        introScreenLabel.setIcon(new ImageIcon(img));
        introScreenLabel.setSize(800,600);
        introScreenLabel.setLocation(0,0);
        contentPane.add(introScreenLabel);


        contentPane.setVisible(true);

        setVisible(true);

    }

}



