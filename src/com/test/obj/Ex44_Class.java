package com.test.obj;

import java.util.Calendar;

public class Ex44_Class {

	public static void main(String[] args) {
		
//      이 과정이 너무 불편하다.
//		Member hong = new Member();
//		hong.setName("홍길동");
//		hong.setId("hong");
//		Calendar regdate = Calendar.getInstance();
//		regdate.set(2023, 0, 10);
//		hong.setRegdate(regdate);
//		System.out.printf("tF\n", hong.getRegdate());
		
		Member lee = new Member();
		
		lee.setName("이순신");
		lee.setId("lee");
		lee.setRegdate(2023, 1, 10);
		
		System.out.println(lee.getRegdate()); // 입출력이 간단하게 바뀐다. 
		
		
	}

}
