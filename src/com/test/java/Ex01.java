package com.test.java; //� ��Ű�� �ȿ� �ֳ�?

// �����Դϴ�. �ּ�(Comment) > ���� �ּ�(Single Line Comment)
// �ּ� > �����Ϸ����� �������� ����� �ϴ� ��

/*
 
 �ּ� > ������ �ּ�(Multi Line Comment)
 
 �����Դϴ�. 
 �����Դϴ�. 
 �����Դϴ�.  
 */

// �� ǥ���� ������ ������ ����. 
// �ڵ��� ����
public class Ex01 
{
	// �޼ҵ�
	// main�̶�� �̸��� �޼ҵ�
	// �ڵ��� ����
	public static void main(String[] args) {
		// ������ ��ɾ� �ۼ�
		// ��ȣ���� ���빰�� �ܼ�â�� ����ض�
//		System.out.println();
//		char c = 3 + '0';
//		int i = '3'-'0';
//		System.out.println(c+", "+i);
//		System.out.println('3');
//		System.out.println('3'+1);
//		System.out.println(3 + '0');
//		System.out.println((char)(3 + '0'));
		
		
		// ���ڵ� ��Ģ������ �����ϴ�. �� ������ �����ڵ����·� ����Ǿ� �־��.
		// ��Ģ ����ÿ��� char���� int������ �����ڵ尪���� ��ȯ�Ǿ� ���ȴ�.
//		char a = 'a'; // �� ���ڰ� �����ڵ� ���·� ������ �ȴ�.
//		char d = 'd';
//		System.out.println(a);      // char Ÿ�Դ�� �ް� 
//		System.out.println((int)a); // int ����ȯ�ؾ� ����� ���� ������
//		System.out.println(a-d);    // ��Ģ ����� int������ ó����
//		System.out.println(a+d);    // ��Ģ ������ �������� ����� ����
		
	
		char c1 = 'a';
		//char c2 =  c1 +1;// ������ ����. �����ȯ���� int���ε� �̰� char�� �������ϴ�
		//char c2 =  (char)(c1 +1); // �̷��� �����ذ�
		char c2 ='a'+1; // ���ͷ� ������ ����ȯ�� ����. 
		System.out.println(c2);
		System.out.println('a'+1);
		
		
		
	}
}

