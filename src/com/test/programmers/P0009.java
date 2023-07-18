package com.test.programmers;

import java.util.Arrays;

public class P0009 {
	//O, X 퀴즈
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str = {"3 - 4 = -3", "5 + 6 = 11"};
		
//		
//		for ( String s : str[0].split(" "))
//			System.out.println(s);
		//solution
		System.out.println(Arrays.toString(solution(str)));;
	}
	
	public static String[] solution(String[] quiz) {
		
		String[] answer = new String[quiz.length];
		
		for(int i=0; i<quiz.length ; i++) {
			
			String[] token = quiz[i].split(" ");
			int a = Integer.parseInt(token[0]);
			int b = Integer.parseInt(token[2]);
			int c = Integer.parseInt(token[4]);
			if ( token[1].charAt(0) == '+' ) {
				if( ( a+b ) == c)
					answer[i] ="O";
				else 
					answer[i] ="X";
			} else {
				
				if( ( a-b ) == c)
					answer[i] ="O";
				else 
					answer[i] ="X";
			} 
		
		}
     
        return answer;
	}
}
