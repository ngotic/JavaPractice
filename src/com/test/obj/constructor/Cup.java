package com.test.obj.constructor;

public class Cup {
	
	private String color;
	private int size;
	
	// 생성자
	// 1. 메서드명이 클래스명과 동일하다. ( 반드시 필수 )
	// 2. 반환형이 생략되어 있다. > 생성자라는 메소드는 반환값을 가질 수 없다.
//	public Cup() { // 반환타입이 없다.
//		// 생성자 내부에서는 어떤일?
//		// 3. 클래스 멤버 변수를 초기화하는 코드 구현(최소한의 의무)
//		
//		this.color = "yellow";
//		this.size  = 300;
//		
//	}
	
	// 자바는 개발자가 생성자를 선언하지 않으면, 자동으로 아래의 생성자를 생성한다.
	// 자동으로 만들어진 생성자를 기본생성자라 그런다. > 이게 자동으로 만들어진다. 
	// 모든 멤버를 기본값으로 초기화한다. 숫자는 0으로 boolean은 false로 , 모든 참조형은 null
	
	// 기본생성자를 써도 되고 명시적으로 이렇게 써도 된다.
	public Cup() {  
		this.color = null;
		this.size  = 0;
	} 
	// 내가 원하는 값으로 넣어서 만든다. 생성자 오버로딩 
	public Cup(String color) { // 인자열 매개변수를 넣어서 위 아래가 동시에 존재 x
		this.color = color;
		this.size = 0;
	}
	// 생성자 오버로딩
	public Cup(int size) {
		this.size = size;
		this.color = null;
	}
	
	public Cup(String color, int size) {
		this.color = color;
		this.size = size;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String info() {
		return "color: "+this.color+"\nsize: " + this.size;
	}
}
