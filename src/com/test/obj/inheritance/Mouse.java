package com.test.obj.inheritance;

public class Mouse {
	private int a;
	public int b;
	
	// 기본생성자 Ctrl+space 눌러서 엔터빡
	public Mouse() {
		// TODO Auto-generated constructor stub
	}
	
	// Alt + Shift + S 누르고 생성자 선택
	public Mouse(int a, int b) {
		this.a = a;
		this.b = b;
	}

   
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}
	
	public String info() {
		return this.a+ "," + this.b;
	}
	private void test() {
		
	}
	
}
