package com.test.question;

import java.util.Scanner;

public class Q006 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("한달 수입 금액(원): ");
		int salary = sc.nextInt();
		double Tax = (3.3 / 100)*salary; // 세금 단위를 %로 하고 월급 곱하기
		System.out.printf("세후 금액(원): %,.0f원\n", salary-Tax); // 세금 뺌
		System.out.printf("세금(원): %,.0f원\n", Tax);
		sc.close();

	}

}
