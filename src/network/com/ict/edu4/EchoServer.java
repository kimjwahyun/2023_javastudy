package network.com.ict.edu4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.xml.sax.InputSource;

public class EchoServer implements Runnable {
	ServerSocket ss = null;
	Socket s = null;

	InputStreamReader isr = null;
	BufferedReader br = null;

	OutputStreamWriter osw = null;
	BufferedWriter bw = null;

	public EchoServer() {
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 대기중 ...");

			new Thread(this).start();
		} catch (Exception e) {
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				s = ss.accept();
				isr = new InputStreamReader(s.getInputStream());
				br = new BufferedReader(isr);

				String msg = br.readLine();

				osw = new OutputStreamWriter(s.getOutputStream());
				bw = new BufferedWriter(osw);

				// BufferedWriter 를 사용시 System.lineSeparator() 를 사용 해야한다.
				// Java에는 운영체제 별 개행문자에 대응하기 위해 필요한 메서드를 제공하고 있다.
				// 그것은 바로 System.lineSeparator() 이다.
				msg += System.lineSeparator();
				bw.write(msg);
				bw.flush();
			} catch (Exception e) {
			} finally {
				try {
					s.close();
					bw.close();
					osw.close();
					br.close();
					isr.close();
				} catch (Exception e2) {
				}
			}
		}

	}

	public static void main(String[] args) {
		new EchoServer();
	}
}
