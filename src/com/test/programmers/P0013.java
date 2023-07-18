package com.test.programmers;

import java.util.Arrays;

public class P0013 {

	public static void main(String[] args) {
		// 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
		// 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
		//		제한사항
		//		0 < s의 길이 < 1,000
		//		s는 소문자로만 이루어져 있습니다.
		//		입출력 예
		//		s	result
		//		"abcabcadc"	"d"
		//		"abdc"	"abcd"
		//		"hello"	"eho"
		//char[] ch  = {'b', 'd', 'f', 's', 'a'};
		// 'a' = 97
		
		//// String 생성자로 new String()에 char[] 넣으면 String형태 된다.
		// char[] 도 정렬할 수 있다. Arrays.sort(); 사용
		// ch도 연산하면 int형이 되니까 배열 인덱스로 담는다.
		int [] cnt = new int[32]; 
		char [] chs = new char[32]; // char[] 도 정렬할 수 있다. Arrays.sort(); 사용
		String s = "abdc";
		// String s = new String(); // char[]로 담을 수 있다.
		for (int i=0; i<s.length(); i++) {
			cnt[s.charAt(i)-'a']++; // ch도 연산하면 int형이 되니까 배열 인덱스로 담는다.
		}
		
		for(int i=0; i<32; i++) {
			if(cnt[i]==1) {
				char ch = (char)(i+'a');
				chs[i]=ch;
			}
		}
		Arrays.sort(chs);
		String ss = new String(chs); 
		System.out.println(ss.trim()); 
	}
	
	public static String solution(String s) {
        int [] cnt = new int[32]; 
		char [] chs = new char[32]; 
		
		for (int i=0; i<s.length(); i++) {
			cnt[s.charAt(i)-'a']++; 
		}
		for(int i=0; i<32; i++) {
			if(cnt[i]==1) {
				char ch = (char)(i+'a');
				chs[i]=ch;
			}
		}
		Arrays.sort(chs);
		return new String(chs).trim(); 
    }

}
