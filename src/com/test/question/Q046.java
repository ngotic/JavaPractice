package com.test.question;

import java.util.Scanner;

public class Q046 {

	public static void main(String[] args) {
		// 요구사항] 숫자를 10개 입력받아 한글로 변환 후 출력하시오.
		// 조건..
		// 1~9까지만 입력하시오.
		final String[] NUMSTR = { "", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		String result = "";

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("숫자: ");
			int num = scan.nextInt();
			result += NUMSTR[num];
		}

		System.out.println(result);

		scan.close();
	}

}
