package com.test.question;

import java.io.File;
import java.util.HashSet;

public class Q116 {

	public static void main(String[] args) {
		HashSet<String> A = new HashSet<>();
		HashSet<String> B = new HashSet<>();
		
		String path1 = "C:\\class\\code\\java\\파일_디렉토리_문제\\동일 파일\\MusicA";
		String path2 = "C:\\class\\code\\java\\파일_디렉토리_문제\\동일 파일\\MusicB";
		File dir1 = new File(path1);
		File[] fList1 = dir1.listFiles();
		
		File dir2 = new File(path2);
		File[] fList2 = dir2.listFiles();
		
		for(File f1 : fList1) {
			A.add(f1.getName());
		}
		
		for(File f2 : fList2) {
			B.add(f2.getName());
		}
		
		A.retainAll(B); //A∩B : B에 있는걸 A에도 모두 남겨놔라
	
		for(String fileName : A) {
			System.out.println(fileName);
		}
		
		
	}

}
