package com.test.question;

import java.util.Scanner;

public class Q052 {

	public static void main(String[] args) {
		// 요구사항
		// 아래와 같이 출력하시오.
		//
		// 조건..
		// 행의 갯수를 입력받으시오.
		// 입력..
		// 행: 5
		// 출력..
		//     aa
		//    abba
		//   abccba
		//  abcddbca
		// abcdeedcba

		Scanner scan = new Scanner(System.in);
		System.out.print("행: ");
		int num = scan.nextInt();
		System.out.println();
		char ch = 'a';

		for (int i = 0; i < num; i++) {

			ch = 'a';
			for (int j = 0; j < num - i - 1; j++) { // 4번
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) { // 1번
				System.out.printf("%c", ch);
				ch += 1;
			}

			ch -= 1;

			for (int j = 0; j <= i; j++) { // 1번
				System.out.printf("%c", ch);
				ch -= 1;
			}

			System.out.println();
		}

		scan.close();
	}

}
