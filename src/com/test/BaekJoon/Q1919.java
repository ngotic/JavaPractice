package com.test.BaekJoon;


import java.util.Scanner;

public class Q1919 {
	
	public static void main(String[] args) {
		// 순서를 바꾸면 동일? > 교집합 찾기
		
		Scanner sc = new Scanner(System.in);
		
		// 알파벳 자체가 26개 
		int [] cntA = new int[26];
		int [] cntB = new int[26];
		
		String first = sc.next();
		String second = sc.next();
		
		for(char a: first.toCharArray()) {
			cntA[a-'a']++;
		}
		
		for(char b: second.toCharArray()) {
			cntB[b-'a']++;
		}
		int abs=0;
		for(int i=0; i< 26; i++)
			abs += Math.abs(cntA[i]-cntB[i]);
		
		System.out.println(abs);
	}
	
}
