package com.test.BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q2309 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = 9;
		int [] nums = new int[N];
		int [] sol = new int[N];
		int sum=0;
		for(int i=0; i < N ;i++) { 
			nums[i] = scan.nextInt();
			sum += nums[i];
		}
		
		// 이 중에서 7개를 선택 > 2개를 빼는 문제 : 역발상
		
		int idx=0;
		boolean exit = false;
		
		for(int i=0; i< N; i++) {
			for(int j=0; j < N; j++) {
				if ( i == j ) continue; //조건 : → i와 j는 달라야 한다. 
				if( (sum-(nums[i]+nums[j]))==100 ) {
					for(int k=0; k<N;k++) {
						if( k != i && k != j ) {
							sol[idx++]=nums[k];
						}
					}
					exit = true;
					break;
				}
			}
			if(exit) break;
		}
		
		Arrays.sort(sol);
		
		for(int a : sol) {
			if(a!=0)
				System.out.println(a);
		}
		
	}
}
