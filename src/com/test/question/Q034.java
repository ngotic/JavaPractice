package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {

	public static void main(String[] args) {
		// 요구사항] 날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
		//		조건..
		//		입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
		//		입력받은 날짜가 토/일요일이면 아무것도 안한다.
		
		Scanner scan = new Scanner(System.in);
		int year, month, day;
		Calendar date = Calendar.getInstance();
		
		System.out.print("년: ");
		year = scan.nextInt();
		System.out.print("월: ");
		month = scan.nextInt();
		System.out.print("일: ");
		day = scan.nextInt();
		
		// 토 : index 7
		// "", "일","월","화","수","목","금","토"
		// 2~7 
		// 다음달로 넘어가는 issue
		date.set(year, month-1, day);
		
		String on_off;
		int diff=7;
		int yoil = date.get(Calendar.DAY_OF_WEEK);
		
		if( yoil == 1 || yoil == 7 ) {
			on_off = "휴일(토/일)";
		} else {
			on_off = "평일";
		}
		
		diff = 7 - yoil;
		date.add(Calendar.DATE, diff);
		
		System.out.printf("입력하신 날짜는 '%s'입니다.\n", on_off);
		
		if(on_off.equals("평일")) {
			System.out.println("해당 주의 토요일로 이동합니다.");
			System.out.printf("이동한 날짜는 '%tF'입니다.\n", date);
		} else {
			System.out.println("결과가 없습니다.");
		}
		
		
		
		scan.close();
	}

}
