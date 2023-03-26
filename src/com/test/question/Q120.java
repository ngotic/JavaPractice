package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q120 {

	public static void main(String[] args) throws Exception {
		// 
		String path = "C:\\class\\code\\java\\파일_입출력_문제\\이름수정.dat";
		String path2 = "C:\\class\\code\\java\\파일_입출력_문제\\이름수정_변환.dat";
		BufferedReader reader = new BufferedReader(new FileReader(path)); 
		BufferedWriter writer = new BufferedWriter(new FileWriter(path2));
		
		String filter = "유재석";
		String filterTo = "메뚜기";
		String line = null;
		while( (line=reader.readLine()) != null) {
			// ★ readLine() 자체는 \r\n을 읽지만 지워버린다. > 사용자가 의도적으로 넣은 엔터가 아니니까 
			// "그래서 readline으로 받은 line을 write로 바로 쓰는 경우 문제가 된다." > 의식하기
			// 그래서 문자열에 안들어온다. 그걸 넣어줘야한다. 추가로
			// System.out.print(line);
			if ( line.contains(filter)) {
				writer.write(line.replace(filter, filterTo));
				writer.newLine();
			} else {
				writer.write(line); //
				writer.newLine();   // 요게 한쌍이다.
			}
		}
		System.out.println("변환 후 다른 이름으로 저장하였습니다.");
		writer.close();
		reader.close();
	}

}
