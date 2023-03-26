package com.test.question;

import java.util.Scanner;

public class Q061 {

	public static void main(String[] args) {
		// 요구사항] 숫자 5개를 입력받아 배열에 담은 뒤 역순으로 출력하시오.
		// 조건 : int[] nums = new int[5];
		// 입력..
		// 숫자: 5
		// 숫자: 1
		// 숫자: 7
		// 숫자: 2
		// 숫자: 3
		int[] nums = new int[5];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			System.out.print("숫자: ");
			nums[i] = scan.nextInt();
		}

		for (int i = nums.length - 1; i >= 0; i--)
			System.out.printf("nums[%d] = %d\n",i, nums[i]);
		
		scan.close();
	}

}
