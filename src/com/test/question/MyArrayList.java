package com.test.question;

public class MyArrayList {
	// 원래는 처음에 배열이 없다가 add를 할 때 배열을 생성인데
	// 처음엔 4칸으로 시작
	private String[] list; // 보조
	private int index; // ****************** 주인공!!!
	private int capacity;

	public MyArrayList() {
		this.index = 0;
	}

	/*
	 * boolean add(String value) Append 모드로 배열의 맨 끝에 요소를 추가한다. value: 추가할 요소 return:
	 * 성공 유무
	 */
	public boolean add(String value) {

		// 인자값을 배열에 차례대로 넣기 > append
		// 첫번째 add() 실행할 떄?
		try {
			if (this.index == 0) {
				capacity = 4;
				this.list = new String[capacity];

			} else if (this.index >= capacity) {
				duplicateArray();
			}
			// 검사 > 방이 모자란지? 배열 2배 확장(깊은 복사)
			this.list[this.index] = value;
			this.index++;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
			return false;
		}
	}

//	boolean add(int index, String value)
//	Insert 모드로 원하는 위치에 요소를 삽입한다.
//	index: 수정할 요소의 위치
//	value: 수정할 요소의 값
//	return: 성공 유무
	public boolean add(int index, String value) {

		// 현재 배열이 없는 경우 : 0만 허용, 그렇지 않은 범위면 IndexOutOfBoundsException을 호출
		try {
			if (this.index == 0) {
				if (index == 0) {
					capacity = 4;
					this.list = new String[capacity];
				} else {
					throw new IndexOutOfBoundsException(); // IndexOutOfBoundsException:
				}

			} else { // 현재 배열이 있는 위치에만 허용 0 ~ this.index 범위까지 허용한다.

				if (index >= 0 && index <= this.index) {

					// 허용량 초과시
					if (this.index >= capacity) {
						duplicateArray();
					}

					// 오른쪽 쉬프트
					for (int i = this.index - 1; i >= index; i--) {
						list[i + 1] = list[i];
					}

				} else {
					throw new IndexOutOfBoundsException();
				}
			}

			this.list[index] = value;
			this.index++; // >>>>>>>>>>>>>>>>>>>>>>.
			return true;

		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.exit(0);
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
			return false;
		}

	}

	private void duplicateArray() {
		capacity *= 2;
		String[] temp = new String[capacity]; // 1. 새로운 배열 생성

		for (int i = 0; i < list.length; i++) { // 2. 깊은 복사
			temp[i] = list[i];
		}
		list = temp; // 3. 링크 연결
	}

	public int size() {
		// 배열 길이(X) > 여태 넣은 데이터의 개수 (O)
		return this.index;
	}

	/*
	 * String get(int index) 원하는 위치에 있는 요소를 가져온다. index: 가져올 요소의 위치 return: 가져올 요소의
	 * 값
	 */
	public String get(int index) {
		try {

			if (index >= 0 && index <= this.index) { // OK
				return this.list[index];
			} else
				throw new IndexOutOfBoundsException();

		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.exit(0);
			return null; // null 보단 빈문자열 리턴이 나은듯
		}
	}

//	String set(int index, String value)
//	원하는 위치의 요소를 다른 값으로 수정한다.
//	index: 수정할 요소의 위치
//	value: 수정할 요소의 값
//	return: 수정하기 전 요소의 값
	public String set(int index, String value) {

		try {
			if (index >= 0 && index <= this.index) { // OK
				String temp = list[index];
				list[index] = value;
				return temp;
			} else
				throw new IndexOutOfBoundsException();

		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.exit(0);
			return null;
		}

	}

//	String remove(int index)
//	원하는 위치의 요소를 삭제한다.
//	index: 삭제할 요소의 위치
//	return: 삭제된 요소의 값
	public String remove(int index) {

		// 0 ~ index 를 선택한 경우
		// 그렇지 않은 경우
		try {
			if (index >= 0 && index <= this.index) { // OK
				String result = list[index]; // 미리 저장하고 있다가
				for (int i = index; i < this.index; i++) { // left shift한다.
					list[i] = list[i + 1]; 
				}
				// list[list.length - 1] = null; // 이미 끝에가 null이라 for문 인덱스 증가시키면댐

				this.index--; // >>>>>>>>>>>>>>>>>>>>>>>>>>>>.
				return result;
			} else {
				throw new IndexOutOfBoundsException();
			}
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.exit(0);
			return null;

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
			return null;
		}
	}

//	
//	
////	int indexOf(String value)
////	원하는 요소가 몇번째 위치에 있는지 위치값을 반환한다.
////	value: 검색할 요소의 값
////	return: 검색된 요소의 위치
	public int indexOf(String value) {

		for (int i = 0; i < this.index; i++) {
			if (value.equals(list[i]))
				return i;
		}
		return -1;

	}
//	
//	
////	int lastIndexOf(String value)
////	원하는 요소가 몇번째 위치에 있는지 위치값을 반환한다.
////	value: 검색할 요소의 값
////	return: 검색된 요소의 위치

	public int lastIndexOf(String value) {
		for (int i = this.index - 1; i >= 0; i--) {
			if (value.equals(list[i]))
				return i;
		}
		return -1;
	}
//	

//	void clear()
//	배열의 모든 요소를 삭제한다.
	public void clear() {
		
		for (int i = 0; i < this.index; i++) {
			list[i]=null;
		}
		
		this.index = 0;
	}

// 0 1 2  : this.index = 3 

//	void trimToSize()
//	배열안의 요소의 개수만큼 배열의 길이를 줄인다.
	public void trimToSize() {
		// this.index : 요소개수
		String[] temp = new String[this.index];

		for (int i = 0; i < this.index; i++) {
			temp[i] = list[i];
		}

		list = temp;
	}

	public String toString() {

		if (this.index == 0)

			return "[]";

		else {
			StringBuilder sb = new StringBuilder("[");

			for (int i = 0; i < this.index; i++) {
				sb.append(String.format("%s, ", list[i]));
			}

			return sb.substring(0, sb.length() - 2) + "]";
		}
	}
}
