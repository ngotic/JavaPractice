package com.test.obj.inheritance;

public class Ex54_static {
	
	
	// main 메서드가 실행되기 전에 여러가지 일이 일어난다.
	// 1. 클래스 로딩, Class Loading
	// - 프로그램을 실행하기 전에, 프로젝트내의 모든 클래스의 정의를 미리 읽어서 
	// - 메모리에 올려놓는 작업 > 설게도를 자바가 인식하는 작업
	// - 설계도를 미리 읽어서 언제든지 사용하게 메모리에 올려놓는 작업
	// - 클래스 로딩 과정 중에 클래스 내부에 Static 키워드를 찾는다. 
	// > 골라서 메모리에 구현을 한다.(******)
	
	// 2. main() 실행
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 'static 키워드'에 대한 얘기 
		 1. 멤버 변수
		 2. 멤버 메서드
		 3. 클래스
		 
		 객체변수 > 개인데이터, 사람마다 가지고 있는 자신의 값(개성, 특성)
		 
		 static 변수 > 공용변수 (정적변수)>하나의 클래스부터 만들어진 모든 객체가 
		 공통으로 관리하는 데이터(공용 데이터)
		 사람, 국적( 대한민국 )
		
		 [ 반대말 : 객체 변수 ]
		 
		*/
		// 상황] 학생 3명 > 300명이면? 역삼중학교 300번?
		// - "역삼 중학교" > 절대 규칙이다. > "대명 중학교"
		
		Student.setSchool("역삼 중학교"); // 
		
		// 이미 Student를 읽어서 인식을 해놔서
		// 이렇게 해놓으면 아 ! 이클래스 하고 아는 것
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(15);
		//s1.setSchool("역삼 중학교");
		
		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(14);
		//s2.setSchool("역삼 중학교");
		
		Student s3 = new Student();
		s3.setName("하하하");
		s3.setAge(16);
		//s3.setSchool("역삼 중학교");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}// main

}// main class


class Student {
	
	private String name;
	private int age;
	
	private static String school;
	//static private String school;//
	// private String school;
	// 생성자는 기본 생성자
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;
//	}
	
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}
}
