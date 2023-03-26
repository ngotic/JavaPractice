package com.test.question;

public class Q071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		출력..
//		25	24	23	22	21
//		20	19	18	17	16
//		15	14	13	12	11
//		10	9	8	7	6
//		5	4	3	2	1

		int matSize = 5;
		int [][] nums = new int[matSize][matSize];
		int value = matSize*matSize;
		for(int i=0; i< matSize; i++) {
			for(int j=0 ; j<matSize; j++) {
				nums[i][j] = value--;
			}
		}
		
		for(int i=0; i< matSize; i++) {
			for(int j=0 ; j<matSize; j++) {
				System.out.printf("%2d\t", nums[i][j]);
			}
			System.out.println();
		}
		
//      No 배열
//		int begin;
//		for (int i = 5; i > 0; i--) {
//			begin = i * 5;
//			for(int j=begin; j > begin-5; j--) {
//				System.out.printf("%2d\t", j);
//			}
//			System.out.println();
//		}
		
	}

}
