package day07.com.ict.edu;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//첫번째 숫자 받기 (계산기) 1번을 누르면 첫번째 두번째가 더헤져서 나와야함 
		//두번째 숫자 받기
		//연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ") 더블 메스사용안됨
		
		System.out.print("첫번째 수 : ");
		int s1 = scan.nextInt();
		
		System.out.print("두번째 수 : ");
		int s2 = scan.nextInt();
		
		System.out.print("연산자 : \n1 => + \n2 => - \n3 => * \n4 =>  / \n>>>>    ");
		int op = scan.nextInt();
		
		double res = 0.0 ;
		String oper ="";
		
		if (op==1) {
			res = s1+s2;
			oper = "+";
		}else if (op==2) {
			res = s1-s2;
			oper = "-";
		}else if (op==3) {
			res = s1*s2;
			oper = "*";
		}else if (op==4) {
			res = (int)(s1*10/s2)/10.0;
			oper = "/";
		}
		System.out.println(s1 + oper + s2 + "=" + res );
	}
}
