package com.test.question;

import java.util.Scanner;

public class Q085 {

	public static void main(String[] args) {
		// 주민번호 유효성 검사 STEP >
		// 1. 각 자리에 234567892345 를 곱한다.
		// 2. 각 자리의 숫자를 모두 더한다.
		// 3. 11로 나눈 나머지 값을 구함
		// 4. 11 - 나머지 = 유효성 번호
		// 단, 마지막 결과가 두자리인 경우 다시 10으로 나눈 마너지 값을 구함
		// 11 - 1 = 10 > % 10 > 0
		// 11 - 0 = 11 > % 10 > 1
		//951220-1021547 > 올바르
		
		//951220-123456   7 > 잘못
		
		// 1. 주민번호는 총 13자리 > 13자리가 아닌 경우 에러 > 하이픈을 제외하고 13자리
		Scanner scan = new Scanner(System.in);
		System.out.print("주민등록번호: ");
		String jumin = scan.nextLine();
		// 1차 
		if (jumin.contains("-")) {// - 있으면 짤라서 다시 붙이기
			String[] juminArr = jumin.split("-");
			jumin = String.join("", juminArr);
		} //  없으면 그냥 처리
		// 2차 문자열 개수 체크
		
		if(jumin.length()!=13) {
			System.out.println("올바르지 않은 주민등록번호입니다.");
			scan.close();
			return ; 
		}
		int sum = 0;
		int[] nums = {2,3,4,5,6,7,8,9,2,3,4,5};
		for(int i=0; i<jumin.length()-1; i++) {
			int one = jumin.charAt(i)-'0';
			sum+= one*nums[i];
		}
		
		int valid = sum % 11;
		
		valid = 11 - valid;
		
		if (valid == 11 )
			valid = 1;
		else if (valid == 10 )
			valid = 0;
	
		int last = jumin.charAt(jumin.length()-1)-'0';
		if (last == valid )
			System.out.println("올바른 주민등록번호입니다.");
		else 
			System.out.println("올바르지 않은 주민등록번호입니다.");
		
		scan.close();
	}

}
