package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class CalcFrame2 extends JFrame {
	
	private JPanel panelDown;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	
	private JButton btn;
	private JButton btn2;
	private JButton btn3;
	
	private JTextField tf;

	public CalcFrame2(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(1300, 300);
		setSize(350, 500);
		setLayout(new BorderLayout(30, 20));
		
		panelNorth();

		panelCenter();
		
		panelSouth();

		setVisible(true);
	}

	private void panelNorth() {
		String[] menu = { "MC", "MR", "M+", "M-", "MS", "M▼"};
		
		
		panel3 = new JPanel(new GridLayout(1, 6));
		for(int i=0; i<6; i++) {
		btn2 = new JButton(menu[i]);
		panel3.add(btn2);
		}
		add(panel3, BorderLayout.NORTH);
	}
	
	private void panelCenter() {
		tf = new JTextField(10);
		add(tf, BorderLayout.CENTER);
	}

	private void panelSouth() {
		String[] name = { "%", "CE", "C", "<-", "1/x", "x²", "2루트x", "÷",
				"7", "8", "9", "×", "4", "5", "6", "-", 
				"1", "2", "3", "+", "+/-", "0", ".", "="};
		
		panelDown = new JPanel(new GridLayout(6, 4, 5, 5));
		for(int j=0; j<24; j++) {
			btn3 = new JButton(name[j]);
			panelDown.add(btn3);
		}
		add(panelDown, BorderLayout.SOUTH);
	}
}
	
