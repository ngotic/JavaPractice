package com.test.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Ex77_Queue {

	public static void main(String[] args) {
		// 선입선출
		// Queue <String> queue; // 큐는 인터페이스다. 그 자체로는 객체 생성이 불가능하다. 
		// ★ 큐는 LinkedList를 이용해서 객체를 만든다.
		
		Queue <String> queue= new LinkedList<>();
		
		
		//1. 요소 추가하기
		queue.add("빨강"); // 
		queue.add("노랑");
		queue.add("파랑");
		
		//2. 요소 개수
		System.out.println(queue.size());
		
		//3. 요소 읽기(=꺼내기)
		System.out.println(queue.poll()); // 값을 하나씩 꺼낸다.
		System.out.println(queue.size());
		
		System.out.println(queue.poll());
		System.out.println(queue.size());
		
		System.out.println(queue.poll());
		System.out.println(queue.size());
		
		System.out.println(queue.poll()); // 큐는 내부에 값이 없을 떄 poll을 하면 null을 반환한다.
		
		// 4. 비었는지?
		System.out.println(queue.size() == 0 );
		System.out.println(queue.isEmpty());
		
		// 5. 구경하기
		queue.add("초록");
		System.out.println(queue.peek());
		System.out.println(queue.size());
		
	}

}
