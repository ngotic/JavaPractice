package com.test.question;

public class MyQueue {

	
	//  O O O O 
	// <-------  방향은 오 > 왼
	//
//	MyQueue
//	Queue 사용자 정의 클래스
//	행동
//	boolean add(String value)
//	값을 순차적으로 추가한다.
//	value: 추가할 요소의 값
//	return: 성공 유무
//	String poll()
//	값을 순차적으로 가져온다.
//	return: 가져올 요소의 값
//	int size()
//	요소의 개수를 반환한다.
//	return: 요소의 개수
//	String peek()
//	이번에 가져올 값을 확인한다.
//	value: 값 반환
//	void clear()
//	배열의 모든 요소를 삭제한다.
//	void trimToSize()
//	배열안의 요소의 개수만큼 배열의 길이를 줄인다.
	
	private String[] list; // 보조
	private int index; // ****************** 주인공!!!
	
	// 생성자가 없네? 
	public boolean add(String value) {
		if (this.index == 0) { 
			this.list = new String[4]; // 초기 배열 크기 // 초기 셋팅 
		}
		
	
		if ( this.index == list.length ) {// 꽉차면 > doubling
			String [] temp = new String[ list.length * 2];
			for(int i=0; i<list.length; i++) {
				temp[i] = list[i];
			}
			list = temp;
		}
		
		list[this.index++]=value;
		
		return true;
	}
	
	public String poll() { // left Shift
		String temp = list[0];
		
		
		for(int i=0;i<this.index-1;i++) {
			list[i]=list[i+1];
		}
		list[this.index-1] = null;
		this.index--;
		
		
		return temp;
	}
	
	public int size() {
		return this.index;
	}
	
	public String peek() {
		return list[0];
	}
	
	public void clear() {
		for(int i=0; i<this.index; i++) {
			list[i]=null;
		}
		this.index=0;
	} 
	public void trimToSize() {
		
		String[] temp = new String[this.index];

		for (int i = 0; i < this.index; i++) {
			temp[i] = list[i];
		}

		list = temp;
	}

}
