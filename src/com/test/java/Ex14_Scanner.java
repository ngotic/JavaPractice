package com.test.java;

import java.util.Scanner;

public class Ex14_Scanner {

	public static void main(String[] args) {
		// Scanner�� ��������� ���ϴ�.
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.printf("�ȳ��ϼ���. %s��\n", str);
		
		System.out.println("���� : ");
	
		int num = sc.nextInt();
		System.out.println(num + 10);
		
		

	}

}
