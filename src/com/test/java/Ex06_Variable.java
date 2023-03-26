package com.test.java;

//과제 : 구글 드라이버로 제출 > 랜덤으로 찍어서 한두명 두세명걸 그날 그날 본다.

public class Ex06_Variable {

	public static void main(String[] args) {
		
		// 과제 
		// 9개의 자료형, 값형 8개 + 참조형 1개
		// 9개를 가지고 변수를 만들고 데이터를 넣고 적당히 출력하는 작업
		// 각 자료형당 x 10개씩 
		
		//1. 주의의 데이터 선별 > 몸무게 
		//2. 데이터 성격 > 자료형 어떤 것이 적합할까? 0보다는 크고 300kg?
		//   0에서부터 300정도 표현하는 데이터 뭘까? Short 적합한 얘 찾으니까 가장 작은 자료형
		//   변수 만들자
		//3. 변수 생성 : 변수 이름짓는 연습 최대한 의미 있게> 이변수에 뭐가 들었구나를 바로 알 수 있는 것
		//   myWeight, weight
		//4. 값 대입 > 상수
		//5. 출력 
		
		short weight;
		weight = 65;
		System.out.println("내 몸무게는 "+ weight +"kg 입니다.");
		
		
	}

}

