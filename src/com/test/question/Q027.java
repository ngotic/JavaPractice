package com.test.question;

import java.util.Scanner;

public class Q027 {

	public static void main(String[] args) {
		// 요구사항] 문자 1개를 입력받아 아래와 같이 출력하시오.
		//조건 
		//		f, F → Father
		//		m, M → Mother
		//		s, S → Sister
		//		b, B → Brother
		//		유효성 검사를 하시오.(위의 문자가 아닌 문자는 예외 처리)
		Scanner scan = new Scanner(System.in);
		System.out.print("문자: ");
		String character = scan.nextLine();
		
		char ch = character.charAt(0);
		String result="";
		switch(ch) {
			case 'f':
			case 'F':
					result = "Father";
					System.out.println(result);
					break;
			case 'm':
			case 'M':
					result = "Mather";
					System.out.println(result);
					break;
			case 's':
			case 'S':
					result = "Sister";
					System.out.println(result);
					break;
			case 'b':
			case 'B':
					result = "Brother";
					System.out.println(result);
					break;
			default :
					System.out.println("입력한 문자가 올바르지 않습니다.");
					break;
		}
		scan.close();
	}

}
