package com.test.BaekJoon;

import java.util.Scanner;

public class Q2744 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(char a : str.toCharArray() ) {
			
			// 소문자
			if(a >= 'a' && a <= 'z' )
				a -= ('a'-'A');
			// 대문자
			else if(a >= 'A' && a <= 'Z' )
				a += ('a'-'A');
			
			System.out.print(a);
				
		}
	
	}
	
}


