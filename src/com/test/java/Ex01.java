package com.test.java; //어떤 패키지 안에 있냐?

// 문장입니다. 주석(Comment) > 한줄 주석(Single Line Comment)
// 주석 > 컴파일러에게 번역하지 말라고 하는 것

/*
 
 주석 > 여러줄 주석(Multi Line Comment)
 
 문장입니다. 
 문장입니다. 
 문장입니다.  
 */

// 이 표현이 없으면 에러가 난다. 
// 코드의 집합
public class Ex01 
{
	// 메소드
	// main이라는 이름의 메소드
	// 코드의 집합
	public static void main(String[] args) {
		// 실행할 명령어 작성
		// 괄호안의 내용물을 콘솔창에 출력해라
//		System.out.println();
//		char c = 3 + '0';
//		int i = '3'-'0';
//		System.out.println(c+", "+i);
//		System.out.println('3');
//		System.out.println('3'+1);
//		System.out.println(3 + '0');
//		System.out.println((char)(3 + '0'));
		
		
		// 문자도 사칙연산이 가능하다. 그 이유는 유니코드형태로 저장되어 있어서다.
		// 사칙 연산시에는 char형이 int형으로 유니코드값으로 변환되어 계산된다.
//		char a = 'a'; // 한 문자가 유니코드 형태로 저장이 된다.
//		char d = 'd';
//		System.out.println(a);      // char 타입대로 받고 
//		System.out.println((int)a); // int 형변환해야 저장된 값을 보여줌
//		System.out.println(a-d);    // 사칙 연산시 int형으로 처리됨
//		System.out.println(a+d);    // 사칙 연산은 정수간의 연산과 동일
		
	
		char c1 = 'a';
		//char c2 =  c1 +1;// 에러가 난다. 산술변환으로 int형인데 이걸 char에 담으려하니
		//char c2 =  (char)(c1 +1); // 이러면 에러해결
		char c2 ='a'+1; // 리터럴 연산은 형변환이 없다. 
		System.out.println(c2);
		System.out.println('a'+1);
		
		
		
	}
}

