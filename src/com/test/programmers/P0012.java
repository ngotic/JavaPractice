package com.test.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class P0012 {
	// 약수 구하는 문제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(solution(24)));
	}
	
   public static int[] solution(int n) {
        ArrayList<Integer> ar = new  ArrayList<Integer>();
        for(int i=1; i<=n; i++){
            if( (n % i) == 0  )
                ar.add(i);
        }
        
        return ar.stream().mapToInt(i->i).toArray();
    }

}


// ar.stream().mapToInt(i->i).toArray(); 외우기
