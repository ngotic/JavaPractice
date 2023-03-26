package com.test.question;

public class Q075 {

	public static void main(String[] args) {
		
		int value = 1;
		int matSize = 5; // input your number
		int sum = 0;
		int[][] inputs = new int[matSize][matSize];
		// 
		for (int i = 0; i < matSize - 1; i++) {
			sum=0;
			for (int j = 0; j < matSize - 1; j++) {
				sum += value;
				inputs[matSize - 1][j]+=value; // last 행
				inputs[i][j] = value++;
			}
			inputs[i][matSize - 1] = sum;
		}
		for (int i = 0; i < matSize - 1; i++) {
			inputs[matSize - 1][matSize - 1] += inputs[matSize - 1][i];
		}
		
		for (int i = 0; i < matSize ; i++) {

			for (int j = 0; j < matSize ; j++) {
				System.out.printf("%3d\t", inputs[i][j]);
			}
			System.out.println();
		}

//      No 배열
//		int num = 5; // matrix size
//		
//		int rowSum = 0;
//		int value =1;
//		int[] colSum = new int[num];
//		
//		for (int i=0 ; i< num -1; i++) {
//			rowSum=0;
//			for(int j=0; j< num-1; j++) {
//				System.out.printf("%2d\t", value);
//				rowSum+=value;
//				colSum[j]+=value;
//				value++;
//			}
//			System.out.printf("%2d\t", rowSum);
//			System.out.println();
//		}
//		
//		rowSum = 0;
//		for (int i=0 ; i< num -1; i++) {
//			System.out.printf("%2d\t", colSum[i]);
//			rowSum += colSum[i];
//		}
//		System.out.printf("%2d\t", rowSum);

	}

}
