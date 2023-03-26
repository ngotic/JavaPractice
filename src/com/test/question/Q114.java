package com.test.question;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q114 {

	public static void main(String[] args) {
		
		//파일위치 : C:\class\code\java\파일_디렉토리_문제\확장자별 카운트;
		//		요구사항
		//		이미지 파일이 있다. 확장자별로 파일이 몇개 있는지 세시오.
		//
		//		조건..
		//		새로운 확장자 파일이 추가되도 동작이 가능하게 구현하시오.
		//		'mouse.bmp' 추가를 하면.. 소스 수정 없이도 *.bmp : 1개 출력이 되게 하시오.
		//		리소스..
		//		폴더 > 확장자별 카운트
		//		파일 다운로드
		//		출력..
		//		*.gif: 10개 
		//		*.jpg: 5개 
		//		*.png: 3개
		// 이미지 파일포맷들 : .gif, .jpg, .png. .jpeg, .bmp
		HashMap<String, Integer> map = new HashMap<>();
		
		String path = "C:\\class\\code\\java\\파일_디렉토리_문제\\확장자별 카운트"; //
		
		File dir = new File(path);
		
		File[] files = dir.listFiles();
		
		for(File f : files) {
			String fileExt = findExt(f.getName());
			if(fileExt != null) {
				if(map.containsKey(fileExt))
					map.put(fileExt, map.get(fileExt) + 1);
				else 
					map.put(fileExt, 1);
			}
		}
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		
		for(Map.Entry<String, Integer> entry : set) {
			System.out.printf("*.%s: %d\n", entry.getKey(), entry.getValue());
		}
		
		
	}
	
	// 확장자를 리턴해준다.
	public static String findExt(String path) {
		String[] extList = {"gif", "jpg", "png" , "jpeg", "bmp"};
		for ( String ext : extList) {
			String[] split = path.split("\\.");
			if( split.length == 2) {
				if ( split[1].toLowerCase().equals(ext) )
					return ext;
			} else {
				System.out.printf("%s 파일 포멧이 이상함.\n", path);
				return null;
			}
			
		}
		return null;
	}

}
