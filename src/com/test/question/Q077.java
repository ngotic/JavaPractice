package com.test.question;

public class Q077 {

	public static void main(String[] args) {

		int matSize = 5;
		int[][] nums = new int[matSize][matSize];
		
		
		// phase 1.
		// 00             /0
		// 01 10          /1
		// 02 11 20       /2
		// 03 12 21 30    /3
		// 04 13 22 31 40 /4
		
		// phase 2.
		// 14 23 32 41    /5
		// 24 33 42       /6
		// 34 43          /7
		// 44             /8

		int value = 1;
		int length = matSize * 2 - 1;
		
		// i는 합
		for (int i = 0; i < matSize; i++) { // outer 전체 회수 및 합
			for (int j = 0 ; j <= i; j++) {
				nums[j][i - j] = value++;
			}
		}
		
		int begin =1;
		for (int i = matSize; i < length; i++) { // outer 전체 회수 및 합
			for (int j = begin ; j < matSize ; j++) {
				nums[j][i - j] = value++;    // j + i - j = i
			}
			begin++;
		}

		for (int i = 0; i < matSize; i++) {
			for(int j=0 ; j<matSize; j++) {
				System.out.printf("%2d\t", nums[i][j]);
			}
			System.out.println();
		}
	}

}
