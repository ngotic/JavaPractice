package com.test.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q11659 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
	
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int [] arr = new int[N+1];
		int [] acc = new int[N+1];
        int [] sol = new int[M];
		
		
		
//		arr[0]=scan.nextInt();
//		acc[0] = arr[0];
		
		for(int i=1 ;i<=N; i++) {
			arr[i]=scan.nextInt();
			acc[i]=acc[i-1]+arr[i]; // 누적합 구한다. 
		}
		
		// acc[n2]-acc[n1-1]
		
		for(int i=0;i<M;i++) {
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			sol[i] = acc[n2]-acc[n1-1];
		}
		for( int a : sol) System.out.println(a);
		
	}
	
}
