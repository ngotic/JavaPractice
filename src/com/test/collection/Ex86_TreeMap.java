package com.test.collection;

import java.util.TreeMap;

public class Ex86_TreeMap {

	public static void main(String[] args) {
		// Ex86_TreeMap.java
		// Tree + Map 
		// -Tree > 이진 탐색 트리> 자동정렬 + 범위(부분) 추출 용이
		// -Map > 키와 값 구성
		
		TreeMap<String ,String> map = new TreeMap<String ,String>();
		map.put("white", "하얀");
		map.put("black", "검정");
		map.put("yellow", "노랑");
		map.put("orange", "주황");
		map.put("green", "초록");
		map.put("red", "빨강");
		map.put("blue", "파랑");
		
		System.out.println(map); // key기준으로 자동 정렬되어있다.
		
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		System.out.println(map.get(map.firstKey()));
		System.out.println(map.firstEntry().getValue());// 권장
		
		System.out.println(map.headMap("m")); // 머고
		System.out.println(map.tailMap("m"));
		System.out.println(map.subMap("m","t"));
		
		// 일반적인 자료집합 > ArrayList : 무난한자료형
		// ArrayList vs LinkedList
		// Stack, Queue
		// HashSet vs TreeSet
		// HashMap vs TreeMap
		
		// 일반적인 자료집함 > ArrayList
		// 중간 추가/삭제 > LinkedList
		// 선입선출 > Queue
		// 후입선출 > Stack
		// 중복값(X) > HashSet(***) or TreeMap(정렬, 범위추출)
		
		//*** ArrayList, HashSet, HashMap + Queue(Stack) // 얘네들이 좋다. 
		
	}

}
