package com.test.question;

import java.util.Scanner;

public class Q089 {
	
	final static String[] numStr = { "", "일", "이", "삼", "사","오","육","칠","팔","구" };
	final static String[] unit   = {"원", "십", "백", "천", "만"};
	
	public static void main(String[] args) {
		//		요구사항]
		//		입력받은 금액을 한글로 출력하시오.
		//		조건..
		//		입력 범위(원): 0 ~ 99,999,999
		//		입력..
		//		금액(원): 120 
		//		출력..
		//		일금 일백이십원
		//		입력..
		//		금액(원): 53216 
		//		출력..
		//		일금 오만삼천이백일십육원
		//		입력..
		//		금액(원): 1234 ,5678 
		//		출력..
		//		일금 일천이백삼십,  사만오천육백칠십팔원
		
		Scanner scan = new Scanner(System.in);
	
		// 1. 5자리까지면
		// 2. 5자리가 넘어가면?
		// 두 파트로 짜른다.  
		// 각자 번역 > 붙인다.concat
		System.out.printf("금액(원): ");
		String price = scan.nextLine();
		String result="";
		int length = price.length(); 
		if( length <= 5 ) {
			result = translate(price, 0);
		} else { // 5자리가 넘어가면?? > 두 부분으로 쪼갠다.
			String front = translate(price.substring(0, length - 5), 1);
			String rear = translate(price.substring(length - 5,length) , 0);
			result = front.concat(rear);
		}
		
		System.out.println("일금 "+result);
		scan.close();
	}
	public static String translate(String price, int offset) {
		
		String result="";
		for(int i=price.length()-1, a=offset; i>=0; i--, a++) {
			int num = price.charAt(i)-'0'; // digit
			result = numStr[num]+unit[a]+result;
		}
		return result;
	}

}
