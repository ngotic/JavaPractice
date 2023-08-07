package com.test.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10989 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// BufferedReader를 쓰더라도 시간초과가 뜬다. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
	
		int []arr = new int[N];
		
		int [] sorted = new int[N];		
		int [] cnt = new int[10001]; // 최대 
		
		for(int i=1; i<N+1; i++) {
			int number = Integer.parseInt(br.readLine());
			cnt[number]++;
		}
		StringBuilder sb = new StringBuilder();
		// Arrays.sort(arr); // 이 방식으로 하면 시간 초과가 일어난다.
		for(int i=1; i<10001; i++) {
			for(int j=0; j<cnt[i]; j++) {
				sb.append(i);
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
	// 이래도 시간 초과가 난다. > 이게 입출력이 쥰내 많아서 그렇다. > 알고리즘 상으론 시간 복잡도를 줄였는데.
	// IO함수가 빡새서 그렇다.
}
