package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.desktop.ScreenSleepListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex04_Calc extends JFrame {
	public Ex04_Calc() {
		super("계산기");
		
		JPanel np = new JPanel();
		JTextField jtf1 = new JTextField(25);
		
		
		JPanel sp = new JPanel(new GridLayout(5, 3, 5, 5));
		JButton jb1 = new JButton(" 1 ");
		JButton jb2 = new JButton(" 2 ");
		JButton jb3 = new JButton(" 3 ");
		JButton jb4 = new JButton(" 4 ");
		JButton jb5 = new JButton(" 5 ");
		JButton jb6 = new JButton(" 6 ");
		JButton jb7 = new JButton(" 7 ");
		JButton jb8 = new JButton(" 8 ");
		JButton jb9 = new JButton(" 9 ");
		JButton jb10 = new JButton(" 0 ");
		JButton jb11 = new JButton(" + ");
		JButton jb12 = new JButton(" - ");
		JButton jb13 = new JButton(" * ");
		JButton jb14 = new JButton(" / ");
		JButton jb15 = new JButton(" = ");
		
		
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		sp.add(jb4);
		sp.add(jb5);
		sp.add(jb6);
		sp.add(jb7);
		sp.add(jb8);
		sp.add(jb9);
		sp.add(jb10);
		sp.add(jb11);
		sp.add(jb12);
		sp.add(jb13);
		sp.add(jb14);
		sp.add(jb15);
		
//		jb1.setBounds(10, 100, 10, 100);
//		jb2.setBounds(10, 10, 10, 10);
//		jb3.setBounds(10, 10, 10, 10);
		
		np.add(jtf1);
		
//		JTextArea jta = new JTextArea();
//		jta.setLineWrap(true); // 자동 줄 바꾸기
//		JScrollPane jsp = new JScrollPane(jta,
//				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
//				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//		// 편집 불가능하게 만들자
//		jta.setEditable(false);
		
		
		
		//np.add();
		
		add(np);
		
		add(np,BorderLayout.NORTH);
		//add(jsp,BorderLayout.CENTER);
		add(sp,BorderLayout.CENTER);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 350, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex04_Calc();
	}
}
