import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoatClickerMain implements ActionListener {
    private JFrame f;
    private JPanel p;
    private Icon i;
    private JLabel textboxLabel;
    private JLabel showCounter;
    private JTextField field;
    private JButton b;
    private int linesOfCode; // variable containing total lines of code

    public BoatClickerMain() {
        String[] textboxWords = {"int i = 0;", "String hell", "for (int i = 0)", "while (true)", "System.out.println", "hot dogs",
                "ur mom", "public static", "void main", "+1 Line of Code!", "f = new JFrame();", "import java.util.Scanner",
                "#hackthenorth", "int random = Math.random()", "Scanner s = new Scanner"}; //array containing the Strings that can randomly appear in the typing section
        f = new JFrame();
        textboxLabel = new JLabel();
        showCounter = new JLabel("LOCs: 0", SwingConstants.CENTER);
        p = new JPanel();
        b = new JButton(i);
        b.addActionListener(this);
        field = new JTextField(10);
        p.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
        p.setLayout(new GridLayout(0, 1));
        p.add(showCounter);
        p.add(textboxLabel);
        p.add(field);
        p.add(b);

        f.add(p, BorderLayout.CENTER);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Our GUI");
        f.pack();
        f.setVisible(true);
        field.setTransferHandler(null);
        while (true) {
            int random = (int) (Math.random() * textboxWords.length);
            textboxLabel.setText("Type out \"" + textboxWords[random] + "\"!");
            while (true) {
                if (field.getText().equals(textboxWords[random])) {
                    linesOfCode += textboxWords[random].length() / 2;
                    field.setText("");
                    showCounter.setText("LOCs: " + linesOfCode);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        new BoatClickerMain();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        linesOfCode+=1;
        showCounter.setText("LOCs: " + linesOfCode);
    }
}