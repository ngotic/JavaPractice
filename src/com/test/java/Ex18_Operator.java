package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex18_Operator {
	public static void main(String[] args) throws IOException {

		/*
		 * 연산자, Operator
		 * - 수학 연산자 > 프로그래밍 연산자
		 * - 피연산자를 대상으로 미리 정해진 연산(행동)을 한 후에, 연산(행동)의 결과를 반환하는 요소
		 * 주로 기호를 많이 사용 + 영단어도 많이 사용
		 * 1. 문장, Statement
		 * 2. 표현식, Expression
		 * 3. 연산자, Operator
		 * 4. 피연산자, Operand
		 * 5. 연산자 우선순위
		 * 6. 연산자 연산방향
		 * 
		 *  문장, Statement
		 *  - 1개 이상의 표현식이 모여서 문장을 만든다.
		 *  - int sum = 10 + 20; 이게 하나의 문장이다.쪼갤 수 있는 단위까지 다 쪼갰을때 남는거 > 표현식
		 *  표현식, Expression
		 *  - 문장을 구성하는 최소 단위; 표현식이 모여서 문장이 된다. 
		 *  - int sum, 10+20 
		 *  연산자, Operator
		 *  +, =
		 *  피연산자, Operator
		 *  +에 대응: 10, 20 
		 *  =: sum, 30
		 *  연산자 우선순위
		 *  하나의 문장에서 속해있는 모든 연산자들은, 누가 먼저 실행해야 되는지 
		 *  순서가 정해져있다. > 연산자의 우선순위다. 연산자가 미리 순서를 가짐, 수학에서 비롯  
		 *  1+2x3 = 7
		 *  
		 *  연산자 연산방향
		 *  1 + 2 + 3 = 6 // 성질이 같은 연산자는 우선순위가 동일하다.
		 *  우리는 수학에선 뭘 먼저해도 상관은 없다. 컴퓨터는 미리 정해진 규칙이 있다. 앞에걸 먼저, 뒤에걸 먼저? 
		 *  하나의 문장에 속해있는 연산자들 중 우선순위가 동일하면 어느 방향(좌, 우)으로 실행해야 하는지 순서가 정해짐
		 *  
		 *  < 연산자의 종류 >
		 *  1. 행동(목적)
		 *     a. 산술 연산자   
		 *     b. 비교 연산자
		 *     c. 논리 연산자
		 *     d. 대입 연산자
		 *     e. 증감 연산자
		 *     f. 조건 연산자
		 *     
		 *  2. 형태(피연산자 개수)
		 *     a. 1항 연산자
		 *     b. 2항 연산자
		 *     c. 3항 연산자  
		*/  
		
		int sum = 10 + 20;
		System.out.println(sum); // 세미클론으로 맞춰지는 일련의 코드의 집합 
		
		/*  
		 	산술 연산자
		 	+, -, *, /, %(mod, 나머지)
		 	2항(이항) 연산자
		 	피연산자를 숫자를 가진다. (정수, 실수)
		 */ 
		int a = 10;
		int b = 3;
		
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d %% %d = %d\n", a, b, a % b); 
		
		// 10/3 > 3몫, 나머지 1
		// 10/3 으로 3.333333으로 바꾸고 싶다면? : 자료형과 관련되었다.
		double c = 10;
		double d = 3;
		System.out.println( c / 3);
		
		// - 정수 / 정수 = 정수
		// - 실수 / 정수 = 실수
		// - 정수 / 실수 = 실수
		// - 실수 / 실수 = 실수
		
		//*** 대원칙 ) 모든 산술 연산자의 결과값 자료형은 두 피
		// 연산자의 자료형 중에서 더 크기가 큰 자료형으로 변환된다.
//		System.out.println();
//		System.out.println(10  /   3); // - 정수 / 정수 = 3
//		System.out.println(10.0/   3); // - 실수 / 정수 = 3.33333333
//		System.out.println(10  / 3.0); // - 실수 / 정수 = 3.33333333
//		System.out.println(10.0/ 3.0); // - 실수 / 정수 = 3.33333333
//		System.out.println();
		
		int e =1000000000; // 10억
		int f =2000000000; // 20억
		// int + int = int(overflow) 조심
		System.out.println(e + f); // 30억?
		
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
		
		// 달력 만드는 로직
		// 1. 2023년 2월 1일 > 무슨 요일? 수
		// 2. 2023년 2월 > 마지막일? 28일
		//    공식?
		// 조건(날짜 % 7 > 나머지4 엔터)
		// 일 월 화 수 목 금 토
		//         1 2 3 4
		// 5  6 7  8 9 10 11 
		// ... 
		
		// 정수 중 int를 주로 사용하는지?
		// - 정수형 리터럴이 int
		// - 
//		byte b1 = 10;
//		byte b2 = 20;
//		
//		// byte + byte = byte
//		System.out.println(b1+b2); // 여기선 괞찮아
//		
		// Type mismatch: cannot convert from int to byte
		
		//**** byte, short의 산술 연산은 무조건 int이다. > CPU 처리단위
		// byte + byte = byte(X)
		// byte + byte = int(O)
		// byte + byte
		// byte b3 = (byte)(b1+b2)
		// byte b3 = (b1 + b2);            // 여기선 에러
		
//		byte b3 = (byte)(b1 + b2);         // 여기선 에러
//		
//		System.out.println(b3);
//		
//		int b4 = b1 + b2;
//		
		/*
		 * 연산자 우선 순위
		 * 1. () : 제일먼저다.
		 * 2. 산술 연산자
		 * 	  a. *, /, % 산술
		 *    b. +, - 
		 *    c. >, <    비교
		 *    d. &&, ||  논리
		 *    e. =       대립
		 *    단항(1) > 이항 (2) > 삼항(3) : 단항 연산자의 우선순위가 이항 연산자보다 높다.
		 *    단항 연산자와 대입 연산자를 제외한 모든 연산의 진행방향은 왼쪽에서 오른쪽이다. 
		 * 	  	
		 * 비교 연산자
		 * >, >=, <, <=, ==(같다, equals), !=(같지 않다. not equals)
		 * 2항 연산자
		 * 피연산자들의 우위(동등) 비교를 하는 연산자
		 * 피연산자는 숫자형을 가진다.
		 * 연산의 결과가 boolean이다.(true, false)
		 * */
		
		 a = 10;
		 b = 3;
		 
		 System.out.println(a > b);
		 System.out.println(a >= b);
		 System.out.println(a < b);
		 System.out.println(a <= b);
		 System.out.println(a == b);
		 System.out.println(a != b);
		 
		 //프로그램 흐름 > 조건 제시용
		 //요구사항] 사용자 나이 입력 > 성인 (19세 이상) O, X
		 
//		 System.out.println("나이 : ");
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
		 
		 String s1 = "홍길동";
		 String s2 = "홍길동";
		 String s3 = "아무개";
		 String s4 = "홍";
		 s4 = s4 + "길동"; // "홍" + "길동" 
		 System.out.println(s1 == s2); // true
		 System.out.println(s1 == s3); // false
		 System.out.println(s4);
		 System.out.println(s1 == s4); // false
		 // *** 문자열의 비교는 ==, != 연산자를 사용하면 절대 안된다.
		 // -> equals()써라 
		 System.out.println();
		 System.out.println(s1.equals(s2)); // true
		 System.out.println(s1.equals(s4)); // true
		 
		 int ages=10;
		 System.out.println(19 <= ages && ages > 60 );     // 비교연산자가 우선순위가 더 높다.
		 System.out.println((19 <= ages) && (ages > 60) ); // 비교연산자가 우선순위가 더 높다.
		 
		 // boolean을 반대로 뒤집기
		 System.out.println(!true);
		 System.out.println(!false);
		 
		 /*
		  * 논리 연산자
		  * &&(and), ||(or), !(not)
		  * &(and), |(or), ^(xor, exclusive or, 배타적 논리합) : 비트 연산
		  * &, ||, ^ 
		  * 2항 연산자(&&, ||)
		  * 1항 연산자!
		  * 피연산자의 자료형이 boolean이다;.
		  * 연산의 결과는 boolean이다.
		  * */
		System.out.println(10 & 9);
	}//main
}
