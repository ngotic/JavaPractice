package com.test.question;

public class Student {
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;
	
	public Student() {
		this.name = "미정";
		this.age = 0;  // 나이
		this.grade = 0; // 학년
		this.classNumber = 0; //반번호
		this.number = 0;
	}
	public Student(String name, int age, int grade, int classNumber, int number) {
		this.name = name;
		this.age = age;                 // 나이
		this.grade = grade;             // 학년
		this.classNumber = classNumber; //반번호
		this.number = number;           // 넘버
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;                 // 나이
	}
	public Student(int grade, int classNumber, int number) {
		this.name = "미정";
		this.grade = grade;             // 학년
		this.classNumber = classNumber; // 반번호
		this.number = number;           // 넘버
	}
	String info() { // default 접근자.
		return String.format("%s(나이: %s, 학년: %s, 반: %s, 번호: %s)",
							 this.name,
							 this.age==0? "미정": this.age+ "세",
							 numToString(this.grade),
							 numToString(this.classNumber),
							 numToString(this.number ));
	}
	String numToString(int num) {
		return num==0? "미정": num+""; 
	}
}
