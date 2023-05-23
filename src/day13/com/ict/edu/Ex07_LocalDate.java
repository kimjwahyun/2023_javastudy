package day13.com.ict.edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex07_LocalDate {
	public static void main(String[] args) {
		// java version 8.0 이상만 가능
		// LocalDate : 날짜 정보만 필요할 때
		// LocalTime : 시간 정보만 필요할 때
		// LocalDateTime : 날짜, 시간 모두 필요할 때
		
		LocalDate cDate = LocalDate.now();
		System.out.println(cDate);
		
		LocalTime cTime = LocalTime.now();
		System.out.println(cTime);
		
		LocalDateTime cdt = LocalDateTime.now();
		System.out.println(cdt);
		System.out.println();
		
		System.out.println("날짜");
		System.out.println("getYear() : " + cDate.getYear());              // 현재년도
		System.out.println("getMonth() : " + cDate.getMonth()); 	       // 현재 달 May
		System.out.println("getMonthValue() : " + cDate.getMonthValue());  // 월(1,2,3,...)
		System.out.println("getDayOfYear() : " + cDate.getDayOfYear());	   // 년의 몇번째일 현재 1월1일 부터 135일
		System.out.println("getDayOfMonth() : " + cDate.getDayOfMonth());  // 15일
		System.out.println("getDayOfWeek() : " + cDate.getDayOfWeek());	   // 요일
		System.out.println("isLeapYear() : 윤년여부 " + cDate.isLeapYear());   // boolean 형은 get대신 is를 많이 쓰인다
		System.out.println();
		
		System.out.println("-- 시간 --");
		System.out.println("getHour() : " + cTime.getHour());
		System.out.println("getMinute() : " + cTime.getMinute());
		System.out.println("getSecond() : " + cTime.getSecond());
		// 1970s년 1월 1일 UTC의 첫번째 순간 이후의 현재 시간까지의 나노초를 나타내는 값
		// 날짜끼리 비교할때 연산 속도가 빠르다는 장점이 있다
		System.out.println("getNano() : " + cTime.getNano());
		System.out.println();
		
		System.out.println(cDate.format(DateTimeFormatter.BASIC_ISO_DATE)); // 날짜년도를 숫자만 받을때
		// format 의 자료형은 string(마우스 갖다대면 나옴)
		System.out.println(cDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		System.out.println(cdt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:SS")));
		System.out.println();
		
		System.out.println("-- 날짜 차이 계산 --");
		LocalDate sDate = LocalDate.now();
		LocalDate eDate = LocalDate.of(2023, 06, 15);
		Period period = Period.between(sDate, eDate); 
		
		System.out.println(period.getYears());  // 년
		// 한달이 30일짜리도 있고 31일짜리도 있을때 사용에 주의해야한다
		System.out.println(period.getMonths()); // 월
		System.out.println(period.getDays());   // 일
		// 위의 단점이 있어서 아래것을 자주쓴다.
		System.out.println(ChronoUnit.DAYS.between(sDate, eDate));  // 일 
		System.out.println();
		
		// 날짜에 값더하기
		System.out.println(sDate.plusYears(2));
		System.out.println(sDate.plusMonths(2));
		System.out.println(sDate.plusDays(17));
		
		// 회사마다 사용하는것이 다르다
		
		
		
	}
}
