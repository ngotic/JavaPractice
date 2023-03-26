package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {

	public static void main(String[] args) {
		// 요구사항] 아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
		//		입력..
		//		아빠 생일(년): 1970 
		//		아빠 생일(월): 5 
		//		아빠 생일(일): 10 
		//		딸 생일(년): 1998 
		//		딸 생일(월): 7 
		//		딸 생일(일): 22
		
		Calendar daughter = Calendar.getInstance();
		Calendar daddy = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		int year1, year2, month1, month2, day1, day2;
		
		System.out.printf("아빠 생일(년): ");
		year1 = scan.nextInt();
		System.out.printf("아빠 생일(월): ");
		month1 = scan.nextInt();
		System.out.printf("아빠 생일(일): ");
		day1 = scan.nextInt();
		System.out.printf("딸 생일(년): ");
		year2 = scan.nextInt();
		System.out.printf("딸 생일(월): ");
		month2 = scan.nextInt();
		System.out.printf("딸 생일(일): ");
		day2 = scan.nextInt();
		
		daughter.clear(); //
		daddy.clear();    // 밀리초단위에서 오차가 발생할 수 있다.
		daughter.set(year1, month1, day1);
		daddy.set(year2, month2, day2);
		int day = (int) ((daddy.getTimeInMillis()-daughter.getTimeInMillis())/(24*60*60*1000)) ;
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.\n", day);
		scan.close();
	}

}
