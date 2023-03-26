package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q123 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//김게돈,서울시 강남구 나동, 010-6244-7008
		try {
			String path = "C:\\class\\code\\java\\파일_입출력_문제\\단일검색.dat";
			BufferedReader reader = new BufferedReader(new FileReader(path));
			System.out.print("이름: ");
			String name = scan.nextLine();
			String line = null;
			boolean search=false;
			while( ( line=reader.readLine()) != null) {
				if ( line.contains(name)) {
					String[] temp= line.split(",");
					System.out.printf("[%s]\n", name);
					System.out.printf("번호: %s\n", temp[0].trim());
					System.out.printf("주소: %s\n", temp[2].trim());
					System.out.printf("전화: %s\n", temp[3].trim());
					search= true;
					break;
				}
			}
			if(!search)
				System.out.println("찾는 사람이 없음.");
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		scan.close();
	}

}
