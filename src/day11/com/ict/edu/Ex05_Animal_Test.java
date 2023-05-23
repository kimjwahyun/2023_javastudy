package day11.com.ict.edu;

public class Ex05_Animal_Test {
	public static void main(String[] args) {
		// 객체생성
		Ex05_Animal t1 = new Ex05_Animal();
	
		// 이름 : 큰뿔소
		t1.getName("큰뿔소");
		
		// 나이 : 3
		t1.getAge(3);
		
		// 생존여부  : 살아있음
		t1.getLive(true);    //t1.getLive(true); 라고 적어도됨. Ex05_메서드의 if문 안적어도됨
		
		// 결과 출력"
		 //System.out.println("이름 : " + t1.name);
		String m1 = t1.getName2();
		System.out.println("이름 : " + m1);
		 //System.out.println("나이 : " + t1.age);
		int m2 = t1.getAge2();
		System.out.println("이름 : " + m2);
		 //System.out.println("생존여부 : " +t1.live);
		boolean m3 = t1.getLive2();
		
		if(m3) {
			System.out.println("생사여부 : 살았음");
		}else {
			System.out.println("생사여부 : 죽었음");
		}
		
		System.out.println("==========");
		
		// 이름을 펭귄, 나이를 1, 생존여부는 살아있음 으로 변경
		t1.getName("펭귄");
		t1.getAge(1);
		t1.getLive(true);
	
		// 결과 출력
		String p1 = t1.getName2();
		System.out.println("이름 : " + p1);
		
		int p2 = t1.getAge2();
		System.out.println("이름 : " + p2);
		
		boolean p3 = t1.getLive2();
		
		if(p3) {
			System.out.println("생사여부 : 살았음");
		}else {
			System.out.println("생사여부 : 죽었음");
		}
		
		System.out.println("==========");
		
		t1.play(false, 14, "엄지");
		t1.prn();
		
		System.out.println("==========");
		t1.play("까치", 14, true);
		t1.prn();
	}
}
