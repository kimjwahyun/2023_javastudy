package day09.com.ict.edu;

import java.util.Scanner;

public class Ex06_Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시험인원이 몇명인가요?");
		int su = scan.nextInt();
	
		String[] name = new String[su];
		int[] kor = new int[su];
		int[] eng = new int[su];
		int[] math = new int[su];
		int[] sum = new int[su];
		double[] avg = new double[su];
		String[] hak = new String[su];
		int[] rank = new int [su];
		
		int i = 0;
		while (i<su) {
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
			System.out.println("국어 점수를 입력하세요");
			kor[i] = scan.nextInt();
			System.out.println("영어 점수를 입력하세요");
			eng[i] = scan.nextInt();
			System.out.println("수학 점수를 입력하세요");
			math[i] = scan.nextInt();
			i++;
		}
		sum = new int[name.length];
		avg = new double[name.length];
		hak = new String[name.length];
		// rank = {};
		for ( i = 0; i < sum.length; i++) {
			sum[i] = kor[i]+eng[i]+math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			if(avg[i]>=90) {
				hak[i] = "A 학점";
			}else if (avg[i]>=80) {
				hak[i] = "B 학점";
			}else if (avg[i]>=70) {
				hak[i] = "C 학점";
			}else {
				hak[i] = "F 학점";
			}
		}
		
		for ( i = 0; i < sum.length; i++) {
			// rank[i] = 1;
			for (int j = 0; j < sum.length; j++) {
				if(sum[i] == sum[j]) continue;
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
	}
		
}
		for ( i = 0; i < sum.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.println(rank[i]+1+"\t");
		}
	}
}
