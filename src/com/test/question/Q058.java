package com.test.question;

import java.util.Scanner;

public class Q058 {

	public static void main(String[] args) {

//		요구사항] 아래와 같이 출력하시오.
//		출력..
//		 1 ~  10:  55
//		11 ~  20: 155
//		21 ~  30: 255
//		31 ~  40: 355
//		41 ~  50: 455
//		51 ~  60: 555
//		61 ~  70: 655
//		71 ~  80: 755
//		81 ~  90: 855
//		91 ~ 100: 955

		Scanner scan = new Scanner(System.in);

		int sum = 0, offset = 1; // k 라고 해서 앞쪽의 범위를 가리키는 offset를 둔다.
		for (int i = 10; i <= 100; i += 10) {
			sum = 0;
			for (int j = offset; j <= i; j++) {
				sum += j;
			}

			System.out.printf("%3d ~ %3d: %4d\n", offset, i, sum);
			offset += 10;
		}

		scan.close();

	}

}
