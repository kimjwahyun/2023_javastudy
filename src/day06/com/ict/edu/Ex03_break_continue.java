package day06.com.ict.edu;

import java.util.Iterator;

public class Ex03_break_continue {
	public static void main(String[] args) {
		// break 와 continue
		// break : 현재위치의 블록을 탈출하는 예약어(명령어)
		// continue : continue문을 만나면 아래 수행문을 포기하고, 다음회차를 하기 위해서 증감식으로 이동
		// 보통 if문과 함께 사용한다.
		// break 는 for문과 while문에 모두 사용, continue는 for문에 사용(while문에 사용 가능)
		
		// 1-10 출력
	    for (int i = 1; i < 11 ; i++) {
			System.out.print(i + " ");
		}
	    System.out.println();
	    
	 // 1-10 출력 6 일때 break 사용
	    for (int i = 1; i < 11 ; i++) {
	    	if(i == 6) break;
			System.out.print(i + " "); // 실행문 보다 위에 있기 때문에 5까지만 찍힌다.
		}
	    System.out.println();
	    
	    for (int i = 1; i < 11 ; i++) {
	    	System.out.print(i + " ");  // i=6 을 먼저 실행을 하고 나서 빠져나간다.
	    	if(i == 6) break;
		}
	    System.out.println();
	    System.out.println("===================");
	    
	 // 1-10 출력 6 일때 continue 사용
	    for (int i = 1; i < 11 ; i++) {
	    	if(i == 6) continue;
			System.out.print(i + " ");  // 6과 continue가 만나면 실행을 안하기 때문에 6 빼고 나머지 숫자가 찍힌다.
		}
	    System.out.println();
	    
	    for (int i = 1; i < 11 ; i++) {
	    	System.out.print(i + " ");  // 실행하고자 하는 문장을 무조건 continue 밑에 적어야한다.
	    	if(i == 6) continue;  		// continue 와 for문의 끝은 증감식으로 가기때문에 실행하고자 하는걸 못한다.
		}
	    System.out.println();
	    System.out.println("===================");
	    
	    // 0-10 홀수만 출력하자 (일반적인 (if))
	    for (int i = 0; i < 11; i++) {
	    	if (i%2 == 1) {
				System.out.println(i);
			}	
	    }
	    System.out.println("===================");
	    
	    // 0-10 홀수만 출력하자 (continue)
		for (int i = 0; i < 11; i++) {
		    if (i%2 == 0) continue;     // 짝수일 때는 실행 안한다.
		    	System.out.println(i);
				
		}
	    
	}
}








