package day11.com.ict.edu;

public class Ex05_Animal {
	// 생존여부
	boolean live ;
	// 나이
	int age ;
	// 이름
	String name  ;
	
	
	// 생존여부를 변경하는 메서드
	public void getLive(boolean k1) { 
		live = k1;
	}
	// 생존여부를 반환하는 메서드
	public boolean getLive2() {
	
		return live;
	}
	
	// 나이를 변경하는 메서드
	public void getAge(int a1) {
		age = a1;
	}
	// 나이를 반환하는 메서드
	public int getAge2() {
		
		return age;
	}

	// 이름을 변경하는 메서드
	public void getName(String n1) {
		name = n1;
	}
	
	// 이름을 반환하는 메서드
	public String getName2() {
		
		return name;
	}
	
	
	// 이름, 나이, 생존여부 한번에 변경하자
	public void play(String s1, int s2, boolean s3) {
		name = s1;
		age = s2;
		live = s3;
	}
	public void play(int s2, String s1, boolean s3) {  // 인자의 순서와 상관없이 가능
		name = s1;
		age = s2;
		live = s3;
	}
	public void play(boolean s3, int s2, String s1) {  // 인자의 순서와 상관없이 가능함
		name = s1;
		age = s2;
		live = s3;
	}
	
	// 이름, 나이, 생존여부 한번에 출력하자
	public void prn() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		if(live) {
			System.out.println("생존여부 : 살았음");
		}else {
			System.out.println("생존여부 : 죽었음");
		}
	}
}








