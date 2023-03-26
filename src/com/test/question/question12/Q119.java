package com.test.question;

import java.io.File;

public class Q119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\class\\code\\java\\파일_디렉토리_문제\\직원";
		
		File dir = new File(path);// 직원 폴더.
		File[] files = dir.listFiles();
		//아무게_2014__17.txt
		for(File f : files) {
			String[] fileNameSplit = f.getName().split("_"); 
			//split의 이슈는 연속으로 __ 두개 나오면 _ _이렇게 짤린다는 것 그래서 스플릿된 요소하나가 빈문자열이 들어가
			
			if(fileNameSplit.length<3) continue; 
			// System.out.println("split len : "+fileNameSplit.length);
			// __는 4개로 짤리고, _는 3개로 짤리고
			
			File name = new File(path+"\\"+fileNameSplit[0]);
			if(!name.exists()) name.mkdir();
			
			File year = new File(path+"\\"+fileNameSplit[0]+"\\"+fileNameSplit[1]);
			if(!year.exists()) year.mkdir();
			
			File move = new File(path+"\\"+fileNameSplit[0]+"\\"+fileNameSplit[1]+"\\"+f.getName());
			
			f.renameTo(move);
			
		}
		System.out.println("분류가 완료되었습니다.");
		
	}

}
