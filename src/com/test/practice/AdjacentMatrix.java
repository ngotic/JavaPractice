package com.test.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdjacentMatrix {
								// 0 인덱스는 요소로 둔다.
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src\\input.txt")); 
		// freopen같은 함수다.
		// 현재 디렉토리 위치는 Algorithm이 위치다. 그래서 src\\input.txt를 넣은 것이다.
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 정점 수
		int[][] map = new int[n+1][n+1]; // 2차원 배열
		int edge = scan.nextInt(); // edge 수
		for(int i=1; i<= edge; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			map[a][b]=c;
		}
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();
	}

}
