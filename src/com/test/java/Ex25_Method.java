package com.test.java;

import java.util.Scanner;

public class Ex25_Method {

	public static void main(String[] args) {
		int num = getNum();
		// ** 동일한 목적을 가지는 동일 코드가 2번이상 반복되면 안된다. !!!
		hello();
		hello();
		String name = "홍길동";
		hi(name);
		score();
		score2(100);
		String result = score3("홍길동");
		aaa();
	}
	
	private static void aaa() {
		int num = 10;
		int sum = 0;
		num++;
		num *= 2;
		sum = num + 100;
		System.out.println(sum);
	}

	private static String score3(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void score2(int i) {
		// TODO Auto-generated method stub
		
	}

	private static void score() {
		// TODO Auto-generated method stub
		
	}

	private static void hi2(String name) {
		System.out.println(name+" 안녕하세요.");
		System.out.println(name+" 반갑습니다.");
		System.out.println(name+" 환영합니다.");
	}

	private static void hi(String name) {
		hi2(name);
	}
	
	
	public static void hello() {
		System.out.println("안녕하세요.");
		System.out.println("반갑습니다.");
		System.out.println("환영합니다.");
	}
	
	public static void test() {
		System.out.println("one");
		return ; // 메서드를 중단하는 역할에서 쓰인다.
	}
	public static int getNum() {
		return 100;
	}
}
