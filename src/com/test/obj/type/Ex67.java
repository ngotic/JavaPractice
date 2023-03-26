package com.test.obj.type;

public class Ex67 {

	public static void main(String[] args) {
		
		/*
		 * 상속
		 * 1. 클래스
		 * 2. 인터페이스
		 * 3. 추상클래스
		 * (부모) <- (자식)
		 * 클래스     클래스 :   O
		 * 인터페이스  클래스 :   O(상속된 추상 클래스를 자식이 구현해야 한다.)
		 * 추상클래스  클래스 :   O(구현멤버는 그대로 상속받고, 추상메서드는 구현)
		 * 인터페이스  인터페이스: O
		 * 추상클래스  추상클래스: O (상속받은 추상 메서드를 구현할지? 안할지 선택!)
		 * ---------------------------------------------------------
		 * 인터페이스  추상클래스 :  O 추상클래스가 추상메서드를 소유할 능력이 있음
		 * 추상클래스  인터페이스  : X (부모의 구현된 멤버를상속받을수 없어서..)
		 * 클래스     인터페이스 : X (부모의 구현된 멤버를상속받을수 없어서..)
		 * 클래스     추상클래스 : X 
		 * 
		 * - 일반 클래스는 일반 클래스의 부모 역할만 가능하다.
		 * - 일반 클래스의 인터페이스나 추상클래스의 부모 역할이 불가능하다.
		 * 
		 * - 추상 클래스는 추상클래스, 일반클래스의 부모 역할을 한다.
		 * - 추상 클래스는 인터페이스 부모 역할이 불가능하다.
		 * 
		 * - 인터페이스는 인터페이스, 추상클래스, 일반 클래스의 부모 역할을 한다.
		 * - [ 인터페이스 <--- 인터페이스 <---- 추상클래스 <----- 일반 클래스 ]
		 *                상, 중, 하로 나눠서 구분된다.   
		 * */

	}

}

interface AAA {
	void aaa();
}

abstract class BBB {
	public int b; // 구현
	public abstract void bbb(); // 추상 
}
//////////////////////////////////////////////////////////////////////////////////
// 근데 얘는 abstract라서 굳이 구현하지 않더라도 에러가 안난다.
// 추상 클래스가 자식이 되버리면 선택이 가능하다. 부모가 물려준 추상 메서드 구현할지 구현 안할지 스스로 선택한다.
// 그래서 헷갈린다. >>>>> 경우의 수가 많다.
abstract class FFF extends BBB {
	public int f; // 본인 멤버 구현
	//public int b; // 구현 > 상속받음
	// 부모인 추상 클래스가 물려준 추상 메소드를 구현
	
//	public void bbb() {
//		
//	}
} ////////////////////////////////////////////////////////////////////////////////////

class CCC {
	public int c;
}

//interface DDD implements AAA{ // 에러! 얘는 인터페이스라 구현 불가능하다. Syntax error on token "implements", extends expected
//	
//}

// 얘는 extends이다. 확장하는 느낌
interface DDD extends AAA{ // 얘는 인터페이스라 구현 불가능하다. Syntax error on token "implements", extends expected
	// void aaa(); // 상속받음 > 얘의 추상메서드를 물려받는다.
	void ddd();
} 
class EEE implements DDD {
	@Override
	public void aaa() {
		// TODO Auto-generated method stub
	}
	@Override
	public void ddd() {
		// TODO Auto-generated method stub
	}
}

abstract class GGG implements AAA { 
	// 추상 클래스는 추상메소드를 소유할 수 있어서 에러는 안난다. > 선택 가능
	// 구현할지, 걍 냅둘지
	
}

// 둘다 안된다.
//interface HHH extends BBB{ // X
//	
//}
//interface HHH implements BBB{
//  아래꺼는 부모꺼인데 부모의 구현된 멤버를 상속받을 수가 없다.
//	public int b; // 구현
//  public abstract void bbb(); // 추상
//}

abstract class III extends AAA {
	
}


