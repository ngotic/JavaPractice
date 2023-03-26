package com.test.question;

import java.util.Scanner;

public class Q047 {

	public static void main(String[] args) {
		// 요구사항] 자판기 프로그램을 구현하시오.
		// 실제 결과 화면 ...
		Scanner scan = new Scanner(System.in);
		final int COKE = 700, CIDER = 600, VITA500 = 500;

		while (true) {
			System.out.println("======================");
			System.out.println("        자판기           ");
			System.out.println("======================");
			System.out.println("1. 콜라 : 700원");
			System.out.println("2. 사이다 : 600원");
			System.out.println("3. 비타500 : 500원");
			System.out.println("----------------------");
			System.out.print("금액 투입(원) : ");
			int price = scan.nextInt();
			System.out.println("----------------------");
			System.out.print("음료 선택(번호) : ");
			int num = scan.nextInt();
			scan.nextLine();

			if (num == 1) {

				if (COKE > price) {
					System.out.println("+금액이 부족합니다.");
				} else if (COKE < price) {
					System.out.println("+콜라를 제공합니다.");
					System.out.printf("+잔돈 %d원을 제공합니다.\n", price - COKE);
				} else {
					System.out.println("+콜라를 제공합니다.");
					System.out.println("+잔돈이 없습니다.");
				}

			} else if (num == 2) {

				if (CIDER > price) {
					System.out.println("+금액이 부족합니다.");
				} else if (CIDER < price) {
					System.out.println("+사이다를 제공합니다.");
					System.out.printf("+잔돈 %d원을 제공합니다.\n", price - CIDER);
				} else {
					System.out.println("+사이다를 제공합니다.");
					System.out.println("+잔돈이 없습니다.");
				}

			} else if (num == 3) {

				if (VITA500 > price) {
					System.out.println("+금액이 부족합니다.");
				} else if (VITA500 < price) {
					System.out.println("+비타500을 제공합니다.");
					System.out.printf("+잔돈 %d원을 제공합니다.\n", price - VITA500);
				} else {
					System.out.println("+비타500을 제공합니다.");
					System.out.println("+잔돈이 없습니다.");
				}

			} else {
				System.out.println("+1 ~ 3번의 음료번호를 선택하세요.");
			}
			System.out.println("\n게속하시려면 엔터를 입력하시고 종료하시려면 q 를 입력하시오. ");
			String str = scan.nextLine();

			if (str.equals("q")) {
				break;
			}
		}
		scan.close();
	}

}
