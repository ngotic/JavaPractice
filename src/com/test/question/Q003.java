package com.test.question;

import java.util.Scanner;

public class Q003 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 너비, 높이 출력
		System.out.print("너비(cm): ");
		int square = sc.nextInt();
		// 2. 입력
		System.out.print("높이(cm): ");
		int height = sc.nextInt();
		// 3. 연산결과 출력 
		System.out.printf("사각형의 넓이는 %dc㎡입니다.\n", square * height);
		System.out.printf("사각형의 둘레는 %dcm입니다.\n", square * 2 + height * 2);
		
		sc.close();
	}
	
}
