package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q110 {

	public static void main(String[] args) {
		//		요구사항
		//		파일의 경로를 입력받아 파일 정보를 출력하시오.
		//		조건..
		//		파일 크기 단위 변환 출력(소수이하 1자리까지) : B, KB, MB, GB, TB
		//		입력..
		//		파일 경로 : C:\class\code\java\file\class.txt 
		//		출력..
		//		파일명 : test.txt 
		//		종류 : txt 파일 
		//		파일 크기 : 45B
		Scanner scan = new Scanner(System.in);
		System.out.print("파일 경로 : ");
		String path = scan.nextLine();
		File file = new File(path);
		if ( file.exists() ) {
			
			System.out.println("파일명 : "+file.getName());
			
			String[] exts = file.getName().split("\\."); // regex에서 .은 \\으로 escape
			
			if(exts.length == 2)
				System.out.println("종류 : "+ exts[1]);
			else 
				System.out.println("확장자가 없음.");
			
			System.out.printf("파일 크기 : %s\n", fileSize(file.length()));
			
		} else {
			System.out.println("그런 파일 없습니다.");
		}
		scan.close();
		
	}   
	private static String fileSize(long length) {
		String[] unit = {"B", "KB", "MB", "GB", "TB"};

		double size = length;
		for(int i=0;i <unit.length; i++) {
			
			if ( (int)(size / 1024)==0 ) {
				return String.format("%.1f", size)  + unit[i];
			}
			
			size /= 1024.0;
				
		}
		// C:\class\code\java\file\class.txt 
		return String.format("%.1f",size)  + unit[unit.length-1];
	}

}
