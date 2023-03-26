package com.test.obj.type;

public class Ex66_abstract {

	public static void main(String[] args) {
		

	}

}

//interface Keyboard {
//	// 구현된(실제 존재하는) 멤버를 가질 수 없다. 
//	// 행동의 제약
//	void typing(String txt);
//}
//
//class K810 implements Keyboard { // 인터페이스 상속 > 인터페이스 구현
//	public String color;
//	public int price;
//	public int weight;
//	
//	public void typing(String txt) {}
//}
//// 키보드 
//class K380 implements Keyboard { // 인터페이스 상속 > 인터페이스 구현
//	public int price;
//	public int weight;
//	public int size;
//	
//	public void typing(String txt) { } 
//}

//class Keyboard { // 상속은 인터페이스의 성질을 잃는다. 
//	public int price;
//	public int weight;
//	//void typing(String txt); //This method requires a body instead of a semicolon
//	// 구현된(실제 존재하는) 멤버를 가질 수 없다. 
//	// 행동의 제약
//	// 클래스의 멤버 메서드는 구현부를 반드시 가져야 한다. > 추상 메서드는 X 
//}


// 추상 클래스 > 구현 멤버를 가질 수 있다. 
// 구현 멤버를 가질 수 있다.(=일반 클래스의 성질)
// 추상 멤버를 가질 수 있다.(= 인터페이스의 설징)
abstract class Keyboard { // 일종의 하이브리드  
	public int price;
	public int weight; 
	
	// void typing(String txt); // 인터페이스내에서만 작성하는 추상 메서드 표기법 
	// 위 아래 동일은 하다.
	public abstract void typing(String txt); // 구현부가 없는 클래스 추상 메서드
	// 이건 추상클래스내에서만 작성하는 추상 메서드 표기법이다. 
}

class K810 extends Keyboard { // 인터페이스 상속 > 인터페이스 구현
	public String color;
//	public void typing(String txt) {}
}
// 키보드 
class K380 extends Keyboard { // 인터페이스 상속 > 인터페이스 구현

	public int size;	
	public void typing(String txt) { } 
}

