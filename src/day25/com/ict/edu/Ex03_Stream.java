package day25.com.ict.edu;

public class Ex03_Stream {
	// 스트림(Stream) : 데이터를 목적지까지 입/출력하는 방법
	//  종류 : 바이트 스트림, 문자 스트림, 객체 스트림(오브젝트스트림)
	// 1. 바이트 스트림 : 모든 처리를 1byte 처리
	//         대상 : 바이트로 이루어진 모든 파일(이미지, 동영상, 음악 등...)
	//    최상위 클래스 : InputStream(입력), OutputStream(출력)
	// 기계와 기계가 정보를 주고 받는 것
	
	// 2. 문자 스트림 : 모든 처리를 2byte 묶음 처리
	//        대상 : 세상 모든 문자로 구성된 파일을 입출력한다.
	//   최상위 클래스 : Reader(입력), Writer(출력)
	// 사람과 사람이 정보를 주고 받는 것 
	
	// 1,2 결합 스트림 : 바이트스트림 <=> 문자스트림
	//     기계를 통해서 입/출력된 정보를 사람이 알아 보기 쉽도록 입/출력하는 역할을 한다.
	//    최상위 클래스 : InputStreamReader(입력), OutputStreamWriter(출력)
	
	//3. 오브젝트 스트림 : 객체 직렬화 후 객체(Object) 단위로 입/출력
	//    최상위 클래스 : ObjectInputStream : readObject()   => 객체 역직렬화 메서드
	//               ObjectOutStream   : writerObject() => 객체 질렬화 메서드
	
	
	
}
