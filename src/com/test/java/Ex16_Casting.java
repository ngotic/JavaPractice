package com.test.java;

public class Ex16_Casting {
	public static void main(String[] args) {
		//        [ 규칙 ]
		// 정수형 리터럴은 int이다. 
		// 실수형 리터럴은 double이다.
		// 대입 연산자는 좌우 자료형이 동일해야 한다.

		byte  m1 = 10; // 얘는 오른쪽이 큰형인데?	
		// byte,  int > 그럼 명시적 형변환 일어나야 하는데?
		
		
		//byte m1 = 100;
		
		
		// short작은형2 = int큰형4 
		short m2 = 100;
		
		// 형변환 없음
		int   m3 = 10;
		
		//long큰형4 = 작은형4 > 암시적
		long  m4 = 10000000;
		float f1 = 3.15f;
		double f2 = 3.14;
		
		// 정수 <-> 실수		
		//long n1 = 100; // 원본(8)
		long n1 = Long.MAX_VALUE; // 원본(8)
		float n2;      // 복사(4)
		//double n3;     //    (8)
		// float(4) = long(8)
		n2 = n1+1F;
		// 어떻게 8바이트 자료형이 4바이트로 들어가는데 암시적으로 됨??
		// 사실 이건 암시적이 맞다. float이 long보다 크다.사실 저장하는 방식이 달라서 
		// float는 long보다 표현범위가 넓다. 물리적인 크기는 long이 더 크지만
		//System.out.println(n2);
		//n3 = n1;
		// 우리는 단지 공간의 범위를 논하는 것이 아니라 값이 허용하는 범위를 논한다.
		
		double n3 = 3.14;
		int n4;
		//작은형  큰형 > (int) 안붙이면 에러
		n4 = (int)n3;
		//System.out.println(n4);
		
		// byte, short, int ,long, float, double
		
		// char > 문자코드값
		// char > 문자형이라 분류하지만 저장할 때는 정수타입의 숫자형이다. (물리적으론 숫자가 저장)
		// - char 숫자 자료형이다. 그래서 형변환은 가능하다. 문자코드는 정수만 가진다.
		// 정수타입으로 형변환가능  
		
		//'A' > 숫자? 
		//'@' > 숫자?
		
		// char(2byte) = short(2byte)
		char c1 = '가'; // 원본
		short s1; 	   // 복사본
		// 'A' 는 65 
		s1 = (short)c1;       // 에러 -> 형변환 직접해야한다.  
		//System.out.println("s1: " + s1);
		
		short s2 = -10;
		char c2;
		c2 = (char)s2; // 뒤집어도 에러 -> 형변환 해야한다.
		//System.out.println("c2 : "+ c2); // 97 > 'a' 
		
		// char를 short로 변환하면 안된다.
		// char를 문자코드로 변환하려면 int를 사용한다.
		// char > int
		// int > char
		
		char c3 = '가';
		int a3; 
		
		a3 = c3; // 암시적 형변환
		//System.out.println("a3:" + a3); // 한글 '가'가 가지는 실제 메모리의 숫자
		
		System.out.println((int)'A'); // 65
		System.out.println((int)'Z'); // 90
		System.out.println((int)'a'); // 97
		System.out.println((int)'z'); // 122
		System.out.println((int)'0'); // 48
		System.out.println((int)'9'); // 57
		
		//한글 체계
		//- 완성형 한글(가, 나, 다, 강, 곽, 감...) > 구현하기 쉽다.  
		//- 조합형 한글(ㄱ, ㄴ, ㄷ, ㄹ,  ㅏ,   ㅑ) > 요즘은 사용 잘안한다.
		System.out.println((int)'가'); // 44032
		System.out.println((int)'힣'); // 55203
		
	}
}
