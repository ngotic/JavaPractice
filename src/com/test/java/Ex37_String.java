package com.test.java;

public class Ex37_String {

	public static void main(String[] args) {
		// Ex37_String.java
		
		//1. 메모리의 공간은 한번 할당되면 더 이상 늘리거나 줄일 수 없다.
		//2. 문자열은 '불변'(Immutable)이다. > 한번 만들어진 문자열은 절 대 수정할 수 없다.
		//3. 문자열은 참조형이다. > 프로그래밍 언어 특징임
		
		//m1();
		// m2();
		// m3();
		m4();
		
	}
	private static void m4() {
		//String vs StringBuilder 
		
		
		// 이건 1970 1월 1일부터 몇 밀리초가 흘렀는지 알아내는 숫자
		// 이걸론 시간을 못잰다 1000분의1초보다 짧게끝날수도 있다.
		// long begin = System.currentTimeMillis();
		
		// 10의 마이너스 9승이다. 나노타임이다. 얘도 틱임
		// 1970년으로부터 흐른 단위 
		long begin = System.nanoTime(); 
		
		String txt1 = "홍길동";
		
		for(int i=0; i<100000; i++) {
			txt1 = txt1 + "."; // 잦은 수정
		}
		long end = System.nanoTime();
		
		System.out.println("글자수: "+txt1.length());
		System.out.println(end-begin + "ns" );
		
		
		begin = System.nanoTime();
		
		StringBuilder txt2 = new StringBuilder("홍길동");
		
		for(int i=0; i<100000; i++) {
			txt2.append("."); //txt1 = txt1 + ".";
		}
		
		end = System.nanoTime(); 
		System.out.println("글자수: "+txt2.length());
		System.out.println(end-begin + "ns" );
		
	}
	
	private static void m3() {
		// 문자열
		//1. String
		//2. StringBuilder 
		String name1 = "홍길동";// 혜택( 값형 스타일 )
		String name3 = new String("홍길동");// FM
		StringBuilder name2 = new StringBuilder("홍길동");
		
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name1.equals(name2));
		// 자료형 자체가 달라서 true라고 나오진 않는다. 
		// 데이터는 동일하지만 자료형이 달라서 안된다.
		// 거의 쌍둥이 같은 애들이다.
		System.out.println(name1.length());
		System.out.println(name2.length());
		
		
	}
	private static void m2() {
		// 문자열 > 하면 안되는 행동
		// 1. 큰문자열을 조작
		// 2. 잦은 문자열을 조작
		
		String txt1 = "홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동홍길동";
		
		txt1 = txt1 + "님";
		
		String txt2 ="가나다";
		for(int i=0; i <100; i++) {
			txt2 = txt2 + "라";
		}
		System.out.println(txt2);
	}
	private static void m1() {
		// 1. 메모리의 공간은 한번 할당되면 더 이상 늘리거나 줄일 수 없다. 
		// 3. 문자열은 참조형이다.
		
		// integer라서 4바이트로 잡히고
		// 값형 > 자료형 > 메모리의 크기가 고정
		int a = 10;        // 4바이트
		char c = 'A';      // 2바이트
		// char는 2바이트라서 잡는다.
		// 메모리 공간 크기 고정 ↑
		
		// 얘네들과 아래는 공간의 크기를 잡는데 기준이 다르다.
		// 길이가 늘어나거나 줄어든다는 뜻이 아니다
		String b = "홍길동"; // 글자3개 // 6byte로 실제로 잡힌다.
		// String은 몇바이트? X 이친구는 글자가 3글자라서 6byte이다.
		String d = "안녕하세요"; // 10byte로 잡혀야 한다.
		// 얘는 위에 애들과 표현이 다르다. 
		// 이게 참조형들 애들의 특징이다.
		// 참조형은 데이터의 크기에 따라 메모리의 크기가 달라진다.
		
		// int 방 3개 실제크기 12바이트
		int[] ns1 = new int[3];  
		// ns1이라는 애가 실제로 차지하는 크기지
		// int배열이 12바이트인것은 아니다.
		int[] ns2 = new int[5]; // 20byte
		// 방의 길이, 내용물에 따라 길이가 줄어들 수도 늘어날 수도 있다.
		
		// 이 모든 것들이 참조형들의 특징이다.
		// 값형은 어떤 값이 들어가든 공간의 크기 불변
		// 참조형은 어떤 값이 들어가냐에 따라서 길이가 결정된다.
		
		
		String name = "홍길동";
		
		name = name + "님"; 
		// 여기를 거치면?? 기존의 홍길동 대신에 홍길동님이라 고쳐?
		// 메모리 공간은 한번 할당되면 더이상 늘리거나 줄일 수 업슨데?
		
		System.out.println(name);
		
		
		
		name ="홍길동";
		name ="아무개";
		System.out.println(name);
		
		String name1= "홍길동";
		String name2= "홍길동";
		String name3= "홍";
		name3 = name3 + "길동";
		
		//*** 모든 참조형 변수의 비교는 참조 데이터 비교가 아니라, 주소값을 비교한다.
		System.out.println(name1== name2);
		System.out.println(name1== name3); // 주소값이 다르다.
		
		System.out.println(name1.equals(name2)); //true
		System.out.println(name1.equals(name3)); //true
		// 그래서 equals를 쓴다. 사실은 값 자체를 비교하는게 아니라
		// 주소값을 비교해버리는 격이 되버리니까. 
		
		
	    // 문자열 > 참조형 > 예외	
		String txt1= "안녕하세요.";
		String txt2= "안녕하세요."; // 동일하게 txt1, txt2가 안녕하세요. 가르킨다.
		
		txt1 = "반값습니다.";
	 
		System.out.println(txt1);
		System.out.println(txt2);
		
		String txt3 ="홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.";
		String txt4 ="홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.";
		
	}
}
