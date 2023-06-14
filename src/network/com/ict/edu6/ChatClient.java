package network.com.ict.edu6;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import oracle.jdbc.driver.parser.Tuple;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ChatClient extends JFrame implements Runnable {
	JPanel contentPane;
	JTextField nickname_tf;
	JButton join_bt;
	JPanel card1;
	JPanel card2;
	JTextField input_tf;
	JButton send_bt;
	JTextArea jta;
	JScrollPane jsp;
	CardLayout cardLayout;
	
	// 접속
	Socket s = null;
	ObjectOutputStream out = null;
	ObjectInputStream in = null;
	
	public ChatClient() {
		super("멀티캐스팅 ver 0.2");
		cardLayout = new CardLayout();
		
		setSize(380,550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(cardLayout);
		add(contentPane);

		card1 = new JPanel();
		contentPane.add(card1, "login");
		card1.setLayout(new BorderLayout());

		JPanel jp1 = new JPanel();
		card1.add(jp1, BorderLayout.SOUTH);
		jp1.setLayout(new GridLayout(2, 1));

		JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp2.add(new JLabel("닉네임 : "));

		nickname_tf = new JTextField(10);
		jp2.add(nickname_tf);

		jp1.add(jp2);

		JPanel jp3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		join_bt = new JButton(" 입장하기 ");
		jp3.add(join_bt);

		jp1.add(jp3);

		JLabel img = new JLabel("");
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setIcon(new ImageIcon(ChatClient.class.getResource("/images/talk.png")));
		card1.add(img, BorderLayout.CENTER);

		card2 = new JPanel();
		contentPane.add(card2, "chat");
		card2.setLayout(new BorderLayout());

		jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setEditable(false);
		jta.setBackground(Color.LIGHT_GRAY);
		jta.setForeground(Color.WHITE);
		jta.setFont(new Font("굴림", Font.PLAIN, 15));
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		card2.add(jsp, BorderLayout.CENTER);

		JPanel jp4 = new JPanel(new BorderLayout());
		input_tf = new JTextField();
		jp4.add(input_tf, BorderLayout.CENTER);
		send_bt = new JButton("보내기");
		jp4.add(send_bt, BorderLayout.EAST);

		card2.add(jp4, BorderLayout.SOUTH);

		join_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// cardLayout.show(contentPane, "chat");
				// 사용자 닉네임 받기
				String name = nickname_tf.getText().trim();
				if(name.length()>0) {
					
				} else {
					JOptionPane.showMessageDialog(getParent(), "닉네임 입력하세요");
					nickname_tf.setText("");
					nickname_tf.requestFocus();
				}
				
			}
		});
	}

	@Override
	public void run() {

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				ChatClient cc = new ChatClient();
				cc.setVisible(true);

			}
		});
	}
}
