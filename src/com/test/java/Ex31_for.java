package com.test.java;

import java.util.Scanner;

import java.util.*;

public class Ex31_for {

	public static void main(String[] args) {
		//Ex31_for.java
		/*
		 * 반복문
		   - 특정 코드를 원하는 횟수만큼 반복 실행
		   - 생산성 향상 + 유지보수성 향상 
		*/
		// m1();
		// m2();
		// m3(); // 회전수가 중요하다.
		// m4();
		// m5();
		// m6();
		// m7();
		// m8();
		// m9();
		// m10();
		// m11();
		// m12();
		// m13();
		// m14();
		// m15();
		 m16();
		// m17();
		// m18();
		//m19();
	}
	
	private static void m19() {
		// 난수 생성기
		// - 임의의 수를 만들어내는 도구
		// - 랜덤값 
		// 1. Math.random()
		// 2. Random 클래스
		
		System.out.println(3.14);
		System.out.println(3.14159265358979212846164338327);
		// 0 ~ 1 사이의 양수값의 실수
		System.out.println(Math.PI); 
		for(int i=0; i<10; i++) {
			// 0.0 <= 값 <1.0
			//System.out.println(Math.random());

			// 0~9 정수
			// 0.0 > 0.0 > 0
			// 0.1 > 1.0 > 1
			// 0.2 > 2.0 > 2
			// ..
			// 0.9 > 9.0 > 9
			System.out.println((int)(Math.random() * 10)  ); // 0 ~ 9
			System.out.println((int)(Math.random() * 10)+1); // 1 ~ 10
			
			// 1~N => (int)(Math.random() * N) + 1 
			
			// 3~7
			System.out.println( (int)(Math.random())*5+3 );
		}
		
	}

	private static void m18() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력: ");
		// Token 입력 > 스페이스로 구분되는 단어
//		String input = scan.next(); // 스페이스나 공백을 만나면 멈춘다.
//		System.out.println(input);
//		int input = scan.nextInt();
//		System.out.println(input*2);
//		boolean input = scan.nextBoolean(); //"true"를치면 true를 반환
//		if(input) {
//			System.out.println("참");
//		} else {
//			System.out.println("거짓");
//		} 
//		double input = scan.nextDouble(); // "3.21" 입력시 3.21저장
//		System.out.println(input);
//		
		//nextLine() vs nextXXX()
		
		//nextLine()
		// - 입력버퍼의 내용(개행문자전까지) 
		
		// 1. 문자열 > 숫자 :: 정상
		System.out.println("문자열: ");
		String txt0 = scan.nextLine(); // 다지워 버퍼를 엔터까지
		System.out.print(txt0);
		
		System.out.println("숫자: ");   // 숫자쓰고 엔터를 침 
		int num1 = scan.nextInt();    // 숫자를 읽고 엔터는 내비둠 // 숫자\r\n > 숫자 읽음
		System.out.print(num1);
		
		// 2. 숫자 > 숫자 :: 정상
		System.out.println("숫자: ");   
		int num2 = scan.nextInt();     // 숫자\r\n\r\n 이것은 자기가 읽을 숫자라고 판단을 안함 그래서 무시한다.  
		System.out.print(num2);
		
		System.out.println("숫자: ");
		int num3 = scan.nextInt();    // 숫자\r\n\r\n\r\n > 숫자 뽑아먹는다.
		System.out.print(num3);
		
		// 3. 숫자 > 문자열 :: 비정상
		System.out.println("숫자: ");
		int num4 = scan.nextInt();    // 숫자\r\n\r\n\r\n\r\n > 숫자 뽑아먹는다.
		System.out.print(num4);
		
		System.out.println("문자열: ");
		String txt = scan.nextLine(); // 오? 엔터가 있네 읽고 버려야지 하고 나 할일 끝
		System.out.print(txt);
		
		// *** nextXXX() 호출하고 바로 뒤에 nextLine() 호출할 때!!
		//     > 앞의 nextXXX()이 개행문자를 남겨버려서 그 다음 nextLine()이 새로운 입력값을 요구하는 대신에
		//       남아있는 개행문자 처리를 하면서 그냥 넘어간다. 
		// 해결책 > 남이있는 개행문자를 개발자가 직접 삭제해야 한다.
		
		// 1. 해결책
		scan.skip("\r\n"); // 엔터를 지워버랴라
		// 2. nextLine()을 한번 더 호출
		scan.nextLine(); // 이때, 문자를 받환을 안한다. 
		
		// BuffereReader의 readLine()도 scan.nextLine();와 비슷하다. 
		
	
	}

	private static void m17() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id = scan.nextLine();
		
		if(checkId(id)) {
			System.out.println("올바른 아이디");
		} else {
			System.out.println("올바르지 않은 아이디");
		}
			
	}
	
	public static boolean checkId(String id) {
		
		// 유효성 검사
		for(int i=0; i<id.length(); i++) {
			char c = id.charAt(i);
			if( c < 'a' || c > 'z' ) {
				return false;
			}
		}
		
		return true;
	}
	
	private static void m16() {
		// 유효성 검사
		// 아이디 입력 > 영어 수문자로 ~ (문자 코드)
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디");
		String id = scan.nextLine();
		
//      h o n g
//      zerobased index
//		char c=id.charAt(0);
//		System.out.println(c);
//		
//		c=id.charAt(1);
//		System.out.println(c);
//		
//		c=id.charAt(2);
//		System.out.println(c);
//		
//		c=id.charAt(3);
//		System.out.println(c);
		
		System.out.println(id.length());
		
		//1. 몇회전? :: 입력한 아이디의 글자수만큼 회전
		//2. i의 최대값 > id.length()
		//3. charAt(i) > i사용되는지?
		// hong 0~3
		// aaa 0~2
		// abcde 0~$
		for(int i=0; i<id.length(); i++) {
			char c= id.charAt(i);
			System.out.println((int)c);
		}
		scan.close();
	}
	
	
	private static void m15() {
		// 제어문(조건문, 반복문) > 변수에 대해서...
		// 자바의 변수
		// 1. 멤버 변수(클래스변수)
		// 2. 지역 변수
		// - 블록({}) 스코프 변수
		// - 메소드 안에서 선언한 변수
		// - 제어문 안에서 선언한 변수
		
		// m15 메서드를 영역(Scope, Context)으로 하는 지역 변수이다.
		int a=10;
		if(a>0) {
			int b= 20;
			System.out.println(b);
			if(b>0) {
				int c = 30;
				System.out.println(c);
			}		
		}
		String result=""; // 안전한 값을 넣어둠 
		if ( a > 0 ) {
			result = "결과";
		}
		System.out.println(result);
		
		// **** 항상 지역 변수는 선언과 동시에 값을 초기화한다.(습관)
		// 자료형별 초기화값으로 무난한 값
		// - 정수: 0,-1
		// - 실수: 0.0
		// - 논리: false
		// - 문자열: ""
	}

	private static void m14() {
		// 숫자 전달 > 한글 반환
		String result =  getNum(1);
		System.out.println(result);
		
		String result2 = getText();
		System.out.println(result2); // 012가 나온다. 
	}

	// This method must return a result of type String
	// 모든 경우의 수에는 리턴문이 있어야 한다.
	private static String getText() {
		//컴파일 시점과 런타임 시점의 차이 !!
		//1. 컴파일 > 소스르 기계어로 번역
		//2. 런타임 > 기계어를 실행
		// 컴파일 실행
		// 1. 파싱 : 구성요소를 쪼갬 > 구문을 분석 > 문법 검사 
		// 2. 번역 작업
		// 컴파일하는 과정중에는 메모리에 안생긴다. 
 
		int a = 10; //  
		int b = 20; 
		System.out.println(a + b); // 컴파일러 > int + int 
		// 컴파일러는 실행하는 사람이 아니라 번역만 하는 사람
		// 위, 아래 문맥관계를 잘 이해 못한다. 
	
		String txt= "";
		
		for(int i= 0; i <3 ;i++) {
			// "012"
			txt = txt+i; // 누적 문자열 + 숫자열
			return txt;
		} //
		return txt;// 문법을 올바르게 맞추기 위해선 이런 return문 필요
	}


	// 
	private static String getNum(int num) {
		// TODO Auto-generated method stub
		if (num == 1) {
			return "하나";
		} else if  (num==2) {
			return "둘";
		}else if  (num==2)  {
			return "셋";
		}
		return null;// ㅇ
	}


	private static void m13() {
		// 학교 선생님 > 학생 상담(30명) 
		for (int i=1; i<=30 ; i++) {
//			if(i == 16) { // 여기서 중단.
//				break;
//			}
			// 16번 결석
			if(i == 16 || i == 20) {// 건너띰 
				continue;
			}
			System.out.printf("%d번 학생을 상담합니다.\n", i);
		}
	}

	private static void m12() {
		// continue;  
		// break;     완전 중지
		for(int i=1; i<=10; i++) {
			if( i==5 ) {
				continue; // 나머지 코드를 실행하지 않고 반복문의 시작으로 돌아가라
			}
			System.out.println(i);
		}
		
	}



	private static void m11() {
		// 요구사항] 사용자 숫자 원하는 만큼 입력 > 합을 구하시오.
		//         횟수를 예측하지 못하는 반복문 > 무한 루프
		int count=0;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		for(;;) {
			System.out.println("숫자(0을 입력하면 종료) : ");
			int num = scan.nextInt();
			if (num == 0) {
				break; // 
			}
			sum += num;
			count++;
		}
		System.out.printf("총 %d개의 숫자를 입력했고, 그 숫자들의 합은 %d입니다. \n" ,count, sum );
		scan.close();
	}

	private static void m10() {
		// 기본적으로 1~10까지 출력 루프
		// > 사용자 개입 > 루프 횟수 추가 지정
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자: ");
		int num = scan.nextInt();
		
		for(int i=1 ; i<=10; i++) {
			System.out.println(i);
			if( i == num) {
				break;
			}
		}
		
		for(int i=1; i<= num ;i++) {
			
		}
	}

	private static void m9() {
		
		// 분기문
		// - break
		// - continue 
		// - 단독으로 못쓰인다.
		// - 반복문과 같이 사용
		//-** if문은 인식하지 않는다.(if문 탈출 대상으로 보지 않는다.)
		// BreakPoint 
		System.out.println("시작");
		for(int i=0; i<=10 ; i++) {
			
			System.out.println(i); // Unbreakable code
			
			//break; // 자신이 속한 제어문을 탈줄한다.(for)
			if( i == 5 ) {
				break;
			}
			
		}
		System.out.println("종료");
		
	}

	private static void m8() {
		
		// 무한 루프, Infinite Loop
		
		// 10바퀴 > 언제까지? 21억 바퀴
//		int n = Integer.MIN_VALUE;
////		n--;// 
////		for(int i=0; i<10 ; i--) { //21바퀴 돌다가 마지막에 underflow난다.
////			System.out.println("안녕하세요."+ i); 
////		}
////		System.out.println(n);
		
		//무한 루프를 일부러 만드는 경우도 있다.
		// > 회전수를 미리 예측하기 힘든 경우에 사용
//		for(;;) {
//			System.out.println("무한 루프");
//		}
//		for(; true; ) { // 조건식을 생략하면 자동으로 true가 대입된다. > 무한 루프 
//			System.out.println("무한 루프");
//		}
		
		for(int i=1 ; ; i++) { // 전부다 비우는 게 아니라. 필요하면 초기식, 증감식 맘대로 써라
			System.out.println(i);
		}
		
	}

	private static void m7() {
		
		/*
		  5 x 1 = 5
		  5 x 2 = 10
		  5 x 3 = 15
		  5 x 4 = 20
		  ....
		  5 x 9 = 45
		*/
		Scanner scan = new Scanner(System.in);
		System.out.print("단: ");
		int dan = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %2d\n", dan, i, dan*i);
		}
		System.out.println("======================");
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++ ) {
				System.out.printf("%d x %d = %d\n",i,  j, i*j);
			}
		}
	
	}

	private static void m6() {
		//요구사항 ] 사용자로부터 숫자를 10개 입력받아 총합을 구하시오.
		Scanner scan = new Scanner(System.in);
		int sum=0;
		for(int i=0 ; i < 10 ; i++) {
			System.out.print("숫자: ");
			int num = scan.nextInt();
			sum += num;
		}
		System.out.printf("총합: %d\n", sum);
		scan.close();
	}

	private static void m5() {
		// 요구사항] 사용자로부터 숫자를 입력받아 1~입력한 숫자까지 총
		// 합을 구하시오. 
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = scan.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.printf("1 ~ %d = %d\n", num, sum);
		scan.close();
	}

	private static void m4() {
		// 요구사항] 1~10까지의 합?
		int sum = 0; // 반드시 초기화
		for(int i=1; i<=10; i++) {
			sum+=i;
		} 
		System.out.println(sum);
		
	}

	private static void m3() {
		// 반복문 > 루프변수? 
		// 요구사항] 숫자 1~10까지 출력
		// 추가사항] 숫자를 10000까지 늘려줘....
		System.out.println("1");
		System.out.println("2"); 
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
		int num =1;
		
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		// 무조건 반복문
		for(int i=1; i<=10; i++) {
			System.out.println("실행문" + i);
		}
		System.out.println();
		
		//초기식, 조건식, 증감식
		for (int i=2; i<100; i+=2 ) {
			System.out.println(i);
		}
		System.out.println();
	}

	private static void m2() {
		// 반복문 > 회전수? 
		for (int i=1 ; i<=5 ; i++) {
			System.out.println("실행문 A");
		}
	
		for (int i=3 ; i<=7 ; i++ ) {
			System.out.println("실행문 B");
		}
		
		for (int i=10; i>=6; i--) {
			System.out.println("실행문 C");
		}
		// ************ 
		for(int i=0; i<5; i++ ) {
			System.out.println("실행문 D");
		}
	}

	private static void m1() {
		/*
		 *     사이 사이에 문장 3개
		 * for (초기식; 조건식; 증감식) {
		 * 		실행문; x 반복 
		 * }
		 * 
		 * 요구사항 ] "안녕하세요." x5번 출력 >
		 * 메서드 영역으로 분리해서 관리 쉽게 한다.
		 * switch() { }
		 * 
		 */
		hello();
		hello();
		hello();
		hello();
		hello();
		// 1. 초기식 실행 : int i=1; 
		// 2. 조건식 실행 : i<=3
		//	2.1 true   : 실행블럭을 실행한다. 
		//  2.2 false  : for문을 빠져나간다.
		// 3. 실행문: Hello
		// 4. 증감식 실행 : i=i+1
		// 5. 조건식 실행 : i<=3
		// 6. 실행문 : Hello
		// 7. 증감식 실행: i=i+1
		// 8. 조건식 실행: i<=3
		// 9. 실행문: 
		// 10. 증감식 실행: i=i+1
		// 11. 조건식 실행: i<=3
		// 12. for 탈출 (종료) 
		for( int i=1 ; i<=3 ; i=i+1 ) { 
			// 변수 선언 값을 할당 > 초기식 > 조건식 > 증감식
			// System.out.println("Hello.");
			hello();
		}
	}
	
	public static void hello() {
		System.out.println("안녕하세요.");
	}

}
