package com.test.BaekJoon;

import java.util.Scanner;

public class Q10432_sorted {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int ans=0;
		int [] arr = new int[20];
		// 문제에서 제시한 작은 과정부터 시뮬레이션을 뛰어봐야 안다. 
		
		for(int i=0; i<N; i++) {
			ans = 0;
			int L = scan.nextInt();
			
			for (int j=0; j<20; j++) {
				arr[j] = scan.nextInt(); // 구하고 
			}
			
			int [] sorted = new int[20];
			// 1. 줄 서있는 학생 중에 자신보다 큰 학생을 찾는다.
			// 1-1. 찾지 못했다면, 줄의 가장 뒤에 선다.
			int cnt=0;
			
			for( int k=0; k<20; k++) { // 하나씩 삽입할 인덱스 
				boolean find = false;
				for(int m=0; m<k; m++) {
					if(arr[k] < sorted[m]) {
						// 2. 찾았다면, 그 학생의 앞에 선다.
						// 3. 그 학생과 그 뒤의 학생이 모두 한칸씩 물러난다. 
						find = true;
						for(int a=k-1; a>=m; a--) {
							sorted[a+1] = sorted[a];
							cnt++;
						} 
						sorted[m] = arr[k];
						break; // 이 순간에는 break해서 빠져 나온다. 
					}
				}
				if( !find ) sorted[k] = arr[k]; // > 가장 뒤에 선다. 그대로 간다.  
			}
			
			System.out.println(i+1+" "+cnt); // 답
		}
		
		
	}
	
}
