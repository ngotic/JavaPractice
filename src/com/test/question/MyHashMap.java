package com.test.question;

//public class MyHashMap {
//
//	//a. 
//	private Entry[] list; // 처음부터 엔트리 배열을 만든다.
//	// private String[] list; // ArrayList, Stack, Queue의 방법
//	
//	// 하지만 Map, key ,value가 있다. 그래서 배열 두개가 필요하다.
//	
//	// b. 
//	private String [] keys;
//	private String [] values;
//	private int index ;
//	
//	public MyHashMap() {
//		this.index = 0;
//		this.keys = new String[4];
//		this.values = new String[4];
//	}
//
//	@Override
//	public String toString() {
//		String temp = "";
//		
//		temp+= String.format("index: %d\n", this.index);
//		temp+= String.format("length: %d\n", this.keys.length);
//		
//		for(int i=0;i<this.keys.length;i++) {
//			temp += String.format("	[%s] = %s\n",
//					this.keys[i], this.values[i]);
//		}
//		return temp;
//	}
//	
//	public String put(String key, String value) {
//		this.keys[this.index] = key;
//		this.values[this.index] = value;
//		this.index++;
//		
//		Entry e = new Entry();
//		e.key = key;
//		e.value = value;
//		
//		
//		return null;
//		
//		// 이러다가 꽉차면 두배로 늘린다.
//	}
//	
//}

















public class MyHashMap {
	
	private Entry[] list;
	private int index;
	
	
	
	// 생성자로 일단은 배열 길이 설정
	public MyHashMap() {
		this.list = new Entry[4]; // Entry의 초기 길이 > 4 
		this.index = 0;           // 인덱스는 0
	}
	
	//String put(String key, String value)
	//키와 값을 요소로 추가한다.
	//key: 추가할 요소의 키
	//value: 추가할 요소의 값
	//return: null : 끝에 추가가 되었다. 
	//return: 수정하기 전 요소의 값 : 중복된키값 찾아서 value값 수정
	public String put(String key, String value) {
		
		// No Duplicate
		for(int i=0; i <this.index; i++) { // 값이 기존에 있으면 있다 싶으면 거기서 수정 
			if(list[i].key.equals(key)) {   // 키값을 찾음
				String temp = list[i].value;  
				list[i].value =value;
				return temp; //종료
			}
		} 
		
		// 중복되는게 없다? 그럼 사이즈 체크하고 더블링, 뒤에다가 추가 
		
		doubling();
		
		Entry e = new Entry(key, value); // 
		list[this.index++] = e;
		
		return null; // 종료
	}
	
	//String get(String key)
	//키에 대응하는 요소의 값을 가져온다.
	//key: 가져올 요소의 키
	//return: 가져올 요소의 값
	public String get(String key) {
		for(int i=0 ; i<this.index  ;i++) {
			if(list[i].key.equals(key))
				return list[i].value;
		}
		return null;
	}
	
	//int size()
	//요소의 개수를 반환한다.
	//return: 요소의 개수
	public int size() {
		return this.index;
	}
	
	//String remove(String key)
	//원하는 키의 요소를 삭제한다.
	//key: 삭제할 요소의 키
	//return: 삭제된 요소의 값
	public String remove(String key) {
		int delIndex = 0;
		Boolean isFind = false;
		String temp = "";
		for(int i=0; i <this.index; i++) { // 삭제할 키를 찾았다. 
			if(list[i].key.equals(key)) {  // 키값을 찾음
				temp = list[i].value;  	   // 
				delIndex = i;
				isFind = true;
				break;
			}
		}
		
		if( ! isFind ) return null; // 못찾으면 바로 종료
			
		for(int i=delIndex ; i < this.index -1 ; i++) {
			list[i].key = list[i+1].key;
			list[i].value = list[i+1].value;
			// list[i]=list[i+1] // 이렇게 하지마라 이러면 다음줄에서 null 되버려서 앞에 i번쨰도 null 된다.
			// 걍 key, value값을 하나씩 복사
		}
		
		list[ this.index -1 ].key = null; // 마지막 요소에 null가리키게 off
		list[ this.index -1 ].value = null; // 마지막 요소에 null가리키게 off
		this.index--;
		return temp;
	}
	
		
	//boolean containKey(String key)
	//해당 키가 존재하는지 확인한다.
	//key: 확인할 키
	//return: 키의 존재 유무
	public boolean containsKey(String key) {
		for(int i=0 ; i<this.index  ;i++) {
			if(list[i].key.equals(key))
				return true;
		}
		return false;
	}
	
	//boolean containsValue(String value)
	//해당 값이 존재하는지 확인한다.
	//value: 확인할 값
	//return: 값의 존재 유무
	public boolean containsValue(String value) {
		for(int i=0 ; i<this.index  ;i++) {
			if(list[i].value.equals(value))
				return true;
		}
		return false;
	}
	
	//void clear()
	//배열의 모든 요소를 삭제한다.
	public void clear() {
		
		for(int i=0 ; i<this.index  ;i++) {
			list[i].key = null;
			list[i].value = null;
		}
		
		this.index = 0;
	}
	
	
	//void trimToSize()
	//배열안의 요소의 개수만큼 배열의 길이를 줄인다.
	public void trimToSize() {
		Entry[] temp = new Entry[this.index];
		for (int i = 0; i < this.index; i++) {
			temp[i] = list[i]; 
		}
		list = temp;
	}
	
	
	@Override
	public String toString() {
		String temp = "";
		
		temp+= String.format("index: %d\n", this.index);
		temp+= String.format("length: %d\n", this.list.length);
		
		for(int i=0;i<this.index;i++) {
			temp += String.format("	[%s] = %s\n",
					this.list[i].key, this.list[i].value);
		}
		return temp;
	}
	
	private void doubling() {
		
		if(this.index == list.length) { // 꽉차면
			// 기존의 list의 2배길이 리스트 생성
			Entry[] temp = new Entry[list.length * 2]; // 1. 새로운 배열 생성
			
			// 기존에 저장하고 있는 길이만큼 deep copy
			for (int i = 0; i < list.length; i++) {    // 2. 깊은 복사
				temp[i] = list[i]; // new 객체 넣어야함
			}
			
			list = temp; // 3. 링크 연결
		}
		
	}
	
}







// 또 한가지 방법은 클래스를 만들어서 푼다. 
// Key, Value를 아예 처음부터 세트로 만든다.
class Entry {
	public String key;
	public String value;
	public Entry(String key, String value) {
		this.key = key;
		this.value = value;
	}	
}