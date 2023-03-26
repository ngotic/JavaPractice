package com.test.obj;

public class Ex41_Access {

	// 클래스의 멤버변수 접근 지정자
	// 1. private으로 지정한다. > 유효하지 않는 값이 들어갈까봐...
	// 2. public 메서드를 선언 > private 변수를 접근한다. 
	
	public static void main(String[] args) {
		/* 
		 * 접근 지정자(제어자), Access Modifier 
		 *  - 클래스 멤버 변수에 붙여 사용한다.
		 *  - 클래스 멤버 메서드에 붙여서 사용한다.
		 *  - 클래스 자체에 붙여서 사용한다.
		 *  - 멤버를 노출 수위를 조절하는 역할 > 외부에 공개 유무 조절하는 역할 
		 *  - 어디를 경계(***)로 공개할지 말지를 결정하는지? > 클래스가 경계선 역할
		 *  
		 *  1. public     > 100% 공개
		 *  2. private    > 100% 비공개
		 *  ------------  중간쯤
		 *  3. protected
		 *  4. default
		 */
		//bbb();
		
		Book b1 = new Book();
		
		b1.a = 10;
		// b1.b = 20; //The field Block is not visible, 실제 존재, 안보임
		// b1.c = 30; //c cannot be resolved or is not a field, 아예 없음
		System.out.println(b1.a);
		// System.out.println(b1.b);
			
		Keyboard k1 = new Keyboard();
//		k1.model = "K810";
//		k1.price = 150000;
//		
//		System.out.println(k1.model);
//		System.out.println(k1.price);
//		
		Keyboard k2 = new Keyboard();
//		k2.model = "k380";
//		k2.price = 35000;
		//k2.price = 2000000000; // 컴파일 에러(x)
		// 실행시에 런타임에러도 안난다. 잘 출력되긴하는데 올바른 가격일까? 
		// 이게 public으로 멤버를 열었을 때 생기는 문제점이다.
		// 이걸 접근지정자로 해결한다. 어떤식으로 해결할까? 
//		System.out.println(k2.model);
//		System.out.println(k2.price);
//		k2.aaa("K380");
//		k2.bbb(35000);  // 전달만해준다.
//		k2.bbb(-35000); // 이런 통제가 가능하다. 
//		
//		System.out.println(k2.ccc());
//		System.out.println(k2.ddd());
		k2.setModel("K380");
		System.out.println(k2.getModel());
		
		k2.setPrice(20000);
		System.out.println(k2.getPrice());
	}



}//main
