package com.test.java;

public class Ex24_Method {

	public static void main(String[] args) {
		int num = getNum();
		System.out.println(num);
		System.out.println(checkAge(20));
	}
	
	public static int getNum() {
		// 리턴문, 반환문
		// return 키워드 사용한다.
		// return 뒤에 값 1개(***)를 돌려주는 역할
		return 10;
	}
	
	public static String checkAge(int age) {
		String result = age >= 19 ? "성인" : "미성년자";
		return result;
	}
}
