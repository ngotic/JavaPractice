package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex12_BufferedReader {
	
	public static void main(String[] args) throws IOException {
		
//		// 입력 도구 생성하기 그것이 reader라는 변수 안에 들어 있다. 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		
//		System.out.println("문자 입력 : ");
//		int code = reader.read(); // read라는 이름의 메서드가 있다.
//		System.out.printf("출력 : %c\n", code);
//		System.out.println("종료");
//		System.out.println("이름 입력: " ); // 3글자
//		String txt = reader.readLine(); // 얘는 사용자가 입력한 데이터를 문자열로 돌려준다. 
//		System.out.printf("안녕하세요. %s님\n", txt);
//		
//		System.out.println("색상 입력 : ");
//		String color = reader.readLine(); // 입력한 내용을 한번에 얻어와서 좋다.
//		System.out.printf("당신이 입력한 색상은 %s입니다.\n", color);
		
//		System.out.println("숫자 입력");
//		String input = reader.readLine();   // "3.5"
//		// 자료형 변환 작업
//		double num = Double.parseDouble(input);  // "3.5"->3.5 으로 변환작업 해준다.
//		System.out.println(100 - num);
		
		// 요구사항] 사용자로부터 숫자를 2개 입력 > 두 수의 합을 구하시오.
		// 1. 라벨 출력
		System.out.println("시작");
		
		System.out.println("숫자입력: ");
		int a = Integer.parseInt(reader.readLine());
		System.out.println("숫자입력: ");
		int b = Integer.parseInt(reader.readLine());
		
		System.out.println("두 수의 합은 ? "+(a+b));
		// 2. 숫자 1개를 입력
		// 3. 라벨 출력
		// 4. 숫자 1개 입력
		// 5. 두 수의 합을 구하고 
		// 6. 연산과정을 출력
		
		
	}
}
