package com.test.programmers;

import java.util.Arrays;

public class P0004 {

	public static void main(String[] args) {
		// 잘라서 배열로 저장하기
//		
//		문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		1 ≤ my_str의 길이 ≤ 100
//		1 ≤ n ≤ my_str의 길이
//		my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
		
		
		System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));
	}
	
	public static String[] solution(String my_str, int n) {
        String[] answer = {};
        
        int divide =(int)Math.ceil( (double)my_str.length()/ n ); 
        
        answer = new String[divide];//
        // 16
        // 6 , 6 , 4
        // 6개로 짜름
        
        //0 ~ 6, 6 ~12 12 ~ my_str.length();
        
        for(int i=0; i<divide ; i++) {
        	
        	if ( (my_str.length()  - n * i) < n) // 마지막 토막 처리
        		answer[i] = my_str.substring(i * n,  my_str.length() );
        	else 
        		answer[i] = my_str.substring(i * n,  (i + 1) * n);
        	
        }
        
        return answer;
    }

}
