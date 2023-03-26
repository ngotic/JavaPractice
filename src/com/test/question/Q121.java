package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q121 {

	public static void main(String[] args) throws Exception {
		String[] numStr = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		String path = "C:\\class\\code\\java\\파일_입출력_문제\\숫자.dat";
		String path2 = "C:\\class\\code\\java\\파일_입출력_문제\\숫자_변환.dat";
		BufferedReader reader = new BufferedReader(new FileReader(path)); 
		BufferedWriter writer = new BufferedWriter(new FileWriter(path2));
		int ch;
		while( (ch=reader.read())!=-1) {
			if ( ch-'0' >= 0 && ch-'0'<= 9) {
				writer.write(numStr[ch-'0']);
			} else {
				writer.write(ch);
			}
		}
		System.out.println("변환 후 다른 이름으로 저장하였습니다.");
		reader.close();
		writer.close();

	}

}
