package com.test.BaekJoon;

import java.util.Scanner;

public class Q1236 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		char [][] map = new char[N][M];
		
		for(int i=0; i< N ;i++) {
			map[i] = scan.next().toCharArray();
		}
		
		// 이것도 약간은 시뮬레이션이다.
		
		// 인풋의 모양이 중요한데 여기보면 띄어쓰기가 없네? 
		//....
		//....
		//....
		//....

		// for(int i=0; i< n1 ;i++) {
		//	  System.out.println(map[i]);
		// }
		
		//
		//r1, r2, r3, r4
		//c1, c2, c3, c4
		
		// row 방향 체크 
		int existRowCount = 0;
		for(int i=0; i < N; i++) {
			boolean exist = false;
			for(int j=0; j < M; j++) {
				if(map[i][j] == 'X') {
					exist = true;
					break;
				}
			}
			if(exist) existRowCount++;
		}
		
		// col방향 체크
		int existColCount = 0;
		for(int i=0; i < M; i++) {
			boolean exist = false;
			for(int j=0; j < N; j++) {
				if(map[j][i] == 'X') {
					exist = true;
					break;
				}
			}
			if(exist) existColCount++;
		}
		
		int needRowCount = N - existRowCount;
		int needColCount = M - existColCount;
		
		System.out.println(Math.max(needRowCount, needColCount));
		
	}
	
}
