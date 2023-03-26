package com.test.obj.cast;

public class Ex61_Casting {

	// main 메서드를 정적으로 만듬 이 안에서 this를 못쓴다. static 메서드 안에서는 static 멤버만 호출한다.
	public static void main(String[] args) { // main은 static 메서드다. 이게 static이 아니면 객체를 만들어야 한다. 
		// Ex61_Casting.java
		// 전자 제품 사용 > 배터리 
		Duracell b1 = new Duracell();
		setPower(b1); // 업캐스팅 > 호환성을 높인다.
		
		//	Ex61_Casting ex61 = new Ex61_Casting(); // 이렇게 하면 호출될 수도 있다. 
		//	ex61.setPower(b1);
		Neo b2 = new Neo();
		setPower(b1); // 업캐스팅 > 호환성을 높인다. 
		// setPower(b2); // 자료형이 달라서 안들어간다. // 호환성이 높도록 개량을 해야한다. 
		// >>> 호환성을 높이는 장점이 있다.
		
		Duracell b3 = getPower();
		setPower(b3);
		
		// 사용자 입장
		// - 건전지를 사용한다.
		// - 듀라셀이든 네오든 중요하지 않다. ... 전자제품이 동작만되면 된다. ...건전지면 된다.  
		// 추상화 > 행동의 단순함 
		Battery b4 = getPower(1); // 1. 듀라셀, 2.네오 
		setPower(b4); // 
		
	}// static 메서드 안에서는 static 변수나 static메서드만 호출 
	
	private static Battery getPower(int sel) { // * 하나의 리턴타입으로 두가지 값을 반환 가능
		if( sel == 1 )
			return new Duracell();
		else 
			return new Neo();
	}
	
	private static Duracell getPower() { 
		Duracell b = new Duracell();
		return b;
	}

	// 여기 static은 의미가 있다.  // 매개변수를 배터리로 받는다. > 호환성 향상 > 하나의 매개변수 타입으로 여러개를 인자로 받을 수 있음
	private static void setPower(Battery b1) {  // 자동완성되니까 static이 되버린 것은 당연
	// 뭔가 잘못했을 때 피해가 가장 적기에 private을 해놓은 것이다.
	// public으로 했다가 다른쪽에서 잘못 호출되면 문제가 되니까 > 그래서 감춰줌 안보이면 사고가 터질 확률이 낮아진다.
		System.out.println("전자 제품이 동작한다고.");
	}

}


class Battery { //// 이 친구들 상속///
	public int price;
	public int capacity;
} 

//class Battery2 { //// 이 친구들 상속///
//	public int price;
//	public int capacity;
//} ///////////////////////////////

class Duracell extends Battery{
	public String color;
}

class Neo extends Battery {
	public int weight;
}