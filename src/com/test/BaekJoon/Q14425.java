package com.test.BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q14425 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		String [] arr = new String[N];
		while(N--> 0 ) {
			arr[N] = scan.next();
		}
		
		Arrays.sort(arr); // 정렬 한번 때린다. 
	
		int ans=0;
		while(M--> 0 ) {
			String Mstr = scan.next();
			if( isExist(arr, Mstr)) // logN과 
									// L이 문자열의 길이다.(Compare) M번 도니까 M번 곱 
				ans++;
		}	
		System.out.println(ans);
	}

	// 바이너리 서치는 그림을 그리자
	private static boolean isExist(String[] arr, String mstr) {
		int L=0, R = arr.length-1;
		while(L <= R) {
			int m = (L+R)/2;
			if( arr[m].compareTo(mstr) < 0 ) {
				L=m+1;
			} else if( arr[m].compareTo(mstr) > 0) {
				R=m-1;
			}  else
				return true;
		}
		return false;
	}
	
}
