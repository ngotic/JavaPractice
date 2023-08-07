package com.test.practice;

import java.util.Arrays;

class Student implements Comparable<Student>{
	private String name;
	private int age;
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

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
	@Override
	public int compareTo(Student o) {
		if( this.age == o.getAge() )
			this.name.compareTo(o.getName());
		return this.age - o.getAge();
	}
}

public class SortObject {
	public static void main(String[] args) {
		Student[] students = { new Student("Alice", 40),
				new Student("Bob", 21),
				new Student("Poll", 22)};
		Arrays.sort(students);
		for(Student s : students)
			System.out.println(s);			
	}// student cannot be cast to class java.lang.Comparable 
	 // (com.test.practice.Student is in unnamed module of loader 'app';
	 // java.lang.Comparable is in 
	// 런타임 에러가 나는데 이걸 > comparable하게 바꾼다. 
}
