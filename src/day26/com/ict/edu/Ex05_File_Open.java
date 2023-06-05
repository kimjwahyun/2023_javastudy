package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
// 1조 팀원끼리 한거
public class Ex05_File_Open extends JFrame implements ActionListener{
	JPanel jp;
	JTextArea jta;
	JButton jb1;
	JTextField jtf;
	JLabel jl;
	public Ex05_File_Open() {
		super("불러오기");
		
		jp = new JPanel();
		jl = new JLabel("파일경로 : ");
		jtf = new JTextField(20);
		jb1 = new JButton("열기");
		jta = new JTextArea(20,0);
		jta.setLineWrap(true); // 자동 줄바꾸기
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jp.add(jl);
		jp.add(jtf);
		jp.add(jb1);
		
		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		setSize(400,600);
		setLocale(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String pathname = jtf.getText();
				
				File file = new File(pathname);
		        FileInputStream fis = null;
		        BufferedInputStream bis = null;
		        try {
		            fis = new FileInputStream(file);
		            bis = new BufferedInputStream(fis);

		            byte[] b = new byte[(int)file.length()];
		            bis.read(b);
		            String msg = new String(b);
		          // input으로 가져온 데이터 출력부.
		            System.out.println(msg);
		            jta.append(msg);
		        } catch (Exception e2) {
		            e2.printStackTrace();
		        }finally {
		            try {
		                bis.close();
		                fis.close();
		            } catch (Exception e3) {
		                // TODO: handle exception
		            }
		        }
		    }
				
			});
	}
	public static void main(String[] args) {
		new Ex05_File_Open();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
