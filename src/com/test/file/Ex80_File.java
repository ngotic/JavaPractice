package com.test.file;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Ex80_File {

	private static int fileCount;
	private static int dirCount;
	private static long length;
	
	static {
		fileCount = 0; 
		dirCount = 0; 
		length = 0; 
		// "정적변수니까 [정적생성자]에서 초기화해라"
	}
	
	public static void main(String[] args) {
		// Ex80_File.java
		/*
		 * 1. 파일 / 디렉토리 조작 - 윈도우 탐색기로 하는 행동 > 자바로 구현 - 파일 > 정보 확인, 새로 만들기, 이름 바꾸기, 이동하기,
		 * 삭제하기 등... - 폴더 > 정보 확인, 새로 만들기, 이름 바꾸기, 이동하기, 삭제하기 등...
		 * 
		 * 2. 파일 입출력 - 메모장으로 하는 행동 - 텍스트 입출력 - 메모장, 이클립스 등.. 텍스트 편집기
		 */
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		// m8();
		// m9();
		// m10();
		// m11();
		// m12();
		// m13();
		// m14();
		// m16();
		// m17();
		// m18();
		// m19();
		// 재귀 메소드 == 트리 구조 탐색(조작) 
	}
	
	private static void m19() {

		String path = "C:\\class\\code\\java\\파일_디렉토리_문제\\폴더 삭제\\delete";
		File dir = new File(path);
		
		if(dir.exists()) {
			//System.out.println(dir.delete());
			delete(dir); // 재귀메소드로 전달
		}
	}

	private static void delete(File dir) { // 비어있찌 않은 폴더를 삭제하는 메서드
		// 1. 목록 가져오기
		File[] list = dir.listFiles();
	
		// 2. 파일 삭제
		for(File file : list) { ///  
			if(file.isFile()) {
				file.delete();
			}
		}
		// 3. 자식 폴더 > 자식 폴더 빈폴더 > 삭제
		for(File subdir : list) { ///
			if(subdir.isDirectory()) {
				delete(subdir); // 이번엔 자식폴더로 넘어온다.
			}
		}
		// 4. 여기까지 왔다.? 호출된 폴더 > 파일 모두 삭제 + 자식 폴더 없음
		// 4. 호출된 폴더 > 파일 모두 삭제 + 자식 폴더 없음 == 빈폴더
		dir.delete(); 
	}
	
	
	private static void m18() { // 리턴값 특성이 하나만 주는데... 
		// 리턴처리하고 다시 주기가 좀 불편하다. 
		// C:\class\dev\eclipse > 탐색
		// - 파일 11,598, 폴더 2,379
		// - 730MB(765,490,890 바이트)
		// - 모든 파일들을 저한게 폴더 크기다.
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		
		if(dir.exists()) {
			count(dir); 
		}
		
		System.out.printf("총 파일 개수: %,d개\n", fileCount); // 시간이 조금 걸리네
		System.out.printf("총 폴더 개수: %,d개\n", dirCount); // 시간이 조금 걸리네
		System.out.printf("폴더 크기: %,dMB\n", length / 1024 / 1024); // 시간이 조금 걸리네
		
	}


	private static void count(File dir) {
		// 1. 목록 가져오기
		File[] list = dir.listFiles();
	
		/// "자식 폴더가 없으면 여기 for문에 들어오지 못한다." >> for문도 조건이다. 
		// 2. 파일 개수
		for(File file : list) { /// 
			if(file.isFile()) {
				fileCount++;
				length += file.length();
			}
		}
		// 3. 자식 폴더 > 방그 행동을 반복
		for(File subdir : list) { ///
			if(subdir.isDirectory()) {
				dirCount++;
				count(subdir); // 이번엔 자식폴더로 넘어온다.
			}
		}
	}

	private static void m17() {
		// C:\class\dev\eclipse > 탐색
		// - 파일 11,598, 폴더 2,379
		// - 730MB(765,490,890 바이트)
		// 근데 원하는 것은 어찌됫든 폴더마다의 파일의 개수를 알고 싶다.
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		
		int count = 0;
		
		if(dir.exists()) {
			
			// 자식파일 > 개수 
			File[] list = dir.listFiles();
			for(File file : list) {
				if(file.isFile()) {
					count++;
					
				}
			}
			
			// 자식폴더 > 탐색 + 파일개수 
			for(File subdir : list) {
				if(subdir.isDirectory()) {
					
					// 자식 폴더의 내용
					File[] sublist = subdir.listFiles();
					for(File subfile:sublist) {
						if(subfile.isFile()) {
							count++;
						}
					}
					
					for(File subsubdir:sublist) {
						if(subsubdir.isDirectory()) {
							// 손자 폴더의 내용
							File[] subsublist = subsubdir.listFiles();
							for(File subsubfile : subsublist) {
								count++;
							}
						}
					}
					// 이번엔 손자 폴더도 봐야한다. 
				}
			}
		}
		// 실제론 더이상 자식 폴더가 없을 때까지 해야한다... 
		System.out.printf("총 파일 개수: %,d개\n", count);
	}


	private static void m16() {
		
		int n = 4;
		int result = m17_(4);
		
		result = factorial(n);
		System.out.printf("%d! = %d\n", n ,result);
		//System.out.println(result);	
	}	// 5 4 3 2 1 

	
	private static int factorial(int n) {
		return ( n == 1 ) ? 1 : n * factorial(n-1); //  
	}

	private static int m17_(int n) {
// 		4! 벡터리얼
//		if(n==1) return 1;
//		else {
//			return n*m17(n-1);
//		}
		System.out.println(n);
		
		int result = (n == 1 ) ? 1 : m17_(n-1);
		return result;
		
	}

	private static void m14() {
		//
		int n = 1;
		m15(n); // 
	}

	private static void m15(int n) {
		System.out.println(n);
		n++; // 연산
		// 언젠가는 끝이나게 해야 한다. > 언젠가는 자기가 자기 자신을 부르면
		// 안되는 상황이 와야 한다.
		if( n < 10 ) { // 조건에 걸리면 재귀 
			m15(n); // 재귀 호출
		}   // 그렇지 않으면 탈출하는 조건이 필요하다.
			//return; 
	}

	private static void m13() {
		// 메서드 사용 + 파일디렉토리 조작
		// 선언 + 호출
		// test();
	}

	
	// 무한 루프다. 재귀 메서드 (Recursive Method)
	private static void test() {
		
		// 종료조건 
		System.out.println("메소드 호출");
		test();// > 자기가 자기를 호출 > 에러 발생(X) 
		// 동일한 문장 계속 찍히다가 혹하고 에러난다. 
		// Exception in thread "main" java.lang.StackOverflowError
		// 이후부터 쭉 예외가 발생되고 있다. 용도에 따라 우리가 쓰는 메모리가 영역이 나눠져있고 
		// 우리가 있는 영역은 stack > 지역변수가 있다. heap, static 
		// 자기가 자기를 호출 > recursive method > 에러 발생 x > 재귀 호출(Recursive Call)
		// 의도적으로 이런 형태를 사용하기도 한다. 뭔가 반복적으로 하려고 할 때
	}

	private static void m12() {
		
		// 어떤 폴더 내용 보기
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		
		
		if (dir.exists()) {
			// 또 다른 파일배열이다.
			File[] list = dir.listFiles();
			
				
//				for(File f: list) {
//					System.out.println(file.getName());     // 이름
//					System.out.println(file.isFile());      // 너파일이니?
//					System.out.println(file.isDirectory()); // 너폴더니?
//					System.out.println();
//				}
				
				for(File file: list) {
					if(file.isDirectory()) { // 폴더만 먼저 가져와서 출력
						System.out.printf("[%s]\n", file.getName());
					}
				}
				
				for(File file: list) {
					if(file.isFile()) { // 파일만 먼저 가져와서 출력
						System.out.printf("<%s>\n", file.getName());
					}
				}
			
		}
		
		
	}

	private static void m11() {
		// 디렉토리나 파일을 하나의 클래스로 참조한다. 이게 가독성 측면에선 좋지 않다.
		// 장점이자, 단점이다.
		// 폴더조작
		// 폴더 삭제하기
		// File dir1 = new File("C:\\class\\code\\java\\file\\fff");
		
		// File dir1 = new File("C:\\class\\code\\java\\file\\plan"); 
		// >> 365개의 자식폴더 있는 폴더 실패를 한다.....
		
		File dir1 = new File("C:\\class\\code\\java\\file\\bbb"); // X

		if (dir1.exists()) {
			boolean result = dir1.delete();
			System.out.println(result); // plan
		}
		// 삭제 가능한 경우 : 빈 폴더만 삭제가 가능하다. 폴더 안에 어떤 파일이나 자식 폴더가 있으면 못지운다.
		// 내용있는 폴더를 삭제하려면 > 직접 구현해야 한다. > 다음시간에 알려준다.
	}

	private static void m10() {
		// 폴더 조작 >폴더명 조작도 renameTo를 사용한다.
		// - 폴더명 수정하기 + 이동하기
		// - aaa > fff
//      수정하기
//		File dir1 = new File("C:\\class\\code\\java\\file\\aaa");
//		File dir2 = new File("C:\\class\\code\\java\\file\\fff");
//		File dir1 = new File("C:\\class\\code\\java\\file\\member");
//		File dir2 = new File("C:\\class\\code\\java\\file\\회원");

		// 이동도 가능
		File dir1 = new File("C:\\class\\code\\java\\file\\회원");
		File dir2 = new File("C:\\class\\code\\java\\move\\회원");

		// 내용물이 있어도 이름바꾸는건 가능
		if (dir1.exists()) {

			dir1.renameTo(dir2); // OK

		} else {
			System.out.println("실패 ");
		}
		// 1. 상위 폴더가 있는지 확인, 폴더가 있으면 그안에 회원이 파일이 있는지 확인

	}

	private static void m9() {
		// 요구사항] 날짜별 폴더 생성
		// -"2023-01-01" ~ "2023-12-31" x 365 생성
		// C:\class\code\java\file\plan\2023-01-01~
		// > %tF
		String dirPath = "C:\\class\\code\\java\\file\\plan";
		File dir = new File(dirPath);

		if (!dir.exists()) {
			dir.mkdirs();
		}

		Calendar day = Calendar.getInstance();
		day.set(2023, 0, 1);
		for (int i = 0; i < 365; i++) {
			String path = String.format(dirPath + "\\%tF", day);
			File daydir = new File(path);
			daydir.mkdir();
			day.add(Calendar.DATE, 1);
		}

	}

	private static void m8() {
		// 요구사항] 회원명단 > 개인 폴더 생성
		String[] member = { "홍길동", "아무개", "하하하", "호호호", "유재석", "강호동", "조세호", "이이경" };

		for (int i = 0; i < member.length; i++) {

			// 회원 1명 > 1개의 폴더 생성
			String path = String.format("C:\\class\\code\\java\\file\\member\\[개인폴더]%s님", member[i]);

			File dir = new File(path);

			dir.mkdir();

		}
		
		System.out.println("종료");
	}

	private static void m7() {

		// 폴더 조작
		// - 새폴터 만들기
//		String path = "C:\\class\\code\\java\\file\\aaa";
//		File dir = new File(path); // 파일객체인데 dir이라고 이름 붙임
//		
//		boolean result = dir.mkdir(); 
		// > aaa 폴더가 생김 이미 / aaa라는 폴더가 있으면 안만들어진다. false
//		System.out.println(result);

		String path = "C:\\class\\code\\java\\file\\aaa\\bbb\\ccc\\ddd";
		File dir = new File(path);

		boolean result = dir.mkdir(); // > 얘는 아예 없는 폴더를 뛰어넘지 못한다.// false뜬다
		System.out.println(result);
		// 이런경우 실패

		boolean result2 = dir.mkdirs();
		//현재 경로중에 없는 경로도 다만들어줄래 > 얘는 없는 폴더도 다 만든다. > 부모자식 다만든다.
		System.out.println(result2);
		
	}

	private static void m6() {
		// 파일 조작
		// - 파일 삭제하기
		String path = "C:\\class\\code\\java\\file\\test.txt";
		File file = new File(path);

		if (file.exists()) { // 파일이 존재하는지 먼저 확인
			boolean result = file.delete(); // 진짜 삭제된다.
			// (얘 복구 안된다... 조심히 지워라)
			// 휴지통 삭제: 삭제가 아니라 '휴지통'이라는 폴더로 이동하기.
			// 진짜 삭제 : 하드 디스크에서 소멸 : 지금 삭제가 이거다.
			System.out.println(result);
			// 이미 실행중인 파일은 delete 실패한다. false 뜬다.!
		}

	}

	private static void m5() {
		// 파일 조작하기   > renameTo는 파일이름 바꾸기인데
		// - 파일 이동하기 > 이동하기도 renameTo이다. 
		String path = "C:\\class\\code\\java\\file\\수업.txt";  //
		File file = new File(path);
                                                               // ------------------
		String path2 = "C:\\class\\code\\java\\move\\수업.txt"; // 위와 아래가 폴더가 다르다. 
		File file2 = new File(path2);

		if (file.exists()) {
			boolean result = file.renameTo(file2); // 이름수정, 경로수정 모두다.
			// 이 전체 경로를 바꾼다. 끝의 파일이름만 바꾸는 것이 아니다.
			System.out.println(result);
		}
		// file 폴더에 수업.txt파일을 
		// move 폴더로 옮긴다.
		// 1. 만약에 move에 수업.txt파일이 이미 있으면 false다.
		// 2. file 폴더에는 수업.txt가 있어야 한다.
	}
	
	private static void m4() {
		
		// 파일 조작
		//- 파일명 수정하기
		// - 수업.txt > class.txt 
		
		String path = "C:\\class\\code\\java\\file\\수업.txt";
		File file = new File(path); // 참조객체 하나를 만드는 것이 시작이다.
		
		// 내가 바꿀려는 파일이름으로 등록하기 > 수정후 
		String path2 = "C:\\class\\code\\java\\file\\class.txt"; 
		File file2 = new File(path2);
		
		if(file.exists()) {
			// > 실패하는 경우 > 1. 이미 class.txt가 있으면 이름을 바꾸지 못한다....
			boolean result = file.renameTo(file2); 
			// > 앞의 파일 경로와 이름을 인자값으로 들어간 파일로 바꿔준다.
			System.out.println(result);
			
		}
		
		// 2. 폴더도 이동가능, 이름 변경 가능
		
	}

	private static void m3() {
		// 파일 조작
		// - 새 파일 만들기
		
		String path = "C:\\class\\code\\java\\file\\수업.txt";
		File file = new File(path); // 참조객체 하나를 만드는 것이 시작이다.
		
		// 이게 파일을 만들어준다. 
		try {
			System.out.println(file.createNewFile()); // 이게 새파일을 만드는 방법이다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 이안에 예외 미루기가 들어있다. 

	}

	private static void m2() {
		// 폴더 > 정보
		// - 폴더(Folder), 디렉토리(Directory)
		// 폴더 경로
		String path = "C:\\class\\code\\java\\file";
		// 폴더 참조 객체
		// - 디렉토리는 파일의 일종이다.
		File dir = new File(path); //
		if (dir.exists()) {
			// -----------------------------------------------------------------------------
			System.out.println("파일 있음"); // 파일 조작
			System.out.println(dir.getName()); // file
			System.out.println(dir.isFile()); // false
			System.out.println(dir.isDirectory()); // true
			System.out.println(dir.length()); // 0 <- 이게 중요하다.
			// length는 파일의 크기를 말한다. 근데 왜?
			// 폴더는 크기가 항상 0이다. 폴더 자체는 크기라는 개념이 존재하지 않는다.
			// 폴더 자체 크기는 항상 0이다. 폴더를 공간이라 생각하면 폴더는 안의 내용물을 소유하는 것이다.
			// 근데 폴더 얘도 파일이나 파일 자체는 아무것도 가지고 있지 않다.
			// 속성 창에서 크기는 파일들을 다담은거 크기라고 나온다. 무게 느낌
			// 근데 실질적으로 폴더 자체는 0이다.

			System.out.println(dir.getAbsolutePath());
			// C:\class\code\java\file > 위치한 경로 : 절대경로
			// ------------------------------------------------------------------------------
			System.out.println(dir.lastModified()); // 1677218977341
			// : 최종 수정한 시간인데 > 1970 이후로의 틱값이다. 몇 밀리세컨트냐?
			System.out.println(dir.isHidden()); // false, 파일에서 숨김 체크하면 안보이는데 그거다.
			System.out.println(dir.getParent()); // C:\class\code\java
													// [ 부모 파일이다. > 폴더 ]
			// -------------------------------------------------------------------------------
		} else {
			System.out.println("파일 없음");
		}

	}

	private static void m1() {
		// ------------------------------------------------------------------------------
		// 파일 > 정보
		// C:\class\code\java\file\test.txt

		// 자바 프로그램 > 외부에 존재하는 파일에 접근
		// 1. 외부 파일을 참조하는 객체를 생성
		// 2. 참조 객체 조작 > 외부 파일에 적용

		// 파일 경로
		String path = "C:\\class\\code\\java\\file\\test.txt"; // 역슬래쉬 두번 들어가야 한다.
		// 이스케이프 안되면 에러나니까,,,,,

		// 파일 참조 객체 > java.io.File 클래스
		// File file = new File(); // 에러 ) 기본 생성자가 없다. 뭐든지 다 달라고 한다.
		File file = new File(path); //

		// 해당 경로에 파일이 실제로 존재하는지???
		System.out.println(file.exists()); // 메소드 이름 그대로...
		// 파일이 없을 수 있으니까 이것부터 판단해야 한다.

		// 파일 우클릭 속성 눌렀을 때의 정보이다. 실제크기 19바이트
		if (file.exists()) {
			// -----------------------------------------------------------------------------
			System.out.println("파일 있음"); // 파일 조작
			System.out.println(file.getName()); // test.txt
			
			System.out.println(file.isFile()); // true
			System.out.println(file.isDirectory()); // false
			
			System.out.println(file.length()); // 19 > 파일 크기(바이트)
			System.out.println(file.getAbsolutePath()); //상대경로 : 현재위치 기준으로의 경로  
			// C:\class\code\java\file\test.txt > 위치한 경로 : 절대경로

			System.out.println(file.lastModified()); // 1677219024569
			// : 최종 수정한 시간인데 > 1970 이후로의 틱값이다. 몇 밀리세컨트냐?
			System.out.println(file.isHidden()); // false, 파일에서 숨김 체크하면 안보이는데 그거다.

			System.out.println(file.getParent()); // C:\class\code\java\file
													// [ 부모 파일이다. > 폴더 ]
			// -------------------------------------------------------------------------------
			// tick > Calendar.getIns
			Calendar c1 = Calendar.getInstance();
			System.out.println(c1.getTimeInMillis()); // 이 lastModified()를
			c1.setTimeInMillis(file.lastModified()); // Calendar 객체의 setTimeInMillis()안에 등록
			System.out.printf("%tF %tT\n", c1, c1);

		} else {
			System.out.println("파일 없음");
		}
	}

}
