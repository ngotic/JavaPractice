package com.test.BaekJoon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q1920_binary_serach {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int m = scan.nextInt();
		
		int [] result = new int[m];
		
		Arrays.sort(arr);
		
		for(int i=0;i < m; i++) {
			int num = scan.nextInt();
			if ( binary_search(arr, num) )
				result[i] = 1;
			else
				result[i] = 0;
		}
		
		for( int a : result)
			System.out.println(a);
		
	}

	// 반드시 사전에 정렬 필요
	private static boolean binary_search(int[] arr, int num) {
		// L과 R은 인덱스 기준이다.
		int L = 0;
		int R = arr.length-1; 
		
		while( L <= R ) {
			int m = (L+R) / 2;
			if(arr[m] < num) {
				L = m+1;
			}
			else if(arr[m] > num) {
				R = m-1;
			}
			else { 
				return true; 
			} 
		}
		return false;
	}
}
