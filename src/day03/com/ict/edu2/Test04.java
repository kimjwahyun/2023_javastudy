package day03.com.ict.edu2;

public class Test04 {
	public static void main(String[] args) {
		// 카페모카 6500이다.
		// 친구와 둘이서 15000을 내고 주문했다.
		// 잔돈은 얼마 인가? (단, 부가세 10%포함)
		
		int a1 = 6500 ;  // 카페모카 6500원
		int a2 = 15000 ; // 지불하는 금액 15000원
		int a3 = a1 * 2 ;  // 친구와 둘이 카페모카 6500원*2 = 13000원
		
		int a4 = a3 / 10 ; // 지불 할 금액 / 부가세 10%
		System.out.println(a2-a3-a4);
		
		// <풀이>
		// 입력
	    String coff = "카페모카";
		int dan = 6500;
		int su = 2 ;
		int in = 15000;
		
		// 부가세를 구하기 위해서 총 금액을 구하자
		int total = dan*su ;
		
		//둘 중 하나만 사용하자
	    int vat = total / 10;
		int vat2 = (int) (total * 0.1) ;
		int out = in - (total + vat) ; 
		
		System.out.println("잔돈 : " + out);
		
		//위 정보를 한번 퍼리
		int out2 = in - (int)(total * 1.1) ;
		System.out.println("잔돈 : " + out2);
		
	}
}

        
