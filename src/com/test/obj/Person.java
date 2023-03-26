package com.test.obj;

public class Person {
	
	private String name;    // 이름 
	private int age;        // 나이
	private String address; // 주소
	
	// private String nick1;   // 별명(여러개 저장)
	// private String nick2;
	// private String nick3;
	// 변수 이름이 넘버링 되는 것은 좋지 않다.
	
	
	// private String[] nick; // 멤버로 배열을 넣을 수 있다. 
	// private String[] nick= new String[10]; // 멤버로 배열을 넣을 수 있다. 
	// 미리 객체를 만들지 아니면 선언만 할지 ? 
	
	
	// 다시 5개를 만든다. 
	private String[] nick= new String[5];
	private int index = 0; // 별명 배열의 방번호 제어
	//private String[] nick;
	// 이 친구 nick은 주소값만 있고 String 배열은 힙 어딘가에 있따.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	public String[] getNick() {
//		return nick;
//	}
//
//	public void setNick(String[] nick) {
//		this.nick = nick;
//	}
	
	public void addNick(String nick) {
		
		if (this.index < this.nick.length) { // 아직까진 집어넣을 여력이 있다.
			
			this.nick[this.index] = nick; // index를 옮겨가면서 넣어줄거임 
			this.index++; //  이게 무한정으로 돌아갈 수가 없다.
		} else {
			System.out.println("별명을 더이상 추가할 수 없습니다.");
		}
	}
	
	public String getNick() {
		// 끝에서부터 하나씩 돌려주기
		if(this.index > 0) {
			this.index--;
			String nick = this.nick[this.index];
			return nick;
		} else {
			System.out.println("더이상 별명이 없습니다.");
			return null;
		}
	}
	
}
