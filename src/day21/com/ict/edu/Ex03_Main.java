package day21.com.ict.edu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03_Main extends JFrame{
	JPanel jp;
	JButton jb1,jb2;
	public Ex03_Main() {
		super("여러 창 사용하기"); // 카드레이아웃은 아니고 카드효과 한 프레임에 다 넣기
		jp = new JPanel();
		jb1 = new JButton("회원가입");
		jb2 = new JButton("로그인");
		
		jp.add(jb1);
		jp.add(jb2);
		
		add(jp);
		
		setSize(500,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false); // 실제로 꺼진거는 아니고 안보이게 함 (새로운 창 나오고 본인 창은 안나온다)
				// 익명 내부클래스에서는
				// this를 사용할 때, 클래스.this를 사용해야 된다. 
				new Ex03_Join(Ex03_Main.this); 
			}
		});
	}
	public static void main(String[] args) {
		new Ex03_Main();
	}
}
