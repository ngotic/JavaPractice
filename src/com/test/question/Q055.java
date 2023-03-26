package com.test.question;

public class Q055 {

	public static void main(String[] args) {

		// [요구사항]
		// 1부터 100사이의 완전수를 구하시오.
		//
		// 조건..
		// 완전수: 자기 자신을 제외한 나머지 약수들의 합이 자신과 동일한 수
		// 약수: 어떤 수나 식을 나누어 나머지가 없이 떨어지는 수

		String add = "";
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			add = "";
			sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					add += j + ", "; // String으로 형변환
					sum += j;
				}
			}
			if (i == sum) {

				System.out.printf("%d = [%s]\n", i, add);
			}

		}

	}

}
