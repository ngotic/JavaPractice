package com.test.practice;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		String text2 = "홍길동 이수홍 박연수";
		String text3 = "홍길동 이수홍 박연수";
		StringTokenizer st = new StringTokenizer(text, "/");
		StringTokenizer st2 = new StringTokenizer(text2, " ");
		StringTokenizer st3 = new StringTokenizer(text3, "/");
		// 두번쨰 인자가 delimeter다.:통일된 구분자를 쓴다. <-> split은 regex를 받는다. 
		while(st.hasMoreTokens()) { // iterator 같은 느낌이다.
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("-----");
		int cnt = st2.countTokens();
		// for문 예제도 가능
		for(int i=0;i<cnt;i++) {
			String token = st2.nextToken();
			System.out.println(token);
		}
		System.out.println("-----");
		String token2 = st3.nextToken(" ");
		System.out.println(token2);
		token2 = st3.nextToken();
		System.out.println(token2);
		token2 = st3.nextToken();
		System.out.println(token2);
		
		// 두 에시 가능
	}

}
