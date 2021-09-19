
package clickerGame;

	import java.awt.*;
	import javax.swing.*;
	import java.awt.event.*;
	import java.sql.PreparedStatement;
	import java.util.*;
	import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.Timer;
import java.io.*;
import java.util.Scanner;

public class Main {
		static JFrame frame = new JFrame();
		private static JTextField txtInputCode;
		static JLabel lblLOC = new JLabel("New label");
		static final JLabel lblCodes = new JLabel("New label", SwingConstants.CENTER);
		static ArrayList<String> textboxWords = new ArrayList<String>();
		private static final JLabel lblPerSec = new JLabel("");
		static JScrollPane scrollPane = new JScrollPane();
		public static Timer timer;

		public static int loc = 0; // variable that stores the total LOC count
		public static double locDecimal = 0.0;
		public static double locTime = 0.0; // variable that counts how many LOCs are gained per second
		public static int stackOverflowCount = 0; // counts  how many times each upgrade has been purchased
		public static int gitHubCount = 0;
		public static int IDECount = 0;
		public static int youtubeCount = 0;
		public static int classmateCount = 0;
		public static int keyboardCount = 0;
		public static int clickBoost = 0;
		public static int keyboardBoost = 0;
		public static int jdkCount = 0;

		//when enter pressed
		private static void locMining(KeyEvent e)
		{
			int rdm = (int)(Math.random() * textboxWords.size());
			restartTimer();
			if(e.getKeyCode() == KeyEvent.VK_ENTER)
			{
				String qCode = lblCodes.getText();
				qCode = qCode.replaceAll(" ", "");
				String inputCode = txtInputCode.getText();
				inputCode = inputCode.replaceAll(" ", "");
				if (qCode.equals(inputCode))
				{
					int plus_loc = (int) (inputCode.length() * (1 + (keyboardBoost/100.0)));
					loc += plus_loc;
					lblLOC.setText(Integer.toString(loc));
					txtInputCode.setText("");
					lblCodes.setText(textboxWords.get(rdm));
				}
				else
				{
					txtInputCode.setText("");
				}
			}
		}

	public static void restartTimer() {
		if (timer != null && timer.isRunning()) {
			timer.stop();
		}
		setTimer();
		timer.start();
	}

	public static void setTimer() {
			timer = new Timer(1000 - (jdkCount * 30), new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					loc += (int) locTime;
					locDecimal += (locTime % 1);
					if (locDecimal >= 1) {
						loc++;
						locDecimal--;
					}
					lblLOC.setText(Integer.toString(loc));
					try {
						setSaveData();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});
		}
		
		public static void GameOn()
		{
			frame.setVisible(true);
		}

	public static void main(String[] args) throws Exception {
		Intro.instruction();
		//adding Strings in textboxWords ArrayList
		textboxWords.add("int i = 0;");
		textboxWords.add("String hello");
		textboxWords.add("for (int i = 0)");
		textboxWords.add("while (true)");
		textboxWords.add("System.out.println");
		textboxWords.add("hot dogs");
		textboxWords.add("public static");
		textboxWords.add("public void main(String[] args)");
		textboxWords.add("f = new JFrame();");
		textboxWords.add("import java.util.Scanner");
		textboxWords.add("#hackthenorth");
		textboxWords.add("int random = Math.random()");
		textboxWords.add("Scanner s = new Scanner");
		textboxWords.add("Hello world!");
		textboxWords.add("hamburgers");
		textboxWords.add("pineapple on pizza");
		textboxWords.add("never gonna give you up");
		textboxWords.add("@everyone");
		textboxWords.add("@Override");
		textboxWords.add("while (false) {}");
		textboxWords.add("do {} while (yes);");
		textboxWords.add("@here");
		textboxWords.add("double num = 6.9;");
		textboxWords.add("if(((!a)&&(b))||((a)&&((!b)||a)))");
		textboxWords.add("never gonna let you down");
		textboxWords.add("textboxWords.add(\"\");");
		textboxWords.add("You're watching Treehouse");
		textboxWords.add("Try Grammarly for Free");
		textboxWords.add("Remember to drink water!");
		textboxWords.add("Sponsored by Raid Shadow Legends");
		textboxWords.add("Sleep is good");
		textboxWords.add("DIAMONDS!");
		textboxWords.add("char a = 'A'");
		textboxWords.add("push through the pain");
		textboxWords.add("help im trapped in a video game-");
		textboxWords.add("whatever floats your boat");
		textboxWords.add("pro is short for programmer B)");
		textboxWords.add("professionally vibing");
		textboxWords.add("deltarune 2!");
		textboxWords.add("to my bestie");
		textboxWords.add("bruh");
		textboxWords.add("swag");
		textboxWords.add("kirbo");
		textboxWords.add("knock your socks off");
		textboxWords.add("Get ad-free listening with Spotify Premium");
		textboxWords.add("Honey is a free browser extension");
		textboxWords.add("i forgor :skull:");
		textboxWords.add("According to Youtube Statistics...");
		textboxWords.add("A man has fallen into the river in Lego City!");
		textboxWords.add("Chug jug with you");
		textboxWords.add("amogus");
		textboxWords.add("red sus");
		textboxWords.add("if ((a % 3) == 2)");
		textboxWords.add("int c = (Math.round(c * 10)) / 10");
		textboxWords.add("Rock paper scissors");
		textboxWords.add("This was written at 11:11 - make a wish!");
		textboxWords.add("new phone who dis");
		textboxWords.add("public class Main{}");
		textboxWords.add("i need more phrases");
		textboxWords.add("insert funny phrase here");
		textboxWords.add("int[] array = new int[6];");
		textboxWords.add("String[] array = {\"hi\", \"how\"}");
		textboxWords.add("java > c++");
		textboxWords.add("my mixtape is fire");
		textboxWords.add("slowly losing my mind creating these");
		textboxWords.add("1/365 chance that today is your birthday");
		textboxWords.add("for (int j = 0; j < 3; j += x)");
		textboxWords.add("Hotel: Trivago");
		textboxWords.add("69th entry nice");
		textboxWords.add("isXTurn = !isXTurn");
		textboxWords.add("megalovania intensifies");
		textboxWords.add("Everything is legal in New Jersey");
		textboxWords.add("crab rave");
		textboxWords.add("Joe? Never heard of him");
		textboxWords.add("Updog");
		textboxWords.add("The 5 stages of grief");
		textboxWords.add("Why is 6 afraid of 7? Because 7 8 9");
		textboxWords.add("Anything and everything, all of the time");
		textboxWords.add("Discord moderators");
		textboxWords.add("who asked");
		
		frame.setBackground(Color.WHITE);
		JPanel pnl1 = new JPanel();
		//pnl1.setBackground(SystemColor.info);
		pnl1.setBackground(new Color(232, 241, 255));

		frame.getContentPane().add(pnl1);
		pnl1.setLayout(null);

		lblCodes.setFont(new Font("Arial", Font.BOLD, 16));
		lblCodes.setBounds(39, 465, 252, 40);
		lblCodes.setText("int i = 0;");
		pnl1.add(lblCodes);

		txtInputCode = new JTextField();
		txtInputCode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				locMining(e);
			}
		});
		txtInputCode.setBounds(39, 500, 252, 40);
		pnl1.add(txtInputCode);
		txtInputCode.setColumns(10);
		lblLOC.setFont(new Font("Arial", Font.BOLD, 25));
		lblLOC.setBounds(39, 63, 252, 77);
		pnl1.add(lblLOC);
		lblLOC.setText(Integer.toString(loc));
		lblPerSec.setFont(new Font("????", Font.PLAIN, 13));
		lblPerSec.setBounds(39, 150, 252, 40);
		lblPerSec.setText(locTime + " lines of code / sec");

		pnl1.add(lblPerSec);

		JPanel panel = new JPanel();
		panel.setBounds(22, 23, 304, 371);
		pnl1.add(panel);
		panel.setBackground(new Color(255, 232, 241));

		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(338, 23, 510, 548);
		pnl1.add(scrollPane);
		storeUI();

		JPanel boatPanel = new JPanel();
		boatPanel.setBounds(65, 200, 200, 160);
		boatPanel.setBackground(new Color(255, 232, 241));
		pnl1.add(boatPanel);
		ImageIcon boat = new ImageIcon("resources/guest200x160.png");

		JButton boatButton = new JButton();
		boatButton.setBackground(new Color(255, 232, 241));
		boatButton.setFocusPainted(false);
		boatButton.setBorder(null);
		boatButton.setIcon(boat);
		boatButton.setOpaque(false);
		boatButton.setContentAreaFilled(false);
		boatButton.setBorderPainted(false);
		boatButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {		
				loc += (clickBoost + 1);
				lblLOC.setText(Integer.toString(loc));
				restartTimer();
			}
		});
		boatPanel.add(boatButton);
		JButton btnNewButton = new JButton("Load");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file = new File("resources\\saveData.txt");
				Scanner scan = null;
				try {
					scan = new Scanner(file);
				} catch (FileNotFoundException ex) {
					ex.printStackTrace();
				}
				String line = scan.nextLine();
				System.out.println(line);
				loc = Integer.parseInt(line);
				locDecimal = Double.parseDouble(scan.nextLine());
				locTime = Double.parseDouble(scan.nextLine());
				stackOverflowCount = Integer.parseInt(scan.nextLine());
				gitHubCount = Integer.parseInt(scan.nextLine());
				IDECount = Integer.parseInt(scan.nextLine());
				youtubeCount = Integer.parseInt(scan.nextLine());
				classmateCount = Integer.parseInt(scan.nextLine());
				keyboardCount = Integer.parseInt(scan.nextLine());
				clickBoost = Integer.parseInt(scan.nextLine());
				keyboardBoost = Integer.parseInt(scan.nextLine());
				jdkCount = Integer.parseInt(scan.nextLine());
			}
		});
		btnNewButton.setBackground(SystemColor.info);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBounds(22, 10, 114, 55);
		pnl1.add(btnNewButton);

		frame.setResizable(false);
		frame.setPreferredSize(new Dimension(870, 630));
		frame.setSize(870, 630);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scrollPane.getVerticalScrollBar().setUnitIncrement(8);
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
			
			final JLabel lblGitHub = new JLabel("GitHub Copilot (0)");
			lblGitHub.setForeground(new Color(0, 0, 0));
			lblGitHub.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
			
			final JLabel lblGitHub_cost = new JLabel("cost: 100");
			lblGitHub_cost.setForeground(new Color(0, 0, 0));
			lblGitHub_cost.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 22));
			
			JTextArea txtGitHub = new JTextArea();
			txtGitHub.setText("Like Grammarly, but better\r\n\r\n- 1 LOC per second.\r\n");
			txtGitHub.setFont(new Font("Arial", Font.PLAIN, 17));
			txtGitHub.setEditable(false);
			txtGitHub.setBackground(new Color(255, 239, 213));
			
			final JButton btnGitHub = new JButton("Upgrade!");
				//when the user clicked upgrade button of GitHub
			btnGitHub.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					restartTimer();
					if (loc >= (int) (100 * (Math.pow(1.1, gitHubCount)))) {
						loc -= (int) (100 * (Math.pow(1.1, gitHubCount)));
						lblGitHub_cost.setText("cost: " + (int) (100 * (Math.pow(1.1, gitHubCount + 1))));
						gitHubCount++;
						lblGitHub.setText("GitHub Copilot (" + gitHubCount + ")");
						locTime += 1;
						locTime = (Math.round(locTime * 10.0)) / 10.0;
						lblLOC.setText(Integer.toString(loc));
						lblPerSec.setText(locTime + " lines of code / sec");
					} else {
						JOptionPane.showMessageDialog(null, "Insufficient Lines of Code!", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
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
			
			final JLabel lblStackOverflow = new JLabel("Stack Overflow (0)");
			lblStackOverflow.setForeground(new Color(255, 99, 71));
			lblStackOverflow.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
			
			final JLabel lblStackOverflow_cost = new JLabel("cost: 15");
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
					restartTimer();
					if (loc >= (int) (15 * (Math.pow(1.1, stackOverflowCount)))) {
						loc -= (int) (15 * (Math.pow(1.1, stackOverflowCount)));
						lblStackOverflow_cost.setText("cost: " + (int) (15 * (Math.pow(1.1, stackOverflowCount + 1))));
						stackOverflowCount++;
						lblStackOverflow.setText("Stack Overflow (" + stackOverflowCount + ")");
						locTime += 0.1;
						locTime = (Math.round(locTime * 10.0)) / 10.0;
						lblLOC.setText(Integer.toString(loc));
						lblPerSec.setText(locTime + " lines of code / sec");
					} else {
						JOptionPane.showMessageDialog(null, "Insufficient Lines of Code!", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
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

			final JLabel lblIDE = new JLabel("Java IDE (0/6)");
			lblIDE.setForeground(new Color(0, 0, 128));
			lblIDE.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));

			final JLabel lblIDE_cost = new JLabel("cost: 10");
			lblIDE_cost.setForeground(new Color(0, 0, 128));
			lblIDE_cost.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 22));
			
			final JTextArea txtIDE = new JTextArea();
			txtIDE.setText("Looks nicer than doing it in Notepad.\r\n- Increases LOC generated from \r\nclicking by 3.\r\n");
			txtIDE.setFont(new Font("Arial", Font.PLAIN, 17));
			txtIDE.setEditable(false);
			txtIDE.setBackground(new Color(255, 239, 213));
			
			final JButton btnIDE = new JButton("Upgrade!");
			//when the user clicked upgrade button of IDE
			btnIDE.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					restartTimer();
					if(loc >= 10 && IDECount == 0) {
						loc -= 10;
						clickBoost = 1;
						lblLOC.setText(Integer.toString(loc));
						IDECount++;
						lblIDE.setText("Paid Java IDE (1/6)");
						txtIDE.setText("You have a proper IDE but you want \r\n more!.\r\n- Increases LOC generated from \r\nclicking by 5.\r\n");
						lblIDE_cost.setText("Cost: 100");
					}
					else if (loc >= 100 && IDECount == 1) {
						loc -= 100;
						clickBoost = 5;
						lblLOC.setText(Integer.toString(loc));
						lblIDE.setText("Ultimate Paid Java IDE (2/6)");
						txtIDE.setText("You have a paid IDE but you want \r\neven more! Increase LOC/click by 25");
						lblIDE_cost.setText("Cost: 1000");
						IDECount++;
					}
					else if (loc >= 1000 && IDECount == 2) {
						loc -= 1000;
						clickBoost = 25;
						lblLOC.setText(Integer.toString(loc));
						lblIDE.setText("Ultimate Paid Java IDE (3/6)");
						txtIDE.setText("You have a paid IDE but you want \r\neven more! Increase LOC/click by 100");
						lblIDE_cost.setText("Cost: 10000");
						IDECount++;
					}
					else if (loc >= 10000 && IDECount == 3) {
						loc -= 10000;
						clickBoost = 100;
						lblLOC.setText(Integer.toString(loc));
						lblIDE.setText("Ultimate Paid Java IDE (4/6)");
						txtIDE.setText("You have a paid IDE but you want \r\neven more!Increase LOC/click by 400");
						lblIDE_cost.setText("Cost: 100000");
						IDECount++;
					}
					else if (loc >= 100000 && IDECount == 4) {
						loc -= 100000;
						clickBoost = 400;
						lblLOC.setText(Integer.toString(loc));
						lblIDE.setText("Ultimate Paid Java IDE (5/6)");
						lblIDE_cost.setText("Cost: 1000000");
						txtIDE.setText("You now have the best of the best!\r\n(but there's an update!)\r\nIncrease LOC/click by 6400");
						IDECount++;
					}
					else if (loc >= 1000000 && IDECount == 5) {
						loc -= 1000000;
						clickBoost = 6400;
						lblLOC.setText(Integer.toString(loc));
						lblIDE.setText("Ultimate Paid Java IDE (6/6)");
						btnIDE.setEnabled(false);
						btnIDE.setText("Purchased");
						txtIDE.setText("You now have the best of the best!");
						IDECount++;
					}
					else if (IDECount > 5) {
						JOptionPane.showMessageDialog(null, "You've already reached the max tier of this upgrade!", "Error",JOptionPane.WARNING_MESSAGE);
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
			
			final JLabel lblYouTube = new JLabel("YouTube Tutorial (0)");
			lblYouTube.setForeground(new Color(220, 20, 60));
			lblYouTube.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
			
			final JLabel lblYouTube_cost = new JLabel("cost: 700");
			lblYouTube_cost.setForeground(new Color(220, 20, 60));
			lblYouTube_cost.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 22));
			
			JTextArea txtYouTube = new JTextArea();
			txtYouTube.setText("\u201CThanks for explaining this 10000x better \r\nthan my teacher!\u201D\r\n\r\n- Produces 5 LOC per second.\r\n");
			txtYouTube.setFont(new Font("Arial", Font.PLAIN, 17));
			txtYouTube.setEditable(false);
			txtYouTube.setBackground(new Color(255, 239, 213));
			
			final JButton btnYouTube = new JButton("Upgrade!");
			//when the user clicked upgrade button of YouTube
			btnYouTube.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					restartTimer();
					if (loc >= (int) (700 * (Math.pow(1.1, youtubeCount)))) {
						loc -= (int) (700 * (Math.pow(1.1, youtubeCount)));
						lblYouTube_cost.setText("cost: " + (int) (700 * (Math.pow(1.1, youtubeCount + 1))));
						youtubeCount++;
						lblYouTube.setText("YouTube Tutorial (" + youtubeCount + ")");
						locTime += 5;
						locTime = (Math.round(locTime * 10.0)) / 10.0;
						lblLOC.setText(Integer.toString(loc));
						lblPerSec.setText(locTime + " lines of code / sec");
					} else {
						JOptionPane.showMessageDialog(null, "Insufficient Lines of Code!", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
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
			
			final JLabel lblClassmate = new JLabel("Friendly \"Classmate\" (0)");
			lblClassmate.setForeground(new Color(46, 139, 87));
			lblClassmate.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 16));
			
			final JLabel lblClassmate_cost = new JLabel("cost: 5000");
			lblClassmate_cost.setForeground(new Color(46, 139, 87));
			lblClassmate_cost.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 22));
			
			JTextArea txtClassmate = new JTextArea();
			txtClassmate.setText("Helps you code 24/7. Doesn't get paid.\r\n\r\n- Produces 15 LOC per second.\r\n");
			txtClassmate.setFont(new Font("Arial", Font.PLAIN, 17));
			txtClassmate.setEditable(false);
			txtClassmate.setBackground(new Color(255, 239, 213));
			
			final JButton btnClassmate = new JButton("Upgrade!");
			//when the user clicked upgrade button of Classmate
			btnClassmate.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					restartTimer();
					if (loc >= (int) (5000 * (Math.pow(1.1, classmateCount)))) {
						loc -= (int) (5000 * (Math.pow(1.1, classmateCount)));
						lblClassmate_cost.setText("cost: " + (int) (5000 * (Math.pow(1.1, classmateCount + 1))));
						classmateCount++;
						lblClassmate.setText("Friendly \"Classmate\" (" + classmateCount + ")");
						locTime += 15;
						locTime = (Math.round(locTime * 10.0)) / 10.0;
						lblLOC.setText(Integer.toString(loc));
						lblPerSec.setText(locTime + " lines of code / sec");
					} else {
						JOptionPane.showMessageDialog(null, "Insufficient Lines of Code!", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
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
			
			JLabel lblKeyboard = new JLabel("Mechanical Keyboard (0)");
			lblKeyboard.setForeground(new Color(255, 0, 255));
			lblKeyboard.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 17));
			
			JLabel lblKeyboard_cost = new JLabel("cost: 1000");
			lblKeyboard_cost.setForeground(new Color(255, 0, 255));
			lblKeyboard_cost.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 22));
			
			JTextArea txtKeyboard = new JTextArea();
			txtKeyboard.setText("""
					Your neighbors show up at your door with a \r
					noise complaint, but you can\u2019t...stop...coding...\r
					- +30% LOC from textbox mining\r
					""");
			txtKeyboard.setFont(new Font("Arial", Font.PLAIN, 15));
			txtKeyboard.setEditable(false);
			txtKeyboard.setBackground(new Color(255, 239, 213));
			
			JButton btnKeyboard = new JButton("Upgrade!");
			//when the user clicked upgrade button of keyboard
			btnKeyboard.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					restartTimer();
					if (loc >= (int) (1000 * (Math.pow(1.1, keyboardCount)))) {
						loc -= (int) (1000 * (Math.pow(1.1, keyboardCount)));
						lblKeyboard_cost.setText("cost: " + (int) (1000 * (Math.pow(1.1, keyboardCount + 1))));
						keyboardCount++;
						lblKeyboard.setText("Mechanical Keyboard (" + keyboardCount + ")");
						keyboardBoost += 30;
						lblLOC.setText(Integer.toString(loc));
					} else {
						JOptionPane.showMessageDialog(null, "Insufficient Lines of Code!", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
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
			
			JLabel lblJDK = new JLabel("JDK Upgrade (0/23)");
			lblJDK.setForeground(new Color(0, 191, 255));
			lblJDK.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
			
			JLabel lblJDK_cost = new JLabel("cost: 300");
			lblJDK_cost.setForeground(new Color(0, 191, 255));
			lblJDK_cost.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 22));
			
			JTextArea txtJDK = new JTextArea();
			txtJDK.setText("Looks like you\u2019ll need to do a lot of \r\nGoogling.\r\n- Decreases LOC/sec timer by 3% \r\nper level \r\n");
			txtJDK.setFont(new Font("Arial", Font.PLAIN, 17));
			txtJDK.setEditable(false);
			txtJDK.setBackground(new Color(255, 239, 213));
			
			JButton btnJDK = new JButton("Upgrade!");
			//when the user clicked upgrade button of JDK
			btnJDK.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					restartTimer();
					if (loc >= (int) (300 * (Math.pow(1.2, jdkCount))) && jdkCount < 23) {
						loc -= (int) (300 * (Math.pow(1.2, jdkCount)));
						lblJDK_cost.setText("cost: " + (int) (300 * (Math.pow(1.2, jdkCount + 1))));
						jdkCount++;
						lblJDK.setText("JDK Upgrade (" + jdkCount + "/23)");
						lblLOC.setText(Integer.toString(loc));
					} else {
						JOptionPane.showMessageDialog(null, "Insufficient Lines of Code!", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
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

		public static void setSaveData() throws Exception {
			PrintWriter out = new PrintWriter("resources\\saveData.txt");
			out.write(loc + "\n" + locDecimal + "\n" + locTime + "\n" + stackOverflowCount + "\n" +
					gitHubCount + "\n" + IDECount + "\n" + youtubeCount + "\n" + classmateCount + "\n" +
					keyboardCount + "\n" + clickBoost + "\n" + keyboardBoost + "\n" + jdkCount);
			out.close();
		}
	}

