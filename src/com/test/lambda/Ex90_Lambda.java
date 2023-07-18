package com.test.lambda;


import java.util.Calendar;
import java.util.function.*;

public class Ex90_Lambda { 
	
	public static void main(String[] args) {
		// 스트림을 배우기 위한 준비 과정이다.
		/*
		람다식 > 인터페이스가 필요하다.
		
		람다식의 장점 > 간단함(생산성)
		람다식의 단점 > 인터페이스를 선언해야 한다.
		
		주객전도됨 : 나는 람다식을 만들어야 하는데 인터페이스를 만들어야해...
		인터페이스가 근데 만드는게 귀찮아...
		
		*** 자바에선 여러가지 형식의 추상 메서드를 소유한 인터페이스를 제공한다.
		*> 이런 애들을 함수형 인터페이스라고 부른다.(Functional Interface!)
		// 추상메서드가 하나이면서 람다식을 저장하는 목적의 인터페이스 
		*> 함수형 인터페이스라고 한다.
		*  
		*  함수형 인터페이스, Functional Interface
		*  - 평범한 인터페이스
		*  - 목적: 람다식을 저장하기 위해서 만들어진 인터페이스 
		*    1. 표준 API 함수형 인터페이스 > JDK 제공, 자바가 만든 것
		*    2. 사용자 정의 함수형 인터페이스> 아까 만든거 내가 만든게 이거다.
		*    
		*    표준 API 함수형 인터페이스
		*    1. Comsumer
		*    	- Consumer<T>
				- BiConsumer<T, U>	
							
		*    2. Supplier
		*    	- Supplier<T>
		*    
		*    3. Function
		*    	- Function<T, R>
		*    	- BiFunction<T, U, R>
		// Operator와 Predicate가 하는일은 Function도 하는데 
		*  얘네는 뭔가의 이름을 붙일 정도로 특징이 있어서 그렇다.
		*  
		*    4. Operator
		*    	- UnaryOperator<T>
				- BinaryOperator<T>
				- Function 하위셋
				- 행동이 연사자 역할
				
		*    5. Predicate
		*    	- Predicate<T>
		*    	- BiPredicate<T, U>
		*    	- Function 하위셋
		*    	- 행동 > 무언가를 판단하는 역할
		*/
		// m1();
		// m2();
		// m3();
		//m4();
		//m5();
		m6();
		
		
	}   

	private static void m6() {
		
		// 함수형 인터페이스 중 일부 > 서로간의 결과를 결합(연결) > 람다식 연산
		User hong = new User("1", "홍길동", 20, "M", "서울", "010-1234-5678");
		
		// 업무 1.
		Consumer<User> c1 = user -> System.out.println("이름: " + user.getName());
		c1.accept(hong);
		
		// 업무 2.
		Consumer<User> c2 = user -> System.out.println("나이: "+user.getAge());
		c2.accept(hong);
		System.out.println();
		
		// 업무 3. 업무1 + 업무2 : 동시에 실행 > 기존 c1과 c2를 재사용??
		test(hong, c1, c2); // 한번의 행동으로 두가지 업무를 한다.
		System.out.println();
		
		// c1 + c2 ; 이걸하고 싶다.
		Consumer<User> c3 = c1.andThen(c2); // andThen 이렇게 이 메서드는 아래 test와 같다.
		                   // 두가지 컨슈머를 재활용해서 합친 컨슈머를 리턴해준다.
		c3.accept(hong);
		System.out.println();
		
		Consumer<User> c4 = user -> System.out.println("전화: "+user.getTel());
		
		Consumer<User> c5 = c1.andThen(c2).andThen(c4); // c1 + c2 + c4
		c5.accept(hong); // 얘는 하나를 똑같이 매개변수로 전달한다. c1, c2 c4
		System.out.println();
		
		// 위의 연산이 불가능 : c1 + c2
		Consumer<User> c6 = user -> {
			System.out.println("이름: " + user.getName());
			System.out.println("나이: " + user.getAge());			
		};
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//  처음에 integer를 넘김
		Function<Integer, Boolean> f1 = num -> num > 0; // boolean을 돌려준다.
		System.out.println(f1.apply(10));
		
		
		//  boolean을 매개변수로 넣어서 String으로 리턴한다.
		Function<Boolean, String> f2 = result -> result? "성공" : "실패";
		System.out.println(f2.apply(true));
		
		// f1 + f2
		// f1 매개변수 Integer로 -----> Boolean 반환받고 이걸 ----> f2의 매개변수로 넣어서 ----> String으로 반환
		Function<Integer, String> f3 = f1.andThen(f2); // f1을 시작 -> f2 받고 스트링 
		System.out.println(f3.apply(10)); // f1이 준값, f2가 준값을 둘다 못받으니까 결국 하나를 받아야함
		// 그리고 체인 형식으로 앞에서 끝난걸 뒤에서 받고 뒤에서 끝난걸 결과적으로 받는다.
		// * 동일한 andThen이지만 Consumer에 적용한것과 Function에 적용한 것이 다르다.
		Function<String, Integer> f4 = txt->txt.length();
		
		// f1 + f2 + f4 : 나는 최종 f4에게 돌려받음
		
		// 양수인지 판별, 성공실패인지?, 길이를 리턴
		Function<Integer, Integer> f5 = f1.andThen(f2).andThen(f4);
		System.out.println(f5.apply(10));
		// 꼬리에 꼬리를 무는 메타
		
		// 2의 배수
		Predicate<Integer> p1 = num -> num % 2 == 0;

		// 3의 배수
		Predicate<Integer> p2 = num -> num % 3 == 0;
		
		int a = 6;
		// "Predicate는 test라는 메서드를 가지고 있다."
		System.out.println(p1.test(a)); // 이게 2의 배수 인지 궁금해
		System.out.println(p2.test(a)); // 이게 2의 배수 인지 궁금해
		System.out.println();
		
		// a가 2와 3의 공배수인지?
		System.out.println(p1.test(a) && p2.test(a));
		
		//                           ↓↓↓↓↓
		// p1 && p2 
		Predicate<Integer> p3 = p1.and(p2); // 두 단계를 합침
		System.out.println(p3.test(a)); // 니가 2와 3의 공배수냐??
		
		//p1 || p2
		Predicate<Integer> p4 = p1.or(p2);
		System.out.println(p4.test(a));
		
		Predicate<Integer> p5 = p1.negate(); // 연산의 결과가 뒤집이진다.
		System.out.println(p5.test(a));      // 기존의 2로 나눠지는 결과가 true면 뒤집어져서 false가 된다.
		
	}

	private static void test(User hong, Consumer<User> c1, Consumer<User> c2) {
		c1.accept(hong);
		c2.accept(hong);	
	}

	private static void m5() {
		//5. Predicate
		// - Predicate<T>
		// - BiPredicate<T,U>
		// - 매개변수를 전달하면, 처리 후 반환값을 돌려주는 업무를 구현하는 인터페이스
		// - testXXX() 추상 메서드 제공
		// - 논리 검사 전용 > Boolean 반환
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10)); //true
		System.out.println(f1.apply(-10)); //false
		
		Predicate<Integer> p1 = num -> num > 0; // 인자 하나 반환형은 boolean
		System.out.println(p1.test(10));
		System.out.println(p1.test(-10));
		
		BiPredicate<Integer, Integer> p2 = (a, b) -> a> b; // 인자 두개 타입, 반환형은 boolean
		System.out.println(p2.test(10, 20));
		
		
	}

	private static void m4() {
		//4. Operator
		// - UnaryOperator<T>
		// - BinaryOperator<T>
		// - 매개변수를 전달하면, 처리 후 반환값을 돌려주는 업무를 구현하는 인터페이스
		// - applyXXX() 추상 메서드 제공
		// - [ 추상 메서드의 매개변수와 반환값이 자료형이 동일하다. ] > 이게 마치 Operator 느낌이라서 그렇다.
		
		// 연산자와 메소드는 성질이 같다. ?
		// 연산자 오버로딩이라는 기술이 있다. 
		
		// 1 + 1 = 2
		// result = 1 + 1
		// result = sum(1, 1)
		
		BiFunction<Integer, Integer, Integer> bf1 = (a, b) -> a + b;
		System.out.println(bf1.apply(10, 20));
		
		BinaryOperator<Integer> bo1 = (a, b) -> a + b; // 반환형이 같으니까
		// Integer하나가 저 두 매개변수와 반환값으러 셋팅되는 것이다. 
		System.out.println(bo1.apply(10, 20));
		
		Function<Integer, Integer> bf2 = num -> num*num;
		
		System.out.println(bf2.apply(10));
	}

	private static void m3() {
		// 3. Function
		// - Function<T, R>           : > T는 매개변수, R은 리턴값
		// - BiFunction<T, U, R>
		// - 매개변수를 전달하면, 처리 후 반환값을 돌려주는 업무를 구현하는 인터페이스 
		// - applyXXX() 추상 메서드 제공
		// 첫번째 것 매개변수, 두번째 것 리턴값
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		Function<String, Integer> f2 = txt -> txt.length();// 문자열의 길이를 리턴
		System.out.println(f2.apply("홍길동"));
		System.out.println(f2.apply("홍길동입니다."));
		
		User user = new User("1", "홍길동",20, "M","서울","010-1234-5678"); //이 지역변수
		User user2 = new User("2", "호호호", 20, "F", "서울", "010-1234-5678"); //이 지역변수
		
		// 유저라는 객체 _-------------> 이거 잡아서
		Function<User, String> f3 = u ->  u.getGender().equals("M")? "남자": "여자"; // 요기서 위 지역변수 또쓰면 충돌
		System.out.println(f3.apply(user));
		System.out.println(f3.apply(user2));
		                            
		
		BiFunction<Integer, Integer, Integer> bf1 = (a, b) -> a + b; // 숫자 두개를 줄테니 연산하고 반환 해
		System.out.println(bf1.apply(10, 5));
		
		BiFunction<Integer, Integer, String> bf2 = (a, b ) -> {
			if(a > b)
				return "크당";
			else if( a < b)
				return "작당";
			else 
				return "같당";
		};
		
		System.out.println(bf2.apply(10, 5));
		System.out.println(bf2.apply(5, 10));
		System.out.println(bf2.apply(10, 10));
		
		//java.util.function.Function 
		
	}

	private static void m2() {
		//2. Supplier
		//	- Supplier<T>
		//  - 매개변수 없이 반환값을 돌려주는 업무를 구현하는 인터페이스
		//  - getXXX() 추상 메서드 제공
		// : 이걸가지고 익명 객체를 만들 것이다.
		Supplier<Integer> s1 = () -> { return 100; }; // 이 리턴 값의 타입을 제네릭으로 만든 것이다.
		//   T get();
		// Supplier는 get이다. get이다. get이다.
		System.out.println(s1.get()); 
		
		Supplier<Double> s2 = () -> Math.random();
		System.out.println(s2.get());
		
		Supplier<String> s3 = () -> "홍길동";
		System.out.println(s3.get());
		
		Supplier<Integer> s4 = () -> {
			// Calendar : 추상 클래스
			Calendar now = Calendar.getInstance();
			// Calender now = new GregorianCalendar();
			return now.get(Calendar.HOUR_OF_DAY);
		};
		
		System.out.println(s4.get());
		
	}

	private static void m1() {
		//1. Consumer 
		// - 매개변수를 받아서 소비하는 업무를 구현하는 인터페이스
		// - acceptXXX() 추상 메서드 제공
		
		MyConsumer m1 = num -> System.out.println(num);
		// 매개변수가 하나니까 소괄호 x, 자료형 생략, 
		m1.test(10);
		
		// 내가 만든거랑 동일하다. 미리 만들어논거 쓴거와 내가 만든거 쓴 차이다.
		// 왜 Generic이냐? int를 고정시키면 다른 자료형으론 못쓰니까 이렇게 제네릭으로함 
		
		Consumer<Integer> c1 = new Consumer<Integer>() {
			@Override
			public void accept(Integer num) { 
				// 매개변수가 있는데 리턴값이 없다. 인풋이 드갔는데 output이 없다. 
				// > "소비했닭"
				// 추상 메서드가 하나짜리
				System.out.println(num);
			}
		};
		c1.accept(20);
		
		//String형
		Consumer<String> c2 = txt-> System.out.println(txt);
		c2.accept("홍길동");
		
		Consumer<String> c3 = txt-> System.out.println(txt.length());
		c3.accept("홍길동");
		
		Consumer<Integer> c4 = count -> {
			// 안에서 뭘하는지는 강요는 없다.
			for(int i=0; i<count; i++) {
				System.out.println(i);
			}
			System.out.println();
		};
		c4.accept(5);
		c4.accept(10);
		
		// 타입이 두개로 늘었다.
		BiConsumer<String ,Integer> bc1 = (name, age) -> {
			System.out.printf("이름: %s, 나이: %d세\n", name, age);
		} ;// 이 제네릭에 따라 타입지정
		bc1.accept("홍길동", 20);
		
		// 얘는 타입을 int쓰라고 고정시킨거다. 
		IntConsumer ic1 = num -> System.out.println(num*num);
		ic1.accept(10);
		
		// >>>> 제네릭은 타입만 바꾸면 된다.
		//Consumer<T>      : 범용
		//Biconsumer<T, U> : 범용 > 형식상 최대 2개의 매개변수를 지원한다.
		// -> 더필요하면 만들어서 쓰라고 
		//IntConsumer      : 전용 : 안에 애들이 Int라는게 확실하다.
		
		// "내가 몰라 하면 한번 이렇게 자동완성을 시켜봐라"
		ObjIntConsumer<String> oic1= new ObjIntConsumer<String>() {
			@Override
			public void accept(String t, int value) {
			}                 // 앞에만 타입나오고, 두번쨰는 int
		};
		
		// 앞에 타입만 통제다. > 범용+전용 > 섞은 타입
		ObjIntConsumer<Integer> oic2= (a, num)->{ };
		
	}   	
	
}	

// 람다식을 저장하고 싶다. > 인터페이스가 필요. > 인터페이스 선언
interface MyConsumer { // 이게 IntConsumer이다.
	//인자O + 반환x
	// - 건내준 데이터를 받아서 무언가를 하고, 돌려주는 값은 없는 행동 > 소비
	void test(int num);
}
