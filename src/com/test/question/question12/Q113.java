package com.test.question;

import java.io.File;

public class Q113 {

	public static void main(String[] args) {
		
		//파일위치 : C:\class\code\java\파일_디렉토리_문제\음악 파일;
		String path ="C:\\class\\code\\java\\파일_디렉토리_문제\\음악 파일";
		
		File dir = new File(path);
		File[] files = dir.listFiles();
		int cnt = 1;
		for(File file : files ) { //
			
			String temp = String.format("[%03d]%s",cnt++, file.getName());
			File f2 = new File( path+"\\"+temp ); //
			
			System.out.println(temp);
			file.renameTo(f2);
		
		} ///
		
	}

}
