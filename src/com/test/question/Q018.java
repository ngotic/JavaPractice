package com.test.question;

public class Q018 {

	public static void main(String[] args) {
	// 요구사항 ] 	인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하시오.
		int count;
		count = positive(10);
		System.out.printf("양수: %d개\n", count);
		count = positive(10, 20);
		System.out.printf("양수: %d개\n", count);
		count = positive(10, 20, -30);
		System.out.printf("양수: %d개\n", count);
		count = positive(10, 20, -30, 40);
		System.out.printf("양수: %d개\n", count);
		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수: %d개\n", count);
		
	}
	
	public static int positive(int...array) {
		int cnt=0;
		for (int n : array) {
			if ( n > 0 ) cnt++;
		}
		
		return cnt;
	}
 // 아래 메서드 5개를 이거 하나로 표현 가능
	
//	public static int positive(int n1) {
//		int cnt = 0;
//		cnt = n1 > 0? cnt + 1: cnt;
//		return cnt;
//	}
//	public static int positive(int n1, int n2) {
//		int cnt = 0;
//		cnt = n1 > 0? cnt + 1: cnt;
//		cnt = n2 > 0? cnt + 1: cnt;
//		return cnt;	
//	}
//	public static int positive(int n1, int n2, int n3) {
//		int cnt = 0;
//		cnt = n1 > 0? cnt + 1: cnt;
//		cnt = n2 > 0? cnt + 1: cnt;
//		cnt = n3 > 0? cnt + 1: cnt;
//		return cnt;
//	}
//	public static int positive(int n1, int n2, int n3, int n4) {
//		int cnt = 0;
//		cnt = n1 > 0? cnt + 1: cnt;
//		cnt = n2 > 0? cnt + 1: cnt;
//		cnt = n3 > 0? cnt + 1: cnt;
//		cnt = n4 > 0? cnt + 1: cnt;
//		return cnt;
//	}
//	public static int positive(int n1, int n2, int n3, int n4, int n5) {
//		int cnt = 0;
//		cnt = n1 > 0? cnt + 1: cnt;
//		cnt = n2 > 0? cnt + 1: cnt;
//		cnt = n3 > 0? cnt + 1: cnt;
//		cnt = n4 > 0? cnt + 1: cnt;
//		cnt = n5 > 0? cnt + 1: cnt;
//		return cnt;
//	}
}
