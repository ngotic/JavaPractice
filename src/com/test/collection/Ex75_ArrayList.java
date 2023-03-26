package com.test.collection;

import java.util.ArrayList;

public class Ex75_ArrayList {

	public static void main(String[] args) {
		// 모든 컬랙션의 특징
		 //m1();
		m2();

	}

	private static void m2() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		
		// 숫자 100 저장
		for(int i=1; i < 100; i++) {
			
			list.add(i); // 이 행동은 좋지 않다.
			// 짧은 시간에 add를 여러번 하는것은 별로
		}
		
		System.out.printf("+",list.toArray());
		System.out.println(list);
		
		list.add(101);//숫자 1개 추가 > 더 이상 숫자를 추가할 일이 없음(***)
		// 200칸을 만들고 101칸에 101을 넣음 그러면 나머지 99 칸은 가비지다.
		
		list.trimToSize(); // 이것을 하면 200칸 짜리 배열을 101칸으로 쭐인다.
		
		
	}

	private static void m1() {
		// ArrayList(컬랙션)의 특징
		// 1. 내부의 배열을 가지고 있다. > ArrayList를 배열이라고 생각하자
		// 2. ArrayList 클래스의 대부분 기능 > 내부 배열을 조작하는 기능들 ... 
		// 3. 길이가 가변? > 데이터를 계속 넣으면 길이가 계속 증가???? 
		
		
		ArrayList<String> list = new ArrayList<String>(); // 배열이 없다.
		
		//System.out.println(list);
		
		list.add(0, "멍멍이");  // 0~1범위에만 허용
		list.add(1, "멍멍이");
		list.add(2, "멍멍이");
		System.out.println(list);
		
//		
//		System.out.println(list.size());
//		
//		list.add(100); // 첫번째 데이터를 넣는 순간 길의 4짜리를 만든다.
//		
//		System.out.println(list.size());
//		
//		list.add(200); //  
//		list.add(300); //
//		list.add(400); // 여기까진 4짜리 배열로 감당가능
//		
//		System.out.println(list.size());
//		
//		list.add(500); // 여기까진 4짜리 배열> 길이 8 배열 교체
		
	}// main

}// main

//class ArrayList {
//	
//	private int[] list = new int[5];
//	public void add(int n) {
//		this.list[0] = n;
//	}
//}