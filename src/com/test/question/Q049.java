package com.test.question;

import java.util.Scanner;

public class Q049 {

	public static void main(String[] args) {
		// 요구사항]
		// 아래와 같이 출력
		// 조건 행으 ㅣ갯수를 입력 받으시오.
		// 입력..
		// 행: 5
		// 출력..
		// *****
		//  ****
		//   ***
		//    **
		//     *
		Scanner scan = new Scanner(System.in);
		System.out.print("행: ");
		int num = scan.nextInt();
		System.out.println();

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		scan.close();
	}

}
