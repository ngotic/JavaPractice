package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17_Casting {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���� : ");
		String input1 = reader.readLine();
		
		System.out.println("���� : ");
		String input2 = reader.readLine();
		
		
		int num1 = Integer.parseInt(input1); //
		int num2 = Integer.parseInt(input2); // int�� �Ƚ��ϰٴ�
		
		System.out.println(num1+num2);
		
		//������(String) > ����
		// - ����Ŭ����.parseXXX()
		
		byte n1 = Byte.parseByte("10");
		short n2 = Short.parseShort("10");
		int n3 = Integer.parseInt("10");
		long n4 = Long.parseLong("10");
		float n5 = Float.parseFloat("3.14");
		double n6 = Double.parseDouble("3.14");
		boolean n7 = Boolean.parseBoolean("true");
		
		// ���� > ������
		String s1 = String.valueOf(10);
		String s2 = String.valueOf(3.14);
		String s3 = String.valueOf(true); // true > "true"
		
	}

}
