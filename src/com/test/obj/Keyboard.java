package com.test.obj;

public class Keyboard {

	private String model;
	private int price;

// 외부에서 직접 접근이 불가능한 private 변수를
// public 메소드가 중간에서 연결 > 중계인
	
//	public void aaa(String a) {
//		model = a;
//	}
//
//	public void bbb(int b) {
//		// 유효성 검사가 가능하다.
//		if (b >= 0 && b <= 200000) {
//			price = b;
//		} else {
//			System.out.println("가격 오류!!");
//		}
//	}
//
//	public String ccc() {
//		return model;
//	}
//
//	public int ddd() {
//		return price;
//	}
		// - set멤버 변수명
		// - 쓰기 메소드 > Setter
		public void setModel(String model) {// 매개변수 === 지역변수

			// 멤버변수(model) = 매개변수(model) : 멤버변수 일수도, 지역변수 일수도 있다. 충돌이 발생했다.
			// model = model;
			// this > 객체 접근(지정) 연산자> 객체 자신을 가르키는 표현 > "나"
			this.model = model; // 지역변수라고 손을 들어준다. 
			// 이름을 안붙이면 지역변수가 되서 this를 붙인다.
			
			// model > 멤버변수 vs 지역변수 > 충돌발생!!! >> 
			
		}
		
		// get멤버변수명
		// 읽기 메서드 > Getter
		public String getModel() {
			return model;
		}
		
		public void setPrice(int price) {
			this.price = price;
		}
		
		public int getPrice() {
			return price;
		}
	
}
