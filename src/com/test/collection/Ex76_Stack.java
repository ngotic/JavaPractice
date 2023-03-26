package com.test.collection;

import java.util.Stack;

public class Ex76_Stack {

	public static void main(String[] args) {
		// ADT
		//-Abstract Data Type
		//-Stack, Queue
		//-물리적인 특성은 배열과 동일한데, 사용법이 특별한 자료형
		
		//Stack
		// 후입선출
		// LIFO, Last Input First Output
		// 메모리 구조(Stack)
		// 되돌리기 C+Z, C+Y
		
		//Queue
		// 선입선출
		// FIFO, First Input First Output
		// ex) 줄서기

		Stack<Integer> stack= new Stack<Integer>();
		System.out.println(stack.pop());
		stack.add(4);
		stack.add(2);
		stack.add(7);
		stack.add(3);
		stack.add(5);
		stack.add(2);
		stack.add(1);
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		while(stack.size() !=0) {
			System.out.println(stack.pop()); // 위의 공을 꺼냈고 반환한다. 그 값으로
		}
		
		// System.out.println(stack.pop()); // 비어있을 때 pop을 하면 에러다.
		System.out.println(stack.size()==0);
		System.out.println(stack.isEmpty());
		stack.add(2);
		stack.add(1);
		
		// peek() 다음번 pop이 될 테이터를 확인만 하는 용도 
		System.out.println(stack.peek()); // 꺼내진 않는다. 공을 반환한다.
		System.out.println(stack.peek()); // 꺼내진 않는다. 공을 반환한다.
		// 쳐다본다.
		
	}

}
