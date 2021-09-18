import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyAdapter;
	import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.*;
	import java.util.Timer;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

	public class Main {
		private static JTextField txtInputCode;
		static JLabel lblLOC = new JLabel("New label");
		static final JLabel lblCodes = new JLabel("New label", SwingConstants.CENTER);
		static ArrayList<String> textboxWords = new ArrayList<String>();
		private static final JLabel lblPerSec = new JLabel("");
		static JScrollPane scrollPane = new JScrollPane();
		public static Integer loc = 0;
		public static double locTime = 1;
		public static int boost = 0;
		public static int purchasedIDE = 0;




		//when enter pressed
		private static void locMining(KeyEvent e)
		{
			int rdm = (int)(Math.random() * textboxWords.size());
			if(e.getKeyCode() == KeyEvent.VK_ENTER)
			{
				String qCode = lblCodes.getText();
				qCode = qCode.replaceAll(" ", "");
				String inputCode = txtInputCode.getText();
				inputCode = inputCode.replaceAll(" ", "");
				if (qCode.equals(inputCode))
				{
					int plus_loc = inputCode.length();
					int plus_time = (inputCode.length() / 60);
					loc += (plus_loc + boost);
					locTime += 1;
					lblLOC.setText(loc.toString());
					txtInputCode.setText("");
					lblCodes.setText(textboxWords.get(rdm));
				}
				else
				{
					txtInputCode.setText("");
				}
			}
		}
		
		
		public static void main(String[] args) {
			//adding Strings in textboxWords ArrayList
			textboxWords.add("int i = 0;");
			textboxWords.add("String hell");
			textboxWords.add("for (int i = 0)");
			textboxWords.add("while (true)");
			textboxWords.add("System.out.println");
			textboxWords.add("hot dogs");
			textboxWords.add("ur mom");
			textboxWords.add("public static");
			textboxWords.add("public void main(String[] args)");
			textboxWords.add("f = new JFrame();");
			textboxWords.add("import java.util.Scanner");
			textboxWords.add("#hackthenorth");
			textboxWords.add("int random = Math.random()");
			textboxWords.add("Scanner s = new Scanner");
			JFrame frame = new JFrame();
			frame.setBackground(Color.WHITE);
			JPanel pnl1 = new JPanel();
			pnl1.setBackground(SystemColor.info);
			
			
			frame.getContentPane().add(pnl1);
			pnl1.setLayout(null);
		
			
			lblCodes.setFont(new Font("Consolas", Font.BOLD, 16));
			lblCodes.setBounds(39, 255, 252, 40);
			lblCodes.setText("int i = 0;");
			pnl1.add(lblCodes);
			
			txtInputCode = new JTextField();
			txtInputCode.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					locMining(e);
				}
			});
			txtInputCode.setBounds(39, 305, 252, 40);
			pnl1.add(txtInputCode);
			txtInputCode.setColumns(10);
			
			
			lblLOC.setFont(new Font("Arial", Font.BOLD, 45));
			lblLOC.setBounds(39, 63, 252, 77);
			pnl1.add(lblLOC);
			lblLOC.setText(loc.toString());
			lblPerSec.setFont(new Font("Consolas", Font.PLAIN, 15));
			lblPerSec.setBounds(39, 150, 252, 40);
			lblPerSec.setText(locTime + " lines of code / sec");
			pnl1.add(lblPerSec);
			
			JPanel panel = new JPanel();
			panel.setBounds(22, 23, 304, 371);
			pnl1.add(panel);
			
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.setBounds(338, 23, 475, 548);
			pnl1.add(scrollPane);
			storeUI();
			
			frame.setResizable(false);
			frame.setVisible(true);
			frame.setPreferredSize(new Dimension(840, 630));
			frame.setSize(840, 630);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		static void storeUI() {
			
			
			JSplitPane splitPane = new JSplitPane();
			splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
			scrollPane.setViewportView(splitPane);
			
			JSplitPane splitPane_1 = new JSplitPane();
			splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
			splitPane.setLeftComponent(splitPane_1);
			
			JSplitPane splitPane_3 = new JSplitPane();
			splitPane_3.setOrientation(JSplitPane.VERTICAL_SPLIT);
			splitPane_1.setLeftComponent(splitPane_3);
			
			JPanel panel_GitHub = new JPanel();
			splitPane_3.setRightComponent(panel_GitHub);
			
			JLabel lblGitHub = new JLabel("GitHub Copilot (1/1)");
			lblGitHub.setForeground(new Color(0, 0, 0));
			lblGitHub.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
			
			JLabel lblGitHub_cost = new JLabel("cost: ");
			lblGitHub_cost.setForeground(new Color(0, 0, 0));
			lblGitHub_cost.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 22));
			
			JTextArea txtGitHub = new JTextArea();
			txtGitHub.setText("Like Grammarly, but better\r\n\r\n- 1 LOC per second.\r\n");
			txtGitHub.setFont(new Font("Arial", Font.PLAIN, 17));
			txtGitHub.setEditable(false);
			txtGitHub.setBackground(new Color(255, 239, 213));
			
			JButton btnGitHub = new JButton("Upgrade!");
			//when the user clicked upgrade button of GitHub
			btnGitHub.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
				}
			});
			btnGitHub.setForeground(new Color(255, 255, 255));
			btnGitHub.setFont(new Font("Arial", Font.BOLD, 13));
			btnGitHub.setBackground(new Color(0, 0, 0));
			GroupLayout gl_panel_GitHub = new GroupLayout(panel_GitHub);
			gl_panel_GitHub.setHorizontalGroup(
				gl_panel_GitHub.createParallelGroup(Alignment.LEADING)
					.addGap(0, 456, Short.MAX_VALUE)
					.addGap(0, 456, Short.MAX_VALUE)
					.addGroup(gl_panel_GitHub.createSequentialGroup()
						.addGroup(gl_panel_GitHub.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_GitHub.createSequentialGroup()
								.addGap(12)
								.addComponent(lblGitHub, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
								.addGap(12)
								.addComponent(lblGitHub_cost, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_GitHub.createSequentialGroup()
								.addContainerGap()
								.addComponent(txtGitHub, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnGitHub, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
						.addGap(6))
			);
			gl_panel_GitHub.setVerticalGroup(
				gl_panel_GitHub.createParallelGroup(Alignment.LEADING)
					.addGap(0, 175, Short.MAX_VALUE)
					.addGap(0, 175, Short.MAX_VALUE)
					.addGroup(gl_panel_GitHub.createSequentialGroup()
						.addGap(10)
						.addGroup(gl_panel_GitHub.createParallelGroup(Alignment.LEADING)
							.addComponent(lblGitHub, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblGitHub_cost, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
						.addGroup(gl_panel_GitHub.createParallelGroup(Alignment.TRAILING)
							.addComponent(txtGitHub, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnGitHub, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
			);
			panel_GitHub.setLayout(gl_panel_GitHub);
			
			JPanel panel_StackOverflow = new JPanel();
			splitPane_3.setLeftComponent(panel_StackOverflow);
			
			JLabel lblStackOverflow = new JLabel("Stack Overflow (1/10)");
			lblStackOverflow.setForeground(new Color(255, 99, 71));
			lblStackOverflow.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
			
			JLabel lblStackOverflow_cost = new JLabel("cost: ");
			lblStackOverflow_cost.setForeground(new Color(255, 99, 71));
			lblStackOverflow_cost.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 22));
			
			JTextArea txtStackOverflow = new JTextArea();
			txtStackOverflow.setText("A programmer\u2019s best friend!\r\n\r\n- Produces 1 line of code (LOC) \r\nevery 10 seconds.\r\n");
			txtStackOverflow.setFont(new Font("Arial", Font.PLAIN, 17));
			txtStackOverflow.setEditable(false);
			txtStackOverflow.setBackground(new Color(255, 239, 213));
			
			JButton btnStackOverflow = new JButton("Upgrade!");
			//when the user clicked upgrade button of Stack Overflow
			btnStackOverflow.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			btnStackOverflow.setForeground(new Color(240, 248, 255));
			btnStackOverflow.setFont(new Font("Arial", Font.BOLD, 13));
			btnStackOverflow.setBackground(new Color(210, 105, 30));
			GroupLayout gl_panel_StackOverflow = new GroupLayout(panel_StackOverflow);
			gl_panel_StackOverflow.setHorizontalGroup(
				gl_panel_StackOverflow.createParallelGroup(Alignment.LEADING)
					.addGap(0, 456, Short.MAX_VALUE)
					.addGap(0, 456, Short.MAX_VALUE)
					.addGroup(gl_panel_StackOverflow.createSequentialGroup()
						.addGroup(gl_panel_StackOverflow.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_StackOverflow.createSequentialGroup()
								.addGap(12)
								.addComponent(lblStackOverflow, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
								.addGap(12)
								.addComponent(lblStackOverflow_cost, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_StackOverflow.createSequentialGroup()
								.addContainerGap()
								.addComponent(txtStackOverflow, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnStackOverflow, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
						.addGap(6))
			);
			gl_panel_StackOverflow.setVerticalGroup(
				gl_panel_StackOverflow.createParallelGroup(Alignment.LEADING)
					.addGap(0, 175, Short.MAX_VALUE)
					.addGap(0, 175, Short.MAX_VALUE)
					.addGroup(gl_panel_StackOverflow.createSequentialGroup()
						.addGap(10)
						.addGroup(gl_panel_StackOverflow.createParallelGroup(Alignment.LEADING)
							.addComponent(lblStackOverflow, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblStackOverflow_cost, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
						.addGroup(gl_panel_StackOverflow.createParallelGroup(Alignment.TRAILING)
							.addComponent(txtStackOverflow, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnStackOverflow, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
			);
			panel_StackOverflow.setLayout(gl_panel_StackOverflow);
			
			JSplitPane splitPane_4 = new JSplitPane();
			splitPane_4.setOrientation(JSplitPane.VERTICAL_SPLIT);
			splitPane_1.setRightComponent(splitPane_4);
			
			JPanel panel_IDE = new JPanel();
			splitPane_4.setLeftComponent(panel_IDE);
			
			JLabel lblIDE = new JLabel("Java IDE (0/3)");
			lblIDE.setForeground(new Color(0, 0, 128));
			lblIDE.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
			
			JLabel lblIDE_cost = new JLabel("cost: 10 LOC ");
			lblIDE_cost.setForeground(new Color(0, 0, 128));
			lblIDE_cost.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 22));
			
			JTextArea txtIDE = new JTextArea();
			txtIDE.setText("Looks nicer than doing it in Notepad.\r\n\r\n- Increases LOC generated from \r\nclicking by 3.\r\n");
			txtIDE.setFont(new Font("Arial", Font.PLAIN, 17));
			txtIDE.setEditable(false);
			txtIDE.setBackground(new Color(255, 239, 213));
			
			JButton btnIDE = new JButton("Upgrade!");
			//when the user clicked upgrade button of IDE
			btnIDE.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(loc >= 10 && purchasedIDE == 0) {
						loc -= 10;
						boost = 3;
						lblLOC.setText(loc.toString());
						purchasedIDE++;
						lblIDE.setText("Paid Java IDE (1/3)");
						txtIDE.setText("You have a proper IDE but you want \r\n more!.\r\n\r\n- Increases LOC generated from \r\nclicking by 6.\r\n");
						lblIDE_cost.setText("Cost: 100 LOC");
					}
					else if (loc >= 100 && purchasedIDE == 1) {
						loc -= 100;
						boost = 6;
						lblLOC.setText(loc.toString());
						lblIDE.setText("Ultimate Paid Java IDE (2/3)");
						txtIDE.setText("You have a paid IDE but you want \r\n even more!");
						lblIDE_cost.setText("Cost: 10000 LOC");
						purchasedIDE++;
					}
					else if (loc >= 100 && purchasedIDE == 2) {
						loc -= 10000;
						boost = 12;
						lblLOC.setText(loc.toString());
						lblIDE.setText("Ultimate Paid Java IDE (3/3)");
						btnIDE.setEnabled(false);
						btnIDE.setText("Purchased");
						txtIDE.setText("You now have the best of the best!");
						purchasedIDE++;
					}
					else {
							JOptionPane.showMessageDialog(null, "Insufficient Lines of Code!", "Error",
									JOptionPane.WARNING_MESSAGE);
						}



				}
			});
			btnIDE.setForeground(new Color(240, 248, 255));
			btnIDE.setFont(new Font("Arial", Font.BOLD, 13));
			btnIDE.setBackground(new Color(0, 0, 128));
			GroupLayout gl_panel_IDE = new GroupLayout(panel_IDE);
			gl_panel_IDE.setHorizontalGroup(
				gl_panel_IDE.createParallelGroup(Alignment.LEADING)
					.addGap(0, 456, Short.MAX_VALUE)
					.addGap(0, 456, Short.MAX_VALUE)
					.addGroup(gl_panel_IDE.createSequentialGroup()
						.addGroup(gl_panel_IDE.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_IDE.createSequentialGroup()
								.addGap(12)
								.addComponent(lblIDE, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
								.addGap(12)
								.addComponent(lblIDE_cost, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_IDE.createSequentialGroup()
								.addContainerGap()
								.addComponent(txtIDE, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnIDE, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
						.addGap(6))
			);
			gl_panel_IDE.setVerticalGroup(
				gl_panel_IDE.createParallelGroup(Alignment.LEADING)
					.addGap(0, 175, Short.MAX_VALUE)
					.addGap(0, 175, Short.MAX_VALUE)
					.addGroup(gl_panel_IDE.createSequentialGroup()
						.addGap(10)
						.addGroup(gl_panel_IDE.createParallelGroup(Alignment.LEADING)
							.addComponent(lblIDE, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblIDE_cost, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
						.addGroup(gl_panel_IDE.createParallelGroup(Alignment.TRAILING)
							.addComponent(txtIDE, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnIDE, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
			);
			panel_IDE.setLayout(gl_panel_IDE);
			
			JPanel panel_YouTube = new JPanel();
			splitPane_4.setRightComponent(panel_YouTube);
			
			JLabel lblYouTube = new JLabel("YouTube Tutorial (2/2)");
			lblYouTube.setForeground(new Color(220, 20, 60));
			lblYouTube.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
			
			JLabel lblYouTube_cost = new JLabel("cost: ");
			lblYouTube_cost.setForeground(new Color(220, 20, 60));
			lblYouTube_cost.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 22));
			
			JTextArea txtYouTube = new JTextArea();
			txtYouTube.setText("\u201CThanks for explaining this 10000x better \r\nthan my teacher!\u201D\r\n\r\n- Produces 5 LOC per second.\r\n");
			txtYouTube.setFont(new Font("Arial", Font.PLAIN, 17));
			txtYouTube.setEditable(false);
			txtYouTube.setBackground(new Color(255, 239, 213));
			
			JButton btnYouTube = new JButton("Upgrade!");
			//when the user clicked upgrade button of YouTube
			btnYouTube.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			btnYouTube.setForeground(new Color(240, 248, 255));
			btnYouTube.setFont(new Font("Arial", Font.BOLD, 13));
			btnYouTube.setBackground(new Color(220, 20, 60));
			GroupLayout gl_panel_YouTube = new GroupLayout(panel_YouTube);
			gl_panel_YouTube.setHorizontalGroup(
				gl_panel_YouTube.createParallelGroup(Alignment.LEADING)
					.addGap(0, 456, Short.MAX_VALUE)
					.addGap(0, 456, Short.MAX_VALUE)
					.addGroup(gl_panel_YouTube.createSequentialGroup()
						.addGroup(gl_panel_YouTube.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_YouTube.createSequentialGroup()
								.addGap(12)
								.addComponent(lblYouTube, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
								.addGap(12)
								.addComponent(lblYouTube_cost, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_YouTube.createSequentialGroup()
								.addContainerGap()
								.addComponent(txtYouTube, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnYouTube, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
						.addGap(6))
			);
			gl_panel_YouTube.setVerticalGroup(
				gl_panel_YouTube.createParallelGroup(Alignment.LEADING)
					.addGap(0, 175, Short.MAX_VALUE)
					.addGap(0, 175, Short.MAX_VALUE)
					.addGroup(gl_panel_YouTube.createSequentialGroup()
						.addGap(10)
						.addGroup(gl_panel_YouTube.createParallelGroup(Alignment.LEADING)
							.addComponent(lblYouTube, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblYouTube_cost, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
						.addGroup(gl_panel_YouTube.createParallelGroup(Alignment.TRAILING)
							.addComponent(txtYouTube, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnYouTube, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
			);
			panel_YouTube.setLayout(gl_panel_YouTube);
			
			JSplitPane splitPane_2 = new JSplitPane();
			splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
			splitPane.setRightComponent(splitPane_2);
			
			JSplitPane splitPane_5 = new JSplitPane();
			splitPane_5.setOrientation(JSplitPane.VERTICAL_SPLIT);
			splitPane_2.setLeftComponent(splitPane_5);
			
			JPanel panel_Classmate = new JPanel();
			splitPane_5.setLeftComponent(panel_Classmate);
			
			JLabel lblClassmate = new JLabel("Friendly \"Classmate\"");
			lblClassmate.setForeground(new Color(46, 139, 87));
			lblClassmate.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
			
			JLabel lblClassmate_cost = new JLabel("cost: ");
			lblClassmate_cost.setForeground(new Color(46, 139, 87));
			lblClassmate_cost.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 22));
			
			JTextArea txtClassmate = new JTextArea();
			txtClassmate.setText("Helps you code 24/7. Doesn't get paid.\r\n\r\n- Produces 15 LOC per second.\r\n");
			txtClassmate.setFont(new Font("Arial", Font.PLAIN, 17));
			txtClassmate.setEditable(false);
			txtClassmate.setBackground(new Color(255, 239, 213));
			
			JButton btnClassmate = new JButton("Upgrade!");
			//when the user clicked upgrade button of Classmate
			btnClassmate.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			btnClassmate.setForeground(new Color(255, 255, 255));
			btnClassmate.setFont(new Font("Arial", Font.BOLD, 13));
			btnClassmate.setBackground(new Color(46, 139, 87));
			GroupLayout gl_panel_Classmate = new GroupLayout(panel_Classmate);
			gl_panel_Classmate.setHorizontalGroup(
				gl_panel_Classmate.createParallelGroup(Alignment.LEADING)
					.addGap(0, 456, Short.MAX_VALUE)
					.addGap(0, 456, Short.MAX_VALUE)
					.addGroup(gl_panel_Classmate.createSequentialGroup()
						.addGroup(gl_panel_Classmate.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_Classmate.createSequentialGroup()
								.addGap(12)
								.addComponent(lblClassmate, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
								.addGap(12)
								.addComponent(lblClassmate_cost, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_Classmate.createSequentialGroup()
								.addContainerGap()
								.addComponent(txtClassmate, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnClassmate, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
						.addGap(6))
			);
			gl_panel_Classmate.setVerticalGroup(
				gl_panel_Classmate.createParallelGroup(Alignment.LEADING)
					.addGap(0, 175, Short.MAX_VALUE)
					.addGap(0, 175, Short.MAX_VALUE)
					.addGroup(gl_panel_Classmate.createSequentialGroup()
						.addGap(10)
						.addGroup(gl_panel_Classmate.createParallelGroup(Alignment.LEADING)
							.addComponent(lblClassmate, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblClassmate_cost, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
						.addGroup(gl_panel_Classmate.createParallelGroup(Alignment.TRAILING)
							.addComponent(txtClassmate, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnClassmate, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
			);
			panel_Classmate.setLayout(gl_panel_Classmate);
			
			JPanel panel_Keyboard = new JPanel();
			splitPane_5.setRightComponent(panel_Keyboard);
			
			JLabel lblKeyboard = new JLabel("Mechanical Keyboard (3/3)");
			lblKeyboard.setForeground(new Color(255, 0, 255));
			lblKeyboard.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 17));
			
			JLabel lblKeyboard_cost = new JLabel("cost: ");
			lblKeyboard_cost.setForeground(new Color(255, 0, 255));
			lblKeyboard_cost.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 22));
			
			JTextArea txtKeyboard = new JTextArea();
			txtKeyboard.setText("Your neighbors show up at your door with a \r\nnoise complaint, but you can\u2019t...stop...coding...\r\n\r\n- Produces: 50 LOC per second\r\n");
			txtKeyboard.setFont(new Font("Arial", Font.PLAIN, 15));
			txtKeyboard.setEditable(false);
			txtKeyboard.setBackground(new Color(255, 239, 213));
			
			JButton btnKeyboard = new JButton("Upgrade!");
			//when the user clicked upgrade button of keyboard
			btnKeyboard.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			btnKeyboard.setForeground(new Color(240, 248, 255));
			btnKeyboard.setFont(new Font("Arial", Font.BOLD, 13));
			btnKeyboard.setBackground(new Color(255, 0, 255));
			GroupLayout gl_panel_Keyboard = new GroupLayout(panel_Keyboard);
			gl_panel_Keyboard.setHorizontalGroup(
				gl_panel_Keyboard.createParallelGroup(Alignment.LEADING)
					.addGap(0, 456, Short.MAX_VALUE)
					.addGap(0, 456, Short.MAX_VALUE)
					.addGroup(gl_panel_Keyboard.createSequentialGroup()
						.addGroup(gl_panel_Keyboard.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_Keyboard.createSequentialGroup()
								.addGap(12)
								.addComponent(lblKeyboard, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
								.addGap(12)
								.addComponent(lblKeyboard_cost, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_Keyboard.createSequentialGroup()
								.addContainerGap()
								.addComponent(txtKeyboard, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnKeyboard, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
						.addGap(6))
			);
			gl_panel_Keyboard.setVerticalGroup(
				gl_panel_Keyboard.createParallelGroup(Alignment.LEADING)
					.addGap(0, 175, Short.MAX_VALUE)
					.addGap(0, 175, Short.MAX_VALUE)
					.addGroup(gl_panel_Keyboard.createSequentialGroup()
						.addGap(10)
						.addGroup(gl_panel_Keyboard.createParallelGroup(Alignment.LEADING)
							.addComponent(lblKeyboard, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblKeyboard_cost, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
						.addGroup(gl_panel_Keyboard.createParallelGroup(Alignment.TRAILING)
							.addComponent(txtKeyboard, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnKeyboard, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
			);
			panel_Keyboard.setLayout(gl_panel_Keyboard);
			
			JPanel panel_JDK = new JPanel();
			splitPane_2.setRightComponent(panel_JDK);
			
			JLabel lblJDK = new JLabel("JDK Upgrade (1/21)");
			lblJDK.setForeground(new Color(0, 191, 255));
			lblJDK.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
			
			JLabel lblJDK_cost = new JLabel("cost: ");
			lblJDK_cost.setForeground(new Color(0, 191, 255));
			lblJDK_cost.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 22));
			
			JTextArea txtJDK = new JTextArea();
			txtJDK.setText("Looks like you\u2019ll need to do a lot of \r\nGoogling.\r\n- Increases LOC generated from clicking \r\nby 1\r\n");
			txtJDK.setFont(new Font("Arial", Font.PLAIN, 17));
			txtJDK.setEditable(false);
			txtJDK.setBackground(new Color(255, 239, 213));
			
			JButton btnJDK = new JButton("Upgrade!");
			//when the user clicked upgrade button of JDK
			btnJDK.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			btnJDK.setForeground(new Color(240, 248, 255));
			btnJDK.setFont(new Font("Arial", Font.BOLD, 13));
			btnJDK.setBackground(new Color(0, 191, 255));
			GroupLayout gl_panel_JDK = new GroupLayout(panel_JDK);
			gl_panel_JDK.setHorizontalGroup(
				gl_panel_JDK.createParallelGroup(Alignment.LEADING)
					.addGap(0, 456, Short.MAX_VALUE)
					.addGap(0, 456, Short.MAX_VALUE)
					.addGroup(gl_panel_JDK.createSequentialGroup()
						.addGroup(gl_panel_JDK.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_JDK.createSequentialGroup()
								.addGap(12)
								.addComponent(lblJDK, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
								.addGap(12)
								.addComponent(lblJDK_cost, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_JDK.createSequentialGroup()
								.addContainerGap()
								.addComponent(txtJDK, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnJDK, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
						.addGap(6))
			);
			gl_panel_JDK.setVerticalGroup(
				gl_panel_JDK.createParallelGroup(Alignment.LEADING)
					.addGap(0, 175, Short.MAX_VALUE)
					.addGap(0, 175, Short.MAX_VALUE)
					.addGroup(gl_panel_JDK.createSequentialGroup()
						.addGap(10)
						.addGroup(gl_panel_JDK.createParallelGroup(Alignment.LEADING)
							.addComponent(lblJDK, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblJDK_cost, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
						.addGroup(gl_panel_JDK.createParallelGroup(Alignment.TRAILING)
							.addComponent(txtJDK, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnJDK, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
			);
			panel_JDK.setLayout(gl_panel_JDK);
			
			
		}
	}

