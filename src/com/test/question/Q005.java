package com.test.question;

import java.util.Scanner;

public class Q005 {

	public static void main(String[] args) {
		// 1inch -> 2.54cm = 2.56* 0.01 m
		// 원의 둘레 : 2r*3.14
		// Math.PI
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자가 페달을 밟은 횟수: ");
		int diameter = 26;
		double inchPermeter =2.54 * 0.01;
		int count = sc.nextInt();
		double distance = count * diameter * inchPermeter * Math.PI;
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.\n", count, distance );
		sc.close();
	}

}
