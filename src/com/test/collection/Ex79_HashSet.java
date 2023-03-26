package com.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Ex79_HashSet {

	public static void main(String[] args) {
		//
		/*
		 * 컬랙션 1. List 계열 - 숫자가 있는 집합 - 첨자(방번호) - 데이터 중복을 허용한다. 
		 * 2. Map 계열 
		 * - 순서가 없는 집합 
		 * - 키 
		 * - 데이터 중복을 허용한다. 
		 * 3. Set 계열 
		 * - 순서가 없는 집합 
		 * - 식별자가 없다.(방번호x, 방이름x) 방과 방을 구분할 수 없다. 
		 * - 데이터 중복을 허용하지 않는다.
		 */
		m1();
		// m2();
	}

	private static void m2() {
		
		// 로또 번호 > 중복되지 않는 난수
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		System.out.println(lotto);
		
		for(int i=0; i<6; i++) {
			int n = (int)(Math.random() * 45) + 1;
			boolean flag = false;
			for(int j=0; j < i; j++) {
				if(lotto.get(j) == n) {
					flag =true;
					break;
				}
			}
			if(!flag) {
				lotto.add(n);
			} else {
				i--; // 인덱스를 감소시키는 기술
			}
//			if(lotto.contains(n)) {
//				lotto.add(n);
//			} else {
//				i--; // 루프를 한바퀴 더돈다.
//			}
		}
		
		System.out.println(lotto);
		
		Collections.sort(lotto);
		System.out.println("정렬 후 :"+lotto);
		
		
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		
		// 이게 현재로서는 가장 적은 코드이다. 
		while( lotto2.size() < 6 ) {
			int n = (int)(Math.random() * 45) +1;
			lotto2.add(n);
//			if (lotto2.size() == 6) {
//				break;
//			}
		}
		
		// Arrays는 순수 배열에 대한 유틸
		// Collections 라는 유틸클래스가 있다. 
		// 얘는 Collection 관련 객체를 다룸
		System.out.println("SET은 순서가 없어서 정렬이 불가능하다.");
		
		// SET : 정렬 :> 그 자체론 못함
		// Set을 List로 변환 후 정렬 
		System.out.println("Set  : "+lotto2);
		
		ArrayList<Integer> lotto3 = new ArrayList<>(lotto2); // 여기에 Set을 넣을 수 있다.
		
		System.out.println("List : "+lotto2); // 이러면 얘를 정렬가능
		
		Collections.sort(lotto3); // 인플레이스
		System.out.println("List :> 정렬 후 : "+lotto3); // 이러면 얘를 정렬가능
		
		// TreeSet은 ....  
		
		// 롯데마트 > 경품 행사
		// 1등 : 아이패드
		// 2등 : 에어팟
		// 3등 : 참치세트
		// 4등 : 김세트
		// 5등 : 맥스봉
		
		String [] list = {"홍길동","아무개","하하하","호호호", "후후후",
				          "유재석","강호동","박명수","정형돈","조세호"};
		
		// 추첨
		// 1. 중복 당첨 허용(O) > ArrayList
		// 2. 중복 당첨 허용(X) > HashSet
		for(int i=0; i<5; i++) {
			System.out.println(list[(int)(Math.random() * 10)]);
		}
		System.out.println();
	}

	private static void m1() {

		// 수료 + 취업 > 업무 적응(1~2년) > 개발 > 알고리즘, 자료구조, 디자인패턴 공부
		HashSet<String> set = new HashSet<String>();

		// 1. 요소 추가하기
		set.add("사과");
		set.add("딸기");
		set.add("바나나");

		// 2. 요소 개수
		System.out.println(set.size());

		// 3. 덤프
		System.out.println(set);

		// 4. 중복된 값 추가하기
		boolean result = set.add("사과"); // 안들어감(기존에 사과가 있어서...)
		System.out.println("*"+result);  // > false 리턴 

		System.out.println(set);

		// List를 물려받음 ArrayList는 add 무조건 true
		// Set은 boolean 필요 Set
		ArrayList<String> list = new ArrayList<String>();
		// > 해쉬셋에 불리언을 넣기 위해 ArrayList에 되물림이 된다.

		// list.add("사과"); // add 실패할 일?? 없는데 왜 true인데??
		// ArrayList와 HashSet이 부모가 같다.
		// 그래서

		// 5. 검색
		System.out.println(set.contains("사과"));

		// 6. 삭제
		set.remove("사과");
		System.out.println(set);

		// 7. 요소 읽기??? > 탐색 통해서
		for (String item : set) { // for문을 시작할때 이터레이터를 생성한다.
			System.out.println(item);
		}

		for (String item : set) { // for문을 시작할때 이터레이터를 생성한다.
			System.out.println(item);
		}

		// 이터레이터 > 데이터 집합을 탐색하는 도구 > 탐색기
		Iterator<String> iter = set.iterator(); // 이터레이터를 호출하면 객체 하나를 떤져준다.
		// *** 끝까지 읽고 나면 다시 읽을 수 없다.
		// 이 모습이 향상된 for문과 비슷하다. 향상된 for문 안에는 iterator가 숨어있다.
		while (iter.hasNext()) {
			System.out.println(": "+iter.next());
		} ///////////////////////

		iter = set.iterator(); // >> 이터레이터를 다시 생성하면 화살표는 다시 처음에서 시작

		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		
		System.out.println(iter.hasNext());  
        // >> 데이터가 있는 것보다 한번더 호출시 에러난다.
		System.out.println(iter.next()); // 에러처리 >> NoSuchElementException

	}

}
