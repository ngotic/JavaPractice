package com.test.java;

import java.util.Calendar;
import java.util.Date;

public class Ex28_DateTime {

	public static void main(String[] args) {

		//m1();
		//m6();
		// 1. 현재 시각 만들기             > Calendar.getInstance()
		// 2. 특정 파트 읽기              > c1.get(상수)
		// 3. 특정 시각 만들기(수정하기)     > c1.set(상수, 값)
		// 4. 시각 + 시간 = 시각          > c1.add(상수, 값)
		// 5. 시각 - 시간 = 시각          > c1.add(상수, -값)
		// 6. 시각 - 시각 = 시간          > getTimeInMillis()
		// 7. 시간 + 시간 = 시간          > 산술 연산
		// 8. 시간 - 시간 = 시간          > 산술 연산
		// 현재 시간 tick
		Calendar now = Calendar.getInstance();
		
		System.out.println(now.getTime());
		
		System.out.println(now.getTimeInMillis());
		System.out.println(System.currentTimeMillis());
	}// main
	
	private static void m6() {
		// 시각 > Calendar > 한 순간
		// 시간 > int
		
		// 2시간 30분 + 10분 >> 2시간 30분은 어딘가에 속해 있는 시간의 양
		// Calendar를 쓰는게 말이 안댐
		
		// 2시간 30분 + 10분 >>> 양적인 데이터다.
		int hour = 2;
		int min  = 30;
		
		min += 10; 
		
		//System.out.printf("%d시간 %d분\n", hour, min);
		
		// 2시간 30분 + 40분 = 2시간 70분?? = 3시간 10분 ( 자리올림 ) 이건 신경쓴다.
		hour = 2;
		min  = 30;
		
		min += 40; // min의 단위가 hour에다가 반올림 한다. 
		// 70분 > 60 나누기 > 몫(1) 나머지(10)
		hour = hour + (min/60);
		min = min % 60;
		
		System.out.printf("%d시간 %d분\n", hour, min);
		
	}
	
	private static void m5() {
		//내가 살아온 시간?
		Calendar now = Calendar.getInstance();
		
		Calendar birthday = Calendar.getInstance();
		birthday.set(1995, 6, 10, 12, 30, 0);
		// System.out.println(now - birthday);// 에러다.
		System.out.println(birthday.getTimeInMillis());
		
		System.out.println(now.getTimeInMillis());
		
		System.out.println((now.getTimeInMillis() - birthday.getTimeInMillis())/(24*60*60*1000));
		
		// 수료일까지 며칠?
		Calendar endDate = Calendar.getInstance();
		endDate.set(2023, 6, 12);
		long span = endDate.getTimeInMillis() - now.getTimeInMillis();
		System.out.printf("수료일까지 %d일 남았습니다.\n", span / 1000 /60 / 60/ 24);
	}
	
	private static void m4() {
		// 연산 
		// - 시각 + 시간
		// - 시각 - 시간
		
		// 오늘 만난 커플 > 100일
		Calendar now = Calendar.getInstance();
		//System.out.printf("1일차: %tF\n", now);
		//now.add(Calendar.DATE, 100);
		//now.add(Calendar.YEAR, 10);
		//now.add(Calendar.MONTH, 3);
		//System.out.printf("연산 후: %tF\n", now);
		
		// 생일 + 100 > 백일잔치
		Calendar birthday = Calendar.getInstance();
		birthday.set(1995, 6, 10);
		birthday.add(Calendar.DATE, 100); //
		//System.out.printf("백일잔치날: %tF\n", birthday);
		
		//12일전
		now = Calendar.getInstance();
		now.add(Calendar.DATE, -12);
		//System.out.printf("%tF\n", now);
		
		// 3시간 17분 뒤에 복용
		now = Calendar.getInstance();
		now.add(Calendar.HOUR, 3);
		now.add(Calendar.MINUTE, 17);
		System.out.printf("영양제 복용시간: %tT\n", now);
		
	
	}
	
	
	public static void m3() {
		// 현재 시각 만들기
		Calendar now = Calendar.getInstance();
		
		// 특정 시각 만들기 > 원하는 날짜(2023-07-12)
		// 1. 현재 시각 만들기
		// 2. 원하는 시각으로 수정하기
		
		Calendar endDate = Calendar.getInstance();
		endDate.set(Calendar.YEAR, 1995);
		endDate.set(Calendar.MONTH, 6);
		endDate.set(Calendar.DATE, 12);
		endDate.set(Calendar.HOUR_OF_DAY, 18);
		endDate.set(Calendar.MINUTE, 0);
		endDate.set(Calendar.SECOND, 0);
		
		System.out.printf("%tF %tA %tT\n", endDate, endDate, endDate);
		
		Calendar birthday = Calendar.getInstance();
		birthday.set(1995, 6, 3); // 년 월 일
		System.out.printf("%tF\n", birthday);
		birthday.set(1995, 6, 3, 17, 59 , 59); // 년 월 일 시 분 초
		System.out.printf("%tF %tT\n", birthday, birthday);
	}
	
	public static void m1() {
		
		// Date, Calendar
		Date date = new Date(); 
		// 현재 시각을 생성해서 date라는 변수에 담아라
		// > 현재 컴퓨터로부터 > 메인보드 > CMOS
		System.out.println(date);
		//Tue Feb 07 17:18:11 KST 2023 > CMOS에서 나온 시간
		
	}
	
	public static void m2() {
		// 예제2
		// Calendar 클래스
		// 현재 시간 가져오기 > 현재 컴퓨터 시계의 시각을 얻어온다. 
		Calendar c1 = Calendar.getInstance();
		// System.out.println(c1);
//		System.out.println(c1.get(1)); // 년도
//		System.out.println(c1.get(2)); // 년도
//		System.out.println(c1.get(3)); // 년도
//		System.out.println(c1.get(4)); // 년도
//		System.out.println(c1.get(5)); // 년도
		
		//요구사항] "오늘은 2023 2월 7일입니다." 
		Calendar now = Calendar.getInstance();
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n",
				now.get(Calendar.YEAR),
				now.get(Calendar.MONTH)+1,
				now.get(Calendar.DATE)
				);
		
		//요구사항] "오늘은 2023 02월 07일입니다."
		System.out.printf("오늘은 %04d년 %02d월 %02d일입니다.\n",
				now.get(Calendar.YEAR),
				now.get(Calendar.MONTH)+1,
				now.get(Calendar.DATE)
				);
		//요구사항] "지금은 14시 12분 53초입니다." //24H
		System.out.printf("지금은 %02d %02d분 %02d초입니다.\n",
				now.get(Calendar.HOUR_OF_DAY),
				now.get(Calendar.MINUTE),
				now.get(Calendar.SECOND));
		//요구사항] "지금은 오후 3시 12분 53초입니다." //12H
		System.out.printf("지금은 %s %d %02d분 %02d초입니다.\n",
				now.get(Calendar.AM_PM) == 0 ? "오전":"오후",
				now.get(Calendar.HOUR),
				now.get(Calendar.MINUTE),
				now.get(Calendar.SECOND));
		
		//요구사항] 2023-02-08 > printf() // 
		System.out.printf("%tT\n", now);
		
		//요구사항] 수요일
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		System.out.printf("%tA\n", now);
		
		// printf() 메소드 > 콘솔 환경에서 출력할 때만 사용이 가능
		// String.format은 모든 환경에서 사용가능, 출력물x, 문자열조작용(x)
		String msg = String.format("오늘은 %tA입니다.", now); // > 얘는 반환값으로 돌려줌  
		System.out.println(msg);
		
	}

}
