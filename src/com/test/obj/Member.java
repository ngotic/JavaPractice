package com.test.obj;

import java.util.Calendar;

public class Member {
	private String name;      // 회원명
	private String id;        // 아이디
	
	private Calendar regdate; // 가입날짜

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
// 이것도 불편하다 사용하는 사람이 날짜를 넣을 때 Calendar를 만들어서 넣어야 한다.
//	public Calendar getRegdate() {
//		return regdate;
//	}
//
//	public void setRegdate(Calendar regdate) {
//		this.regdate = regdate;
//	}
/////////////////////////////////////////////////////////////
	public void setRegdate(int year, int month, int date) {
		Calendar regdate = Calendar.getInstance();
		regdate.set(year, month-1, date);
		this.regdate = regdate;
	} // 이러면 쓰는 쪽에서는 편할 것이다. 
	
	public String getRegdate() {
		return String.format("%tF", this.regdate); // 이걸 안에서 해준다. 
	}
}
