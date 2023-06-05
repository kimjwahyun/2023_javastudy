package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex04_File_IO {
	public static void main(String[] args) {
		String pathname = "D:/KIM.JH/java1.png";
		String pathname2 = "D:/KIM.JH/util/java1.png";
		
		File file = new File(pathname);
		File file2 = new File(pathname2);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(file2, true);  // 덮어쓰기
			bos = new BufferedOutputStream(fos);
			
			int b =0;
			while((b = bis.read()) != -1) {
				bos.write(b);
			}
			
//			String str = msg;
//			byte[] arr = str.getBytes();
//			fos.write(arr);
//			fos.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
