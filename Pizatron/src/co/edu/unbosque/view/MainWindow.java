package co.edu.unbosque.view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.border.Border;

public class MainWindow extends JFrame implements MouseListener, ActionListener{
	
	
	JPanel left = new JPanel(),right = new JPanel(),buttonsPanel= new JPanel();
	ImageIcon bgImage,iconIMG = new ImageIcon("logo.png"),config = new ImageIcon("config.png"),help = new ImageIcon("info.png"),playBIMG = new ImageIcon("playB.png");;
	JButton playB = new JButton(playBIMG) ,configB = new JButton(config),infoB = new JButton(help);
	JLabel iconLabel = new JLabel();
	JTextPane leaderboard = new JTextPane();
	int xDim = 1700 ,yDim = 800;
	
	
	
	
	
	
	public MainWindow(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(xDim,yDim);
		setVisible(true);
		setTitle("Pizzatron 3000");
		launchMenu(left,right,iconLabel,buttonsPanel,playB,configB,infoB,leaderboard,this,bgImage,iconIMG,config,help,playBIMG);
		
		setResizable(false);
		
		
		
		
	}
	
	public void launchMenu(JPanel left ,JPanel right  ,JLabel iconLabel ,JPanel buttonsPanel, JButton playB ,JButton configB ,JButton infoB ,JTextPane leaderboard ,JFrame frame,ImageIcon bgImage ,ImageIcon iconIMG,ImageIcon config,ImageIcon help,ImageIcon playBIMG){
		frame.setLayout(new BorderLayout());
		//left configurations
		int leftDimX = (xDim/2)+ 20;
		left.setPreferredSize(new Dimension(leftDimX,50));
		left.setLayout(new GridLayout(4,1));
		left.setBackground(new Color(0xFFC55A));
		//right configurations
		right.setPreferredSize(new Dimension((xDim/2)-20,50));
		right.setBackground(Color.blue);
		
		//butonsPanel Config
		
		buttonsPanel.setLayout(new GridLayout(1,2));
		buttonsPanel.setBackground(new Color(0xFFC55A));
		

		
		
		//iconPanel config
		iconLabel = new JLabel();
		iconLabel.setBackground(Color.green);
		
		
		//playB config
		playB.setBounds(860-20,100,10,10);
		playB.setBorder(BorderFactory.createEmptyBorder());
		playB.setContentAreaFilled(false);
		playB.addActionListener(this);
		
	
		
		
		//configB config
		configB.setBorder(BorderFactory.createEmptyBorder());
		configB.setContentAreaFilled(false);
		configB.addActionListener(this);
		
		//infoB config
		infoB.setContentAreaFilled(false);
		infoB.setBorder(BorderFactory.createEmptyBorder());
		infoB.addActionListener(this);
		
		//leaderboards
		leaderboard = new JTextPane();
		leaderboard.setBorder(BorderFactory.createEtchedBorder());
		leaderboard.setBackground(new Color(0x2C4E80));
		appendToPane(leaderboard, "Position : Player : Score,\n\n", Color.WHITE,30);
		appendToPane(leaderboard, "1 :  AAA : 2000,\n", Color.WHITE,20);
		appendToPane(leaderboard, "2 : ABBB : 1000,\n", Color.WHITE,20);
		leaderboard.setEditable(false);
		
		
		
		
		
		frame.add(left,BorderLayout.WEST);
		frame.add(right,BorderLayout.CENTER);
		left.add(iconLabel);
		iconLabel.setIcon(iconIMG);
		left.add(leaderboard);
		left.add(playB);
		left.add(buttonsPanel);
		buttonsPanel.add(configB);
		buttonsPanel.add(infoB);
		
		
		
		
	}
	
	public void configChange() {
		
	}
	public void helpChange() {
		
	}
	
	public static void appendToPane(JTextPane tp, String txt, Color clr,int size) {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        javax.swing.text.AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, clr);
        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Impact");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);
        int len = tp.getDocument().getLength();
        tp.setFont(new Font("Impact",Font.PLAIN,size));
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(txt);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==playB) {
			System.out.println("play");
			left.setVisible(false);
			right.setVisible(false);
		}
		else if(e.getSource()==configB) {
			System.out.println("config");
			left.setVisible(false);
			right.setVisible(false);
		}
		else if(e.getSource()==infoB) {
			System.out.println("tutorial");
			left.setVisible(false);
			right.setVisible(false);
		}
	}

}
