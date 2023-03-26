package com.test.question;

public class Q054 {

	public static void main(String[] args) {
		// 요구사항
		// 2부터 100사이의 소수를 구하시오.
		//
		// 조건..
		// 소수: 1과 자기자신으로밖에 나눠지지 않는 수
		boolean prime = false;//
		
		for (int i = 2; i <= 100; i++) {
			prime = true;

			for (int j = 2; j < i; j++) { // 1, 자기자신은 포합 x loop > 다 돌아야 할 수 있음
				if ((i % j) == 0) { // 나누어 떨어지지 않음
					prime = false;
					break;
				}
			}

			if (prime)
				System.out.printf("%d, ", i);

		}

	}

}
