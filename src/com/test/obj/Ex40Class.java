package com.test.obj;


// 여기의 이름과 파일의 이름이 동일해야 한다.
// 파일 이름만 봐도 어떤 클래스가 있는지 알 수 있다. > 찾기 쉽다. 
// 파일이름과 동일한 클래스만 public을 붙인다. 
public class Ex40Class {
	public static void main(String[] args) {
		/*
		 자바 클래스 파일(소스 파일)을 만드는 규칙
		 자바 클래스 파일(소스 파일) 만드는 규칙
		 1. 파일(*.java)의 이름과 public 클래스의 이름이 반드시 동일해야 한다.
		 2. 1개의 파일안에 여러개의 클래스를 정의할 수 있다. 
		 	> 단, 이 클래스들 중 public이르는 키워드는 딱 1개의 클래스만 가질 수 있다.
		 3. 1개의 파일안에 1개의 클래스만 선언한다.(권고사항)	
		*/
	}

}
// 퍼블릭 붙이면 아래처럼 에러
// The public type Computer must be defined in its own file
class Computer { // 키워드가 없다
	
} // 우리가 추가로 만든 클래스