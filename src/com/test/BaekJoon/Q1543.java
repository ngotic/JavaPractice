package com.test.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1543 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String total = br.readLine();
		String word = br.readLine();
		// 공백도 있어서 이렇게 처리
		
		int point = total.indexOf(word);
		int cnt =0;
		while(point!=-1) {
			cnt++;
			total = total.substring(point+word.length());
			point = total.indexOf(word);
		}
		//indexOf(String str, int fromIndex) // 어디부터 찾아라~ 
		
		System.out.println(cnt);
	}
	
}
