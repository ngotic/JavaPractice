package com.test.java;

public class Ex15_Casting {
	public static void main(String[] args) {
		
		int n1;
		int n2;
		
//		byte  b =100;
//		short s = 40;
//		s= b;
		
		// = 연산자
		// 왼쪽에 오는 것 : 공간, 오른쪽에 오는 것 : 값, -> 공간 = 값
		
		// 100이라는 데이터를 n1이라는 공간에 넣어라
		n1 = 100; // 100이라는 데이터를 들고 n1이라는 공간 찾아가서 100을 집어넣고
		// int(n1) = int(100); 에러가 안난다.
		// int(n2) = int(n1); 에러가 안난다.		
		n2 = n1;  // n1이라는 공간안에 데이터를 가져와서 n2라는 공간에 넣어라 
		// 변수끼리의 복사 
		//System.out.println(n2); 
		
		short a =10;
		int   b ;
		//b = a;
		 b = (int)a; // 번역 결과
		//System.out.println(b);// 검증, 복사복 확인
		
		// int c = 200;   // 4byte, 원본
		int c = Integer.MAX_VALUE;
		long d;        // 8byte, 복사본
		
		// long = int
		// 암시적 형변환
		d = c;
		//System.out.println(d);
		
		int e = 100000;
		short f;
		// f = e // 에러 > 명시적 형변환 > 형변호나 연산자를 생략하면 안된다. > 반드시 작성
		f = (short)e;
		//System.out.println(f);
		
		// 은행계좌
		long g = 3000000000L;
		int h;
		h = (int)g; // long을 int로... 형변환
		System.out.println(h);
		
	}
}
