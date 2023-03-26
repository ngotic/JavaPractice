package com.test.obj.type;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class Ex72_Exception {

	public static void main(String[] args) throws Exception {
		//
		// 예외
		// 런타임오류
		// - 개발자 미리예측,0, X
		// 예외처리, Exception Handling
		// 1. 전통적인 방식
		// - 제어문 사용(조건문)
		// 2. 전용방식
		// - try문
		// m1();
		// m2(); // 코드가 try catch로 께속 묶으니까 더러워짐
		// m3();
//		try {
		//m4();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		m5();
	}

	private static void m5() {

		// 요구사항 ] 숫자 1개 입력 > 처리
		// 조건 ] 반드시 짝수마 입력
		// 홀수 > 에러
		int num = 5;
		if (num % 2 == 0) {
			System.out.println("업무 진행..");
		} else {
			System.out.println("예외 처리..");
		}
		try {

			if (num % 2 == 1) {
				// 강제로 예외 발생 > 예외 던지기
				throw new Exception(); // 야구공 직접 생성 + 던지기
			}
			System.out.println("업무 진행..");
		} catch (Exception e) {
			System.out.println("예외 진행..");
		}

	}

	private static void m4() throws Exception { // 예외 미루기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String name = reader.readLine(); // 예외 발생 가능성을 가지고 있음
		//Unhandled exception type IOException
		
		
//		try {
//			String name = reader.readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	private static void m3() {

		// 실수만 안하면 이렇게만 남기면 된다.
//		try { // 하나의 try로 묶으면 된다. !! 여러개의 에러를 하나의 try로 묶는 것도 나쁘진 않다.
//			System.out.println(111);
//			int num = 2;
//			System.out.println(100/num); //A. 애라쪽 try 블록은 실행 X
//			
//			System.out.println(222);
//			int [] nums = {10, 20, 30};
//			System.out.println(nums[0]);
//			System.out.println(333);
//			Calendar now = null;	
//			System.out.println(now.get(Calendar.HOUR_OF_DAY));
//			System.out.println(444);
//		} catch (Exception e) {
//			System.out.println("예외처리");
//			e.printStackTrace();
//		} // 근데 예외처리를 분류하고 싶다. 어떤 에러가 났니??? > 근데 에러 메세지를 구분하는 순간 볼륨이 커진다.
//		

		try {/////////////////////////////////////////////////////////////////
				// 하나의 try로 묶으면 된다. !! 여러개의 에러를 하나의 try로 묶는 것도 나쁘진 않다.
			int num = 20;
			System.out.println(100 / num); // A. 애라쪽 try 블록은 실행 X
			// 여기서 에러가 발생하면 throw new ArithmeticException(;) 이라는 예외 객체 발생 ↓ 아래쪽에서 catch된다.
			int[] nums = { 10, 20, 30 };
			System.out.println(nums[1]);
			// 여기서 에러며 throw new ArrayIndexOutOfBoundsException(); 를 던진다
			Calendar now = Calendar.getInstance();
			System.out.println(now.get(Calendar.HOUR_OF_DAY));
			// throw new NullPointerException(); 대부분의

			Parent p = new Parent();
			Child c = (Child) p; // >> java.lang.ClassCastException > 형변환 에러

		///////////////////////////// 이젠 정확히 알고 있다. /////////////////////
		} catch (ArithmeticException e) { // ArithmeticException
			System.out.println("에러>0으로 나누기");
		} catch (ArrayIndexOutOfBoundsException e) { // ArrayIndex/Out/Of/Bounds/Exception
			System.out.println("에러>방번호 틀림");
		} catch (NullPointerException e) {
			System.out.println("에러>널참조");
		} catch (ClassCastException e) {
			System.out.println("에러>형변환"); //////////여기까진 정확하게 한놈 잡을 수 있다///////////////
		} catch (Exception e) {
			System.out.println("예외처리");
			e.printStackTrace();
		} /// 대부분의 exception은 서로 형제뻘이라 못받고 부모 예외객체인 Exception이 최종으로 받는다.
		// 다중 catch절이다.
	}

	private static void m2() {
		int num = 0; // 사용자 입력

		try {
			System.out.println(100 / num); //
		} catch (Exception e) {
			System.out.println("0을 나누기");
		}

		int[] nums = { 10, 20, 30 };

		System.out.println();
		// System.out.println(nums[5]); //에러!> java.lang.ArrayIndexOutOfBoundsException:
		// Index 5 out of bounds for length 3
		try {
			System.out.println(nums[5]);
		} catch (Exception e) {
			System.out.println("배열 첨자 오류");
		}

		try {
			Calendar now = null; // 널 참조 오류
			System.out.println(now.get(Calendar.HOUR_OF_DAY)); // 에러!) java.lang.NullPointerException 널포인터에러
			// 실제 객체도 안만들고 참조변수에 null을 넣음, 누굴 찾아갈 수도 없는 아무도 가리킬 수 없는 상태입니다. = null참조 > 널참조
			// 오류 >
			// 우리가 발생하는 모든 런타임 오류중 1등
		} catch (Exception e) { // 얘는 프로그램이 꺼진다.
			System.out.println("널참조");
			e.printStackTrace();
		} // 에러가 날지 안날지는 아무도 모른다.....
			// 그래서 try catch로 묶는다. 에러가 나면 미리 준비한 수순으로 준비한다.

		System.out.println("종료");

	}

	private static void m1() {

		// 요구사항 ] 숫자를 입력받아 연산을 하시오.
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자: ");
		int num = scan.nextInt();

// 		System.out.printf("100 / %d = %d\n", num, 100 / num);

		// System.out.println(100/0); // -> by zero 으로 나눈거 런타임 에러
		// System.out.println(100/0.0); // -> Infinity 이게 뜬다. 그냥 출력이 된다.
		// System.out.println(0/100.0); // -> by zero 으로 나눈거 런타임 에러
		System.out.println("---------------");

		// 권장 ---> ★ 위에 있는 코드에다가 비즈니스 코드를 쓰고 아래쪽에 예외처리 코드 쓴다.
		if (num != 0) { //
			// 비즈니스 코드(=업무 코드)
			System.out.printf("100 / %d = %d\n", num, 100 / num);
		} else { // ★ else문에다가는 부정적인 코드 쓴다.
			// 예외 처리 코드
			System.out.printf("0을 입력하면 안됩니다.\n");
		}

		// 비권장 ---> 가독성이 낮다.
		if (num == 0) {
			// 예외 처리 코드
			System.out.printf("0을 입력하면 안됩니다.\n");
		} else {
			// 비즈니스 코드(=업무 코드)
			System.out.printf("100 / %d = %d\n", num, 100 / num);
		}

		// - try
		// - catch
		// - finally
		try { // 조건이 없으니까 여기는 막 들어가
				// 비즈니스 코드(=업무 코드)
			System.out.printf("100 / %d = %d\n", num, 100 / num);

		} catch (Exception e) { // try 블록에서 에러가나면 그 대응으로 실행되는 절이다.
			// 예외처리 코드
			System.out.println("0을 입려하면 안됩니다.\n");
		}
		System.out.println("종료");

	}

}

class Parent {
}

class Child extends Parent {
}
