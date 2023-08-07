package com.test.BaekJoon;

import java.util.Scanner;

public class Q2747 {
	
	
	
	
	public static void main(String[] args) {
		
//		int [] F = new int[46];
//		F[0] = 0;
//		F[1] = 1;
//		
//		for(int i=2; i<= 45 ;i++) {
//			F[i] = F[i-2] + F[i-1];
//		}
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int result = fibonacci(N);
		System.out.println(result);
//		System.out.println(F[N]);
		
	}

	private static int fibonacci(int n) {
		
		if ( n == 0 ) return 0;
		else if ( n == 1 ) return 1; // 탈출조건
		else 
			return fibonacci(n-1)+fibonacci(n-2);
	}
	
}
