package com.test.java;

import java.util.Arrays;
import java.util.Scanner;

public class Ex36_String {

	public static void main(String[] args) {
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
		m6();
		// m7();
//		m8();
// 		m9();
//		m10();
//		m11();
		// m12();
		//m13();
	}
	
	
	
	private static void m13() {
		// TODO Auto-generated method stub
		String s1 = "Hong";
		String s2 = "hong";
		// System.out.println(s1 > s2); 
		// 연산자로는 못했다. 참조형은 연산자로서 피연산자가 안된다. 
		// 대부분 값형만 피연산자로만 쓴다. 숫자 아니면 구분이 안되
		//		char c;
		//		c++; // 에러
		// 양수 앞에거가 다크다. 음수 이면 뒤에거 같으면 0
		// compareTo는 실제로 문자코드의 차이를 리턴한다. 
		System.out.println(s1.compareTo(s2)); // 이걸로 비교한다.
		// -32, hong이 더 크다.
		System.out.println(s1.compareToIgnoreCase(s2));
		// 대소문자 구분없이 비교해야 하는 업무도 있다.  > compareToIgnoreCase
		// Hong과 hong을 동일하게 봤다.
		
		String s3 = "홍길동";
		String s4 = "아무개";
		
		System.out.println(s3+s4);         // 혜택
		System.out.println(s3.concat(s4)); // FM
		
		String s5 = "홍길동";
		char[] clist = s5.toCharArray();
		System.out.println(Arrays.toString(clist));
		// character형을 배열로 뽑아준다. [홍, 길, 동] // 일일히 내가 수작업을 하는거보다 편한작업이다.
		
	}



	private static void m12() {
		// 문자열 분리
		// - split (String delimeter)
		// - 구분자를 기준으로 문자열을 자르는 메서드다.
		// 조각 조각 낸다. // 어떤 규칙성을 가지고 하나의 문자열에서
		// 여러개의 문자로 만듬
		String name = "홍길동, 아무개, 하하하";
		String name2 = "홍길동,,아무개, 하하하";
		// 이렇게하면 두번째 열엔 빈문자가 들어있다. > 
		
		String[] list = name2.split(","); 
		// 자르고 나면 구분자는 사라진다. 자기의 역할을 다함
		
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]+","+list[i].length());
		}
		
	}



	private static void m11() {
		
		// *** 모든 문자열 메서드는 원본을 수정하지 않는다.!!!
		
		// 문자열 치환(바꾸기)
		// -String replace(String old, String new)
		//- 문자열의 일부를 다른 문자열로 교체하는 메소드
		String txt = "안녕하세요. 홍길동입니다.";
		System.out.println(txt.replace("홍길동", "아무개"));
		System.out.println(txt);
		// 바꿀려면 덮어써야 한다.
		txt = txt.replace("홍길동", "아무개");
		System.out.println(txt);
		
		String content = "게시판에 글을 작성합니다. 바보야";
		String word = "바보";
		
		// 눈에 보이는 걸 안보이게 바꾼다. 
		System.out.println(content.replace(word, "**"));
		
		System.out.println(content.replace(word, ""));
		// 문자열의 일부를 제거할 때 쓴다.
		
	}

	private static void m10() {
		// - String substring(int beginIndex, int endIndex)
		// - String substring(int beginIndex)
		String txt = "가나다라마다사아자차카타파하";
		System.out.println(txt.substring(3, 7)); // 3~ 6
		System.out.println(txt.substring(5, 6)); // 5
		System.out.println(txt.charAt(5)); // 5
		System.out.println();
		
		String jumin = "950215-2012365";
		
		System.out.println(jumin.substring(0, 2));
		System.out.println(jumin.substring(2, 4));
		System.out.println(jumin.substring(4, 6));
		System.out.println(jumin.substring(7, 8));
		
		// 문자열 적고 복붙하면 \\ 두개 붙는다.
		// 파일 경로 > 파일명?
		// 마지막 \\ 를 찾으면 된다. 
		String path = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\question\\Q031.java";
		System.out.println(path.lastIndexOf("\\")); 
		// \ 하나만 쓰면 에러다. 그래서 \ 하나더 써서 이스케이프 시킨다.
		int index = path.lastIndexOf("\\");
		String filename = path.substring(index+1);  // 역슬래시 빼고
		System.out.println(filename);               // 파일명 추출
		
		// Q031.java
		// 확장자 없는 파일명 추출
		// 파일 이름엔 .이 들어가도 된다. 
		// Q031.String.java // 이것도 lastIndexOf를 쓰자
		index = filename.lastIndexOf(".");
		
		String filenameWithoutExtension = filename.substring(0, index);
		System.out.println(filenameWithoutExtension);
		
		String extension = filename.substring(index);
		System.out.println(extension); // 파일 업로드 사례
		
	}





	private static void m9() {
		// 패턴 검색
		// - boolean startsWith(String)
		// - boolean endsWith(String)
		String txt ="자바 개발자 과정";
		System.out.println(txt.startsWith("자바"));
		System.out.println(txt.startsWith("오라클"));
		
		System.out.println(txt.startsWith("과정"));
		System.out.println(txt.indexOf("자바")==0);
		
		System.out.println(txt.endsWith("과정"));
		System.out.println(txt.endsWith("교육"));
		System.out.println(txt.indexOf("과정") == txt.length()-2);
		
		System.out.println();
		
		// 파일 조작
		String file = "Ex36_String.java";
		// 해당 파일의 확장자가 ".java" 인지 확인?
		if(file.toLowerCase().endsWith(".java")) {
		// 이럴 때 endsWith 사용
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
	}



	private static void m8() {
		// 문자열 대소문자 변경
		// - String toUpperCase() > 문자열을 모두 대문자로 변환
		// - String toLowerCase() > 문자열을 모두 소문자로 변환
		String content = "오늘 수업은 String Method입니다.";
		String word = "string"; // 
		
		if(content.toLowerCase().indexOf(word.toLowerCase())> -1) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		System.out.println(content.toUpperCase());
		System.out.println(content.toLowerCase());
		
		// 검색엔진에서는 대소문자 상관없이 같다고 쳐준다. 
		System.out.println("Java".equals("java"));// false
		System.out.println("Java".toUpperCase().equals("java".toUpperCase()));// false
		// 내부적으로 대문자 혹은 소문자로 변환시켜서 한 가지 기준으로 맞추어서 비교
	}



	private static void m7() {
		// SNS, 게시판
		String content = "안녕하세요. 바보야!! 저는 자바를 배우는 학생입니다.";
		String word = "바보"; 
		if(content.contains(word)) {    // 하지만 적합도는 이게 더 있다.
			System.out.println("금지어 발견!!");
		} else {
			System.out.println("글쓰기 진행..");
		}
		if(content.indexOf(word) > -1) { // 이 방법이 좀 더 쓰임새가 많다.
			System.out.println("금지어 발견!!");
		} else {
			System.out.println("글쓰기 진행..");
		}
		
		content = "안녕하세요.멍청이 저는 자바를 배우는 학생입니다.";
		String[] words = {"바보", "멍청이", "메롱" };
		for( int i=0; i<words.length ; i++) {
			if( content.indexOf(words[i]) > -1) {
				System.out.println(":> 금지어 발견!!!");
				break;
			}
		}
		
		
		// 주민등록번호 > "-"
		String jumin="950215-2012457";
		if(jumin.charAt(6) == '-') {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		if(jumin.indexOf("-") ==6) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
	}



	private static void m6() {
		// 문자열 검색 
		// - int indexOf(char c)
		// - int indexOf(String s)
		// - int indexOf(char c, int beginIndex)
		// - int indexOf(String s, int beginIndex)
		// - int lastIndexOf(char c)
		// - int lastIndexOf(String s)
		// - int lastIndexOf(char c, int beginIndex)
		// - int lastIndexOf(String s, int beginIndex)
		
		String txt = "안녕하세요. 홍길동입니다.";
		int index = -1;
		index=txt.indexOf("홍");   //7
		System.out.println(index);
		
		index=txt.indexOf("하");   //2
		System.out.println(index);
		
		index=txt.indexOf("홍길동"); // 시작 문자의 위치값
		System.out.println(index);
		
		index=txt.indexOf("홍길순"); // 완전 일치해야한다. 못찾으니까 -1
		System.out.println(index);
		
		txt= "안녕하세요. 홍길동입니다. 반갑습니다 홍길동입니다. 네 홍길동입니다.";
		System.out.println(index);

		
		String name = "홍길동";
		index = 0;
		while(true) {
			
			index = txt.indexOf(name, index);
			if(index == -1) {
				break;
			}
			System.out.println("홍길동 위치 : "+index);
			
			index = index +name.length(); // 홍길동 글자수 + 3
		}
		
		System.out.println();
		
		txt= "안녕하세요. 홍길동입니다. 반갑습니다 홍길동입니다. 네 홍길동입니다.";
		// indexOf     > 왼쪽 > 오른쪽
		// lastIndexOf > 오른쪽에서 왼쪽
		System.out.println(txt.indexOf("홍길동")); 
		System.out.println("last "+txt.lastIndexOf("홍길동")); // 31인데스 부터 나와
		
		// 다음 것
		System.out.println(txt.indexOf("홍길동", 10)); 
		System.out.println(txt.lastIndexOf("홍길동", 30)); // 이것도 마찬가지로
		           // 첫글자 시작위치를 찾는 것이라 -1 위치만 이동해도 다음 찾는 곳이 된다.
				
		// 찾으려는 위치부터 시작해서 첫번째 검색어를 만나면 이를 중단한다. 
		// 검색어를 여러번 반복하려거든 숫자로 통제하라
//		index = txt.indexOf("홍길동", 0); // 첫번째 길동이
//		System.out.println(index);
//		
//		index = txt.indexOf("홍길동", 10); // 두번쨰 길동이
//		System.out.println(index);
//				
//		index = txt.indexOf("홍길동", 24); // 마지막 길동이
//		System.out.println(index);
	}



	private static void m5() {
		// 문자열 검색
		// -boolean contains(String)
		String txt = "홍길동님 안냐셈";
		// boolean contains(CharSequence) ;// 문자열 넣어도 된다 String의 조상이 CharSequence이다.
		System.out.println(txt.contains("홍길동"));
		System.out.println(txt.contains("아무개"));
		
	}

	private static void m4() {
		// 문자열 공백 제거
		// - String trim()
		// - 문자열에 존재하는 공백(WhiteSpace > 스페이스, 탭, 개행)> 제거하는 메서드
		// - 검색엔진 > 압뒤 공백
		String txt = "		하나		들 		셋 		";
		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());
		
		String s1 = "자바";
		String s2 = "  자바  ";
		
		System.out.println(s1.equals(s2));
		
	}

	private static void m3() {
		// 주민등록번호 or 전화번호
		// 중간에 '-' 반드시 입력
		String jumin= "950215-1014789";
		// 주민등록 번호 or 전화번호
		if(validJumin(jumin)) {
			System.out.println("올바른 주민등록번호");
			// 성별?
			char c = jumin.charAt(7);
			
			if( c == '1' || c== '3') {
				System.out.println("남자");
			} else if ( c == '2' || c == '4') {
				System.out.println("여자");
			}
			// 1, 3
			// Integer.parseInt("1");
//			System.out.println('1'-48);
//			System.out.println('9'-48);
			if(( c - '0' ) % 2==1) {
				System.out.println("남자");
			} else {
				System.out.println("여자");
			}
		} else {
			System.out.println("올바르지 않은 주민등록번호");
		}
	}
	private static boolean validJumin(String jumin) {
		if(jumin.charAt(6)=='-') {
			return true;
		} else {
			return false;
		}
	}
	
	private static void m2() {
		// 문자열 추출
		// - char charAt(int index)
		// - 원하는 위치의 문자를 추출하는 메서드
		// - Zero-based index
		
		           // 012 345678910
		String txt = "안녕하세요. 홍길동님";
		char c = txt.charAt(3);
		System.out.println(c);
		
		c = txt.charAt(7);
		System.out.println(c);
		
		//	c = txt.charAt(11);  //java.lang.StringIndexOutOfBoundsException: index 11,length 11
		//	System.out.println(c);
		c = txt.charAt(txt.length()-1);
		System.out.println(c);
		
	}

	private static void m1() {
		
		// 문자열 > 문자의 집합
		// String > char[]
		String name1 = "홍길동"; // 내부적으로 character배열
		char[] name2 = {'홍','길','동'};
		
		// 문자열 길이
		// -문자열을 구성하는 문자의 개수 > 글자수 
		// -int length()
		System.out.println(name1.length()); // 메서드다.
		System.out.println(name2.length);   // 배열의 길이
		
		System.out.println("홍길동".length());
							// 한글은 1글자
		System.out.println("홍A1".length());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름: ");
		String name =scan.nextLine();
		// 요구사항] 유효성검사(2~5자 이내)
		if( name.length() >= 2 && name.length()<=5) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
					
	}

}
