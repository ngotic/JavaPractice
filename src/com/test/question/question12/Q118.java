package com.test.question;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q118 {

	public static void main(String[] args) {
			//		요구사항
			//		폴더 내의 모든 파일들을 찾아 크기를 비교하고, 크기가 큰 순으로 정렬하시오.
			//
			//		조건..
			//		자식 폴더내의 파일도 모두 검색하시오.
			//		부모 자식 폴더에 상관없이 파일을 한번에 비교하시오.
			//		리소스..
			//		폴더 > 크기 정렬
			//		파일 다운로드
		
		    //      파일객체 안에 다 있음, 파일 수는 몰라 동적으로 추가 해야함
			String path = "C:\\class\\code\\java\\파일_디렉토리_문제\\크기 정렬";
			ArrayList<File> list = new ArrayList<File>();
			File dir = new File(path);
			addFile(dir, list);
			Collections.sort(list, new MySortStandard());
			System.out.printf("%-30s\t%10s\t%10s\n","[파일명]","[크기]","[파일이 들어있는 폴더]");
			
			for(File f : list) {
				System.out.printf("%-30s\t%10s\t%10s\n",f.getName(), fileSize(f.length()),new File(f.getParent()).getName());
			}
			
	} // 117번 문제 이용
	
	
	public static void addFile(File dir, ArrayList<File> list) {
		
		// file
		File[] files = dir.listFiles();
		for( File f : files) {
			if(f.isFile()) {
				//System.out.println("file: "+ f.getName());
				list.add(f);
			} else if(f.isDirectory()) {
				//System.out.println("dir: "+ f.getName());
				addFile(f, list);
			}
		}
		
	}
	
	// 114번 문제 이용
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
// f1 > f2 : 크면 1
class MySortStandard implements Comparator<Object>{
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof File && o2 instanceof File ) {
			File f1= (File)o1;
			File f2= (File)o2;
			return (int)(f1.length() - f2.length()); 
		}
		return 0;
	}
	
}
