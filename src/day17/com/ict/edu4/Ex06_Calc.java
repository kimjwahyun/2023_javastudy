package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.desktop.ScreenSleepListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex06_Calc extends JFrame {
	public Ex06_Calc() {
		super("카페 주문");
		
		JPanel np = new JPanel();
		JLabel jl0 = new JLabel("원하는 음료 선택하세요");
		
		JPanel np1 = new JPanel();
		JRadioButton jrb1 = new JRadioButton("아메리카노(3000)");
		JRadioButton jrb2 = new JRadioButton("카페모카(4000)");
		JRadioButton jrb3 = new JRadioButton("카페라떼(3500)");
		JRadioButton jrb4 = new JRadioButton("과일쥬스(3000)");
		
		JPanel np2 = new JPanel();
		JLabel jl1 = new JLabel("수량 : ");
		JTextField jtf1 = new JTextField(5);
		JLabel jl2 = new JLabel("입금액 : ");
		JTextField jtf2 = new JTextField(5);
	
		JPanel np3 = new JPanel(new BorderLayout());
		np3.add(np,BorderLayout.NORTH);
		np3.add(np1,BorderLayout.CENTER);
		np3.add(np2,BorderLayout.SOUTH);
			
		np.add(jl0);
		
		np1.add(jrb4);
		np1.add(jrb1);
		np1.add(jrb2);
		np1.add(jrb3);
		
		np2.add(jl1);
		np2.add(jtf1);
		np2.add(jl2);
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
		new Ex06_Calc();
	}
}
