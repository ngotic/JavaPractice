package com.test.obj.inheritance;

import java.util.Calendar;
import java.util.Date;

public class Ex52_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time(2, 30);
		System.out.println(t1.info());
		System.out.println(t1);
		System.out.println(t1.toString());
		
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);;
		System.out.println(c1.toString());;
		
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.toString());;
		
	}
}

class Time {
	private int hour;
	private int min;
	
	public Time(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}
	
	public String info() {
		return this.hour + ":" + this.min;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + "]";
	}
	
//	// 모든 개발자는 이 toString() 재정의할 때 항상 덤프를 구현한다. > 암묵적으로 이렇게 쓰라가 있다. 
//	// 2:30
//	// 2시간 30분 이런 형식은 예측할 순 없다.
//	public String toString(){
//		return this.hour +", "+ this.min;
//	} // 내가 가진 데이터를 문자열로 돌려줘
//	// 이렇게 재정의해주면 더이상 Object.toString()를 사용하지 않고, 자신이 직접 만든 toString()을 사용한다.
	
	
	
}

// 역할
// - info()의 역할 == toString()의 역할
// 무조건 toString() 사용
// 1. info() 나만 아는 메소드
// 2. toString() > 전세계 개발자들이 다 안다.



