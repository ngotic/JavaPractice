package com.test.java;

import java.util.Scanner;

public class Ex21_Operator {

	public static void main(String[] args) {
		// �䱸���� ] ����ڷκ��� ���� 1���� �Է� > ���� �ҹ������� �˻�?
		// �ó�����
		
		Scanner scan = new Scanner(System.in);
		// ȭ�� ���� 
		System.out.println("���� �Է� : ");
		String s = scan.nextLine(); 
		
		int code = (int)s.charAt(0);
		if(s.length()==1 ) {
			String str= ( code >=97 && code <=122)? "�ҹ��� �Դϴ�.":"�빮�� �Դϴ�." ;
			System.out.printf("�Է¹��� ���ڴ� %c %s�Դϴ�.",code, str);
		} else {
			System.out.println("�����ڸ�");
		}
	}

}
