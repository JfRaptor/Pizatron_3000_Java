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

public class MainWindow extends JFrame implements MouseListener,ActionListener{
	
	
	JPanel launchMenuLeft,launchMenuRight,buttonsPanel;
	JButton playB,configB,infoB;
	JLabel iconLabelLaunchMenu;
	JTextPane leaderboardsLaunchMenu;
	ImageIcon bgImage,iconIMG = new ImageIcon("logo.png"), config,help,playBIMG;
	int xDim = 1700 ,yDim = 800;
	
	
	
	
	
	
	public MainWindow(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(xDim,yDim);
		setVisible(true);
		setTitle("Pizzatron 3000");
		launchMenu(launchMenuLeft,launchMenuRight,iconLabelLaunchMenu,buttonsPanel,playB,configB,infoB,leaderboardsLaunchMenu,this,bgImage,iconIMG,config,help,playBIMG);
		
		setResizable(false);
		
		
		
		
	}
	
	public void launchMenu(JPanel left ,JPanel right  ,JLabel iconLabel ,JPanel buttonsPanel, JButton playB ,JButton configB ,JButton infoB ,JTextPane leaderboard ,JFrame frame,ImageIcon bgImage ,ImageIcon iconIMG,ImageIcon config,ImageIcon help,ImageIcon playBIMG){
		frame.setLayout(new BorderLayout());
		//left configurations
		int leftDimX = (xDim/2)+ 20;
		left = new JPanel();
		left.setPreferredSize(new Dimension(leftDimX,50));
		left.setLayout(new GridLayout(4,1));
		left.setBackground(Color.red);
		//right configurations
		right = new JPanel();
		right.setPreferredSize(new Dimension((xDim/2)-20,50));
		right.setBackground(Color.blue);
		
		//butonsPanel Config
		
		buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridLayout(1,2));
		buttonsPanel.setBackground(Color.gray);
		

		
		
		//iconPanel config
		iconLabel = new JLabel();
		iconLabel.setBackground(Color.green);
		
		//playBIMG config
		
		playBIMG = new ImageIcon("playB.png");
		
		//playB config
		playB = new JButton(playBIMG);
		playB.setBounds(860-20,100,10,10);
		playB.setBorder(BorderFactory.createEmptyBorder());
		playB.setContentAreaFilled(false);
		
		//config (image) config
		
		config = new ImageIcon("config.png");
		
		
		//configB config
		configB = new JButton(config);
		configB.setBorder(BorderFactory.createEmptyBorder());
		configB.setContentAreaFilled(false);
		
		//help (image) config
		
		help = new ImageIcon("info.png");
				
		//infoB config
		infoB = new JButton(help);
		infoB.setContentAreaFilled(false);
		
		//leaderboards
		leaderboard = new JTextPane();
		leaderboard.setBorder(BorderFactory.createEtchedBorder());
		appendToPane(leaderboard, "Position : Player : Score,\n\n", Color.BLACK,30);
		appendToPane(leaderboard, "1 :  AAA : 2000,\n", Color.BLUE,20);
		appendToPane(leaderboard, "2 : ABBB : 1000,\n", Color.RED,20);
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
	
	public void playChange(){
		
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
		// TODO Auto-generated method stub
		
	}

}
