package com.test.programmers;

import java.util.Arrays;

public class P0006 {

	public static void main(String[] args) {
		
		System.out.println(solution("Bcad"));
		
	}
	
	
	  public static String solution(String my_string) {

//	        char[] array = new char[my_string.length()];
//	        String temp = my_string.toLowerCase();
//	        System.out.println(temp);
//	        
//	        for(int i=0; i< my_string.length(); i++) {
//	        	array[i] = temp.charAt(i);
//	        }
//	        
//	        
//	        for(int i=0 ; i< my_string.length()-1 ;i++) { // 버블 소트
//	        	for(int j=0; j < my_string.length()-1-i; j++) { // 
//	        		if ( array[j] > array[j+1] ) {
//	        			char tempchar =  array[j];
//	        			array[j] = array[j+1];
//	        			array[j+1] = tempchar;	
//	        		}
//	        	}
//	        	
//	        }
		  	char [] array=my_string.toLowerCase().toCharArray();
		  	Arrays.sort(array);
	        return new String(array);
	  }
}
