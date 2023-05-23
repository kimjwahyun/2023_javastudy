package day11.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03_method t1 = new Ex03_method(); //객체생성
		// return이 있으면 무조건 return값을 받아서 사용해줘야된다.
		/*
		 결과가 나오기는 하지만, 비정상적인 코딩
		t1.getSum();
		t1.getAvg();
		t1.getHak();
		
		System.out.println(t1.sum);
		System.out.println(t1.avg);
		System.out.println(t1.hak);
		*/
		
		int k1 = t1.getSum();
		double k2 = t1.getAvg();
		String k3 = t1.getHak();
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		
	}
}
