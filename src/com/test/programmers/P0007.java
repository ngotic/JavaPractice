package com.test.programmers;

public class P0007 {

	public static void main(String[] args) {
		System.out.println(solution(7, 15));

	}
	public static int solution(int n, int t) {
	        for(int i=0; i< t; i++) {
	        	n *= 2;
	        }
	        return n;
	}
}
