package com.test.question;

import java.util.Scanner;

public class Q004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("섭씨(℃): " );
		double C = sc.nextDouble();
		double F = C*1.8 + 32;
		System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.", C, F);
		sc.close();
	}

}
