package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex08_JTextComponent extends JFrame{
	public Ex08_JTextComponent() {
		super("JTextComponent");
		
		JPanel jp = new JPanel();
		
		// JLabel : 글자를 표시한다. 수정불가
		JLabel jLabel = new JLabel();
		
		jLabel.setText("I D : ");
		
		JLabel jLabe2 = new JLabel("P W : ");
		JLabel jLabe3 = new JLabel("자기소개서");
		
		
		//한줄 글자 입력 : JTextField
		JTextField jtf1 = new JTextField();
		jtf1.setText("아이디 입력");
		jtf1.setColumns(20); //보이는 글자 길이
		
		// JTextField jtf2 = new JTextField("비번입력", 20);
		// 입력된 글자가 ***** 표시 되기 위해서 JPasswordField
		JPasswordField jtf2 = new JPasswordField("비번입력", 10);
		
		
		// 메모장과 같이 여러 줄 글자 입력 : JTextArea(행,열);
		JTextArea jta = new JTextArea(5, 20);
		
		// JTextArea는 두가지 옵션을 생각해야 된다.
		// 자동 줄바꿈
		jta.setLineWrap(true);
		
		//스크롤기능
		// NEEDED(필요할 떄만 나옴), ALWAYS(항상 나와있다), NEVER(필요없음)
		JScrollPane jsp = new JScrollPane(jta,
					ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,  // 세로 
					ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER  // 가로 
				);
		
		
		jp.add(jLabel);
		jp.add(jtf1);
		jp.add(jLabe2);
		jp.add(jtf2);
		jp.add(jLabe3);
		jp.add(jsp);
		
		add(jp);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-500, ds.height/2-200, 1000, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex08_JTextComponent();
	}
}
