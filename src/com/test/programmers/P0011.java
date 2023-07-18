package com.test.programmers;

import java.util.StringTokenizer;

public class P0011 {
	//문자열 계산하기
	//my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때,
	// 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요
	//"3 + 4 - 1 + 2" 이 경우도 고려다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("3 + 4 - 1 + 2"));
	}
    public static int solution(String my_string) {
    	
    	StringTokenizer st = new StringTokenizer(my_string, "+-", true);
    	int sum =Integer.parseInt(st.nextToken().trim()); // 
    	while(st.hasMoreTokens()) {    		
    		String token = st.nextToken().trim();
    		if(token.equals("+")) {
    			sum += Integer.parseInt(st.nextToken().trim());
    		}
    		else if(token.equals("-")) {
    			sum -= Integer.parseInt(st.nextToken().trim());
    		}
    	}
    	return sum;
    	
//        String [] str = my_string.split("\\+|\\-");
//        int sum = Integer.parseInt(str[0].trim());
//        int a = 1;
//        
//        for(int i=0; i<my_string.length(); i++) {
//        	if ( my_string.charAt(i)=='+') {
//        		sum+=Integer.parseInt(str[a++].trim());
//        		
//        	} else if( my_string.charAt(i)=='-') {
//        		sum-=Integer.parseInt(str[a++].trim());
//        	}
//        }
//        return sum;
        
        
        
     // 여기서 핵심은 split에 regex로 특문 넣을 떄 \\로 +,- escape 시킨 다는것, 두개 묶을 때 | 쓴다.
        // parseInt에 들어갈 때는 공백을 trim()으로 제거해주자.
        
        // LinkedList 이용
//        LinkedList<Integer> q = new LinkedList<>();
//        
//        for(String s : str ) {
//        	q.add(Integer.parseInt(s.trim()));
//        }
//        
//        for(int i=0; i<my_string.length(); i++) {
//        	if ( my_string.charAt(i)=='+') {
//        		int a = q.poll();
//        		int b = q.poll();
//        		q.add(0, a+b);
//        	} else if( my_string.charAt(i)=='-') {
//        		int a = q.poll();
//        		int b = q.poll();
//        		q.add(0, a-b);
//        	}
//        }
        // String 배열로만
    }
}
