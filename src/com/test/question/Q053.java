package com.test.question;

public class Q053 {

	public static void main(String[] args) {
//		요구사항
//		아래와 같이 출력하시오.
//
//		조건..
//		구구단을 출력하시오.

		for (int k = 0; k <= 4; k += 4) { // 2회

			for (int j = 1; j <= 9; j++) { // 9회

				for (int i = 2 + k; i <= 5 + k; i++) // 4번
					System.out.printf("%d x %d = %2d\t", i, j, i * j); // 2칸잡고 오른쪽 정령
				// 결과값은
				System.out.println();
			}
			System.out.println();

		}
	}

}
