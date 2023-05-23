package day04.com.ict.edu;

public class Ex05_multi_if {
	public static void main(String[] args) {
		// 다중 if문
		// 형식) if(조건식1){
		//        	조건식1이 참일때 실행할 문장 ;
		//        	조건식1이 참일때 실행할 문장 ;
		//      }else if(조건식2){
		//        	조건식1는 거짓이면서 조건식2가 참일때 실행할 문장 ;
		//        	조건식1이 거짓이면서 조건식2가 참일때 실행할 문장 ;
		//      }else if(조건식3){
		//      	조건식1,2는 거짓이면서 조건식3가 참일때 실행할 문장 ;
		//      	조건식1,2이 거짓이면서 조건식3가 참일때 실행할 문장 ;
		//      }else{
		//          조건식1,2,3 모두 거짓인 경우
		//      }
		
		// int k1의 점수가 90이상이면 A학점, 80이상이면 B학점 70이상이면 C학점, 나머지 F학점
		int k1 = 91 ;
		String str = "";
		if (k1>=90) {
			str = "A학점";
		} else if (k1>=80) {
			str = "B학점";
		} else if (k1>=70) {
			str = "C학점";
		} else {
			str = "F학점"; 
		}
		System.out.println("학점 : " + str);
		
		// char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별하자
		char k2 = 'a';
		if (k2>='A' && k2<='Z') {
			str = "대문자";
		} else if (k2>='a' && k2<='z') {
			str = "소문자";
		} else if (k2>='0' && k2<='9') {
			str = "숫자";
		} else {
			str = "기타문자";
		}
		System.out.println("결과 : " + str);
		
		//char k3이 A,a 이면 아프리카, B,b 이면 브라질, C,c 이면 캐나다, 나머지는 한국
		char k3 = 'A';
		if (k3=='A' || k3=='a') {
			str = "아프리카";
		} else if (k3=='B' || k3=='b' ) {
			str = "브라질";
		} else if (k3=='C' || k3=='c') {
			str = "캐나다";
		} else {
			str = "한국";
		}
		System.out.println("결과 : " + str);
		
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		// 4이면 과일쥬스 3500이다. 친구와 2잔을 10000원 내고 먹었다.
		// 잔돈은 얼마인가?(부가세 10% 포함), 친구와 같은 음료만 선택 가능
		int menu1 = 2;
		int pay = 10000;
		int sa = 2;
		int zen = 0;
		if (menu1 ==1) {
			zen = pay-(int)(3500*sa*1.1);
		} else if (menu1 ==2) {
			zen = pay-(int)(4000*sa*1.1);  
		} else if (menu1 ==3) {
		  	zen = pay-(int)(3000*sa*1.1);  
		} else if (menu1 ==4) {
			zen = pay-(int)(3500*sa*1.1);  
		} else {
			  zen = pay;
		}
		System.out.println("잔돈은 : " + zen);
		
		int menu = 3 ; 
		int in = 10000 ; 
		int su = 2 ;
		int dan = 0 ;
		String drink = "";
		int total = dan * su ;
		int vat = (int)(total*0.1) ;
		int out = in - (total + vat) ;
		
		if (menu == 1) {
			drink = "카페모카";
			dan = 3500;
		}else if (menu == 2) {
			drink = "카페라떼";
			dan = 4000;
		}else if (menu == 3) {
			drink = "아메리카노";
			dan = 3000;
		}else if (menu == 4) {
			drink = "과일쥬스";
			dan = 3500;
		}
		
		// 이 밑에 세가지는 처음에 써도 되고 마지막에 써도 된다.
		// int total = dan * su ;
		// int vat = (int)(total*0.1) ;
		// int out = in - (total + vat) ;
		
		System.out.println("선택메뉴 : " + drink);
		System.out.println("잔돈 : " + out);
	}
}
		
		
		
	
