package com.test.question;

public class Q074 {

	public static void main(String[] args) {
		// 요구사항
		// 아래와 같이 출력하시오.
		//
		// 출력..
		// 0 0 1 0 0 // 값은 +1씩, 그럼 어느 포인트냐? 찍는 위치가 중요
		// 0 2 3 4 0
		// 5 6 7 8 9
		// 0 10 11 12 0
		// 0 0 13 0 0

		// 0을 2개, 0아닌거를 1개, 0을 2개 // 0 개수는 대칭
		// 0을 1개 0아닌거를 3개, 0을 1개 // 0 개수는 대칭
		
		
		int value = 1;
		int matSize = 5; // input your number
		int [][] inputs = new int[matSize][matSize];
		
		for(int i=0; i< matSize/2+1 ;i++) {
			//     2,      //  2
			//   1,2,3     // 1~3
			// 0,1,2,3,4   // 0~4
			for(int j = matSize/2 - i; j<=matSize/2+i ; j++) {
				inputs[i][j] = value++;
			}			
		}
		
		for(int i=matSize/2+1; i< matSize ;i++) {
			for(int j = i-matSize/2 ; j< matSize-(i-matSize/2) ; j++) {
				inputs[i][j] = value++;
			}			
		}
		
		
		for(int i=0;i < matSize; i++) {
			for(int j=0; j<matSize; j++) {
				System.out.printf("%d\t",inputs[i][j]);
			}
			System.out.println();
		}
		
		
//      No 배열
//		int num = 5; // input your number 
//		int edge = -1 * (num / 2); // 음수 값
//		
//		//  0의 개수
//		// 2 1 0 1 2
//		// -2 -1 0 1 2 이걸 절대값 취하면 0의 개수와 동일
//		int value = 1; // start
//		
//		for (int i = edge; i <= edge*(-1); i++) { // 범위를 Normalize
//			
//			int zeros = Math.abs(i);
//			int noZero = num - 2 * zeros;
//			
//			for(int j = 0; j < zeros; j++)
//				System.out.printf("%2d\t", 0);
//			
//			for(int j = 0; j < noZero; j++)
//				System.out.printf("%2d\t", value++);
//			
//			for(int j = 0; j < zeros; j++)
//				System.out.printf("%2d\t", 0);
//			System.out.println();
//			
//		}
		
	}

}
