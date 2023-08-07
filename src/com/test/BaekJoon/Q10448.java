package com.test.BaekJoon;

import java.util.Scanner;

public class Q10448 {
	
	public static void main(String[] args) {
		
		int []T = new int[45];
		
		for(int i=1; i<45; i++) {
			T[i] = T[i-1]+i;
		}
		
//		for(int a : T) {
//			System.out.println(a);
//		}
		// 946 
		
		// A + B + C = X
		// X가 T에 있다. 
		// A + B = X - C
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=0; i<N ;i++) {
			int K = scan.nextInt();
			System.out.println(resultThreeValue(T, K));
		}
		
	}

	private static char resultThreeValue(int[] T, int k) {
		
		for(int i=1; i < 45; i++) { // 45라서 가능했다. > 1초 시간내에 45*45*45 해봣자 얼마 안걸려서 
			for(int j=1; j < 45; j++) {
				for(int h=1; h<45; h++) {
					int sum = T[i]+T[j]+T[h];
					if(sum == k)  return '1';
				}
			}
		}
		
		return '0';
	}
	
}
