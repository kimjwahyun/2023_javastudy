package day14.com.ict.edu;

import java.util.StringTokenizer;

public class Ex02_StringBuffer {
	public static void main(String[] args) {
		// 문자열을 추가할 때 사용 (메모리 주소가 변경되지 않는다.)
		// 추가할 때 append()사용
		// toString() => String 전환한다.
		StringBuffer sb = new StringBuffer("ictedu");
		
		//추가
		sb.append("대한민국");
		
		System.out.println(sb);
		System.out.println(sb.toString());
		
		// StringTokenizer : 구분자를 이용해서 문자열 분리, split 와 차이점은 배열의 크기를 지정 못함
		//                   구분자가 없으면 띄어쓰기를 넣어서 구분한다
		//                   (내가 마음대로 쪼갤 수가 없다. 콤마 기준으로 쪼개진다.)
		//nextToken()을 이용해서 문자열 분리
		
		// split(String reaex) : String[]
		// split(String reaex, int limit) : String[]
		// reaex => 구분자(나눌 기준), limit => 배열의 크기(방의 갯수)
		
		String str = "사과 바나나 망고 오렌지 수박";
		// 구분자 없음 (띄어쓰기 기준, 탭, 줄바꾸기)
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreElements()) {     // 다음요소가 있는지 물어보는 hasMoreElements
			String res = st.nextToken();   // 다음요소가 있으면 true, 없으면 false 
			System.out.println(res);       // 지금의 예시에서는 다음요소가 "사과"가 있으므로 true이므로 밑에 String res = st.nextToken();결과를 낸다. 
		}                                  // 결과를 낸다음에 커서가 다음요소 "바나나"로 간다. 미리 커서가 이동하지 않고 사과의 결과물을 낸 다음에 옮겨진다.
		System.out.println();
		
		str = "사과,바나나,망고,오렌지,수박";
		// 구분자 있음,
		// split 와 다른점은 크기 지정 못함
		StringTokenizer st2 = new StringTokenizer(str,",");
		while (st2.hasMoreElements()) {     
			String res = st2.nextToken();   
			System.out.println(res);       
		}                             
		System.out.println();
		
		// 추천 (내가 내 맘대로 쪼갤 수가 있다.)
		String[]arr = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
