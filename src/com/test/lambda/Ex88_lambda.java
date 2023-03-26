package com.test.lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex88_lambda {

	public static void main(String[] args) {
		//Ex88_lambda.java
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<20; i++) {
			list.add((int)(Math.random() * 100) + 1);
		}
		System.out.println(list);
		ArrayList<Integer> sortedList = (ArrayList<Integer>) list.clone(); 
		sortedList.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		System.out.println("원본>"+list);       // ↓
		System.out.println("복제된거>"+sortedList);       // ↓
		
		// "컬렉션의 자료타입"을 보고 Integer라 판단함
		list.sort( (o1, o2) -> o1-o2 ); // 요러면 끝난다.
		System.out.println(list);       // 람다식을 왜써요? 라고 물어보면 그냥 이거다.
		// 코드가 간단해짐...
		
	}

}
