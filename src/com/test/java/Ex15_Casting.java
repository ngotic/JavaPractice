package com.test.java;

public class Ex15_Casting {
	public static void main(String[] args) {
		
		int n1;
		int n2;
		
//		byte  b =100;
//		short s = 40;
//		s= b;
		
		// = ������
		// ���ʿ� ���� �� : ����, �����ʿ� ���� �� : ��, -> ���� = ��
		
		// 100�̶�� �����͸� n1�̶�� ������ �־��
		n1 = 100; // 100�̶�� �����͸� ��� n1�̶�� ���� ã�ư��� 100�� ����ְ�
		// int(n1) = int(100); ������ �ȳ���.
		// int(n2) = int(n1); ������ �ȳ���.		
		n2 = n1;  // n1�̶�� �����ȿ� �����͸� �����ͼ� n2��� ������ �־�� 
		// ���������� ���� 
		//System.out.println(n2); 
		
		short a =10;
		int   b ;
		//b = a;
		 b = (int)a; // ���� ���
		//System.out.println(b);// ����, ���纹 Ȯ��
		
		// int c = 200;   // 4byte, ����
		int c = Integer.MAX_VALUE;
		long d;        // 8byte, ���纻
		
		// long = int
		// �Ͻ��� ����ȯ
		d = c;
		//System.out.println(d);
		
		int e = 100000;
		short f;
		// f = e // ���� > ����� ����ȯ > ����ȣ�� �����ڸ� �����ϸ� �ȵȴ�. > �ݵ�� �ۼ�
		f = (short)e;
		//System.out.println(f);
		
		// �������
		long g = 3000000000L;
		int h;
		h = (int)g; // long�� int��... ����ȯ
		System.out.println(h);
		
	}
}
