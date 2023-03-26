package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q069 {

	public static void main(String[] args) {
//		요구사항 ] 배열의 요소를 순차적으로 2개씩 더한 결과를 배열로 생성한 뒤 출력하시오.
//		조건..
//		원본 배열 길이: 사용자 입력
//		원본 배열 요소: 난수(1~9)
//		결과 배열 길이: 사용자 입력 / 2
//		입력..
//		배열 길이: 10 
//		출력..
//		원본: [ 1, 5, 3, 6, 2, 7, 8, 2, 2, 9 ]
//		결과: [ 6, 9, 9, 10, 11 ]
		Scanner scan = new Scanner(System.in);
		System.out.printf("배열 길이: ");
		int num = scan.nextInt();
		int[] srcAry = new int[num];
		for (int i = 0; i < num; i++) {
			srcAry[i] = (int) (Math.random() * 9) + 1;
		}

		
		double half = num / 2;
		int length = (int) Math.ceil(half);
		int[] dstAray = new int[length];

		
		for ( int i = 0; i < half; i ++) {
			dstAray[i] = srcAry[i*2] + srcAry[2*i + 1];
		}
		
		if( num % 2!=0 )
			dstAray[length - 1] = srcAry[ num - 1];

		System.out.printf("원본: ");
		System.out.println(Arrays.toString(srcAry));
		System.out.printf("결과: ");
		System.out.println(Arrays.toString(dstAray));

		scan.close();
	}

}
