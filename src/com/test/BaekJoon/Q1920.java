package com.test.BaekJoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q1920 {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	
		
		for(int i=0;i < n; i++) {
			s.add(scan.nextInt());
		}
		
		int m = scan.nextInt();
		
		int [] result = new int[m];
		
		for(int i=0;i < m; i++) {
			int num = scan.nextInt();
			if ( s.contains(num) )
				result[i] = 1;
			else
				result[i] = 0;
		}
		
		for( int a : result)
			System.out.println(a);
		
	}
	
}

// Arrays.binarySearch(arr, x); arr배열, x는 찾는 값, 리턴값은 인덱스 이렇게 찾아준다.  
