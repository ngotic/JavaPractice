package com.test.question;

public class Q078 {


	
	public static void main(String[] args) {
		// 센터를 중심으로
		int matSize = 5;
		
		int[][] num = new int[matSize][matSize];
		
		// edge       5 9 13 16 19 21 23 24 25
		// length      4 4  3 3  2 2   1 1  0(종료)
		int length = matSize-1; // 4
		int value = 1;
		int direction = 1;
		int x = -1, y = 0;
		
		// 9개 7개 5개 3개 마지막 1개
		while(true) {

			for(int i=0; i<length; i++) {
				x+=direction;
				num[y][x] = value;
				value++;
			}
			
			x+=direction;
			num[y][x] = value;			
			value++;

			
			for(int i=0; i<length; i++) {
				y+=direction;
				num[y][x] = value;
				value++;

			}
			
			direction *= -1;
			length--;
			
			if( length == 0 ) { // 종료조건
				x+=direction;
				num[y][x] = value;
				break;
			}
			
		}

		for (int i = 0; i < matSize; i++) {
			for(int j=0 ; j < matSize; j++) {
				System.out.printf("%2d\t", num[i][j]);
			}
			System.out.println();
		}

	}

	
}
