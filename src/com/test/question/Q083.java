package com.test.question;

import java.util.Scanner;

public class Q083 {

	public static void main(String[] args) {
		// 요구사항 ] 파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오.
		// 조건..
		// 확장자는 다음으로 제한한다.
		// mp3
		// jpg
		// java
		// hwp
		// doc
		String[] ext = { "mp3", "jpg", "java", "hwp", "doc" };
		int   [] extCnt = new int [ext.length];
//		파일명: 인기가요.mp3 
//		파일명: cat.jpg 
//		파일명: Ex01.java 
//		파일명: icon.jpg 
//		파일명: 수업_정리.doc 
//		파일명: Scanner.java 
//		파일명: food.jpg 
//		파일명: 공지사항.hwp 
//		파일명: 이력서.hwp 
//		파일명: 출금내역.doc
		Scanner scan = new Scanner(System.in);
		
		int cnt = 10;
		for (int i = 0; i < cnt; i++) {
			System.out.print("파일명: ");
			String fileName = scan.nextLine();
			String[] splits = fileName.split("\\."); // dot은 예약어이다. regex에 먹히지 않는다. 먹히게 하려면 escape를 시켜야 한다.
			
			
			// System.out.println(splits.length);
			if(splits.length==2) {
				for(int j=0; j<ext.length; j++) {
					if (splits[1].trim().equals(ext[j])) { //equals를 쓸 떄 trim을 해주자 
						extCnt[j]++;
					}
				}
			}
		}
		
		for(int j=0; j<ext.length; j++) {
			System.out.printf("%s : %d\n",ext[j], extCnt[j]);
		}
		
		scan.close();
	}

}
