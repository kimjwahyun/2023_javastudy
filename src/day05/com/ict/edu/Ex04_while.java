package day05.com.ict.edu;

public class Ex04_while {
	public static void main(String[] args) {
		// while문 : for 문과 같은 반복문
		// 형식)
		//     초기식;
		//     while(조건식){
		//     조건식이 참이면 실행할 문장;
		//     조건식이 참이면 실행할 문장;
		//     증감식;
		//    }
		// while 문의 끝을 만나면 조건식으로 간다.
		
		// 형식2)
		//	     초기식;
		//     while(true){
		//     if(빠져나갈 조건 (형식1의 조건식의 부등호와는 반대)){ 
		//       break;
		//     }
		//     조건식이 참이면 실행할 문장;
		//     조건식이 참이면 실행할 문장;
		//     증감식;
		//    }
		// while 문의 끝을 만나면 조건식으로 간다.
		
		//1 - 10 까지 출력하자
		int i = 1 ;
		while (i < 11) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("===============");
		
		i = 1 ;
		while(true) {
			if(i >= 11)break;
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("===============");
		// 0-10 까지 짝수만 출력
		i = 0 ;
		while (i<11) {
			if(i%2 == 0)
				System.out.println("i ="+i);
			i++ ; 
		}
		System.out.println("===============");
		
		// 구구단 중 7단 출력하기
		i = 1 ;
		while (i<10) {
			System.out.println("7*"+i+"="+(7*i));
			i++;	
		}
		System.out.println("===============");
		
		// 1-10 누적합 (합계 구하기)
		i = 1 ;
		int sum = 0 ; 
		while (i<11) {
			sum = sum + i;
			i++;
		}
		System.out.println("누적합 : " + sum);
		
		System.out.println("===============");
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		i= 1;
		while (i<5) {
			System.out.println(" 0 0 0 0 ");
			i++;
		}
		System.out.println("===============");
		
		i= 1;
		while (i<17) {
			System.out.print("0 ");
			if(i%4==0) {
				System.out.println();
			}
			i++;
		}
		System.out.println("===============");
		
		int e=1;
		i= 0 ; 
		while (e<5) {
			System.out.println( i + " " + i + " " + i + " " + i);
			e++;
		}
		System.out.println("===============");
		
		i= 0;
		while (i<4) {
			int j = 0;
			while (j<4) {
				System.out.print("0 "); //System.out.println(0*j+" ");
				j++ ;
				}
			System.out.println();
			i++ ;
			}
	}
}
