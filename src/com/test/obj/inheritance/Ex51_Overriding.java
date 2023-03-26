package com.test.obj.inheritance;

public class Ex51_Overriding {

	public static void main(String[] args) {
		/* 
		 메소드 오버로딩, Method Overloading
		 - 과적하다. 
		 - 메서드 이름 동일 x N개 생성(+인자 리스트)
		 
		 메소드 오버라이딩, Method Overriding
		 - 기각[무시]하다. 우선하다.  
		 - 클래스 상속 시에 발생
		 - "메소드 재정의" > 상속받은 메서드를 수정하는 기술이다. 
		  
		*/
		// 아빠 + 아들 > 마ㅈㅊ
		OverridingParent hong = new OverridingParent();
		//hong.hello();
		hong.name = "홍길동";
		hong.hello();
		
		OverridingChild jhong = new OverridingChild();
		jhong.name = "홍철수";
	    //jhong.hello();
		//jhong.hi(); // 자신마의 방식을 만들었는데 
		// 외부 사람인 나는 아들한테 .을 찍으면 hello가 여전히 눈에 보인다.
		// - 부모가 선언한 hello()는 호출이 불가능하다.
		jhong.hello(); // >> 메서드 다시 만든것처럼, 보인다 >> 메서드 재정의다.
		
		// *** 내가 문제;;
		// - 이전에는 같은 핏줄인 홍길동과 홍철수가 모두 hello()를 사용해서 인사
		//   > 같은 상속의 클래스(객체는) > 인사메서드 > hello()
		// - 지금은 .. 같은 집안이라도.. 아빠는 hello(), 아들이 hi()
	}//
}//


class OverridingParent {
	public String name;
	public void hello() {
		System.out.printf("안녕하세요. 좋은 아침입니다. 저는 %s입니다.\n", this.name);
	}
}

class OverridingChild extends OverridingParent{
	
//		// 4살 꼬맹이 > 시간이 흘름 > 중 2
//		// 아빠의 인사 방식 불만 > 자기 방식대로 인사를 하고 싶다.
//		// 아빠의 방식을 그대로 사용이유 > hello()를 상속받아서
//		// **** 클래스 상속 > 부모가 물려준 멤버를 자식이 상속 거부할 능력이 없다.
//		//               > 무조건 100% 상속
//		// **** 부모로부터 상속받은 메소드가 맘에 안든다고, 아래처럼 동일한 일을 하는 메소드를 따로 구현하면 큰일난다.
	    // > 나중에 객체 사용시 어떤 메소드가 올바른 메소드인지 구분할 수 없다. 
	// 이러면 자식 객체에는 hello가 두개 있따. 하나는 부모가 물려줌, 또하나는 자신이 만든거
	
	// 자식 이게 부모가 물려준 메소드와 동일한 형식의 메서드를 만든 것이다.
	// 부모가 물려준 메소드와 동일한 형식의 메소드를 선언
	// - 부모의 메서드를 무시하고 자식의 메소드를 사용한다.
	// 부모의 hello() 더이상 자식에게서는 필요가 없다고 판단.
	// 메서드 덮어쓰기 느낌이다.
	public void hello() {
		System.out.printf("Hello My Name is %s\n", this.name);
	}
}



