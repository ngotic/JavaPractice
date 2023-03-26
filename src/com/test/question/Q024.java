package com.test.question;

import java.util.Scanner;

public class Q024 {
	
	enum Food {
		JAJANG(10, "짜장면"), CHICKEN(18, "치킨"), PIZZA(25, "피자");	
		private final int time;
		private final String name;
	
		Food(int time, String name){
			this.time = time;
			this.name = name;
		}
		public int getTime() {
			return time;
		}
		public String getName() {
			return name;
		}
		
	}
	public static void main(String[] args) {
		// 요구사항] 여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다. 
		// 고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.
		//		조건..
		//		전화를 걸면 짜장면은 10분 뒤에 도착합니다.
		//		전화를 걸면 치킨은 18분 뒤 도착합니다.
		//		전화를 걸면 피자는 25분 뒤 도착합니다.
		//		음식을 받기 원하는 시간은 오후 11시 이전에만 가능합니다.(날짜 변경 금지)
		Scanner scan = new Scanner(System.in);
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시: ");
		int hour = scan.nextInt();
		System.out.print("분: ");
		int min = scan.nextInt();
		printTime(hour, min, Food.JAJANG);
		printTime(hour, min, Food.CHICKEN);
		printTime(hour, min, Food.PIZZA);
		scan.close();
	}
	public static void printTime(int hour, int min, Food food){
		int diff = min-food.getTime();
		if ( diff < 0) {
			min = 60 + diff;
			hour = (hour == 0)? 23: hour-1;
		} else {
			min = diff;
		}
		System.out.printf("%s: %d시 %d분\n", food.getName(), hour, min);
	}
}
