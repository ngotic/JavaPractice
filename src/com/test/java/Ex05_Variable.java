package com.test.java;



public class Ex05_Variable {

	public static void main(String[] args) {
		
		//1. 각 자료형 > 변수 만들기
		//2. 각 자료형 > 데이터 대입 + 출력
		
		//정수형
		byte b1; 
		b1 = 10;
		
		System.out.println(10); // 10, 상수 : 변하지 않아
		System.out.println(10); // 10, 상수 : 변하지 않아
		// 10 > 데이터 > 데이터 표현한 10 > 리터럴(Literal), 상수(Constant)
		
		System.out.println(b1); //10이 출력되는데
		b1= 20;
		System.out.println(b1); //20
		
		// -128 ~ 127
		b1 = 127;
		System.out.println(b1);
		
		b1=-128;
		System.out.println(b1);
		
//		b1 = 128;
//		System.out.println(b1);
		
		//b1 = -129;
		b1 = Byte.MAX_VALUE; // 상수다. > JDK가 미리 제공함
		System.out.println(">"+b1);
		b1 = Byte.MIN_VALUE;
		System.out.println(">"+b1);
		
		short s1,s2;
		s1 = 30000;
		System.out.println(s1);
		
		s1 = Short.MAX_VALUE;
		s2 = Short.MIN_VALUE;
		System.out.println(s2+"~"+s1);
		
		int n1, n2; 
		n1 = 1000000000;
		System.out.println(n1);
		
		n1 = Integer.MAX_VALUE; // Integer가 안잡힘 - 해결 이클립스를 껐다킴
		n2 = Integer.MIN_VALUE;
	//	System.out.println(n2+"~"+n1);
		
		long l1;
		//l1 = 3000000000; // 왜 에러?? 왜 int 범위 밖? 무조건 정수형
		// 상수는 int라 4바이트 무조건 잡는데 30억이라는 숫자 저장하려고 4바이트 잡아버림 근데 4바이트 저장하는 정수값
		// 최대는 21억이다. 상수를 넣으려고 임의로 잡아놓은 이공간에 21억 넘는 값을 저장할 수 없다. 그래서 에러 메세지가 이런것
		// 해결책 자바가 상수를 저장할 때 그 공간을 Long으로 잡으면 된다. 
		
		l1 = 3000000000L; 
		// 숫자 뒤에다 대문자 L을 붙인다. 소문자 l을 붙여도 된다. 자바가 이 L을 본순간
		// 메모리에 8칸 잡아야 겠네라고 생각한 것이다. 그래서 전혀 문제가 없다.
		
		// 정수형 리터럴(상수) > int 이다.
		b1 = 10; 
		s1 = 10;
		n1 = 10;
		// 상수 10을 먼저 인식한다. 이 상수도 메모리 어딘가에 올라와야 한다.
        // 메모리 어딘가에 10이 생기고 그것을 복사를 한다.
		// 나중에는 우리가 그 공간에 이름을 붙여서 지속적으로 접근, 기존 10의 메모리 공간은 자바에 의해 사라진다.
		// 상수만 봤을 땐 정확하게 어떤 자료형이라 정하기 애매하다. 그래서 얘네들이 하나로 통일한다. 그게 int이다.
		// 그래서 정수형 상수는 무조건 메모리에 4바이트가 잡힌다.
		l1 = 10; 
		
		// 실수형 상수는 double형이다.
		
		float f1;
		f1 = 3.14F; // 실수형 리터럴
		System.out.println(f1);
		
		double d1;
		d1 = 3.14;
		//d1 = 3.14D; // 굳이 붙이라면 D 붙인다.
		System.out.println(d1);
		
		
		f1 = 123.1234567890123456789012345678901234567890F; // 소수이하 5자리
		System.out.println(f1);
		
		d1 = 123.1234567890123456789012345678901234567890D; // 소수이하 14자리
		System.out.println(d1);
		
		//long(8byte) > float(4byte)
		f1 = 9220000000000000000F;
		System.out.println(f1);
		
		
		System.out.println("start!");
		f1 = 123456789012345678901234567890123456789F;
		System.out.println(f1);
		//1.2345679E38  > 저장할 때 날라가버린다. > 정밀도가 떨어진다.
		//1.2345679000000000000000000000000000000000
		d1 = 123456789012345678901234567890123456789D;
		System.out.println(d1);
		//1.234567890123456800000000000000000000000
		
		//   문자형
		// - 문자 1개를 저장
		char c1;
		c1 = 'A'; // 문자 리터럴 표기법
		System.out.println(c1);
		
		//c1 = '홍길동';
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		
		boolean flag;
		
		flag = true;  // 논리형 리터럴 
		flag = false; // 논리형 상수
		
		System.out.println(flag);
		
		// 문자열, String
		// - 참조형
		// - 문자 + 열 > 문자들이 열을 지어있는 형태 > 문자의 집합 > char가 여러개 모인형태
		// 위에서 따로따로 홍, 길 ,동이 비효율적이니까 이걸 개선하는 방법
		String name;
		name = "홍길동";//쌍 따움표를 붙여서 문자열 리터럴이라고 표시를 해준다. 
		System.out.println(name);
		
		// A 저장할건데 한글자면 선택권이 있다. 
		char m1 = 'A';
		String m2 = "A";
		
		// 두글자 이상이면 선택권이 없다.
		//char m3 = 'ABC';
		String m4 = "ABC";
		String m5 ="";
		
		//char m6=''; // X 빈 char은 없다.
		char m7 = '\0'; // 이렇게 생긴 표현은 있다./ 빈문자 > NULL문자
		
		
	}

}
