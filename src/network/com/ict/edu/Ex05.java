package network.com.ict.edu;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// JSON : XML 과 함께 정보를 전달할 때 사용
//        JavaScript Object Notation(JSON)은 이를 가능케 하는 데이터 교환 포맷
//        Json_simple 라이브러리 다운받기
public class Ex05 {
	public static void main(String[] args) {
		 String jsonData = "{\"Persons\":[{\"name\":\"고경태\",\"age\":\"30\",\"블로그\":\"ktko.tistory.com\",\"gender\":\"남자\"},"
	                + "{\"name\":\"이홍준\",\"age\":\"31\",\"블로그\":\"없음\",\"gender\":\"남자\"},"
	                + "{\"name\":\"서정윤\",\"age\":\"30\",\"블로그\":\"없음\",\"gender\":\"여자\"}],    "
	                + "\"Books\":[{\"name\":\"javascript의모든것\",\"price\":\"10000\"},"
	                + "{\"name\":\"java의모든것\",\"price\":\"15000\"}]}";
		 try {
			JSONParser jsonParser = new JSONParser();
			
			// jsonParser에 json데이터를 넣어 파싱한 다음 JSONObject로 변환한다.
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonData);
			
			// Persons이 배열 되어 있으므로 JSONArray
			JSONArray personArray = (JSONArray) jsonObj.get("Persons");
			for (int i = 0; i < personArray.size(); i++) {
				System.out.println("======person : " + i + "======");
				JSONObject pers_obj = (JSONObject) personArray.get(i);
				System.out.print(pers_obj.get("name")+"\t");
				System.out.print(pers_obj.get("age")+"\t");
				System.out.print(pers_obj.get("gender")+"\n");
			}
			// 
			JSONArray BooksArray = (JSONArray) jsonObj.get("Books");
			for (int i = 0; i < BooksArray.size(); i++) {
				System.out.println("======book : " + i + "======");
				JSONObject pers_obj = (JSONObject) BooksArray.get(i);
				System.out.print(pers_obj.get("name")+"\t\t");
				System.out.println(pers_obj.get("price")+"\t");
			}
			
		} catch (Exception e) {
		}
	}
}
