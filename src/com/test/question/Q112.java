package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q112 {

	public static void main(String[] args) {
		//		요구사항]
		//		지정한 파일을 다른 폴더로 이동하고, 이동한 파일과 동일한 파일명의 파일이 존재하는 경우 중복 처리하시오.
		//
		//		조건..
		//		C:\class\java\file\AAA\test.txt → C:\class\java\file\BBB\test.txt 로 이동하는 것이 목적
		//		BBB 폴더에 이미 test.txt가 있을 경우 덮어쓰거나(y) 작업을 취소(n) 하시오.
		
		String path1 = "C:\\class\\code\\java\\file\\AAA\\test.txt";
		String path2 = "C:\\class\\code\\java\\file\\BBB\\test.txt";
		
		File f1 = new File(path1);
		File f2 = new File(path2);
		
		// * method coding
		// [ Success / Fail 분류 ]
		// 1. 성공하는 경우
		/// BBB 폴더가 있고, test.txt 파일이 없는 경우

		// 2. 실패하는 경우
		//// path2 경로가 이미 존재하지 않음, 이미 test.txt파일이 있는 경우    
		
		// 덮어쓴다? > 기존 파일을 지우고, 다시 실행
		// f2에 그런 파일이 없는 경우 
		
		// 1. path2의 BBB까지의 폴더가 있냐 없냐 여부 따짐 없으면 Fail
		String parent  = path2.substring(0, path2.lastIndexOf("\\"));
		File pDir = new File(parent);
		
		if( !f1.exists() ) {
			System.out.println(path1+" 이 존재하지 않습니다." );
			return; 
		}
		
		if( pDir.exists() ) {
			// 1. 파일의 이동 
			System.out.println("파일 이동을 실행합니다.");
			
			if( !f2.exists() ) {
				//Success phase
				f1.renameTo(f2);
				
			} else {
				// 이미 동일한 파일이 존재 renameTo 실패예상 
				// 덮어쓰기 logic 시작
				Scanner scan = new Scanner(System.in);
				System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) ");
				String yes = scan.nextLine();
				if(yes.equals("y") || yes.equals("Y")) {
					f2.delete(); // 기존 f2파일 삭제
					f1.renameTo(f2); // 다시 옮김
					System.out.printf("%s. 파일을 덮어썼습니다.\n", yes);
				} else if (yes.equals("n") || yes.equals("N")) {
					System.out.printf("%s. 작업을 취소합니다.\n", yes);
				} else {
					System.out.println("올바른 입력을 하시오.");
				}
				scan.close();
			}
			
		} else {
			System.out.println("파일을 이동할 수 없습니다.");
		} 
		
		
		
	}

}
