package com.test.java;

import java.util.Scanner;

public class Ex20_Operator {
	
	public static void main(String[] args) {
		
		
		
		/* ���� ������, �Ҵ� ������
		 * =
		 * +=, -=, *=, /=, %= (���� ���� ������)
		 * LValue(����) = Rvalue(����, ���)
		 * LValue�� RValue�� �ڷ����� �����ؾ� �Ѵ�. > ����ȯ
		 * ���� �������� ������ ������ ���� ����.
		 * */
		
		int sum = 1 + 2 *3 ; // �׻� ���� �����ڴ� �����. 
		System.out.println();
		int n = 10;
		// �䱸����] n�� 1�� ���Ͻÿ�. > n�� ���� 1�� ���ؼ� �ٽ� n�� �־��
		//           > ����(***)
		n = n + 1;
		System.out.println(n); //
		n += 1; //������ �ٿ����� ǥ���̴�. �̰� ���մ��� �������̴�.
		n = n - 1;
		System.out.println(n); //
		n -= 1;
		System.out.println(n); //
		n -= 2;
		System.out.println(n); //
		n = n * 2;
		System.out.println(n); //
		n *= 2;
		System.out.println(n); //
		n =n / 2;
		System.out.println(n); //
		n /= 2;
		System.out.println(n); //
		n = n % 7;
		System.out.println(n);
		n %= 4;
		System.out.println(n);
		n = n + 10;
		n += 10;
		n = n - 10;
		n -= 10;
		n = 10 + n;
		n += 10;
		n = 10 - n; // �� ???..... �򰥸���
		n -= 10;    // �� ��츸 �����ض�
		
		/*
		 * ���� ������
		 * ++(����), --(����)
		 * 1 �� ������
		 * �ǿ����ڴ� �������� ������.
		 * ���� ������ �Ѵ�. ������ ���� +1, -1�� �Ѵ�.
		 * 
		 ** �ǿ������� ��ġ�� �ٲ� �� �ִ�. > ������ �켱 ������ �޶�����.
		 *  ++n: ���� ��ġ(��ġ) > ������ �켱 ���� ���� ����(1��)
		 *  n++: ���� ��ġ(��ġ) > ������ �켱 ���� ���� ����(�õ�)
		*/
				
		System.out.println();
		System.out.println();
		
		n  = 10;
		
		n  = n + 1;
		n += 1;
		++n; // ������ ���� 1�� ���Ѵ�.
		
		System.out.println(n);
		
		n = n - 1 ;
		n -= 1;
		--n;
		
		System.out.println(n);
		System.out.println();
		System.out.println();
		
		n = 10;
		++n; // +1
		n++; // +1
		System.out.println(n); // 12 
		
		--n; //-1
		n--; //-1
		// �ܵ����� �� �� �ƹ��� ������ �Ȼ���µ� 
		// ���̸� ������ �����. 
		System.out.println(n); // 1�� ����.
		
		n = 10;
		int result = 0;
		result = 10 + ++n; 
		//> ++n�갡 �켱������ 1��
		System.out.println(result);
		
		n = 10;
		result = 10 + n++; 
		//> ��ġ �����̵Ǹ鼭 ������ �켱������ �õ� : n++�� �õ�
		System.out.println(result);
		int o=10;
		
		int s = --o-o--; //
		System.out.printf(">> %d\n", s);
		
		/*
		 * [ ���� ������ ]
		 * ?:
		 * 3�� ������ A? B:C
		 * A: ����(boolean)
		 * B, C: ���(���, ����)
		 * */
		boolean flag = true;
		String m1 = "��";
		String m2 = "����";
		
		//            A ?  B : C
 		String m3 = flag? m1 : m2;
		
		System.out.println(m3);
		// ���� > ����?
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����: ");
		//int age = scan.nextInt(); // ó������ ���ڷ� ���� �� �ִ�.
		
		//System.out.println( age >= 19 ? "���" : "����"); // 
		
		System.out.println();
		
		// 문자열 연산자 
		// +
		// 문자열 + 문자열
		// 이클립스 내의 모든 파일은 하나의 프로그램이다. 
		
		System.out.println(20+40+40);
		System.out.println(10+20+"30");
		System.out.println("10"+20+30);
		System.out.println(20+40+40);
		// 연산자 연산방향
		// 같은 수선순위를 가지는 연산들이
		// 같은 우선순위를 가지는 연산들이 어느 방향으로 실행되는지
		// 대부분의 연산자는 왼쪽 > 오른쪾 방향으로 실행한다. 
		// 대입 연산자(=)는 오른쪽 > 왼쪽 방향으로 실행한다.
		int n1; 
		int n2;
		int n3;
		
		// The loca variable n1 may not been initialized
		//System.out.println(); 
		
		n3 = n2 = n1 = 10;
		
		System.out.printf("%d %d %d\n", n3, n2, n1);
		
		System.out.println(10 + 20 + 30); // 산술 연산자   // 60
		System.out.println(10 + 20 + "30"); // 산술 연산자 // 3030
		// 먼저 30 되고 문자열되고 > 문자열+문자열이 된다.
		System.out.println(10 + "20" + 30); // 산술 연산자 // 102030
		// 10-> "10"이 되고 "10"+"20" 붙는다. 
		System.out.println("10" + 20 + 30); // 산술 연산자 // 102030
		// 이것 
		
		
	}
		
}

