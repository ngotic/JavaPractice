package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex12_BufferedReader {
	
	public static void main(String[] args) throws IOException {
		
//		// �Է� ���� �����ϱ� �װ��� reader��� ���� �ȿ� ��� �ִ�. 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		
//		System.out.println("���� �Է� : ");
//		int code = reader.read(); // read��� �̸��� �޼��尡 �ִ�.
//		System.out.printf("��� : %c\n", code);
//		System.out.println("����");
//		System.out.println("�̸� �Է�: " ); // 3����
//		String txt = reader.readLine(); // ��� ����ڰ� �Է��� �����͸� ���ڿ��� �����ش�. 
//		System.out.printf("�ȳ��ϼ���. %s��\n", txt);
//		
//		System.out.println("���� �Է� : ");
//		String color = reader.readLine(); // �Է��� ������ �ѹ��� ���ͼ� ����.
//		System.out.printf("����� �Է��� ������ %s�Դϴ�.\n", color);
		
//		System.out.println("���� �Է�");
//		String input = reader.readLine();   // "3.5"
//		// �ڷ��� ��ȯ �۾�
//		double num = Double.parseDouble(input);  // "3.5"->3.5 ���� ��ȯ�۾� ���ش�.
//		System.out.println(100 - num);
		
		// �䱸����] ����ڷκ��� ���ڸ� 2�� �Է� > �� ���� ���� ���Ͻÿ�.
		// 1. �� ���
		System.out.println("����");
		
		System.out.println("�����Է�: ");
		int a = Integer.parseInt(reader.readLine());
		System.out.println("�����Է�: ");
		int b = Integer.parseInt(reader.readLine());
		
		System.out.println("�� ���� ���� ? "+(a+b));
		// 2. ���� 1���� �Է�
		// 3. �� ���
		// 4. ���� 1�� �Է�
		// 5. �� ���� ���� ���ϰ� 
		// 6. ��������� ���
		
		
	}
}
