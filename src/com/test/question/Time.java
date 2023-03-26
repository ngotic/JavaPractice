package com.test.question;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time () {
		this.hour   = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	public Time(int hour, int minute, int second) {
		this.hour   = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public Time(int minute, int second) {
		this.hour   = 0;
		this.minute = minute;
		this.second = second;
	}
	
	public Time(int second) {
		this.hour   = 0;
		this.minute = 0;
		this.second = second;
	}
	
	String info() {
		int second = this.hour*60*60 + this.minute*60 + this.second;
		
		int h = second /(60*60);
		second %=(60*60);		
		
		int m = second / 60;
		second %=(60);
		int s = second ;
		
		return String.format("%02d:%02d:%02d", h, m, s);
		
	}
}
