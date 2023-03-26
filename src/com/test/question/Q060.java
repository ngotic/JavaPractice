package com.test.question;

public class Q060 {

	public static void main(String[] args) {
		// 요구사항] 아래와 같이 출력하시오.
		// 조건 ] 마지막 숫자가 100이 넘기 전까지 출력하시오.
		// 
		int n1 = 1, n2 =1;
		int last = n1 + n2; // n3
		int sum = n1 + n2;
		
		
		System.out.printf("%d + %d + ", n1, n2);
		
		while ( last < 100) {
			
			// 먼저 출력
			System.out.printf("%d + ", last);
			// sum에 last 더하고
			// ==== fibonacci 로직 ====
			sum += last;
			n1 = n2;
			n2 = last;
			last = n1+n2;
			// =======================
			
		}

		System.out.printf(" = %d\n", sum);

	}

}
