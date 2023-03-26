package com.test.collection;

import java.util.TreeSet;

public class Ex85_TreeSet {

	public static void main(String[] args) {
		/*
		  
		  ArrayList > Array 구조 + List 사용법
		  LinkedList > Linked 구조 + List 사용법
		  
		  HashSet    > Hash 구조 + Set 사용법
		  TreeSet    > Tree 구조 + Set 사용법
		  
		  HashMap    > Hash 구조 + Map 사용법
		  TreeMap    > Tree 구조 + Map 사용법
		  
		  TreeSet 
		  - 이진 탐색 트리 구조(Binary Search Tree) 구조
		  - 자동 정렬되어 있다.
		  
		 */
		m1();
	}

	private static void m1() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(5);
		set.add(1);
		set.add(4);
		set.add(2);
		set.add(3);
		
		
		for(int i=0; i<20 ;i++) {
			set.add((int)(Math.random()*100) +1 );
		}
		
		// Treeset이 정렬이 되어 있어서 부분적으로 추출하기가 용이하다. 
		
		System.out.println(set); //[1, 2, 3, 4, 5] 우리의 개입이 없이도 정렬이 되어 있다. 
		// 입출력의 절대적 속도는 HashSet이 더 빠르다. 뭔가를 찾는데 빠른 알고리즘이 HashSet이다. 
		// 둘 중에 일반적으로 HashSet을 쓰는게 속도가 빨라서 좋다.
		System.out.println(set.first());// 가장 작은 값
		System.out.println(set.last()); // 가장 큰 값
		
		System.out.println("headSet : "+set.headSet(30)); //> 작은 숫자부터 30까지 뗴와라 30은 포함이 안된다.
		
		System.out.println("tailSet : "+set.tailSet(70)); // 70보다 이후에 있는 애들 가져와라.
		
		System.out.println("subSet : "+set.subSet(30, 70));
		
		// 내가 부분적으로 부분을 짤라서 써야할 때 좋다. 부분검색, 범위검색
	
	}

}
