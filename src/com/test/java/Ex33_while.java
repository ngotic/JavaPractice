package com.test.java;

public class Ex33_while {

	public static void main(String[] args) {
		/* 반복문
		   1. for (v)
		   2. while
		   3. do while
		   4. for (X)
		
		   while문, do while문
		   // 조건식 > 조건을 만족하면 실행문을 1번 실행한다.
		    if(조건식){
		      실행문
		    }
		    
		    // 반복문 > 조건을 만족하면 실행문을 실행한 뒤, 다시 조건을 확인 후 
		     while(조건식){
		     	실행문;
		     }
		   
		     제어 순서때문... 프로그래밍 코드는 위에서부터 아래로 실행한다.
		     do {
		     	실행문;
		     }while(조건식); // 문장 종결자 필요
		     
		     조건문 
		     - if > 대부분 사용
		     - switch > 가끔씩 > 가독성
		     
		     반복문 
		     - for
		     - while
		     - do while
		     
		     분기문
		     - break
		     - continue
		     
		*/
		// m1();
		//m2();
		// m3();
	}

	private static void m3() {
		// for문을 while문으로 따와서 정리
		// 요구사항 ] \\
		int sum = 0;
		for(int i=1 ; i <=10 ; i++) {
			sum += 1;
		}
		System.out.println(sum);
		
		
		sum = 0;
		int n = 1;
		while(n <= 10) {
			sum += n;
			n++;
		}
		System.out.println(sum);
		
	}

	private static void m2() {
		int num = 10;
//		while( num < 5) {
//			System.out.println(num);
//			num++;
//		}
		do { // 한번은 찍힌다. 
			System.out.println(num);
			num++;
		} while( num<5 );
		
		System.out.println("종료");
		
	}

	private static void m1() {
		// 요구사항] 1~10까지 출력하시오.
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		int num = 1;
		while(num <= 10) {
			System.out.println(num);
			num++;
		}
		
	}

}
