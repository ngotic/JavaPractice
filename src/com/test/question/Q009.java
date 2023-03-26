package com.test.question;

public class Q009 {

	public static void main(String[] args) {
	// 요구사항] 이름을 전달하면 이름뒤에 '님'을 붙여서 반환하는 메소드를 선언하시오.
	// 조건 
	// String getName(String name)
	// - name: OOO(이름)
	// - return: OOO(이름)님		
		// 화면 설정
		String result = getName("홍길동");
		System.out.printf("고객: %s\n", result);
		
		result = getName("아무개");
		System.out.printf("고객: %s\n", result);

	}
	
	// 메서드 정의
	public static String getName(String name) {
		return name+"님";
	}

}
