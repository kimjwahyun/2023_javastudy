package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Ex10_main extends JFrame{
	public Ex10_main() {
		super("JTab_2");
		
		//JPanel을 상속한 클래스 객체로 만들기
		Ex10_Bule blue = new Ex10_Bule();
		Ex10_Cyan cyan = new Ex10_Cyan();
		Ex10_Green green = new Ex10_Green();
		
		// JPanel 들을 JTab에 넣기
		JTabbedPane jtab = new JTabbedPane();
		jtab.addTab("블루 탭", blue);
		jtab.addTab("시안 탭", cyan);
		jtab.addTab("그린 탭", green);
		
		//JTab을 JFrame에 넣자
		add(jtab);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex10_main();
	}
}
