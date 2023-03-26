package com.test.java;

public class Ex32_for {

	public static void main(String[] args) {
		/*
		 중첩된 For문, Nested for statements
		 
		 for(){
		 
		 }
		 
		 - 2 중 for문
		 for () {
		 	for() {
		 	
		 	}
		 }
		 
		 - 3중 for문
		 for() {
		 	for() {
		 		for() {
		 		
		 		}
		 	}
		 }
		 
		*/
		// m1();
		// m2();
		// m3();
		//m4();
		
	}

	

	private static void m4() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=i; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

	private static void m3() {
		for(int i=0; i<10; i++) {
			for(int j=0; j<10 ;j++) {
//				if(i==5) {
//					break; //자신이 속한 제어문만 빠져나온다.
//				}
				//continue;
				
				System.out.printf("i: %d, j: %d\n", i,j );
			}
		}
		
	}

	private static void m2() {
		for(int j=2; j<=9; j++) {
			for(int i=1; i<=9 ;i++) {
				System.out.printf("%d x %d = %2d\n", j, i, j*i);
			}
		}
		System.out.println();
		
	}

	private static void m1() {
		int a  = 10;
		if( a>0 ) {
			int b =10;
			System.out.println(a);
		}
		
		for(int i=0; i< 10; i++) {
			System.out.println("i: " + i);
		}
		System.out.println();
		System.out.println();
		
		for(int i=0 ; i<10; i++) {
			for(int j=0 ;j <10 ;j++) {
				// System.out.println("안녕하세요" ); // 몇바퀴?
				System.out.printf("i: %d, j: %d\n",i, j ); // 몇바퀴?
			}
		}
		System.out.println();
		System.out.println();
		
		// 시계 바늘(시침, 분침, 초침)
		for(int i=0 ; i<10; i++) {
			for(int j=0 ;j <10 ;j++) {
				for(int k=0;k<10;k++) {
					System.out.printf("i: %d, j: %d\n",i, j ); // 몇바퀴?
				}
			}
		}
		
		// 시계 바늘(시침, 분침, 초침)
		for(int hour=0 ; hour< 24 ; hour++) {
			for(int min=0 ; min < 60 ; min++) {
				for(int sec=0 ; sec< 60 ; sec++) {
					System.out.printf("%2d:%2d:%2d\n", hour, min, sec);
				}
			}
		}
		/*
		//아파트 
			for(단지){
				for(동){
					for(층){
						for(호){
						
						}
					}
				}
			}
		*/
		
	}

}
