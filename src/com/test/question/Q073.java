package com.test.question;

public class Q073 {

	public static void main(String[] args) {
		
//		요구사항
//		아래와 같이 출력하시오.
//
//		출력..
//		1	2	3	4	5
//		6	7	8	9	0       
//		10	11	12	0	0
//		13	14	0	0	0
//		15	0	0	0	0
		
		int matSize = 5;
		int [][] num = new int[matSize][matSize];
		
		
		int n =1;
		for(int i=0 ; i<matSize ; i++) {
			for(int j = 0; j < matSize  ;j++) {
				if((j + i)>=matSize)
					num[i][j] = 0;
				else
					num[i][j] = n++;
			}
			
		}
		
		
		for(int i=0 ; i< matSize; i++) {	
			for(int j=0 ; j< matSize ; j++) {
				System.out.printf("%2d\t", num[i][j]); 
			}
				System.out.println();
		}
			
//      No 배열
//		int n = 1;
//		for(int i = 0 ; i < 5; i++) {
//			
//			for(int j = 1; j<= 5-i; j++ ) {
//				System.out.printf("%2d\t", n++);
//			}
//			for(int k = 0; k < i ; k++) {
//				System.out.printf("%2d\t",0);
//			}
//			
//			System.out.println();
//		}
	}

}
