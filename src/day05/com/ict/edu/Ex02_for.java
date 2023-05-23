package day05.com.ict.edu;

import java.util.Iterator;

public class Ex02_for {
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문을 반복 처리 한다.
		// 형식) for(초기식; 조건식; 증감식){
		//        조건식이 참일때 실행할 문장;
		//        조건식이 참일때 실행할 문장;
		//        조건식이 참일때 실행할 문장;
		//     }
		// ** for문을 만나면 무조건 초기식으로 이동
		//	  초기식은 조건식으로 이동
		//    조건식이 참이면 for문 실행, 거짓이면 for문을 실행하지 않는다.
		//    for문의 끝을 만나면 무조건 증감식으로 간다.
		
		// {}에서 만들어진 변수는 {}밖을 벗어나면 사라진다.(사용불가)
		
		//안녕하세요를 열번 출력하기
		for (int i = 1; i < 11; i++) {
			System.out.println(i +" = 안녕하세요");
		}
		
		// 0~10까지 출력
		for (int i = 0; i < 11; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// 0-10까지 짝수만 출력
		for (int i = 0; i < 11; i = i+2){
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i = 0; i < 11; i++) {
			if(i %2 ==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		// 구구단 중 7단 출력하기
		for (int i = 0; i < 10; i++) {
			System.out.println("7*" + i + " = " + (7*i) );
		}
		
		// 1-10 누적합 (합계 구하기)
		// 이전저장변수 = 0
		// 누적합 : 이전저장변수 = 이전저장변수 + 현재값 ; 
		
		// 이전저장변수 = 1
		// 누적곱 : 이전저장변수 = 이전저장변수 * 현재값 ;
		
		int sum =0 ;
		for (int i = 1; i < 11; i++) {
			sum = sum + i ;
		}
		System.out.println("누적합 : " + sum);
		
		// 0-10까지 짝수의 누적합
		int even = 0 ;
		for (int i = 0; i < 11; i++) {
			if(i % 2 == 0) {
				even = even + i ;
			}
		}
		System.out.println("짝수의 누적합 : " + even);
		
		// 7! 7*6*5*4*3*2*1 ;
		int su1 = 1 ;
		for (int i = 7; i > 0; i--) {
			su1 = su1 * i ;
		}
		System.out.println("7! = "+ su1);
		
		// 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10)
		// FOR문을 이용한 누적합 (if else 사용)
		int sum2 = 0;
		for (int i = 1; i < 11; i++) {
			if (i%2 == 0) {
				sum2 = sum2 + (i*(-1)) ;
			} else {
				sum2 = sum2 + i;
				}
		}
		System.out.println("누적합 : " + sum2);
		System.out.println();
		
		// if~ else문 사용
		// 농구공 5개씩 한 박스에 들어간다. 
		// 40개면 8상자,  26개면 6상자이다.
		
		int ball = 26;
		int box = 0;
		
		if (ball%5 == 0) {
			box = ball/5;
		} else {
			box = (ball/5)+1;
		}
		System.out.println("농구공 "+ball+"개는 "+box+"상자 입니다.");
		System.out.println();
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// for문으로 풀기
		int j = 1;
		for (int i = 1; i < 5; i++) {
			System.out.println(" 0 0 0 0");
		}
		System.out.println();
		
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		int a = 1;
		for (int i = 1; i < 5; i++) {
			for (int k = 0; k < args.length; k++) {
				
			}
		}
	}
}









