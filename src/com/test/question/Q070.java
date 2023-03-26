package com.test.question;

public class Q070 {

	public static void main(String[] args) {
//		요구사항
//		아래와 같이 출력하시오.
//		출력..
//		1	2	3	4	5
//		10	9	8	7	6
//		11	12	13	14	15
//		20	19	18	17	16
//		21	22	23	24	25

		int matSize = 5;
		int phase = 1;
		// 1 : +
		// -1 : -
		int value = 1;
		int[][] nums = new int[matSize][matSize];

		for (int i = 0; i < matSize; i++) {
			for (int j = 0; j < matSize; j++) {
				nums[i][j] = value;
				value += phase;
			}
			if( phase == 1) { // 다음 라인 넘어갈 때의 값 변화
				value+=matSize-1;
			}
			else {			
				value+=matSize+1;
			}
			phase *= (-1); // 부호 전환
		}
		
		for (int i = 0; i < matSize; i++) {

			for (int j = 0; j < matSize; j++) {
				System.out.printf("%2d\t", nums[i][j]);
			}
			System.out.println();
		}

//      No 배열		
//		int n = 1; //
//		boolean on_off = true;
//		int begin;
//		for (int i = 0; i < 5; i++) {
//
//			if (on_off) { // plus phase
//				begin = n;
//				for (int j = begin; j < begin + 5; j++) {
//					System.out.printf("%2d\t", n++);
//				}
//
//			} else { // minus phase
//
//				begin = n + 4;
//				for (int j = begin; j > begin - 5; j--) {
//					System.out.printf("%2d\t", j);
//					n++; // hidden
//				}
//
//			}
//			on_off = !on_off;
//
//			System.out.println();
//		}

	}

}
