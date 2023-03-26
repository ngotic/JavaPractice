package com.test.question;

import java.util.Scanner;

public class Q014 {

	public static void main(String[] args) {
		// 요구사항 ] 지하철 탑승 소요 시간을 구하시오. 지나가는 역의 개수, 환승역의 횟수, 시간대를 전달 받아 총 걸리는 시간을 반환하는 메소드를 선언하시오.
		// 조건
		// - int getTime(int station, int change, int time)
		// - 각 역간 소요 시간: 2분 소요
		// - 환승 소요 시간: N분 소요
		// - 시간대에 따라 환승 소요 시간이 다르다.
		// - 평상시: 3분
		// - 출근시: 4분
		// - 퇴근시: 5분
		
		int station, change, time;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("역의 개수: ");
		station = sc.nextInt();
		System.out.print("환승역의 개수: ");
		change = sc.nextInt();
		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		time = sc.nextInt();
		System.out.printf("총 소요 시간은 %d분입니다.\n",getTime(station, change, time));

		sc.close();
	}
	public static int getTime(int station, int change, int time) {
	    int stationCost = 2;
		int changeCost = (time == 1)? 3: (time == 2)? 4 : 5; 
		return station*stationCost + change*changeCost;
	}
}
