package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {

	public static void main(String[] args) {
		// 요구사항] 태어난 년도를 입력하면 나이를 출력하시오.
		// 조건..
		//		올해를 기준으로 나이를 계산하시오.
		//		내년, 내후년에 실행해도 그때에 맞는 나이를 출력한다.
		//		우리나라 나이로 출력하시오.
		Scanner  sc = new Scanner(System.in);
		Calendar now= Calendar.getInstance();
		// 1. 출력 
		System.out.print("태어난 년도: ");
		// 2. 입력받은 년도, 올해, 나이 
		int year = Integer.parseInt(sc.nextLine());
		int thisYear = now.get(Calendar.YEAR);
		int age = thisYear - year + 1;
		// 3. 출력
		System.out.println("나이: "+age);
		sc.close();
		
	}

}
