package com.test.question;

import java.util.Scanner;

public class Q087 {

	public static void main(String[] args) {
//		요구사항
//		영단어를 입력받아 분리하시오.
//
//		조건..
//		합성어를 입력한다.
//		합성어는 파스칼 표기법으로 입력한다.
//		출력은 각 단어를 공백으로 구분한다
		Scanner scan = new Scanner(System.in);
		System.out.printf("단어: ");
		String word = scan.nextLine();
		//String result="";
		StringBuilder result= new StringBuilder("");
		
		
		// Hello World News
		int index = 0;
		for(int i=1; i<word.length() ;i++) {
			if( word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
				result.append(word.substring(index, i)).append(" ");
				index=i;
			} 
		}
		
		if(index!=0) {
			result.append(word.substring(index, word.length()));
			System.out.println("결과: "+result);
		}
		else
			System.out.println("결과: "+word);
	
		
		scan.close();
	}

}
