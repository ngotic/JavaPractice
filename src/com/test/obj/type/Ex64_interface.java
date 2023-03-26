package com.test.obj.type;

public class Ex64_interface {

	public static void main(String[] args) {
		Samsung100 s = new Samsung100();
		s.on();
		s.off();
		
		LG200 lg = new LG200();
		lg.on();
		lg.off();		
		// 콘센트도 인터페이스 > 인터페이스를 지키는게 좋다.
	}

}


//class Notebook {
//	private int price;
//	public void test() {
//		
//	}
//} // 부모의 필드나 메서드를 상속받아서 사용가능 > 클래스



//인터페이스 부모 > 엄격한 부모 > 자식에게 뭘 시키기만 하는 부모 > 추상 메서드
interface Notebook {
	void on();
	void off();
}

class Samsung100 implements Notebook {

	@Override
	public void on() {
		System.out.println("삼성 기술로 전원을 켭니다");
		
	}

	@Override
	public void off() {
		System.out.println("삼성 기술로 전원을 끕니다.");
	}
	
}

class LG200 implements Notebook {

	@Override
	public void on() {
		System.out.println("Power oN");
		
	}

	@Override
	public void off() {
		System.out.println("Power off ");
		
	}
	
}