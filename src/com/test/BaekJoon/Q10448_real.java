package com.test.BaekJoon;

import java.util.Scanner;

public class Q10448_real {
	
	//1~1000 이렇게 따진다. 
	static boolean[] isEurekaNumber = new boolean[1001];
	static int numcnt;
	public static void preprocess() {
		//1. 1000 넘으면 스탑하는 기준 number 찾기
		int stdvalue=0;
		int [] sum = new int[50];
		
		for(int i=1; i< 50; i++) {
			sum[i] = sum[i-1] + i;
			if( sum[i] > 1000) {
				stdvalue = i;
				break;
			}
		}
		
//		for(boolean a : isEurekaNumber)
//			System.out.println(a); // 기본값이 boolean이다. 
		
		boolean [] istrisum = new boolean[1001]; // 배열이 한턴 더 필요한 것
		for(int i=1; i < stdvalue; i++) {
			for(int j=1; j< stdvalue; j++) {
				int tmpsum =  sum[i] + sum[j];
				if(tmpsum < 1000) 
					istrisum[tmpsum] = true;
			}
		}
		
		
		for(int i=1; i < 1000; i++) { // i > 이건 값 단위
			
			if(!istrisum[i]) continue; //
			for(int j=1; j <stdvalue; j++) {
				int eurekaNumber = i + sum[j];
				if (eurekaNumber > 1000) break;
				isEurekaNumber[eurekaNumber] = true;
			}
			
		}
		
		// 여기 도는 for문의 수를 위에서 구한 기준 number로 셋팅
		//2. 3중 for문 2중 for문 + 1중 포문으로 분해 > 그려면서 범위 제거  
		// > 이건 합이니까 가능 
		
	}
	
	public static void main(String[] args) {
		preprocess();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		while( N-- > 0 ) {
			int K = scan.nextInt();
			System.out.println(isEurekaNumber[K] ? '1':'0');
		}
		
	}
	
}
