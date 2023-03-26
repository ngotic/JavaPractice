package com.test.obj.type;

public class Ex69_Generic {

	public static void main(String[] args) {
		
		// 클래스 종류
		// 1. 클래스
		// 2. 인터페이스
		// 3. 추상 클래스
		// 4. enum
		
		// 제네릭, Generic
		// 1. 제네릭 클래스 > O
		// 2. 제네릭 메서드 
		
		// 요구사항 ] 클래스 설계
		//1. 멤버 변수 선언 > int
		//2. 멤버 변수를 중심으로 여러가지 행동을 하는 메서드 선언
		
		// 추가사항 ] String  중심으로 하는 클래스 추가 설계
		// 추가사항 ] boolean 중심으로 하는 클래스 추가 설계
		// 추가사항 ] double  중심으로 하는 클래스 추가 설계
		// 추가사항 ] byte    중심으로 하는 클래스 추가 설계
		// ... 9개 클래스
		
		WrapperInt n1 = new WrapperInt(10);
		System.out.println(n1.getData());
		System.out.println(n1.getData()*2);
		
		
		WrapperObject n2 = new WrapperObject(10);
		System.out.println((int)n2.getData()*2); // Object라 다운캐스팅하낟.
		System.out.println(n2.toString());
		System.out.println();
		
		
		// Object의 단점을 보완하기 위해 만든 기술 
		Wrapper<Integer> n3 = new Wrapper<Integer>(30);
		
		System.out.println(n3.getData());
		System.out.println(n3.getData() * 2); // 다운 캐스팅이 없어진다. 
		System.out.println(n3.toString());
		
		
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1.getData());
		System.out.println(s1.getData().length());
		System.out.println(s1.getData().toString());
		System.out.println(); 
		
		
		WrapperObject s2 = new WrapperObject("아무개");
		
		System.out.println(s2.getData());
		System.out.println(((String)s2.getData()).length());
		System.out.println(s2.toString());
		System.out.println();
		System.out.println();
		
		Wrapper<String> s3 = new Wrapper<String>("이클립스");
		System.out.println(s3.getData());
		System.out.println(s3.getData().length()); // 다운 캐스팅 없이 가능
		System.out.println(s3.toString());
		
		WrapperBoolean b1 = new WrapperBoolean(true);
		
		System.out.println(b1.getData());
		System.out.println(b1.getData()? "참":"거짓");
		System.out.println(b1.getData());
		System.out.println();
		
		// 초기 생산 비용이 싸다. 근데 유지 비용이 드간다. 쓸 때마다 고민해야 한다.
		WrapperObject b2 = new WrapperObject(true);
		
		System.out.println(b2.getData());
		System.out.println((boolean)b2.getData()? "참":"거짓");
		System.out.println(b2.toString());
		System.out.println();
		System.out.println();
		
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		
		System.out.println(b3.getData());
		System.out.println(b3.getData()? "참" : "거짓");
		System.out.println(b3.toString());
		System.out.println();
		
		
		//for문
		// - 향상된 for문, Enhanced for statement
		// - foreach문
		// - 집합을 가지고 루프를 돌릴 때 사용
		String[] list = {"강아지", "고양이", "병아리", "오병이", "송아지"};
		
		for(int i=0; i<list.length; i++ ) {
			System.out.println(list[i] + "\t");
		}
		System.out.println();
		for (int i=0; i< 10 ;i++) { // 단순히 루프를 도는 용도
			System.out.println(i + "\t");
		}
		System.out.println();
		
		// 향상된 for문은 무조건 배열만 돌리는게 쓴다.
		// 속도가 절대적으로 빠르다.
		for (String name : list) {  // : 인데 다른 언어는 in이라 한다.
			System.out.println(name + "\t");
		} // 무조건 첫번째방~마지막방까지 순서대로 모두 다 가져오는 거말고는 못함
		// 문법이 심플해서 쓴다.
		System.out.println();	
	} // main
} // main class

class WrapperInt {
	private int data; // 클래스 중심이 되는 데이터 
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public WrapperInt(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "data=" + this.data;
	}
}
class WrapperString {
	private String data;

	public WrapperString(String data) {
		super();
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "WrapperString [data=" + data + "]";
	}
}



class WrapperBoolean {
	
	private boolean data;
	@Override
	public String toString() {
		return "WrapperBoolean [data=" + data + "]";
	}

	public boolean isData() {
		return data;
	}
	
	public boolean getData() {
		return this.data;
	}
	
	public void setData(boolean data) {
		this.data = data;
	}

	public WrapperBoolean(boolean data) {
		super();
		this.data = data;
	}
}

class Wrapper<T> {
	private T data;
	public Wrapper(T data) {
		this.setData(data);
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	} /////////////////////////// 유연하게

	@Override
	public String toString() {
		return "Wrapper [data=" + data + "]";
	}
}