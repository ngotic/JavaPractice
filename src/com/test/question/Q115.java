package com.test.question;

import java.io.File;

public class Q115 {

	public static void main(String[] args) {
		
		String path = "C:\\class\\code\\java\\파일_디렉토리_문제\\파일 제거"; //
		
		File dir = new File(path);
		File[] files = dir.listFiles();
		int count =0;
		for(File file : files) {
			if(file.length() == 0) {
				file.delete();
				count++;
			}
		}
		
		System.out.printf("총 %d개의 파일을 삭제했습니다.\n",count);
	}

}
