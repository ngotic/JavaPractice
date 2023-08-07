package com.test.BaekJoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q2295 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		// N(5 ≤ N ≤ 1,000)개의 자연수들로 이루어진 집합 U가 있다. 이 중에서 적당히 세 수를 골랐을 때,
		// 그 세 수의 합 d도 U안에 포함되는 경우가 있을 수 있다. 이러한 경우들 중에서, 가장 큰 d를 찾으라.
		// 주어진 U는 집합이 되므로 입력되는 두 수가 같아서는 안된다. 
		
		// A + B + C = X
		// A, B, C는 모두 U에 속한다. 
		// A + B = X - C >> 가장큰 X가 d다. 
		// max인 X를 찾는 것이 목적이다.
		// 자연수에 대한 조합을 찾는 것이 목적이다.
		int []arr = new int[N];
		
		for(int i=0; i< N; i++) {
			arr[i] = scan.nextInt();
		}
		
		// 이 문제는 x, y, z, k가 중복이 발생할 수 있다. 
		Set se = new HashSet();
		
		
		// 집합 자체는 중복이 안되는데
		
		
		// 뽑을 때는 중복이 된다. 
		
		for(int i=0; i< N; i++) {
			for(int j=i ; j<N; j++){
				se.add(arr[i] + arr[j]);		
			}
		}
		// 1. 중복이 될수 있다. 
		// 2. 중복이 되는것 빼곤 2개 뽑기 10 + 9*8/2
		
		
		int max = -1;
		
		// a[3] - a[5]
		// a[5] - a[3] 
		// 이 둘은 다른 값이니까 양사이드를 다 본다. > 차가 되면 순서가 중요해진다.  
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				int target = arr[i]-arr[j];
				if(se.contains(target)) {
					max = Math.max(max, arr[i]);
				}
			}
		}
		
		System.out.println(max);
		// 시간 복잡도 O(N^2logN)
		// 해당 숫자가 있는 지 없는지 문제는 바이너리 서치가 셋으로 대체된다. 
	}
	
}
