package com.test.question;

public class Q072 {

	public static void main(String[] args) {
//		요구사항
//		아래와 같이 출력하시오.
//		출력..
//		1	6	11	16	21
//		2	7	12	17	22
//		3	8	13	18	23
//		4	9	14	19	24
//		5	10	15	20	25
		int [][] num = new int[5][5];
		
		for(int i=0 ; i< 5; i++) {	
			for(int j=0 ; j< 5 ; j++) {
				num[i][j] = (i+1)+ 5*j; 
			}
				System.out.println();
		}
		
		for(int i=0 ; i< 5; i++) {	
			for(int j=0 ; j< 5 ; j++) {
				System.out.printf("%2d\t", num[i][j]); 
			}
				System.out.println();
		}
		

//      No 배열		
//		for(int i=1 ; i<= 5; i++) {	
//			for(int j=i ; j<= i+5*4 ; j+=5) {
//				System.out.printf("%2d\t", j);
//			}
//				System.out.println();
//		}
	}

}
