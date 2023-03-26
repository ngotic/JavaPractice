package com.test.java;

import java.io.IOException;
import java.util.Scanner;

public class Ex10_Input {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 콘솔입력
		//1. System.in.read()
		//- read()메소드
		//2. BufferedReader 클래스
		// - 편함
		//3. Scanner 클래스
		// - 아주편하
		
		// 요구사항] 사용자에게 문자 1개 입력받아 화면에 출력하시오.
		// 시나리오 짜기
		// 1. 안내 메세지 출력
		// 2. 키 입력
		// 3. 입력받은 키를 화면 출력
		// 설계 바탕 > 화면 구현
		
		System.out.print("문자를 입력하세요: ");
		// 현제 상태 > 사용자가 키를 입력하기를 대기하고 있는 상태
		// read() 라인에서 프로그램이 잠시 멈춰있는 상태		
		int code = System.in.read();
		// 문자 코드값 'A' > 65
		//          'a' > 97
		//          '0' > 48
// 		System.out.println(code);
// 		System.out.printf("%c\n", code); // ㅇ
		System.out.printf("입력한 문자는 %c입니다.", code);

	}

}
