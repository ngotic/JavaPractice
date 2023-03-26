package com.test.obj;

import java.util.Arrays;

public class Ex43_Class {

	public static void main(String[] args) {
		// 클래스 멤버 변수에 대한 얘기
		Person p1 = new Person();

		p1.setName("홍길동"); // 홍길동의 주소값이 들어가는 것이다.
		p1.setAge(20);
		p1.setAddress("서울시"); // 서울시의 주소값이 들어감

		String[] nick = { "멍멍이", "왈왈이", "쫑쫑이" };

		// p1.setNick(nick); // 이 상황 자체를 보자

		// System.out.println(Arrays.toString(p1.getNick()));

		Person p2 = new Person();

		p2.setName("아무개");
		p2.setAge(30);
		p2.setAddress("부산시");

		String[] nick2 = { "강아지", "고양이", "송아지", "병아리", "망아지" };

		// p2.setNick(nick2);

		// 위의 방식
		// 1. Person 클래스 제작자 > 편함
		// 2. Person 클래스 사용자 > 불편함

		// 변경 방식
		// 1. Person 클래스 제작자 > 불편함
		// 2. Person 클래스 사용자 > 편함
		Person p3 = new Person();
		p1.setName("홍길동");
		p1.setAge(20);
		p1.setAddress("서울시");

		p3.addNick("멍멍이");
		p3.addNick("나옹이");
		p3.addNick("병아리");
		p3.addNick("송아지");
		p3.addNick("물고기");
		p3.addNick("망아지");

		System.out.println(p3.getNick());
		System.out.println(p3.getNick());
		System.out.println(p3.getNick());
		System.out.println(p3.getNick());
		System.out.println(p3.getNick());
		System.out.println(p3.getNick());
	}

}
