package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex07_File_copy extends JFrame{
	JPanel jp1, jp2;
	JTextField jtf1,jtf2;
	JButton jb;
	String in_path, put_path;
	public Ex07_File_copy() {
		super("복사하기");
		
		jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jtf1 = new JTextField(15);
		jp1.add(new JLabel("원본위치 :"));
		jb = new JButton("복사하기");
		jp1.add(jtf1);
		
		jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp2.add(new JLabel("사본위치 :"));
		jtf2 = new JTextField(15);
		jp2.add(jtf2);
		jp2.add(jb);
		
		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// 원본파일 : LOAD
		jtf1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				// System.out.println(msg);
				if(! msg.equals("nullnull")) {
					jtf1.setText(msg);
				}
			}
		});
		// 사본파일 : SAVE
		jtf2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "저장하기", FileDialog.SAVE);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				// System.out.println(msg);
				if(! msg.equals("nullnull")) {
					jtf2.setText(msg);
				}
			}
		});
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String oldPathName = jtf1.getText().trim();
				String newdPathName = jtf2.getText().trim();
				
				// 파일은 무조건 바이트 스트림 처리 하자.
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				FileOutputStream fos = null;
				BufferedOutputStream bos = null;
				try {
					fis = new FileInputStream(oldPathName);
					bis = new BufferedInputStream(fis);
					fos = new FileOutputStream(newdPathName);
					bos = new BufferedOutputStream(fos);
					
					int b = 0;
					while((b = bis.read())!= -1) {
						bos.write(b);
					}
					bos.flush();
					jtf1.setText("");
					jtf2.setText("");
					
				} catch (Exception e2) {
				} finally {
					try {
						bos.close();
						fos.close();
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
		new Ex07_File_copy();
	}
}
