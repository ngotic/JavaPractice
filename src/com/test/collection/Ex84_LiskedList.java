package com.test.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex84_LiskedList {
	public static void main(String[] args) {
		
		/*
		 
		 Collection(I) < List(I) < ArrayList(C), LinkedList(C)
		 
		 [ArrayList vs LinkedList] : 그냥 배열이다. 
		 - 사용법 아주 유사
		 - 내부 구조가 다르다. > 사용 용도가 다르다.
		 
		 ArrayList
		 - 순차적인 데이터 추가/삭제 
		 - 탐색 위주 작업
		 
		 LinkedList
		 - 중간 데이터 추가/삭제
		 LinkedList 종류
		 1. LinkedList : 단방향 탐색
		 2. Double LinkedList : 양방향 탐색
		 3. Double Circular LinkedList : 순환 구조 탐색을 만든 것이다. 더 계량이 된 것
		 // > 자바의 LinkedList가 얘다. 자바는 Double Circular LinkedList를 구현한 것이다.
		 
		 
		 
		 * 접근은 배열이 가장 빠르다.
		 * 
		*/
		// m1();
		m2();
	}

	private static void m2() {
		
		// ArrayList vs LinkedList 속도 비교(능률) : 어떤 작업이 어떤 컬랙션이 효과를 보는지
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		long begin = 0, end =0;
		
		System.out.println("1. 순차적으로 데이터 추가하기");
		
		begin = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			list1.add(i); // 내부적으로 더블링이 생기긴한다.
		} // 비교대상이 없다. 빠른지 느린지는 모르겠다.
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);

		
		begin = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			list2.add(i); // 내부적으로 더블링이 생기긴한다.
		} // 비교대상이 없다. 빠른지 느린지는 모르겠다.
		
		end = System.currentTimeMillis();
		// LinkedList가 4배정도 더 오래 걸린다. 링크드 리스트는 연결하고 참조값 건드리는 것들이있다. 
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);

		// 2. 중간에 데이터 추가하기, Insert
		System.out.println("2. 중간에 데이터 추가하기 ");
		
		begin = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			list1.add(0, i); // 내부적으로 더블링이 생기긴한다.
		} // 비교대상이 없다. 빠른지 느린지는 모르겠다.
		end = System.currentTimeMillis(); 
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);

		begin = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			list2.add(0, i); // 내부적으로 더블링이 생기긴한다.
		} // 비교대상이 없다. 빠른지 느린지는 모르겠다.
		
		end = System.currentTimeMillis();
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		
		
		
		// 3. 중간에 있는 데이터 삭제하기
		System.out.println("3. 중간에 있는 데이터 삭제하기");
		begin = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			list1.remove(i); // 내부적으로 더블링이 생기긴한다.
		} // 비교대상이 없다. 빠른지 느린지는 모르겠다.
		end = System.currentTimeMillis(); 
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		begin = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			list2.remove(i); // 내부적으로 더블링이 생기긴한다.
		} // 비교대상이 없다. 빠른지 느린지는 모르겠다.
		end = System.currentTimeMillis();
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		
		// 4. 순차적인 데이터 삭제하기
		System.out.println("4. 순차적인 데이터 삭제하기");
		begin = System.currentTimeMillis();
		for(int i=list1.size()-1; i>=0; i--) {
			list1.remove(i); // 내부적으로 더블링이 생기긴한다.
		} // 비교대상이 없다. 빠른지 느린지는 모르겠다.
		end = System.currentTimeMillis(); 
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		
		begin = System.currentTimeMillis();
		for(int i=list2.size()-1; i>=0; i--) {
			list2.remove(i); // 내부적으로 더블링이 생기긴한다.
		} // 비교대상이 없다. 빠른지 느린지는 모르겠다.
		end = System.currentTimeMillis(); 
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		
	}

	private static void m1() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		 
		list1.add(100);
		list1.add(100);
		list1.add(100);
		System.out.println(list1.size());
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		LinkedList<Integer> list2 = new LinkedList<Integer>(); 
		// 큐를 구현하는 애라서 peek(), poll(), pop() 등이 있다.
		
		list2.add(100);
		list2.add(200);
		list2.add(300);
		
		System.out.println(list2.size());
		
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		// ArrayList와 LinkedList와 쓰는 메서드가 거의 동일하다. 
		

	
	}
}
