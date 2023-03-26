package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13_Error {

	public static void main(String[] args) {
		/*
		 에러 Error
		 	- 오류, 버그, 예외 등...
		1. 컴파일 에러
			- 컴파일 작업 중에 발생하는 에러
			- 컴파일러 발견 !!> 번역하다가... > 문법이 틀려서!!!
			- 발생!!! > 전체 컴파일 작업 중단 > 프로그램 실행 파일 생성 불가
			> 반드시 고쳐야 하는 오류(100%) 못고치면 프로그램 자체가 안만들어진다.
			- 난이도 가장 낮은 에러다. 발견이 쉬우니까 > 컴파일러가 우리에게 알려준다. >고치기 쉽다. 
			- 이클립스의 빨간 줄 > 컴파일 에러 > 컨 F11 안눌럿는데? 이클립스가 실시간으로 컴파일러와 연동됨
			- 그래서 컴파일 작업 전이라도 컴파일이 불가능한 문법 오류를 발견하면 바로 빨간 밑줄을 그어준다.
			- 그래서 재빠르게 알아낼 수 있는 에러다.
			- 해결 방법 > 에러 메세지 > 확인 > 코드 수정
			- 오타! 때문에 거의 발생한다.  
			- 가장 공부가 많이 되는 오류다. >> 정리!!
			
		2. 런타임 에러
			- 런타임(Runtime) > 실행 중
			- 컴파일 작업 중에는 없었는데 .. 실행 중에 발생하는 에러
			- 문법에는 오류가 없었는데 .. 다른 원인으로 발생하는 에러 
			- 예외(Exception)
			- 난이도 중간 > 발견 중간 > 발견 복불복 > 테스트 > 발견 O -> 수정,
													  발견 X -> 잠재 위험
			- 발견이 어렵다... 
			- 충분한 테스트 필요!! > 인력 + 돈 + 시간이 필요
			- 게임 출시 > 오픈베타!!
			- 출시 > 잠재적으로 런타임 오류 내제 > 업그레이드, 패치 수정...
			
		3. 논리 에러
			- 컴파일 성공!! + 실행 성공!! > 일부 결과 이상??
			// 논리에러가 낫을 가능성이 있다. 
			// 프로그래머가 잘못해서 나는 에러, 난이도가 최고에러다. 발견이 잘 안된다.
			// 빨간줄이 없고 오류도 안남 어디서 발생했는데 찾기도 힘들다. 
			// 이 에러는 남의 눈에 잘 보인다. 
		
		*/
		//[요구사항] 숫자 1개 입력 > 연산
//		try {
//			
//			int a = 10;
//			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//			// reader.nextLine();
//			System.out.println("숫자 입력: ");
//			String input = reader.readLine();
//			int num = Integer.parseInt(input);
//			System.out.println(100 / num); 
//			// 수학적인 문제 때문에 에러
//			// num은 0이 될 수 없다. 
//			
//		} catch (ArithmeticException e) { // Divide by Zero Exception
//			System.out.println("Divide by Zero Exception");
//			e.printStackTrace();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		int a =10;
		int b =5;
		
		System.out.println(a-b);
		
		
	}

}
