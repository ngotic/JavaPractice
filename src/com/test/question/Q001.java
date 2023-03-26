package com.test.question;

import java.util.Calendar;
import java.util.Scanner;
// Q001.java
// Q002.java
// ....
// Q007.java 압축해서 올려라  

public class Q001 {

	public static void main(String[] args) {
		
	
		Scanner  sc = new Scanner(System.in);
		Calendar calendar= Calendar.getInstance();
		// 1. 출력 
		System.out.print("태어난 년도: ");
		// 2. 입력받은 년도, 올해, 나이 
		int year = Integer.parseInt(sc.nextLine());
		int thisYear = calendar.get(Calendar.YEAR);
		int age = thisYear - year + 1;
		// 3. 출력
		System.out.println("나이: "+age);
		sc.close();
		
	}

}
