package Homework;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import mybatis.com.ict.edu.DAO;
import mybatis.com.ict.edu.Ex01;
import mybatis.com.ict.edu.VO;

public class Ex02_Main extends JFrame {
	JPanel jp1, jp2, jp3, jp4, jp5, jp6;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	JTextArea jta;
	JScrollPane jsp;

	public Ex02_Main() {
		super("DB 연동 정보");
		jp1 = new JPanel(new GridLayout(0, 2));
		jp2 = new JPanel(new GridLayout(0, 2));
		jp3 = new JPanel(new GridLayout(0, 2));
		jp4 = new JPanel(new GridLayout(0, 2));
		jp5 = new JPanel(new GridLayout(4, 0));
		jp6 = new JPanel();

		jtf1 = new JTextField();
		jtf2 = new JTextField();
		jtf3 = new JTextField();
		jtf4 = new JTextField();

		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");
		jb5 = new JButton(" 지우기 ");
		jb6 = new JButton(" 고치기 ");

		jp1.add(new JLabel("CUSTID  :  ", JLabel.CENTER));
		jp1.add(jtf1);

		jp2.add(new JLabel("NAME  :  ", JLabel.CENTER));
		jp2.add(jtf2);

		jp3.add(new JLabel("ADDRESS  :  ", JLabel.CENTER));
		jp3.add(jtf3);

		jp4.add(new JLabel("PHONE  :  ", JLabel.CENTER));
		jp4.add(jtf4);

		jp5.add(jp1);
		jp5.add(jp2);
		jp5.add(jp3);
		jp5.add(jp4);

		jta = new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);

		jp6.add(jb1);
		jp6.add(jb2);
		jp6.add(jb3);
		jp6.add(jb4);
		jp6.add(jb5);
		jp6.add(jb6);

		add(jp5, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp6, BorderLayout.SOUTH);

		setSize(700, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jta.setFont(new Font("굴림", getFont().PLAIN, 15));

		Scanner scan = new Scanner(System.in);
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				List<VO> list = null;
				list = DAO.getList();
				prn(list);
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				VO vo2 = new VO();
				vo2.setName(jtf2.getText());
				vo2.setAddress(jtf3.getText());
				vo2.setPhone(jtf4.getText());
				int result = DAO.getInsert(vo2);
				if (result > 0) {
					jta.setText("");
					List<VO> list = null;
					list = DAO.getList();
					prn(list);
				}
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf4.setText("");
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				VO vo3 = new VO();
				vo3.setCustid(jtf1.getText());
				int result2 = DAO.getDelete(vo3);
				if (result2 > 0) {
					jta.setText("");
					List<VO> list = null;
					list = DAO.getList();
					prn(list);
				}
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf4.setText("");
			}
		});
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				VO vo2 = new VO();
				//vo2.setCustid(title);
				String custid = scan.next();
				 VO vo = DAO.getOne(custid);
				 prn2(vo);
			}
		});
	}

	public void prn(List<VO> List) {
		jta.append("번호\t이름\t주소\t\t전화번호\n");
		for (VO k : List) {
			jta.append(k.getCustid() + "\t");
			jta.append(k.getName() + "\t");
			jta.append(k.getAddress() + "\t");
			jta.append(k.getPhone() + "\n");
		}
	}

	public void prn2(VO vo) {
		jta.append("번호\t이름\t주소\t전화번호");
		jta.append(vo.getCustid() + "\t");
		jta.append(vo.getName() + "\t");
		jta.append(vo.getAddress() + "\t");
		jta.append(vo.getPhone() + "\n");

	}

	public static void main(String[] args) {
		new Ex02_Main();
	}

}