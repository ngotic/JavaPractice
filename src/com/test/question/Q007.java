package com.test.question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q007 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 입력: ");
		char ch = (char)reader.read();
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.\n",ch, ch-('a'-'A'));
	}

}
