package test;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class PlusButton extends JButton{
	
	public PlusButton() {
		setText("+");
		setBounds(390, 160, 50, 27);
     	setFont(new Font("Serif", Font.BOLD, 25));
     	setBackground(new Color(196, 198, 197));
	}
}
