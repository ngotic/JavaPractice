package com.test.obj.type;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex70_Object {
	public static void main(String[] args) {
		
		AAAA a1 = new AAAA();
		
		AAAA a2 = new BBBB(); // 업캐스팅
		
		AAAA a3 = new CCCC(); // 업캐스팅
		
		
		// Object 변수는 모든 것을 담을 수 있는 만능 주머니이다.
		// 값형 대상 > 박싱, 언박싱 발생
		// Object변수안의 값이 어떤 타입인지 확인하기 힘들다. > 다운캐스팅 오류날수도,, 
		Object o1 = new Object();
		
		Object o2 = new AAAA();
		Object o3 = new BBBB();
		Object o4 = new CCCC();
		Object o5 = new Date();
		Object o6 = new Scanner(System.in);
		Object o7 = Calendar.getInstance();
		Object o8 = new BufferedReader(new InputStreamReader(System.in));
	
		
		// Object = int 
		// 참조형 = 값형
		Object o9 = 10; // 박싱(Boxing) > 10 자료형? > new Integer(10) 
		// 박싱 > 값형의 데이터를 참조형의 객체 안에다가 넣고 이걸 참조한다. 
		// 힙에 200번지 클래스, 10이라는 값 저장 
		// o9이라는 참조변수로 200번지를 저장
		System.out.println(o9);
		// System.out.println(o9*2);// 이건 에러다. 주소값은 연산의 대상이 안된다.
		System.out.println((Integer)o9*2); // 데이터가 들어있는데 아니라 주소값이 있어서 연산을 바로 못해
		// 정석> 이건 언박싱이다. 
		// 그래서 원래 타입으로 다운캐스팅을 하면 된다. 
		// 집어넣을땐 Object로, 끄집어낼땐 형변환해서 꺼낸다.
		System.out.println((int)o9*2); // 이것도 된다. 이건 서비스 문법
		
		// Object 변수에 값형의 값을 입출력> 박싱 / 언박싱이 발생한다. > 비효율 
		// 이 작업이 성능이 영향을 많이 미친다.
		
		
		
		// 값형 변수안에는 데이터만 저장 가능
		// 참조형 변수안에는 주소값만 저장 가능
		int n1 = 10;
		Integer n2 = new Integer(20);
		
		System.out.println(n2 * 2);
		
		//원래 타입으로 형변환 필요
		// Object로 만들었다가 다시 원래 메서드를 꺼내쓰고 싶다.
		Scanner scan = (Scanner)o3; // 겉으로는 이런데
		// 이렇게 에러 메세지를 많이 띄운다.
		// class com.test.obj.type.BBBB cannot be cast to class java.util.Scanner
		
		
		
	}
}


class AAAA {
	public String name;
}

class BBBB extends AAAA {
	public int age;
}

class CCCC extends BBBB {
	public String address;
}


class WrapperObject {
	
	private Object data;
	
	
	public WrapperObject(Object data) {
		super();
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "WrapperObject [data=" + data + "]";
	}
}


