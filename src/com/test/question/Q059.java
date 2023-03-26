package com.test.question;

public class Q059 {

	public static void main(String[] args) {
		// 요구사항] 아래와 같이 출력하시오.
		// 조건 ] 마지막 숫자가 100이 넘기 전까지 출력하시오.
		// 1 + 2 + 4 + 7 + 11
		int last = 1, sum = 0, k = 1;

		while (last < 100) {

			System.out.printf("%d+", last);
			sum += last;
			last += k;
			k++;

		}

		System.out.printf(" = %d\n", sum);

	}

}
