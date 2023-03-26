package com.test.obj.constructor;

public class Ex47_Constructor {

	public static void main(String[] args) {
		
		/*
		 생성자, Constructor + new 
		  자료형 참조(객체)변수 = 객체생성연산자
		  Box box = new Box();
		*/  
		
		//*** 생성자 > 객체의 초기 상태를 개발자가 원하는대로 설정이 가능하다. 
		//        1     2
		//       new + Cup
		Cup c1 = new Cup(); // 여기서 생성자 사용, 생성자를 지워도 이게 구문이 잘 돌아간다. 
		
		// 대량으로 만들 땐 생성자에다가 초기화하는게 좋다. 
		// *** 역할 : 컵을 초기화한다. > 생성자를 쓰면 이런 setter를 안해도 된다. 
		//		c1.setColor("yellow");
		//		c1.setSize(300);
		
		System.out.println(c1.getColor());
		System.out.println(c1.getSize());  
		System.out.println(c1.info());

		Cup c2 = new Cup();
		
		c2.setColor("white");
		c2.setSize(500);
		
		System.out.println(c2.info());
		
		Cup c3 = new Cup("black");
		c3.setSize(600);
		System.out.println(c3.info());
		
		Cup c4 = new Cup(300);
		c4.setColor("green");
		System.out.println(c4.info());
		
		Cup c5 = new Cup("orange", 250);
		System.out.println(c5.info());
		// 알아서 넣어라 ...
		
	}

}
