package com.test.java;

import java.io.IOException;
import java.util.Scanner;

public class Ex10_Input {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// �ܼ��Է�
		//1. System.in.read()
		//- read()�޼ҵ�
		//2. BufferedReader Ŭ����
		// - ����
		//3. Scanner Ŭ����
		// - ��������
		
		// �䱸����] ����ڿ��� ���� 1�� �Է¹޾� ȭ�鿡 ����Ͻÿ�.
		// �ó����� ¥��
		// 1. �ȳ� �޼��� ���
		// 2. Ű �Է�
		// 3. �Է¹��� Ű�� ȭ�� ���
		// ���� ���� > ȭ�� ����
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		// ���� ���� > ����ڰ� Ű�� �Է��ϱ⸦ ����ϰ� �ִ� ����
		// read() ���ο��� ���α׷��� ��� �����ִ� ����		
		int code = System.in.read();
		// ���� �ڵ尪 'A' > 65
		//          'a' > 97
		//          '0' > 48
// 		System.out.println(code);
// 		System.out.printf("%c\n", code); // ��
		System.out.printf("�Է��� ���ڴ� %c�Դϴ�.", code);

	}

}
