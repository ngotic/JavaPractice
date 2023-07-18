package com.test.programmers;

public class P0008 {
	// 제곱수 판별하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(144));
	}
	//Math.sqrt(n) 는 제곱근이다.
	
	 public static int solution(int n) {
//	        int answer = 0;
//	        int a =1;
//	        
//	        //12보다 작아져
//	        while( n/a > a ) {
//	        	a++;
//	        }
//	        if(n % a ==0)
//	        	return answer = 1;
//	        else 
//	        	return answer = 2;		 
	      // 제곱근 이용  
	      if (n % Math.sqrt(n) == 0) {
		      return 1;
		  } else {
		      return 2;
		  }
	      
	      
	      
	 }

}


//if (n % Math.sqrt(n) == 0) {
//    return 1;
//} else {
//    return 2;
//}

// 제곱수 그냥 여기서 
