package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedOutputStream;
import java.io.File;
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

public class Ex05_File_save extends JFrame {
	JPanel jp;
	JTextArea jta;
	JTextField jtf;
	JScrollPane jsp;
	JButton jb1;
	public Ex05_File_save() {
		super("저장하기");
		
		jp = new JPanel();
		jb1 = new JButton("SAVE");
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
		
//		jb1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String pathname = jtf.getText();
//				File file = new File(pathname);
//				FileOutputStream fos = null;
//				BufferedOutputStream bos = null;
//				try {
//					file.createNewFile();
//					fos = new FileOutputStream(file,true);
//					bos = new BufferedOutputStream(fos);
//					byte[] arr = jta.getText().getBytes();
//					bos.write(arr);
//					bos.flush();
//				} catch (FileNotFoundException e1) {
//					e1.printStackTrace();
//				} catch (Exception e2) {
//				}finally {
//					try {
//						bos.close();
//						fos.close();
//					} catch (Exception e3) {
//					}
//				}
//			}
//		});
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f_save();
			}
		});
		jtf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f_save();
			}
		});
		jtf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "저장하기", FileDialog.SAVE);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				// System.out.println(msg);
				if(! msg.equals("nullnull")) {
					jtf.setText(msg);
				}
			}
		});
	}
	private void f_save() {
		String pathname = jtf.getText().trim(); // trim()은 앞뒤 공백 제거
		if(pathname.length() > 0) {
			File file = new File(pathname);
			FileOutputStream fos = null;
			BufferedOutputStream bos = null;
			try {
				fos = new FileOutputStream(file);
				bos = new BufferedOutputStream(fos);
				
				String msg = jta.getText().trim();
				bos.write(msg.getBytes());
				bos.flush();
			} catch (Exception e) {
			} finally {
				try {
					bos.close();
					fos.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
	public static void main(String[] args) {
		new Ex05_File_save();

	}
}