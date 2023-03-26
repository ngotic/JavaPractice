package com.test.question;

import java.util.Scanner;

public class Q076 {

	public static void main(String[] args) {
	//		요구사항
	//		성적을 입력받아 아래와 같이 출력하시오.
	//		조건..
	//		String[][] score = new String[10][3];
	//		입력..
	//		국어 점수: 80 
	//		영어 점수: 50 
	//		수학 점수: 70 
	//		출력..	 	 	 
	//		■           //3개중에 max만큼 for문 		
	//		■		■  
	//		■		■
	//		■	■	■
	//		■	■	■
	//		■	■	■
	//		■	■	■
	//		■	■	■
	//		국어	영어	수학
		String [][] score = new String[10][3];
		Scanner scan = new Scanner(System.in);
		System.out.printf("국어 점수: ");
		int kor = scan.nextInt();
		System.out.printf("영어 점수: ");
		int eng = scan.nextInt();
		System.out.printf("수학 점수: ");
		int math = scan.nextInt();
		
		int[] subject = new int[] {kor, eng, math};
		
		// 값 셋팅
		for(int i=0; i< subject.length; i++) {
			for(int j=0 ; j<subject[i] ; j+=10) {
				score[j/10][i]="■";
			}
		}
		
		// 값 출력
		for(int i=9 ; i >= 0; i--) {
			for(int j=0; j< subject.length; j++) {
				String square = score[i][j];
				if(square != null )
					System.out.printf("%2s\t", square);
				else 
					System.out.printf("%2s\t", " ");
			}
			System.out.println();
		}
		System.out.printf("-------------------\n");
		System.out.printf("국어\t영어\t수학\t");
		scan.close();
	}

}
