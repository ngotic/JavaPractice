package com.test.question;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MySet {

	private String[] list;
	private int index;
	private int iterator;
	// 행동





	public MySet() {
		this.list = new String[4]; // Entry의 초기 길이 > 4
		this.index = 0;            // 인덱스는 0
		this.iterator = -1;        // 시작값이 -1이다.
	}

	// boolean add(String value)
	// 배열에 요소를 추가한다.
	// value: 추가할 요소
	// return: 성공 유무
	public boolean add(String value) {

		// 1. 배열 수가 모자르면 doubling
		doubling();
		
		// 2. 기존 배열에 > 중복이 되는지 확인
		if (duplicate(value) != -1) {
			return false;
		}
		
		// 3. 대입
		this.list[this.index++] = value;
		return true;

	}

	// int size()
	// 요소의 개수를 반환한다.
	// return: 요소의 개수
	public int size() {
		return this.index;
	}

	// boolean remove(String value)
	// 배열의 요소를 삭제한다.
	// s: 삭제할 요소
	// return: 성공 유무> 
	public boolean remove(String value) {
		
		int search = duplicate(value);
		
		if( search == -1 )
			
			return false;
		
		else {
			
			// 끝부분이면 안들어가, 안쪽으면 들어가 
			for(int i=search; i< this.index-1; i++) {
				list[i] = list[i+1];
			}
			
			list[this.index - 1] = null;// 마지막 index는 직접 넣어줄래
			this.index--;
			return true;
		}
		
		
	}
	
	// void clear()
	// 배열의 모든 요소를 삭제한다.
	public void clear() {
		for(int i=0; i<this.index;i++) {
			this.list[i] = null;
		}
		this.index = 0;
	}
	
	
	
	// this.index - 1 가 마지막꺼 
	
	// 아래 두 메서드 때문에 iterator Pointer 가 필요하다
	// boolean hasNext()
	// 다음 요소가 있는지 확인한다.
	// return: 존재 유무
	public boolean hasNext() {
		// 꽉 차지 않은 상태 this.index가 가리킨다. 
		// 꽉찬 상태
		if( ( iterator+1 ) <=  (this.index-1) )
			return true;
		else
			return false;
		
	}
	
	// String next()
	// 다음 요소를 반환한다.
	// return: 다음 요소
	public String next() {
		// 다음 엘리먼트가 있으면 iterator를 +1 한다.
		// 없으면 NoSuchElementException 에러를 낸다.
		try {
			if(hasNext()) {
				this.iterator++;
				return this.list[this.iterator];
				
			} else {
				throw new NoSuchElementException("우왕에러다.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 출력만 시킨다.
			System.exit(0);
			return null;
		} 

	}
		
	@Override
	public String toString() {
		return "MySet [list=" + Arrays.toString(list) + ", index=" + index + ", iterator=" + iterator + "]";
	}

	private void doubling() {

		if (this.index == this.list.length) {

			String[] temp = new String[list.length * 2];

			for (int i = 0; i < this.index; i++) {
				temp[i] = this.list[i];
			} // deep copy
			list = temp;

		}

	}
	
	//////////// [ 찾으면 인덱스를 반환 ]  /////////////
	private int duplicate(String value) {

		for (int i = 0; i < this.index; i++) {
			
			if ( this.list[i].equals(value) ) {
				return i;
			}
		}
		return -1;
	} ////////////////////////////////////////////

}
