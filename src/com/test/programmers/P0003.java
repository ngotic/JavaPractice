package com.test.programmers;

public class P0003 {

	public static void main(String[] args) {
		// 문자열밀기
		solution("abc","abc");
	}
	 // substring을 써서 for문으로 민다.
	 public static int solution(String A, String B) {
	     int answer = -1;
	     String temp = A;
	     
	     if(!A.equals(B)) {
		     for (int i=1; i<A.length(); i++) {
		    	 temp =  temp.substring(temp.length()-1)+temp.substring(0, temp.length()-1);
		    	 if(temp.equals(B)) {
		    		 answer = i;
		    		 break;
		    	 }
		     }
	     } else  {
	    	 answer = 0;
	     }
	     return answer;
	 }

}
