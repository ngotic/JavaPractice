package com.test.obj;

public class Ex45_Class {

	public static void main(String[] args) {
		//Ex45_Class.java
		Employee e1 = new Employee();
		
		e1.setName("홍길동");
		e1.setDepartment("영업부");
		e1.setPosition("과장");
		
		Employee e2 = new Employee();
		
		e2.setName("아무개");
		e2.setDepartment("영업부");
		e2.setPosition("대리");
		
		e2.setSuperior(e1); // 상사 
		
		
		
		
	}   

}
