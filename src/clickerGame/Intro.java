package clickerGame;

import java.awt.*;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Intro {
	
	private static JTextArea txtDescription;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	
	static JFrame frameIntro = new JFrame();
	
	public static void close()
	{
		frameIntro.setVisible(false);
	}
	public static void instruction()
	{
		frameIntro.setBackground(Color.decode("#CCDAEA"));
		frameIntro.setResizable(false);
		frameIntro.setPreferredSize(new Dimension(870, 630));
		frameIntro.setSize(870, 630);
		frameIntro.setLocationRelativeTo(null);
		frameIntro.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Start the Game!");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.GameOn();
				close();
			}
		});
		btnNewButton.setBackground(Color.decode("#00305F"));
		btnNewButton.setForeground(Color.decode("#F5EAEC"));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 29));
		btnNewButton.setBounds(308, 476, 280, 90);
		frameIntro.getContentPane().add(btnNewButton);
		
		txtDescription = new JTextArea();
		txtDescription.setFont(new Font("Arial", Font.PLAIN, 30));
		txtDescription.setEditable(false);
		txtDescription.setBounds(12, 116, 832, 350);
		frameIntro.getContentPane().add(txtDescription);
		txtDescription.setColumns(10);
		txtDescription.setBackground(Color.decode("#F5EAEC"));
		txtDescription.setText("You’re a lonely boat programmer drifting out in a sea of terrible\r\nspaghetti code " +
				"and you’ve taken upon yourself a mission that \r\nwould make any other boat shudder: fix the mess around you," +
				"\r\none line at a time, and code your way back to society.\r\n" +
				"Perhaps you’ll even make your way to something called Hack\r\nthe North, an " +
				"mysterious event you know only from the echoing\r\nvoices of the command line….");
		JLabel lblGameName = new JLabel("KEYBOARD CLICKER");
		lblGameName.setForeground(Color.decode("#E36F7A"));
		lblGameName.setFont(new Font("Arial", Font.BOLD, 50));
		lblGameName.setBounds(165, 10, 756, 90);
		frameIntro.getContentPane().add(lblGameName);
		frameIntro.setVisible(true);
		frameIntro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
