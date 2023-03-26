package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q067 {

	public static void main(String[] args) {
		// 요구사항 ] 배열에 요소를 삽입하시오.
		//		조건..
		//		배열 길이: 10
		//		마지막 요소는 우측으로 옮겨질 공간이 없으면 삭제된다.
		Scanner scan = new Scanner(System.in);
		
		//int[] source = {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};// 
		int[] source = {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};//
		
		System.out.print("삽입 위치: ");
		int pos = scan.nextInt();
		System.out.print("값: ");
		int value = scan.nextInt();
		
		System.out.println("원본: "+Arrays.toString(source));
		
		for(int i = source.length - 2; i>= pos; i--) {
			source[i+1] = source[i];
		}
		
		source[pos] = value;
		System.out.println("결과: "+Arrays.toString(source));
	
		scan.close();
	}

}
