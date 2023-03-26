package com.test.question;

import java.util.Scanner;

public class Q088 {

	public static void main(String[] args) {
//		요구사항
//		금지어를 마스킹 처리 하시오.
//		조건..
//		금지어
//		바보
//		멍청이
//		입력..
//		입력: 너랑 안놀아 바보야!! 
//		출력..
//		너랑 안놀아 **야!!
//		금지어를 1회 마스킹했습니다.
		
//		입력: 잘 생각해봐 바보 멍청이 
//
//		출력..
//		잘 생각해봐 ** ***
//		금지어를 2회 마스킹했습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		String input = scan.nextLine();
		
		String[] filter = {"바보", "멍청이"};
		// 1. contains로 확인
		// 2. replace로 대체 > 성공여부를 모른다.
		String filtered=input;
		int cnt = 0;
		for(int i=0; i<filter.length; i++) {
			if (input.contains(filter[i])) {
				
				// filtered = filtered.replace(filter[i], fill(filter[i], "*")); // 이방식은 내가 메서드를 따로 구현
				filtered = filtered.replace(filter[i], "*".repeat(filter[i].length())); // String의 repeat로 특정 문자열 반복
				
				cnt++;
			}
			
		}
		System.out.printf("%s\n", filtered);
		System.out.printf("금지어를 %d회 마스킹 했습니다.\n",cnt);
		
		scan.close();
	}
	public static String fill(String word, String pattern) {
		String result="";
		for(int i=0; i<word.length() ; i++)
			result +=pattern;
		return result;
	}
}
