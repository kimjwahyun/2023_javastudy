package day09.com.ict.edu;

import java.util.Scanner;

public class Ex12_해석 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 학생 수 받기
		System.out.print("학생 수 : ");
		int su = scan.nextInt();
		double[][] arr = new double[su][8];
		for (int i = 0; i < arr.length; i++) {
			// ** for문이 실행 될 때마다 한사람의 정보를 담을 수 있는 배열을 만들자.
			double[] p = new double[8];  //new 가 있으면 새로 폴더가 만들어진다. for문 안에서는 선언이 여러번 된다.(오류안남)
			
			// 키보드로 번호, 국어, 영어, 수학
			System.out.print("번호 : ");
			p[0] = scan.nextInt();
			
			System.out.print("국어 : ");
			p[1] = scan.nextInt();
			
			System.out.print("영어 : ");
			p[2] = scan.nextInt();
			
			System.out.print("수학 : ");
			p[3] = scan.nextInt();
			
			// 총점, 평균, 학점, 순위(초기값지정)
			p[4] = p[1]+p[2]+p[3] ;
			
			p[5] = (int)(p[4]/3.0*10)/10.0;
			
			if (p[5] >= 90) {
				p[6] ='A';
			}else if (p[5] >= 80) {
				p[6] ='B';
			}else if (p[5] >= 70) {
				p[6] ='C';
			}else {
				p[6] ='F';
			}
			p[7] = 1 ;
			// ** 다차원 배열에 넣자
			arr[i] = p;
		}
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
			    // if(i == j)continue; (생략가능)
				if(arr[i][4] < arr[j][4]);{
					arr[i][7]++;
				}
			}
		}
		// 순위로 오름차순 정렬
		// 자리를 변경하기 위해서 임시
		double[] tmp = new double[8];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i][7] > arr[j][7]);{
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			} 
		}
		
		
		// 출력
		System.out.println("번 호\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// 국어, 영어, 수학은 출력에서 제외
				if(j == 1 || j == 2 || j == 3)continue;
				if(j == 5) {
					System.out.print(arr[i][j]+"\t");
				}else if(j == 6 ){
					System.out.print((char)(arr[i][j])+"\t");
				}else {
					System.out.print((int)(arr[i][j])+"\t");
				}
			}
			System.out.println();
		}
			
	}
}

