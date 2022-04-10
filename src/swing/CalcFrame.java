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

public class CalcFrame extends JFrame {
	
	private JPanel panelUp;
	private JPanel panelDown;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	
	private JButton btn;
	private JButton btn2;
	private JButton btn3;
	
	private JTextField tf;
	private JTextField tf2;
	
	public CalcFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(1300, 300);
		setSize(350, 500);
		setLayout(new GridLayout(2, 1));
		
		panelUp();

		panelDown();

		setVisible(true);
	}

	private void panelUp() {
		String[] menu = { "MC", "MR", "M+", "M-", "MS", "M▼"};
		
		panelUp = new JPanel(new GridLayout(3, 1));
		
		panel1 = new JPanel(new FlowLayout());
		btn = new JButton("표준");
		panel1.add(btn);
		
		panel2 = new JPanel(new GridLayout(2, 1));
		tf = new JTextField(10);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		tf2 = new JTextField(10);
		tf2.setHorizontalAlignment(JTextField.RIGHT);
		panel2.add(tf);
		panel2.add(tf2);
		
		panel3 = new JPanel(new GridLayout(1, 6));
		for(int i=0; i<6; i++) {
		btn2 = new JButton(menu[i]);
		panel3.add(btn2);
		}
		add(panelUp);
		
		panelUp.add(panel1);
		panelUp.add(panel2);
		panelUp.add(panel3);
	}

	private void panelDown() {
		String[] name = { "%", "CE", "C", "<-", "1/x", "x²", "2루트x", "÷",
				"7", "8", "9", "×", "4", "5", "6", "-", 
				"1", "2", "3", "+", "+/-", "0", ".", "="};
		
		panelDown = new JPanel(new GridLayout(6, 4, 2, 2));
		for(int j=0; j<24; j++) {
			btn3 = new JButton(name[j]);
			panelDown.add(btn3);
		}
		add(panelDown);
	}
}
	
