package com.test.BaekJoon;

import java.util.Scanner;

public class Q10431 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int ans=0;
		int [] arr = new int[20];
		// 문제에서 제시한 작은 과정부터 시뮬레이션을 뛰어봐야 안다. 
		
		for(int i=0; i<N; i++) {
			ans = 0;
			int L = scan.nextInt();
			
			for (int j=0; j<20; j++) {
				arr[j] = scan.nextInt(); // 구하고 
			}
			
			for( int k=1; k<20; k++) {
				int cnt=0;
				for(int m=0; m<k; m++) {
					if(arr[k] < arr[m])
						cnt++;
				}
				ans += cnt;
			}
			
			System.out.println(i+1+" "+ans); // 답
		}
		
		
	}
	
}
