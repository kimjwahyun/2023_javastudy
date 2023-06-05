package day27.com.ict.edu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream과 DataOutputStream
// 기본자료형의 데이터를 주고 받을 때 사용
// ** 반드시 입력순서와 출력순서를 맞춰야 한다.
// 기본생성자가 없어서 BufferedStream 처럼 FIleStream를 이용해야 한다.
// 기본자료형으로 한다. 하지만 순서가 맞지 않으면 글자가 깨진다.

public class Ex01_datasteam {
	public static void main(String[] args) {
		String pathname = "D:/KIM.JH/test03.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			// writeXXXX() => XXX는 기본자료형을 말한다.
			dos.writeChar(97);
			dos.writeChar('A');
			dos.writeInt(245);
			dos.writeDouble(178.95);
			dos.writeBoolean(false);
			dos.writeChar('가');
			dos.writeChar(97);
			dos.writeChar('A');
			dos.flush();
			
			
			// readXXX(), XXX는 기본자료형이다.
			// 반드시 쓰기 순서대로 읽어야 한다.
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			
		} catch (Exception e) {
		}finally {
			try {
				
				dis.close();
				fis.close();
				dos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
