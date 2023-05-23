package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.desktop.ScreenSleepListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05_Calc extends JFrame {
	public Ex05_Calc() {
		super("성적계산");
		
		JPanel np = new JPanel();
		JLabel jl0 = new JLabel("이름 : ");
		
		JPanel np1 = new JPanel();
		JTextField jtf0 = new JTextField(7);
		JLabel jl1 = new JLabel("국어 : ");
		JTextField jtf1 = new JTextField(7);
		JLabel jl2 = new JLabel("영어 : ");
		JTextField jtf2 = new JTextField(7);
		JLabel jl3 = new JLabel("수학 : ");
		JTextField jtf3 = new JTextField(7);
		
		JPanel np2 = new JPanel(new BorderLayout());
		np2.add(np,BorderLayout.NORTH);
		np2.add(np1,BorderLayout.CENTER);
		
		np.add(jl0);
		np.add(jtf0);
		np1.add(jl1);
		np1.add(jtf1);
		np1.add(jl2);
		np1.add(jtf2);
		np1.add(jl3);
		np1.add(jtf3);
		
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true); // 자동 줄 바꾸기
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		// 편집 불가능하게 만들자
		jta.setEditable(false);
		
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계  산");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		add(np2,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 600,600 );
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex05_Calc();
	}
}
