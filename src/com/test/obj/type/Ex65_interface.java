package com.test.obj.type;

public class Ex65_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다중상속
		// 자바는 클래스간 다중상속을 지원하지 않는다 > 어렵다; (복잡) >>> 
		// 인터페이스에 한해서 다중상속을 지원한다.   
		
		
		//홍길동
		//1. 아빠 역할
		//2. 회사에서 과장
	}

}


interface 아빠 {
	
	void 돈을번다();
	void 아이와놀아준다();
	void 가족을지킨다();
	
}

interface 과장 {
	void 직원을관리한다();
	void 영업을한다();
	void 결재를한다();
}

class 홍길동 implements 아빠, 과장 {
	
	
	public 홍길동() {}
	@Override
	public void 돈을번다() {	
	}
	@Override
	public void 아이와놀아준다() {	
	}
	@Override
	public void 가족을지킨다() {	
	}
	@Override
	public void 직원을관리한다() {	
	}
	@Override
	public void 영업을한다() {
	}
	@Override
	public void 결재를한다() {
	}
	
}



