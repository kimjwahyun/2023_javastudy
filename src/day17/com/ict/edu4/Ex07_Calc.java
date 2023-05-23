package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.desktop.ScreenSleepListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex07_Calc extends JFrame {
	public Ex07_Calc() {
		super("회원가입");
		
		
		JPanel np = new JPanel();
		JLabel jl1 = new JLabel("이름 : ");
		JTextField jtf1 = new JTextField(6);
		
		JRadioButton jrb1 = new JRadioButton("남");
		JRadioButton jrb2 = new JRadioButton("여");
		
		JPanel np1 = new JPanel();
		JLabel jl2 = new JLabel("생년월일 : ");
		JTextField jtf2 = new JTextField(5);
		
		JPanel np2 = new JPanel();
		JLabel jl3 = new JLabel("주소 : ");
		JTextField jtf3 = new JTextField(10);
		
		JPanel np3 = new JPanel();
		String[] items= {"부서"};
		JComboBox<String> jcom = new JComboBox<>(items);
	
		
		JPanel np4 = new JPanel(new BorderLayout());
		np3.add(np,BorderLayout.NORTH);
		np3.add(np1,BorderLayout.CENTER);
		np3.add(np2,BorderLayout.SOUTH);
			
		np.add(jl1);
		np.add(jrb1);
		np.add(jrb2);
		
		np2.add(jl3);
		np2.add(jtf3);
		np3.add(jl2);
		np2.add(jtf2);
		
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true); // 자동 줄 바꾸기
		
		// 편집 불가능하게 만들자
		jta.setEditable(false);
		
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계  산");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		add(np3,BorderLayout.NORTH);
		add(jta,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex07_Calc();
	}
}
