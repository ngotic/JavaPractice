package com.test.packagetest; // 패키지 선언있어야함

// 현재 클래스가 소속된 패키지

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
 * 패키지, package 클래스 관리 도구 클래스를 분류하는 폴더 역할 물리적 > 폴더
 */
public class PackageTest {
	public static void main(String[] args) {
		// <여러줄 입력받기>
		String result = "";
		try {
			System.out.println("입력을 시작합니다. 종료하시려면 엔터를 치고 + 'quit'를 입력하세요.");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			String line;
			while ((line = buffer.readLine()) != null) {
				if (line.equals("quit")) { // quit를 입력하면 종료
					System.out.println("▶ 입력을 종료하였습니다.");
					break;
				}
				else {
					result += line + '\n';
				}
			}
			System.out.println("입력한 내용을 말해볼게요 : ");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}





