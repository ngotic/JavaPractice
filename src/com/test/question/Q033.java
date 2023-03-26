package com.test.question;

import java.util.Scanner;

public class Q033 {

	public static void main(String[] args) {
		// 요구사항] 년도를 입력받아 해당 년도가 
		// '평년' 인지 '윤년' 인지 출력하시오.
		//		조건..
		//		a. 년도를 4로 나눈다.
		//		떨어지면 b 검사
		//		떨어지지 않으면 "평년"
		//		b. 년도를 100으로 나눈다.
		//		떨어지면 c 검사
		//		떨어지지 않으면 "윤년"
		//		c. 년도를 400으로 나눈다.
		//		떨어지면 "윤년"
		//		떨어지지 않으면 "평년"
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year = scan.nextInt();
		
		System.out.printf("%d년은 '%s'입니다.\n", 
					      year,
				          checkYear(year));
		
		
		scan.close();
	}
	private static String checkYear(int year) {
		
		// '평년' 인지 '윤년' 인지 출력하시오.
		//		조건..
		//		a. 년도를 4로 나눈다.
		//		떨어지면 b 검사
		//		떨어지지 않으면 "평년"
		//		b. 년도를 100으로 나눈다.
		//		떨어지면 c 검사
		//		떨어지지 않으면 "윤년"
		//		c. 년도를 400으로 나눈다.
		//		떨어지면 "윤년"
		//		떨어지지 않으면 "평년"
		String result= "";
		// Depth 지정해서 알고리즘 구분 > Indentation
		//a.
		if( year % 4 == 0 ) {
			//b.
			if( year % 100 == 0) {
				//c 
				if(year % 400 == 0) {
					// 윤년 > 끝
					result= "윤년";
				} else {
					// 평년 > 끝
					result= "평년";
				}
			} else { 
				// "윤년" > 끝
				result= "윤년";
			}
			
		} else {  
			//"평년" > 끝
			result= "평년";
		}	
		return result;
	}
	

}
