import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Sound {

	
	
	public static void main(String[] args) {
			
		JFrame window;
		Container con;
		JPanel buttonPanel;
		JButton x;
		JButton soundButton;
		String clickSound;
		String clickSound1;
		
		
		
		//Construction of window
		window = new JFrame("My interface");
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		window.getContentPane().setBackground(Color.blue);
		window.setLayout(null);
		con = window.getContentPane();
		
		//construction of buttonpanel
		buttonPanel = new JPanel();
		buttonPanel.setBounds(300, 300, 200, 100);
		buttonPanel.setBackground(Color.blue);
		con.add(buttonPanel);
		
		//first button
		clickSound = "res//feelgood.wav";
		ButtonHandler Bhandler1 = new ButtonHandler(clickSound);
		
		x = new JButton("Feels Good");
		x.setFocusPainted(false);
		x.addActionListener(Bhandler1);
		x.setActionCommand("soundA");
		buttonPanel.add(x);
		
		//second button
		clickSound1 = "res/hello.wav";
		ButtonHandler Bhandler2 = new ButtonHandler(clickSound1);

		soundButton = new JButton("Hello Baby");
		soundButton.setFocusPainted(false);
		soundButton.addActionListener(Bhandler2);
		soundButton.setActionCommand("soundB");
		buttonPanel.add(soundButton);
		
		//visibility
		window.setVisible(true);
		

	}
	
	

}


