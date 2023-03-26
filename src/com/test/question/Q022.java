package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {

	public static void main(String[] args) {
		// 요구사항] 남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.
		//		입력..
		//		남자 이름: 하하하 
		//		여자 이름: 호호호 
		//		만난날(년): 2023 
		//		만난날(월): 2 
		//		만난날(일): 9 
		Scanner scan = new Scanner(System.in);
		System.out.print("남자이름 : ");
		String name1 = scan.nextLine();
		System.out.print("여자이름 : ");
		String name2 = scan.nextLine();
		System.out.print("만난날(년) : ");
		int year = scan.nextInt();
		System.out.print("만난날(월) : ");
		int month = scan.nextInt() - 1; // 
		System.out.print("만난날(일) : ");
		int day = scan.nextInt();
		
		Calendar meetDate = Calendar.getInstance();
		meetDate.set(year, month, day);
		System.out.printf("'%s'과(와) '%s'의 기념일 \n", name1, name2);
		
		meetDate.add(Calendar.DATE, 100);
		System.out.printf("100일: %tF\n", meetDate);
		
		meetDate.set(year, month, day);
		meetDate.add(Calendar.DATE, 200);
		System.out.printf("200일: %tF\n", meetDate);
		
		meetDate.set(year, month, day);
		meetDate.add(Calendar.DATE, 300);
		System.out.printf("300일: %tF\n", meetDate);
		
		meetDate.set(year, month, day);
		meetDate.add(Calendar.DATE, 500);
		System.out.printf("500일: %tF\n", meetDate);
		
		meetDate.set(year, month, day);
		meetDate.add(Calendar.DATE, 1000);
		System.out.printf("1000일: %tF\n", meetDate);
		
		scan.close();
	}

}
