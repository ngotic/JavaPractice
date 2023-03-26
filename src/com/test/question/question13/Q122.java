package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Q122 {

	public static void main(String[] args) throws Exception {
		String path = "C:\\class\\code\\java\\파일_입출력_문제\\성적.dat";
		BufferedReader reader =new BufferedReader(new FileReader(path));
		String line=null;
		ArrayList<String> success= new ArrayList<>();
		ArrayList<String> fail= new ArrayList<>();
		while( ( line = reader.readLine())!=null ) {
			String[] splitLine = line.split(",");
			String name = splitLine[0];
			int kor = Integer.parseInt(splitLine[1]);
			int eng = Integer.parseInt(splitLine[2]);
			int math = Integer.parseInt(splitLine[3]);
			double avg = (kor+eng+math)/3.0;
			boolean pass ;
			if( kor < 40 || eng < 40 || math < 40) {
				pass=false;
			} else if( avg >= 60 ) {
				pass = true;
			} else {
				pass = false;
			}
			if(pass) {
				// System.out.printf("%s %d %d %d %.1f\n", name, kor, eng, math, avg);
				success.add(name);
			} else {
				fail.add(name);
			}
		}
		
		System.out.println("[합격자]");
		for(String name : success)
			System.out.println(name);
		System.out.println();
		
		System.out.println("[불합격자]");
		for(String name : fail)
			System.out.println(name);
		
		reader.close();
	}

}
