package buttonTest;

import java.awt.Dimension;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel pnl1 = new JPanel();
		
		frame.add(pnl1);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 630));
		frame.setSize(840, 630);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
