package clickerGame;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Intro {
	
	private static JTextField txtDescription;
	
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
		frameIntro.setBackground(Color.WHITE);
		frameIntro.setResizable(false);
		frameIntro.setPreferredSize(new Dimension(870, 630));
		frameIntro.setSize(870, 630);
		frameIntro.setLocationRelativeTo(null);
		frameIntro.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Start a Game!");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.GameOn();
				close();
			}
		});
		btnNewButton.setBackground(new Color(165, 42, 42));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton.setBounds(308, 476, 249, 90);
		frameIntro.getContentPane().add(btnNewButton);
		
		txtDescription = new JTextField();
		txtDescription.setFont(new Font("Arial", Font.PLAIN, 13));
		txtDescription.setEditable(false);
		txtDescription.setBounds(12, 116, 832, 350);
		frameIntro.getContentPane().add(txtDescription);
		txtDescription.setColumns(10);
		
		JLabel lblGameName = new JLabel("KEYBOARD CLICKER");
		lblGameName.setFont(new Font("Arial", Font.BOLD, 50));
		lblGameName.setBounds(44, 10, 756, 90);
		frameIntro.getContentPane().add(lblGameName);
		frameIntro.setVisible(true);
		frameIntro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
