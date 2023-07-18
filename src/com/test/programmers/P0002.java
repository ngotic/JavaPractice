package com.test.programmers;

import java.util.Arrays;

public class P0002 {
	
	// 연속된 수의 합
	public static void main(String[] args) {
	
		int [] nums = solution(5, 15);
		
		System.out.println(Arrays.toString(nums));
	}
    public static int[] solution(int num, int total) {
    	
        int [] answer = {};
        answer = new int[num];
        int sum=0;
        for(int i=0; i<num; i++)
        	sum+=i;
        int a = (total - sum)/num; 
        
        int index = 0;
        for(int i=a ; i <a+num; i++) {
        	answer[index] = i;
        	index++;
        }
        return answer;
    }

}
