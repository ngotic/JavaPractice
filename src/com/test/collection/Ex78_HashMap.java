package com.test.collection;
import java.util.*;
import java.util.Map.Entry;


public class Ex78_HashMap {

	public static void main(String[] args) {
		/*
		  면접 질문
		  - ArrayList vs HashMap 
		  - List vs Map
		  - ArrayList(C) > List(I) > 결국 비슷한데 인터페이스, 클래스
		  - HashMap(C) > Map(I)
		  
		  ArrayList 
		  - 요소접근 > 첨자( index ) 사용
		  - list[0], list[1], list[2] 방의 번호로 수많은 방을 접근 
		  - 방에다 숫자를 붙여서 구분
		  - 순서가 있는 데이터 집합(방번호 == 요소의 순서)
		  - 방번호 > 루프 적용이 쉽다.
		  - 방번호 > 의미를 알기 힘들다.
		  - 요소 > 첨자(index) + 값(value)
		  - 첨자(index)는 유일하다.
		  - 값(value)는 중복이 가능하다.  > 방번호가 유일해서 
		  
		  HashMap 
		  - 요소접근 > 키(Key) 사용
		  - list["햇님"], list["달님"], list["별님"] : 방을 구분하는 식별자가 있다. 
		  - 방의 이름을 붙여서 구분 -> 이름은 key!
		  - 순서가 없는 데이터 집합 > 방번호가 없음 > 순서를 알 수 없다.
		  - ex) 햇님방, 달님방, 별님반
		  - 방이름 > 의미 명확해서 찾아가기가 쉽고 요소 다르기가 편하다. 
		  - 하지만 방이름이 이래서 > 루프를 돌기 애매하다.
		  - 요소 > 키(Key) + 값(Value)  
		  - 키(Key)는 유일하다. 
		  - 값(value)은 중복이 가능하다 > 키가 유일해서...
		 */
		//m1();
		m2();
		//m3();
	}

	private static void m3() {
		HashMap<String, String> map = new HashMap<String, String>();
		
		//1. 요소 추가하기
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		
		//HashMap을 루프 탐색하기
		// *** 차라리 ArrayList를 사용해라! > 아래처럼 절대로 사용하지 마라!! 
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		
		map2.put(0, "빨강");
		map2.put(1, "노랑");
		map2.put(2, "파랑");

		System.out.println(map2.get(0));
		
		for(int i=0; i<3; i++) {
			System.out.println("for문 :"+map2.get(i));
		}// 근데 이방법은 좋지 않다. 이럴거면 ArrayList를 쓰지 ...
		//                     번호로 방을 구분?을 왜함? ↑
		
		// 키로 들어가는 것은 문자열 만한게 없다.
		// 평생 데이터를 딱 2개만 가질 수 있다. 이건 별로야 그래서  
		HashMap<Boolean, String> map3 = new HashMap<Boolean, String>();
		
		map3.put(true, "홍길동");
		map3.put(false, "아무개");
		// map3.put(true, null);
		
		// HashMap을 루프 탐색하기 > 
		Set<String> set = map.keySet(); 
		// keySet은 키값들만 모아놓은 배열을 반환한다. Set이라는 형태로 반환하는 것이다.
		
		// 얘는 for문을 돌릴 수가 있다. 향상된 for문, 일반 for문은 못돌린다. 향상된 친구만 돌려
		for(String item : set) {
			System.out.println(item);
		}
		
		Collection<String> values = map.values();// 값들만 모아놓은 배열
		for(String value : values) {
			System.out.println(value);
		}
		
		System.out.println();
		
		Set<String> set2 = map.keySet(); // 이렇게하면 HashMap도 뻉뻉이가 가능하다.
		
		// > keySet으로 key받고, 그걸고 get으로 접근 
		
		for(String item : set2) {
			System.out.println(item + ":" + map.get(item));
		}
		
		System.out.println();
		
		// HashMap은 이렇게 뺑뱅이 돌려고 만든 배열이 아니야. 이건 억지로 무리를 하는 것이다.
		// import java.util.Map.Entry;
		
		// HashMap을 탐색하는 가장 정석이자 권장하는 방법//////////////////////////
		Set< Entry<String, String> > eset = map.entrySet();
		
		for(Entry<String, String> item : eset) {
			System.out.println(item.getKey() + " : " + item.getValue());
		}//////////////////////////////////////////////////////////////
	
		
	}

	private static void m2() {
		// HashMap 사용법
		HashMap<String, String> map = new HashMap<String, String>();
		
		//1. 요소 추가하기
		
		System.out.println(map.remove("빨강"));  // null 출력 
		// 없는 요소를 지우려고 할 때 null을 반환
		
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		map.put("black", "빨강");
		map.put("dak", "노랑");
		map.put("dsf", "파랑");
		System.out.println(map);
		
		//2. 요소 개수
		System.out.println(map.size());
		
		//3. 요소 읽기
		System.out.println(map.get("red"));
		System.out.println(map.get("yellow")); // "노랑"
		System.out.println(map.get("blue"));
		
		//4. 요소 수정 >        HashMap은 
		// 키(Key)는 유일하다. > 같은 키면 수정이라는 의미로 받아들인다.! 
		map.put("yellow", "샛노랑"); // ★ 이러면 덮어쓴다. 
		System.out.println(map.get("yellow")); // "셋노랑"
		
		//5. 요소 검색
		// - contains - 키를 가지고, 값을 가지고 찾는다.
		System.out.println(map.containsKey("yellow")); //true
		System.out.println(map.containsValue("노랑"));  //false
		
		//6. 요소 삭제
		map.remove("yellow"); // key를 가지고 삭제한다.
		
		System.out.println(map.size()); //2
		
		
		System.out.println(map.get("yellow")); // null 
		// ★ 없는 key요청 > null
		// map 계열은 없는 애 요청햐도 에러가 안난다. ★
		
		//7. 초기화
		map.clear();
		
		System.out.println(map.size()); // 0 
		
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		
		// toString Override 되어 있다. 
		System.out.println(map); // 방번호 없다. 순서 X
		// {red=빨강, blue=파랑, yellow=노랑}
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("빨강");
		list.add("노랑");
		list.add("파랑");
		System.out.println(list); // 방번호 있다. 순서 O
		// [빨강, 노랑, 파랑]
		// ★ 순서가 있다. 애초에 순서를 지키고 싶다면 HashMap을 쓰지 마라...
		
		
		map.clear();
		System.out.println(map.isEmpty()); //true
		
	}

	private static void m1() {
		// 요구사항] 학생 1명의 국, 영, 수 점수 저장
		// 1. 각각의 변수
		// 2. 배열
		// 3. ArrayList
		// 4. Class
		// 5. HashMap
		
		
		// 배열       vs ArrayList
		// - 길이 고정 vs 가변
		
		
		// 1. 간편함. 비권장
		int kor = 100;
		int eng = 90;
		int math = 80;
		
		//2. 배열, 집합, 과목 모호..
		int[] score = new int[3];
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		
		//3. 배열, 집합, 과목 모호...
		ArrayList<Integer> score2 = new ArrayList<Integer>();
		score2.add(100);   //score2.get(0)
		score2.add(90);    //score2.get(1)
		score2.add(80);    //score2.get(2)
		
		//4. 클래스, 집합, 과목 명확!! 
		Score score3 = new Score(); 
		// 클래스 설계 자체도 비용이 발생한 것
		score3.kor  = 100;
		score3.eng  = 90;
		score3.math = 80;
		
		//5. HashMap > 클래스를 만드는 추가비용 없이 바로 저장
		HashMap<String , Integer> score4 = new HashMap<String, Integer>();
		score4.put("국어", 100);
		score4.put("영어", 90);
		score4.put("수학", 80);
		
		System.out.println(score4.get("국어"));
		System.out.println(score4.get("영어"));
		System.out.println(score4.get("수학"));
		
		//HashMap으로 하면 안되나? X
		HashMap<String ,Integer> score5 = new HashMap<String, Integer>();
		score5.put("국어", 99);
		score5.put("영어", 88);
		score5.put("수힉", 77); // 수힉? 오타가 생길수 있다 
		// 이러한 포맷을 계속 써야 하니까 
		
		
		// 요구사항 ] 학생 1명(***)의 국, 영, 수 저장 > HashMap
		// 요구사항] 학생 100명의 국,영,수 저장> Class 다량으로 만들려면 무조건 Class
		
		// 이럴 땐 HashMap이 편하다.
		// 요구사항 ] 캠핑 > 경험 > 텐트장비 ~ 300만원 > 1박
		
	}
}

class Score {
	public int kor;
	public int eng;
	public int math;
}

