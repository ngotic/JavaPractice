package com.test.programmers;

public class P0001 {
	public static void main(String[] args) {
		
		int sol = solution(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
		System.out.println(sol);
	}
	// replace 사용법 : replace는 해당 문자열에 매칭되는 모든 단어를 바꿔준다.
	 public static int solution(String[] babbling) {
	        
		 	int answer = 0;
		 	
	        String [] pron = {"aya", "ye", "woo", "ma"};
	        for( int i=0; i<babbling.length; i++ ){
	        	int mask = 0;
	        	String temp = babbling[i];
	            for(int j=0 ; j<pron.length ;j++){
	            	
	                if(temp.contains(pron[j])) { // 내가 같은 부분을 마스킹한다. 
	                	temp = temp.replace(pron[j],"x"); 
	                	mask++; // 마스킹한 횟수 카운트
	                }
	                if(temp.equals("x".repeat(mask))) { // 카운트된 마스킹 x
	                	answer++;
	                	break;
	                } // 마스킹된 x 문자열과 마스킹 문자를 mask번 만큼 반복된 것과 비교 
	            }
	        }
	        return answer;
	 }
}
