package com.test.stream;

import java.nio.file.Files;
import java.nio.file.Path;       // 원래는 io에 파일입출력 패키지에 있었는데.
import java.nio.file.Paths; // 이건 다음 버전의 패키지이다. 


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;

public class Ex91_Stream {

	public static void main(String[] args) {
		// 기능이 쓸만하다. 최근에 나온 것이다.
		/*
		  Stream 
		  - "Java 8" 
		  - 파일(컬랙션)의 탐색(조작) ***
		  - 디렉토리 탐색
		  - 빈번하게 익명 객체를 사용 > 람다식 사용 + 표준 API 함수 인터페이스를 쓴다.
		  
		  표준 API 함수형 인터페이스
		  1. Consumer 
		  	- (매개변수) -> {}
		  	
		  2. Supplier 
		    - () -> { return 값; }
		    
		  3. Function 
		  	- (매개변수) -> { return 값; }
		  
		  4. Operator 
		  	- (매개변수) -> { return 값; }
		  	
		  5. Predicate 
		  	- (매개변수) -> { return 값; }
		  	- 반환값의 자료형이 boolean
			
		  *.jar  : 반디집으로 압축은 풀린다.
		    - 압축파일(zip)
		    - 내가 만든 소스를 압축해놓은게 .jar 파일이다.
		    - 근데 컴파일된 .class 파일이다.
		    
		     
		   스트림.forEach()로 탐색을 했다.  
		   
		   스트림 > 데이터 조작? > 파이프
		   
		   
		   파이프
		   - 스트림 객체 메소드 > 파이프의 종류가 크게 2가지다.
		    
		   1. 중간 파이프
		      - 반환값 > 스트림 반환
		      
		   2. 최종 파이프
		   	  - 반환값 > 스트림이 아닌 다른 자료형을 반환 or void
		   	  
		   필터링
		   - filter() 파이프 > predicate 
		   - 중간 파이프
		   - 앞의 스트림의 값들을 받아서 > 검사 > 조건을 만족하는 요소만 남겨 > 스트림 생성
		   
		   중복 제거
		   - distinct() 메소드
		   - 중간 파이프
		   - 앞의 스트림의 값들을 받아서 > 중복값을 제거한 새로운 스트림 생성
		   - 유일한 값들로만 되어있는 스트림을 생성
		   - Set 성질과 유사 
		   
		   변환(매핑) 
		   - map(), mapXXX()
		   - 중간 파이프 
		   - 앞의 스트림의 값들을 받아서 > 다른 값으로 변환한 새로운 스트림 생성 
		   
		   정렬
		   - sorted()
		   - 중간 파이프
		   - 앞의 스트림의 값들을 받아서 > 정렬된 상태의 새로운 스트림을 생성
		   - 이전 컬렉션의 sort(Comparator)와 동일
		   
		   ----------------------------------------------------------------
		   	  
		   탐색
		   - forEach() 메소드
		   - 최종 파이프
		   - 앞의 스트림의 값들을 받아서 소비 !!
		   
		   매칭
		   - allMatch(), anyMatch(), noneMatch() 
		   - 최종 파이프
		   - a. boolean : allMatch(Predicate:인자값) : 모든 요소가 만족하는가?(&&)
		   - b. boolean : anyMatch(Predicate:인자값) : 일부 요소가 만족하는지?(||)
		   - c. boolean : noneMatch(Predicate)     : 모든 요소가 불만족하는지?    
		   
		   집계, Reduce 
		   - count(), max(), min(), sum(), avg() : 개수 세는거 최대, 최소, 누적, 평균 이런거
		   - 최종 파이프
		   - 앞의 스트림의 값들을 받아서 > 통계값
		   
		   // ★ 최종 파이프의 집계! 값이 하나 나온다.!!!! 

 
		   
		*/
		
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		// m8();
		// m9();
		 m10();
		

	}// main 
	
	private static void m10() {
		
		
		// Optional.of(값); 으로 저장하고
		// op.get(); get()으로 꺼낸다.
		
		Optional<Integer> op = Optional.of(10); // 숫자를 넣을 때 
		// Optional<Integer> op = null; // 이것도 가능하다. 
		System.out.println(op+", "+op.get()); //Optional[10]
		
		
		// Optional<T>
		// - 값형 자료형을 취급하지만 null을 가질 수 있다.
		// - 값형에도 null을 넣고 싶다해서 만든 자료형이다.
		int age = getAge("호호호"); 
		// 만약에 존재하지 않는 사람 조회하면 나이 50살이라 나옴 완전 잘못됨
		// 그런데 얘를 0으로 초기화해도 오해의 소지가 다분하다.
		if( age > 0)
			System.out.println("나이 : " + age);
		else 
			System.out.println("회원이 없어요.");
		
		// 걍 숫자 Integer다 라고 보면 마음에 편하다.
//		Optional<Integer> num = getNum("아무개"); // 리턴 값이 그냥 integer면 안된다.
//		// Optional<Integer> num = getNum("없는사람");
//		if(num.isEmpty())
//			System.out.println("번호 : "+ num.isEmpty());
//		else 
//			// 값이 없으면 isEmpty()로 뽑힌다.
//			System.out.println("번호 : "+ num.get()); // 그 안에 integer가 쏙 뽑힌다.
//		
		// 애매하다... 사용 방법이... 
		
		List<Integer> list = Data.getIntList(0);
		System.out.println(list);
		
		
		
		int max = Integer.MIN_VALUE; // list 안의 모든 숫자들 중에 가장 작은 숫자 - 1
		int min = Integer.MAX_VALUE ; // 가장 큰 숫자 더하기 1
		
		for(int n: list) { // ,,,,,,,,,,,,,
			if( n > max ) {  // 무조건 n이 크겠지?
				max = n;   // .............
			}
			
			if( n < min ) {
				min = n ;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
		// 숫자가 없는것을 고려해서 > List<Integer> list = Data.getIntList(0); 
		// >  이면 값이 없으니까 Optional.empty 반환
		
		System.out.println(list.stream().max((a, b) -> a-b)); // 리턴값이 Optional
		
		// 값이 있으면 Optional[86] 이런식으로 숫자인데 없으면 뭘로 주기 애매해니까 비어있다라는 의사표현함
		// 데이터가 없을 때 >>>>> 결과를 반환하고 싶어 근데 null을 줄까? 아니 int형으로 반환해야 하는데?
		// 최대나 최소를 주기도 하지만 값을 못찾았을 경우도 돌려준다는 것 ]
		
		// ★★★★ Stream으로 결과를 줄 때 옵션이 없으면 Optional.empty도 준다. 
		
	
		// Optional<Integer>
		// - Integer, int 타입과 동일한 자료형
		// - null을 가질 수 있다.
		Optional<Integer> result = list.stream().max( (a, b) -> a - b );
		
		if (result.isPresent()) { // 미리 한번 알수가 있다.
			System.out.println(">"+result.get()); // get으로 뽑아내면 된다. > empty()면 에러난다.
		}
		
		
		// min이나 max 둘다 옵셔녈이다. 
		
		System.out.println("****"+Data.getUserList().stream().max((a, b) -> a.getHeight() - b.getHeight()).get());
		// 유저 한명을 리턴한다.
		System.out.println("****"+Data.getUserList().stream().min((a, b) -> a.getWeight() - b.getWeight()).get());
		// 유저 한명 리턴
		
		// ★ 모든 타입 지원
		// - count(), max(), min() > Stream<T> 
		
		// ★ 숫자 타입 지원
		// -sum(), avg() > IntStream, DoubleStream
		
		// Strema<Integer> > 변환 > IntStream
		// mapToInt는 IntStream을 반환한다. 그래서 mapToInt로 변환하는 작업을 한다. 값은 고대로 들고 말이다.
		System.out.println(Data.getIntList(5).stream().mapToInt( num -> num ).sum()); // sum은 인트형이다.
		
		
		System.out.println(",,,,"+Data.getIntList(5).stream().mapToInt( num -> num ).average()); // 리턴값이 OptionalDouble이다.
		System.out.println(",,,,"+Data.getIntList(5).stream().mapToInt( num -> num ).average().getAsDouble());// 이러면 더블로 꺼내진다. 
		
		
		Data.getUserList().stream().mapToInt(user -> user.getWeight()).forEach(num -> System.out.println(num));
		
		System.out.printf("%.2f",
				//////////////////////////////////////////////////////////////////
				Data.getUserList().stream().filter(user->user.getGender() == 1) // 중간에 필터를 둘 수 있다.
				.mapToInt(user -> user.getWeight()).average().getAsDouble()     //
				////////////////// IntStream으로 바꾸고 ////////////////////////////// 
				);
		// mapToInt는 함수계열
		
		
		
		
	}

	private static Optional<Integer> getNum(String name) {
		
		
		// Optional.empty()는 이건 null이다. 
		// get()으로 값을 꺼낼 수 있다. 
		Optional<Integer> num = Optional.empty(); // null로 초기화가 가능하다. 이게 참조형이라 가능 
		
		if(name.equals("홍길동")) {
			num = Optional.of(10);
		} else if (name.equals("아무개")) {
			num = Optional.of(20); 
		} else if ( name.equals("호호호")) {
			num = Optional.of(30);
		}
		
		return num;
	}

	private static int getAge(String name) {
		//  보고싶은 사람의 이름을 넘겨주면 몇살인지 돌려주는 메서드임
		int age = 50;
		
		if(name.equals("홍길동")) {
			age = 20; 
		} else if (name.equals("아무개")) {
			age = 22; 
		} else if ( name.equals("호호호")) {
			age = 25; 
		} else { //  
		  // age = null; // 마지막 else에 걸리면 null을 돌려주자.
		} // null을 명시적으로 집어넣는 것은 참조형 밖에 못한다.
		
		return age;
		
		
	}

	private static void m9() {
		
		List<Integer> list = Data.getIntList();
		
		System.out.println(list.size());
		System.out.println(list.stream().count()); // long을 반환한다.
		
		long cnt = list.stream()
						.filter(num -> num % 2 == 0 )
						.count();
		
		System.out.println(cnt); 
		              
		// 끝에다가 최종 집계 메서드 붙인다.
		cnt = Data.getUserList().stream().filter(user -> user.getHeight() >= 175).count();
		System.out.println(cnt);
		System.out.println();
		System.out.println();
		
		
		/*< 여기까지 정리 >*/
	
		
		int a = 10;
		System.out.println(a);
		
		int b ; // 안에 아무것도 안넣으면 null상태이다. null을 직접적으로 넣으면 안들어간다.
		// System.out.println(b); // 초기화 안해서 사용 못함. > 지역변수 특징
		// 초기화 시키면 값을 넣는데 null을 넣는다고 시도하면 기본형이라 안들어간다.
		
		// int c = null; //(X) 값형 변순느 반드시 값을 가져야 한다.
		// 참조형 변수는 값을 선택적으로 가질 수 있다.
		// 값형 변수는 반드시 값을 가져아하는데 유의미한 값을 가질 수 있다. 
		// 참조형 변수는 값을 선택적으로 가진다.(주소값 or null) > 암튼 불편해 그래서 만든게 Optional이다.
		
		Student s1;
		// System.out.println(s1); // 그냥 찎으면 에러가 나
		
		Student s2 = null; // 명시적으로 null을 넣을 수 있다. 
		
		// Optional 타입은 몇몇 군데에 쓰이긴 하는데 은근히 편하다.
		
		
		
	}

	private static void m8() {
		
		int[] nums = {2, 4, 6, 8, 10};
		
		boolean result = true;
		
		// 요구사항] 배열안에 짝수만 있는지? 
		for(int n: nums) {
			if (n % 2 == 1) {
				result = false;
				break; // 루프를 더이상 돌필요없다.
			}
		}
	
		if( result ) {
			System.out.println("짝수만 존재");
		} else {
			System.out.println("홀수 발견!!");
		}

		
		
		// 이게 all true면 true를 리턴, 5개의 숫자에 대해서 이 검사를 한다. 
		result = Arrays.stream(nums).allMatch( n -> n % 2 ==0 );
		                      // 모든 요소가 만족할 때
		if( result ) {
			System.out.println("짝수만 존재");
		} else {
			System.out.println("홀수 발견!!");
		}
		
		// 요구사항] nums 안에 홀수가 1개 이상 존재하는지? 
		result = Arrays.stream(nums).anyMatch( n -> n % 2 == 1); 
		// 이 조건을 Yes라고 대답하는 친구가 최소 하나냐?
		System.out.println(result);
		
		// 요구사항] nums 안에 모두 홀수가 아닌가?
		result = Arrays.stream(nums).noneMatch( n -> n % 2 == 1 );
		
		System.out.println(result);
		
		
		
		System.out.println(Data.getUserList());
		System.out.println();
		System.out.println(Data.getUserList());
		// 몇명인지가 궁금하지 않아 그냥 키큰 사람이 있어요???? Any Match
		result = Data.getUserList().stream().anyMatch(user -> user.getHeight() >= 180);
		System.out.println(result);
		
		result = Data.getUserList().stream().allMatch( user -> user.getGender() == 1);
		System.out.println(result);
		
		result = Data.getUserList().stream()
				.filter( user->user.getHeight() >= 180) // 필터는 엘리먼트를 아웃풋으로 보낸다.
				.allMatch(user -> user.getGender() == 1); // Match류는 boolean리턴
		System.out.println(result);
		
		result = Data.getUserList().stream()
				                   .noneMatch(user -> user.getWeight() < 60);
		System.out.println(result); // 60kg이하 없지? 네!
		
	}

	private static void m7() {
		
		Data.getIntList(10).stream()
		                   .forEach( num -> System.out.println(num) );
		System.out.println();
		
		Data.getIntList(10).stream()
		                   .sorted() // 중간 필터다 sorted
		                   .forEach( num->System.out.println(num) );
		System.out.println();
		
		
		Data.getIntList(10).stream()
						   .sorted( (a, b) -> b - a) 
	    // 이전의 sort() 메서드가 여기서는 sorted()라고 바뀌었다.
						   .forEach(num -> System.out.println(num));
		System.out.println();
		
		
		// Sort할 때 2차 정렬 안된다.  
		Data.getItemList().stream()
						  .sorted( (a, b) -> a.getName().compareTo(b.getName()) ) // 얘는 뭘 기준으로 정렬하는지 몰라> 그래서 이 안에 정렬조건을 개입해라
		//> 2차정렬 x // .sorted( (a, b) -> a.getSize() - b.getSize() ) // 이렇게하면 이름도 엉망됨 이건 사이즈로만 정렬됨> 앞의 상태를 보존하지 않음 > 자기가 다시 사이즈로 정렬 
						  .forEach(item -> System.out.println(item));
		System.out.println();
		
		
		List<Integer> list = Data.getIntList(10);
		System.out.println(list);
		
		Collections.sort(list);                 // 오름차순
		Collections.sort(list, ( a, b)-> b - a); // 내림차순
		
		list.sort((a,b) -> a-b );               // 오름차순
		list.sort((a,b) -> b-a );               // 내림차순
		
		//  ---------- 이걸 쓰는 경우도 ----- 있다.
		list.sort(Comparator.naturalOrder());   // 오름차순 > 람다 객체랑 같다.
		list.sort(Comparator.reverseOrder());   // 내림차순 > 객체
		
			
		
		
		// distinct(), filter(), sorted() 세개 다쓴다. 
		Data.getIntList().stream()
						 .distinct()
						 .filter( n -> n % 2 ==0) // true / false
						 .sorted()
						 .forEach(n ->System.out.println(n));
		
		
		Boolean answer = list.stream().allMatch( a -> a> 0 ); // 모두 되는가 
		Boolean answer2 = list.stream().anyMatch( a -> a < 0 ); // 하나라도 매칭되나?
		Boolean answer3 = list.stream().noneMatch( a -> a < 0 ); // 하나도 안되는가
		System.out.println(">"+answer+", "+answer2+","+answer3);
		
		
		
		// 최종파이프다. 
		// AllMatch()
		// AnyMatch()
		// NoneMatch()
		
		
	}

	private static void m6() {
		List<String> list = Data.getStringList(10);
		
		
		System.out.println(list);
		System.out.println();
		
		list.stream()
			.forEach(word -> System.out.println(word.length()));
		System.out.println();
		
		list.stream()     //Stream<String> 원본
			.map( word -> word.length()) //String<Integer> Output
			.forEach(num -> System.out.printf("%3d", num)); //결국 %d > 숫자를 for문을 돌렸다.
		                         // 그 길이만을 모아서 integer Stream을 모았다.
		// 그래서 얘를 변환 파이프라고 한 것 앞에는 온데간데 사라진다.
		// 문자열 가공, 문자열은 버리고 숫자만 남긴다.
		System.out.println();
		
		
		// map은 결과값 고대로 다음 파이프의 인풋으로 준다. 
		
		
		list.stream()
			.map(word -> word.substring(0, 2)) //  타입 변환을 할 수가 있다.
			.forEach(word -> System.out.printf("%4s", word));
		System.out.println();
		
		String[] names = {"홍길동", "유재석", "박명수", "박나래", "장도연"};
		
		// 순수 배열이면 
		Arrays.stream(names)
			  .map(name -> name.substring(1)) // 근데 타입 변환 안해도 된다.
			  .forEach(name-> System.out.printf("%4s", name));
		
		System.out.println();
		
		for(int i=0; i<names.length; i++) {
			// 홍 길동
			String firstName = names[i].substring(1);   // 이름
			String lastName = names[i].substring(0, 1); // 성
			Name name = new Name();
			name.setFirstName(firstName);
			name.setLastName(lastName);
			
			System.out.println(name.getFirstName() + ", " + name.getLastName());
		}
		
		// Arrays.stream() 
		Arrays.stream(names)
			  .map(name -> {
				 String firstName = name.substring(1);   // 이름
				 String lastName = name.substring(0, 1); // 성
				 Name n = new Name();                     ////////// 이거
				 n.setFirstName(firstName);
				 n.setLastName(lastName);
				 return n;
			  }).forEach(name -> {
				  System.out.println(name.getFirstName() + "," + name.getLastName());
			  });
		
		System.out.println();
		
		
		Data.getIntList(5)
		.stream()
		.map( num -> 1) // 어떤 숫자가 와도 1로 변환한 것이다. 이건 상수 변환꼴이다. 어떤 값이 와도 고정된 상수하나를 돌려줌
		.forEach(n -> System.out.println(n)); // 뭔가 변환을 했는데 쓸모가 없는 맵핑
		
		System.out.println();
		
		Data.getUserList().stream()
						  .forEach(user -> System.out.println(user.getName()));
		
		System.out.println();
		
		Data.getUserList().stream()
						  .map( user -> user.getName() ) // 이름만 넘어온다.
						  .forEach( name-> System.out.println(name));
			                     // 이름을 받고          이름을 출력
		System.out.println();    // 책임의 소재를 컨트롤 한다.
		// 원하면 그대로, 가공을 하면 가공한대로
		
		
	}

	private static void m5() {
		List<Integer> list = Data.getIntList();
		System.out.println(list.size());
		
		// 요구사항] 집합에서 중복값 > 유일한값들을 출력하시오.
		// System.out.println(list);
		
		//Case 1.
		Set<Integer> set = new HashSet<Integer>(); // 껍데기는 부모 인터페이스 
		
		for(int n : list) { // 100개
			set.add(n);     // 중복값 배제
		}                   
		System.out.println(set.size()); // 61개 > 중복되지 않은 개수
		System.out.println(set);
		System.out.println();
		
		
		//Case 2.
		// - ArrayList > (변환) > HashSet
		Set<Integer> set2 = new HashSet<Integer>(list); // Collection을 달라지만 결국은
		                    // ArrayList나 LinkedList를 넣어도 되는 것이다.
		// ArrayList나 LinkedList를 HashSet의 생성자로 넣는다. 단 제네릭은 맞추고
		
		System.out.println(set2);
		System.out.println();
		
		//Case 3.
		list.stream()
				.distinct() // 중복값 제거> 필터 
				.forEach(num -> System.out.printf("%4d", num));
		
		System.out.println();
		
		Data.getStringList().stream()
						    .filter( word -> word.length() > 5 )
						    .distinct()                  // 중간 파이프를 낌
						    .forEach( word -> System.out.println(word));
		
		System.out.println("-------------");
		
		Data.getStringList().stream()
		.distinct()                  // 중간 파이프인데 순서 상관없다 어차피 function 이라
	    .filter( word -> word.length() > 5 )
	    .forEach( word -> System.out.println(word));
		System.out.println();
		
		// 경품행사
		// 1등 - 홍길동
		// 2등 - 아무개
		// 3등 - 홍길동
		// 4등 - 하하하
		// 5등 - 호호호
		
		// 당첨자 명단 > 홍길동, 아무개, 홍길동, 하하하, 호호호
		//          > 홍길동, 아무개, 하하하, 호호호 
		
		List<Student> slist = new ArrayList<Student>();
		slist.add(new Student("가가가", 20, "남자"));
		slist.add(new Student("나나나", 20, "남자"));
		slist.add(new Student("다다다", 20, "남자"));
		slist.add(new Student("홍길동", 20, "남자"));
		slist.add(new Student("홍길동", 20, "남자"));
		
		
		// hashCode()와 equals() 정의 유무가 중요하다. 
		
		slist.stream()   // hashCode(), equals()를 정의를 안하면 5개가 나온다.
			 .distinct() // hashCode(), equals()를 정의해야 distinct로 구별이 된다.
			 	         // hashCode(), equals()를 정의하면 4개가 나온다.
			 .forEach(s -> System.out.println(s));
		
		System.out.println();
	}

	private static void m4() {
		 
		List<Integer> list = Data.getIntList(20);
		System.out.println(list);
		
		//요구사항] 짝수만 화면에 출력하시오.
		
		// 1. for
		for(int i=0; i< list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				System.out.printf("%4d", list.get(i));
			}
		}
		System.out.println();
		
		//2. for 
		for(int n : list) {
			if(n % 2 == 0) {
				System.out.printf("%4d", n);
			}
		}
		System.out.println();
		
		//3. stream
		list.stream().forEach(num -> {
			if(num  % 2 == 0) {
				System.out.printf("%4d", num);
			}
		});
		System.out.println();
		
		//4. stream
		// -filter > 반환값 stream Integer를 반환 이러면 얘는 중간 파이프다. 		
		list.stream().filter(num -> { // int stream인데
		// ----- 이 필터가 미리 걸러주는 역할이다. -------> 중간 파이프다. 걸러주는 용도. 스트림 반환
			if(num % 2 == 0) {
				return true;
			} else {
				return false;
			}
		// ---------------------------------------------
		}).forEach( num -> System.out.printf("%4d", num) );
		// forEach는 앞의 스트림을 받아서 소비한다.
		
		System.out.println();
							// 여긴 function의 test가 들간다. 
		list.stream().filter( num -> num % 2==0 ).forEach(num-> System.out.printf("%4d", num) );
		System.out.println();
		
		list.stream()
		.filter( n -> n % 2 ==0 && n >= 50 ) // 중첩 검사인데
		.forEach(num -> System.out.printf("%4d", num));
		
		list.stream()
		.filter( num -> num % 2== 0 ) // 하나의 필터
		.filter( num -> num >= 50 )   // 하나의 검사 -> 가독성이 좋아진다. 
		.forEach( num -> System.out.printf("%4d", num) );
		
		// ★ 중간 파이프는 연속적으로 스트림을 반환한다. 그래서 계속 붙여도 되긴함
		System.out.println();
		System.out.println();
		Data.getStringList().stream() // 중간에 filter를 넣어보자.
							.filter(word -> word.length() >= 5) // 단어의 길이가 5글자 이상
							.filter(word->word.startsWith("애플")) // 필터 두개를 연속으로 걸었다. 
							.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		
		// 중간 파이프를 또 여러번 쓸 쑤 있다. 
		Data.getUserList().stream()
							.filter(user -> user.getGender() == 1)
							.filter(user -> user.getHeight() >= 180)
							.filter(user -> user.getWeight() >= 80)
							.forEach(user -> System.out.println(user));
		// 중간 파이프를 또 여러번 쓸 쑤 있다.
		System.out.println();
		
		
		
	}

	private static void m3() {
		// 스트림을 얻어오는 방법
		// - Stream() /OOO/OOO 메소드를 사용한다.
		// 1. 컬랙션으로부터
		// 2. 배열로부터
		//---------------------
		// 3. 숫자범위로부터
		// 4. 파일로부터
		// 5. 디렉토리로부터
		
		// 1. 컬랙션으로부터
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		nums1.add(100);
		nums1.add(200);
		nums1.add(300);
		
		nums1.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		LinkedList<Integer> nums2 = new LinkedList<Integer>();
		nums2.add(1000);
		nums2.add(2000);
		nums2.add(3000);
		
		// ★★ 지역변수에 있는 변수명만 쓰지 마라
		nums2.stream().forEach( num->System.out.println());
		
		
		// ★★ HashSet도 stream이 있다. 
		Set<Integer> nums3 = new HashSet<Integer>();
		nums3.add(10000);
		nums3.add(20000);
		nums3.add(30000);
		
		nums3.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		//HashMap<String, Integer> map; // 이친구는 stream이 없다.
		//map.stream() ; 없다 에러다.
		//map.entrySet().stream() // 이건 된다. 억지로라도 하는건데...
		
		// 2. 배열로부터는 stream을 얻지 못한다.
		int[] nums4 = {111, 222, 333, 444, 555, 666}; //
		
		// Arrays라는 것을 통해 스트림을 얻고 그 인자값으로 얻는다.
		Arrays.stream(nums4); // 여기엔 stream이 있다.
		Arrays.stream(nums4).forEach( num -> System.out.println(num) ); 
		// 내부적으로 intConsumer로 들어가있다. / 범용 Consumer가 아니다.
		
		
		//3. 숫자범위로부터
		// - Stream<T>: 범용 스트림
		// - IntStream: 전용 스트림
		IntStream.range(1, 11);// 시작값 포함, 시작값 포함x
		// - Int Stream을 반환

		IntStream.range(1, 11).forEach(num -> System.out.println(num) );
		// 1 ~ 10 까지 찍힌다.
		System.out.println();
		// 파이썬의 느낌이다.
		
		// DoubleStream. 실수는 range가 없다.
		
		//4. 파일로부터 얻어내는 것
		// - 파일 읽기
		// ★ 파일 내용에 대해 스트림
		// ★ 파일들에 대한 스트림으로 출력
		try {
			
			Path path = Paths.get(".\\dat\\user.txt"); // 우리가 읽고 싶은 곳의 경로가 있다.
			Files.lines(path).forEach(line -> System.out.println(line));
			// Files.lines // 파일들 읽은것에 대한 
			
			System.out.println();
			
			//5. 디렉토리로부터
			// - 목록보기 > dir.listFiles()
			Path dir = Paths.get("c:\\class\\dev\\eclipse");
			Files.list(dir).forEach( p-> {
				System.out.println(p.getFileName());
				System.out.println(p.toFile().length()); 
				// Path객체는 length()가 없다. 그래서 toFile()을 
				// 가져와서 파일객체로 접근하여 length()를 출력
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
 	}

	private static void m2() { // Consumer 예제만 있네 
		
		// 배열(컬랙션) 탐색
		List<Integer> list = Data.getIntList(10);
		
		//1. for문 (while문)
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%5d", list.get(i));
		}
		System.out.println(); // 가장 많이 쓰고 가장 무난한 탐색
		
		 //2. 향상된 for문
		// - 다른 언어에선 forEach라 적는다.
		for(int n : list) {
			System.out.printf("%5d", n);
		}
		System.out.println();
		
		//3. Iterator 
		Iterator<Integer> it= list.iterator();
		
			
		while(it.hasNext()) {
//			Integer n = it.next();
			System.out.printf("%5d", it.next());
		}
		
		//4. stream // stream이라는 이름의 메서드가 나온다. > 리스트에 Stream이라는 메서드가 있다. 
		Stream<Integer> stream = list.stream(); //****
		
		System.out.println(stream); //java.util.stream.ReferencePipeline$Head@2ed94a8b
		
		// 제네렉에 맞는 Consumer 생성 > 왜 여기에 Consumer를 넣었나? 
		Consumer<Integer> c1 = num -> System.out.println(num);
		c1.accept(10); // 하나  
		
		
		List<Integer> myList = new ArrayList();
		
		for(int i=0 ; i< 10; i++) {
			myList.add((int)(Math.random()*20)+1 );
		}
		
		myList.forEach( num -> System.out.println(num) );
		
		stream.forEach(c1); 
		// Consumer<? super T> 를 달래...
		// 배열 안에 데이터를 하나씩 탐색하는 메서드다. 
		// stream 자체가 list의 stream()을 받음
		// list니까 요소마다 돈다. 즉 이 요소의 값을
		// Consumer라는 함수에 돌아가서 동작된 것
		// *** forEach 메소드의 행동
		// 1. stream > 배열(컬랙션)으로부터 데이터 집합을 '공급'받는다.
		// 이렇게 공급받은 것을 forEach라는 메서드가 하나씩 fetch한다. 가져온다.!!
		// 2. forEach > 공급받은 데이터를 하나씩 처리
		// 3. Consumer > forEach가 하나씩 꺼내온 데이터를 스스로 처리(X) > 컨슈머에게 전달+처리
		
		//	34	c1.accept(34); // 하나
		//	21	c1.accept(21); // 하나
		//	11	c1.accept(11); // 하나
		//	24	c1.accept(24); // 하나
		//	19	c1.accept(19); // 하나
		//	9	c1.accept(9);  // 하나
		//	2	c1.accept(2);  // 하나
		//	19	c1.accept(19); // 하나
		//	80	c1.accept(80); // 하나
		//	17	c1.accept(17); // 하나
		System.out.println();
		
		List<Double> list2 = Data.getDoubleList(10);
		Stream<Double> stream2 = list2.stream();
		Consumer<Double> c2 = num -> System.out.println(num);
		
		stream2.forEach(c2); // 
		// list의 stream();
		// stream().forEach(객체); 
		System.out.println();
		
		// 변수를 안만든다. > 메소드 체인으로 
		// - 메소드의 반환값에 바로 또 다른 메소드를 연결시킨 모습
		// - 함수형 프로그래밍 방식
		Data.getDoubleList(10).stream().forEach(c2);
		Data.getDoubleList(10).stream().forEach(num -> System.out.println(num));
		
		Data.getStringList(10)
				.stream()
				.forEach(txt->System.out.println(txt));
		
		Data.getStringList(10)
				.stream()
				.forEach(txt->System.out.println(txt.length()));
		
		Data.getUserList()
				.stream()
				.forEach(user->{
					System.out.println("이름 : "+user.getName());
					System.out.println("나이 : "+user.getAge());
					System.out.println();
				});
		
		
	}

	
	
	
	private static void m1() {
		
		int[] nums1 = Data.getIntArray();
		System.out.println(Arrays.toString(nums1));
		
		int[] nums2 = Data.getIntArray(10);
		System.out.println(Arrays.toString(nums2));
		
		ArrayList<Integer> list1 = (ArrayList<Integer>) Data.getIntList();
		
		List<Integer> list2= Data.getIntList();
		
		System.out.println(list2);
		
		String[] txt1 = Data.getStringArray();
		System.out.println(Arrays.toString(txt1));
		
		
		User[] ulist = Data.getUserArray(); // com.test.data user
		System.out.println(Arrays.toString(ulist));
		
		// 데이터 만들기 귀찮으니까 미리 만들어놓은 것
		Item[] ilist = Data.getItemArray();
		System.out.println(Arrays.toString(ilist));
	
		//*** 인터페이스를 구현한 클래스의 객체를 담을 참조 변수.
		//1. 자기 타입의 클래스 변수 
		//2. 부모 타입의 인터페이스 변수 : 이걸 굉장히 많이 쓴다.
		
		//BB a1 = new BB(); // 
		//AA a2 = new BB(); //
	}

}


class Name {
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
