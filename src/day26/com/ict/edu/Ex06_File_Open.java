package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
// 강사님 해설
public class Ex06_File_Open extends JFrame {
	JPanel jp;
	JTextArea jta;
	JTextField jtf;
	JScrollPane jsp;
	JButton jb1;
	public Ex06_File_Open() {
		super("불러오기");
		
		jp = new JPanel();
		jb1 = new JButton("불러오기");
		jtf = new JTextField(20);
		
		jp.add(new JLabel("파일 경로 :"));
		jp.add(jtf);
		jp.add(jb1);
		
		jta = new JTextArea(20, 0);
		jta.setLineWrap(true);
		jta.setEditable(true);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		setSize(500,550);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f_open();
			}
		});
		jtf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f_open();
			}
		});
		jtf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				// System.out.println(msg);
				if(! msg.equals("nullnull")) {
					jtf.setText(msg);
					f_open();
				}
			}
		});
	}
	private void f_open() {
		String pathname = jtf.getText().trim();
		if(pathname.length() > 0) {
			File file = new File(pathname);
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			try {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				
				byte[] b = new byte[(int) file.length()];
				bis.read(b);
				String msg = new String(b).trim(); // trim()은 앞뒤 공백 제거
				jta.setText(msg);
				
				
			} catch (Exception e) {
			} finally {
				try {
					bis.close();
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
	public static void main(String[] args) {
		new Ex06_File_Open();

	}
}