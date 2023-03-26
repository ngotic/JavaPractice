package com.test.java;

import java.io.IOException;

public class Ex11_Input {
	public static void main(String[] args) throws IOException {
		// read 메서드의 특성을 좀더 보자
		System.out.print("문자 입력:	");
		int code = System.in.read();
		System.out.println(code);
		System.out.printf("%c\n", code);
		
		code = System.in.read();
		System.out.println(code);
		System.out.printf("%c\n", code);
		
		code = System.in.read();
		System.out.println(code);
		System.out.printf("%c\n", code); 
		// read라는 메서드는 사용자가 입력한 글자를 한개씩 가져온다.
		code = System.in.read();
		System.out.println(code);
		System.out.printf("%c\n", code); 
		
		code = System.in.read();
		System.out.println(code);
		System.out.printf("%c\n", code); 
	}
}
