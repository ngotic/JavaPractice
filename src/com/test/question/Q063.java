package com.test.question;

public class Q063 {

	public static void main(String[] args) {
		// 요구사항 ] int 배열을 매개변수로 받아 내용을 문자열로 반환하는 dump 메소드를 구현해라
		// 조건..
		// String dump(int[] list)
		int[] list = new int[4];

		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		String result = dump(list);
		System.out.printf("nums = %s\n", result);

	}

	public static String dump(int[] list) {

		String result = "[ ";
		if ( list.length>0 ) {
			
			for (int i = 0; i < list.length - 1; i++)
				result += list[i] + ", ";

			result += list[list.length - 1] + "";
		}
		result += " ]";
		return result;
	}

}
