package com.test.obj.constructor;

public class Ex48_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열은 초기화를 안해도 자동으로 초기화가 된다.
		int[] ns = new int[5]; // 배열도 사실은 생성자가 초기화 시킨 것이다. 
		
		Student s1 = new Student(); // 생성자가 없다고 한다. 
		
		s1.setName("홍길동");
		s1.setKor(100);
		s1.setEng(90);
		s1.setMath(80);
		
		System.out.println(s1.info());

		//Student s2 = new Student("아무개", 90, 85, 95); // 생성자가 없다고 한다.	
		
		
		
	}

}
