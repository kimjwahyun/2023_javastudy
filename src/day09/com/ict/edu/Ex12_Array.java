package day09.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

public class Ex12_Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 학생 수 받기
		System.out.print("학생 수 : ");
		
		int su = scan.nextInt();
		int num = 0;
		int kor = 1;
		int eng = 2;
		int math = 3;
		int[][]arr = new int[su][8]; 
		// 키보드로 번호, 국어, 영어, 수학
		for (int i = 0; i < su; i++) {
			for (int j = 0; j < 4; j++) {
				if(j == num){
					System.out.print("번호를 입력하세요");
					arr[i][num]=scan.nextInt();
				}else if (j == kor) {
					System.out.print("국어점수를 입력하세요");
					arr[i][kor]=scan.nextInt();
				}else if (j == eng) {
					System.out.print("영어점수를 입력하세요");
					arr[i][eng]=scan.nextInt();
				}else if (j == math){
					System.out.print("수학점수를 입력하세요");
					arr[i][math]=scan.nextInt();
				}
			}
		}
		
		// 총점, 평균, 학점, 순위(초기값 지정)
		int sum = 4;
		double avg = 5;
		int hak = 6;
		int rank = 7;
		for (int i = 0; i < su; i++) {
			for (int j = 0; j < 8; j++) {
				if(j == sum){
					arr[i][sum] = arr[i][kor]+arr[i][eng]+arr[i][math];
				}else if (j == avg) {
					arr[i][j] = (int)((arr[i][sum]/3.0)*10/10.0);
				}else if (j ==hak) {
					if (avg>=90) {
						arr[i][hak] = 'A';
					} else if (avg>=80) {
						arr[i][hak] = 'B';
					} else if (avg>=70) {
						arr[i][hak] = 'C';
					} else {
						arr[i][hak] = 'F';
					}
				}
			}
			arr[i][rank] = 1;
		}
		
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if( i == j ){
					continue;
				}else if (arr[i][sum]<arr[j][1]) {
					arr[i][sum]++;
				}
			}
		}
		
		
		// 자리변경을 위한 임시배열 필요
		int [] tmp = new int[0] ;
		
		// 순위로 오름 
		for (int i = 0; i < arr[4].length-1; i++) {
			for (int j = i+1; j < arr[4].length; j++) {
				if(arr[i][4] > arr[j][4]) { // 오름차순
					tmp = arr[4];
					arr[4] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// 출력
		
	}
}
