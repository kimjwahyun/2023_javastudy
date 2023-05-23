package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_Map {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
		// 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성

		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");

		Scanner scan = new Scanner(System.in);

		esc: while (true) {
			System.out.println("나라를 입력하세요 >>>");
			String k = scan.next();
			while (true) {
				if (map.containsKey(k)) {
					System.out.println(k + "의 수도는 " + map.get(k) + " 입니다.");
					break;
				} else {
					System.out.println("데이터에 없느 나라 입니다.");
					break;
				}
			}
			while (true) {
				System.out.println("계속할까요? (1. yes, 2. no)");
				int su = scan.nextInt();
				if (su == 1) {
					break;
				}
				if (su == 2) {
					break esc;
				}
			}
		}
	}
}