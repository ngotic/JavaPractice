package com.test.question;

import java.io.File;
import java.util.HashMap;

public class Q117 {

	public static void main(String[] args) {
		//		요구사항
		//		내용물이 있는 'delete' 폴더를 삭제하시오.
		//
		//		조건..
		//		재귀 메소드 사용
		//		삭제된 파일과 자식 폴더 개수를 출력하시오.
		//		리소스..
		//		폴더 > 폴더 삭제
		//		파일 다운로드
		String path = "C:\\class\\code\\java\\파일_디렉토리_문제\\폴더 삭제\\delete";
		HashMap<String, Integer> delCnt = new HashMap<String, Integer>();
		File dir = new File(path);
		delCnt.put("file", 0);
		delCnt.put("dir", 0);
		delete(dir, delCnt);
		System.out.println("폴더를 삭제했습니다.");
		System.out.printf("삭제된 폴더는 %d개이고, 파일은 %d개 입니다.\n",
				delCnt.get("file"),
				delCnt.get("dir"));

	}
	
	// 폴더의 삭제 : 빈 폴더만 삭제가능, 따라서 폴더 안에 삭제 모조리 삭제
	// 재귀구조 > [ 종료조건 > 리프노드 : 파일 ], [행동: 삭제, 언제>후위], [2갈래>파일, 디렉토리]
	public static void delete(File dir, HashMap<String, Integer> cnt) {
		
		// file
		File[] files = dir.listFiles();
		for( File f : files) {
			if(f.isFile()) {
				//System.out.println("file: "+ f.getName());
				f.delete();				
				cnt.put("file", cnt.get("file") + 1);
			} else if(f.isDirectory()) {
				//System.out.println("dir: "+ f.getName());
				delete(f, cnt);
			}
		}
		
		if (dir.isDirectory()) { 
			dir.delete();
			cnt.put("dir", cnt.get("dir") + 1);
		}
		
	}
	
}
