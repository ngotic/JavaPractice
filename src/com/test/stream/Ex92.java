package com.test.stream;

import java.util.HashSet;
import java.util.LinkedList;

public class Ex92 {

	public static void main(String[] args) {
		m1();
		// m2();
	}

	private static void m2() {
		
		LinkedList<Student> ll = new LinkedList<Student>();
		
		ll.add(new Student("홍길동", 20, "남자"));
		ll.add(new Student("아무개", 25, "여자"));
		ll.add(new Student("홍길동", 20, "남자"));
		
		// Student 리스트를 Student 배열로 바꿈
		System.out.println(ll.toArray());        // Object []
		Student[] ss = ll.toArray(new Student[0]);// Student [] 
		
		for(Student s:ss) {
			System.out.println(s);
		}
		
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("강아지");
		set1.add("고양이");
		set1.add("강아지");
		
		System.out.println(set1);
		
		HashSet<Student> set2 = new HashSet<Student>();
		
		set2.add(new Student("홍길동", 20, "남자"));
		set2.add(new Student("아무개", 25, "여자"));
		set2.add(new Student("홍길동", 20, "남자")); 
		// Set은 이 사람을 첫번째 사람과 같은 사람인지? 동명이인이야 
		// Set은 첫번쨰 홍길동과, 두번째 홍길동을 다른 사람이라고 인식한다.
		// >>> 나는 이둘이 같은 사람이라고 생각해 맞나자?
		// hashCode, equals를 정의하니까 이젠 set에 중복 필터가 된다.
		System.out.println(set2);  // 이제 두개만 들어감 
		
		// ★ ★ ★ ★  Set에도 결국에는 구분을 하기 위해서 HashCode와 equals를 정의해야 한다. 
	}

	private static void m1() {
		
		// 객체의 유일성
		int n1 = 10;
		int n2 = 10;
		int n3 = 20;
		
		System.out.println(n1 == n2);
		System.out.println(n1 == n3);
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "아무개";
		
		System.out.println(s1 == s2); // 주소값 비교
		// boolean java.lang.String.equals(Object anObject)
		System.out.println(s1.equals(s2)); // equals 메소드 재정의
		
		Student t1 = new Student("홍길동", 20, "남자"); // 
		Student t2 = new Student("아무개", 25, "남자"); // 
		Student t3 = new Student("홍길동", 20, "남자"); //  t1과 같은 사람인가?
		    
		System.out.println(t1 == t2);      // 주소값 비교   
		System.out.println(t1.equals(t2)); // 주소값 비교 > [ false , false ]
		
		// 동명이인
		System.out.println(t1 == t2);      // false
		System.out.println(t1.equals(t3)); // false, 왜 같은 사람이 아님??
		
		// 동일인물
		
		// 자바가 어떤 객체와 어떤 객체가 같은지 비교할 때 이 hashCode를 비교한다.
		// 그래서 첫번째 객체의 hashCode와 두번째 객체의 hashCode가 다르니까 다른애라고 판단한다.
		// 
		System.out.println("t1: "+t1.hashCode()); //> 다르다.
		System.out.println("t2: "+t2.hashCode());
		System.out.println("t3: "+t3.hashCode()); //> 다르다.
		
		
		// hashCode를 손봣다 > t1과 t3가 동일한 것으로 나왔다.
		// 그런데도 아직은 t1.equals(t3)의 결과가 false이다. 
		// 여기서 equals를 건드려야 한다.
		// eqauls를 이제 고쳤다. >return this.hashCode() == obj.hashCode(); 라고
		System.out.println(t1.equals(t3)); // 이제는 true가 되었다. 내가 뜯어 고침
		
		
		//★ 동일 여부를 결정하는 > HashCode와 equals
	}

}


class Student {
	
	private String name;
	private int age;
	private String gender;
	
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Student(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
//
	@Override
	public int hashCode() { //
		// 이름 == 이름
		// 나이 == 나이
		// 성별 == 성별
		// System.out.println(this.name + this.age + this.gender);
		return (this.name + this.age + this.gender).hashCode();
	}
	// 홍길동20남자 과 홍길동20남자는 같은 애를 참조한다. 저 3개의 멤버션수를 가지고 새로운 문자를 만듬
	
	@Override 
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
}


