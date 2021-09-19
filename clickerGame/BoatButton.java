package clickerGame;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class BoatButton extends JButton{

    BoatButton(ImageIcon boat){
        // this.lbLOC = lblLOC;
        this.setBackground(new Color(255, 232, 241));
		this.setFocusPainted(false);
		this.setBorder(null);
		this.setIcon(boat);

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {		
				Main.loc ++;
				Main.lblLOC.setText(Integer.toString(Main.loc));
			}
		});

    }
}