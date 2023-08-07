package com.test.BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q3273 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int [] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		// 1<=i<j<=n 이런 셋팅의 ai, aj를 구해라
		int X = scan.nextInt();
		// A + B = X(상수)
		// A = X(상수) - B
		// A가 집합에 있니?? 
		
		//>> Arrays.binarySearch 이 검색에 성공하면 key와 일치하는 요소의 인덱스를 반환한다.
		// 실패하면 음수의 숫자를 반환한다. 
		// ★★ >= 0 이상처리 해주라
		
		int ans=0;
		for(int i=0 ;i < N; i++) {
			//System.out.println(X-arr[i]);
			int find= X-arr[i];
			if( Arrays.binarySearch(arr,  find) >= 0 ) {
				ans++;
				// 중복 발생 > 5,8 > 중복 제거 
				// 12 1
				// 10 3
				// 3 10
				// 2 11
				// 11 2
				// 1 12
			}
		}
		System.out.println(ans/2); // 쌍이라 2 나눠야 한다. 
	}
}
