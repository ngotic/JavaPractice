package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex18_Operator {
	public static void main(String[] args) throws IOException {

		/*
		 * ������, Operator
		 * - ���� ������ > ���α׷��� ������
		 * - �ǿ����ڸ� ������� �̸� ������ ����(�ൿ)�� �� �Ŀ�, ����(�ൿ)�� ����� ��ȯ�ϴ� ���
		 * �ַ� ��ȣ�� ���� ��� + ���ܾ ���� ���
		 * 1. ����, Statement
		 * 2. ǥ����, Expression
		 * 3. ������, Operator
		 * 4. �ǿ�����, Operand
		 * 5. ������ �켱����
		 * 6. ������ �������
		 * 
		 *  ����, Statement
		 *  - 1�� �̻��� ǥ������ �𿩼� ������ �����.
		 *  - int sum = 10 + 20; �̰� �ϳ��� �����̴�.�ɰ� �� �ִ� �������� �� �ɰ����� ���°� > ǥ����
		 *  ǥ����, Expression
		 *  - ������ �����ϴ� �ּ� ����; ǥ������ �𿩼� ������ �ȴ�. 
		 *  - int sum, 10+20 
		 *  ������, Operator
		 *  +, =
		 *  �ǿ�����, Operator
		 *  +�� ����: 10, 20 
		 *  =: sum, 30
		 *  ������ �켱����
		 *  �ϳ��� ���忡�� �����ִ� ��� �����ڵ���, ���� ���� �����ؾ� �Ǵ��� 
		 *  ������ �������ִ�. > �������� �켱������. �����ڰ� �̸� ������ ����, ���п��� ���  
		 *  1+2x3 = 7
		 *  
		 *  ������ �������
		 *  1 + 2 + 3 = 6 // ������ ���� �����ڴ� �켱������ �����ϴ�.
		 *  �츮�� ���п��� �� �����ص� ����� ����. ��ǻ�ʹ� �̸� ������ ��Ģ�� �ִ�. �տ��� ����, �ڿ��� ����? 
		 *  �ϳ��� ���忡 �����ִ� �����ڵ� �� �켱������ �����ϸ� ��� ����(��, ��)���� �����ؾ� �ϴ��� ������ ������
		 *  
		 *  < �������� ���� >
		 *  1. �ൿ(����)
		 *     a. ��� ������   
		 *     b. �� ������
		 *     c. �� ������
		 *     d. ���� ������
		 *     e. ���� ������
		 *     f. ���� ������
		 *     
		 *  2. ����(�ǿ����� ����)
		 *     a. 1�� ������
		 *     b. 2�� ������
		 *     c. 3�� ������  
		*/  
		
		int sum = 10 + 20;
		System.out.println(sum); // ����Ŭ������ �������� �Ϸ��� �ڵ��� ���� 
		
		/*  
		 	��� ������
		 	+, -, *, /, %(mod, ������)
		 	2��(����) ������
		 	�ǿ����ڸ� ���ڸ� ������. (����, �Ǽ�)
		 */ 
		int a = 10;
		int b = 3;
		
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d %% %d = %d\n", a, b, a % b); 
		
		// 10/3 > 3��, ������ 1
		// 10/3 ���� 3.333333���� �ٲٰ� �ʹٸ�? : �ڷ����� ���õǾ���.
		double c = 10;
		double d = 3;
		System.out.println( c / 3);
		
		// - ���� / ���� = ����
		// - �Ǽ� / ���� = �Ǽ�
		// - ���� / �Ǽ� = �Ǽ�
		// - �Ǽ� / �Ǽ� = �Ǽ�
		
		//*** ���Ģ ) ��� ��� �������� ����� �ڷ����� �� ��
		// �������� �ڷ��� �߿��� �� ũ�Ⱑ ū �ڷ������� ��ȯ�ȴ�.
//		System.out.println();
//		System.out.println(10  /   3); // - ���� / ���� = 3
//		System.out.println(10.0/   3); // - �Ǽ� / ���� = 3.33333333
//		System.out.println(10  / 3.0); // - �Ǽ� / ���� = 3.33333333
//		System.out.println(10.0/ 3.0); // - �Ǽ� / ���� = 3.33333333
//		System.out.println();
		
		int e =1000000000; // 10��
		int f =2000000000; // 20��
		// int + int = int(overflow) ����
		System.out.println(e + f); // 30��?
		
		//(long)int + int
		System.out.println((long)e + f); 
		
		e=300000;
		f=500000;
		System.out.println(e*f);
		System.out.println((long)e*f);
		
		e = 10;
		f = 3;
		System.out.println(e % f);
		
		e = 10;
		f = 11;
		System.out.println(e % f); 
		
		// �޷� ����� ����
		// 1. 2023�� 2�� 1�� > ���� ����? ��
		// 2. 2023�� 2�� > ��������? 28��
		//    ����?
		// ����(��¥ % 7 > ������4 ����)
		// �� �� ȭ �� �� �� ��
		//         1 2 3 4
		// 5  6 7  8 9 10 11 
		// ... 
		
		// ���� �� int�� �ַ� ����ϴ���?
		// - ������ ���ͷ��� int
		// - 
//		byte b1 = 10;
//		byte b2 = 20;
//		
//		// byte + byte = byte
//		System.out.println(b1+b2); // ���⼱ �I����
//		
		// Type mismatch: cannot convert from int to byte
		
		//**** byte, short�� ��� ������ ������ int�̴�. > CPU ó������
		// byte + byte = byte(X)
		// byte + byte = int(O)
		// byte + byte
		// byte b3 = (byte)(b1+b2)
		// byte b3 = (b1 + b2);            // ���⼱ ����
		
//		byte b3 = (byte)(b1 + b2);         // ���⼱ ����
//		
//		System.out.println(b3);
//		
//		int b4 = b1 + b2;
//		
		/*
		 * ������ �켱 ����
		 * 1. () : ���ϸ�����.
		 * 2. ��� ������
		 * 	  a. *, /, % ���
		 *    b. +, - 
		 *    c. >, <    ��
		 *    d. &&, ||  ��
		 *    e. =       �븳
		 *    ����(1) > ���� (2) > ����(3) : ���� �������� �켱������ ���� �����ں��� ����.
		 *    ���� �����ڿ� ���� �����ڸ� ������ ��� ������ ��������� ���ʿ��� �������̴�. 
		 * 	  	
		 * �� ������
		 * >, >=, <, <=, ==(����, equals), !=(���� �ʴ�. not equals)
		 * 2�� ������
		 * �ǿ����ڵ��� ����(����) �񱳸� �ϴ� ������
		 * �ǿ����ڴ� �������� ������.
		 * ������ ����� boolean�̴�.(true, false)
		 * */
		
		 a = 10;
		 b = 3;
		 
		 System.out.println(a > b);
		 System.out.println(a >= b);
		 System.out.println(a < b);
		 System.out.println(a <= b);
		 System.out.println(a == b);
		 System.out.println(a != b);
		 
		 //���α׷� �帧 > ���� ���ÿ�
		 //�䱸����] ����� ���� �Է� > ���� (19�� �̻�) O, X
		 
//		 System.out.println("���� : ");
//		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		 String input = reader.readLine();
//		 int age = Integer.parseInt(input);
//		 System.out.println(age >= 19);
//		 
//		 boolean b1 = true;
//		 boolean b2 = true;
//		 // System.out.println(b1 > b2);
//		 System.out.println(b1 == b2);
//		 System.out.println(b1 != b2);
		 
		 String s1 = "ȫ�浿";
		 String s2 = "ȫ�浿";
		 String s3 = "�ƹ���";
		 String s4 = "ȫ";
		 s4 = s4 + "�浿"; // "ȫ" + "�浿" 
		 System.out.println(s1 == s2); // true
		 System.out.println(s1 == s3); // false
		 System.out.println(s4);
		 System.out.println(s1 == s4); // false
		 // *** ���ڿ��� �񱳴� ==, != �����ڸ� ����ϸ� ���� �ȵȴ�.
		 // -> equals()��� 
		 System.out.println();
		 System.out.println(s1.equals(s2)); // true
		 System.out.println(s1.equals(s4)); // true
		 
		 int ages=10;
		 System.out.println(19 <= ages && ages > 60 );     // �񱳿����ڰ� �켱������ �� ����.
		 System.out.println((19 <= ages) && (ages > 60) ); // �񱳿����ڰ� �켱������ �� ����.
		 
		 // boolean�� �ݴ�� ������
		 System.out.println(!true);
		 System.out.println(!false);
		 
		 /*
		  * �� ������
		  * &&(and), ||(or), !(not)
		  * &(and), |(or), ^(xor, exclusive or, ��Ÿ�� ����) : ��Ʈ ����
		  * &, ||, ^ 
		  * 2�� ������(&&, ||)
		  * 1�� ������!
		  * �ǿ������� �ڷ����� boolean�̴�;.
		  * ������ ����� boolean�̴�.
		  * */
		System.out.println(10 & 9);
	}//main
}
