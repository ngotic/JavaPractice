package com.test.java;

public class Ex07_Escape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1= '\n';
		String s1 ="\n";
		// 요구사항 ] 안녕하세요 홍길동입니다. 출력해주세요
		// 수정사항 ] 안녕하세요와 홍길동입니다를 각각 다른줄에 출력해줘
		// String msg = "안녕하세요.홍길동입니다.";
		
		String msg = "안녕하세요.\r홍길동";
		System.out.println(msg);
		
		msg = "하나		둘	셋"; // 탭이 몇갠지 눈으로 안보인다. 가독성이 떨어진다.
		System.out.println(msg); // 그래서 직접적인 탭을 안쓴다. 내가 피곤해진다.
		
		msg = "하나\t\t둘\t\t\t셋";
		System.out.println(msg);
		
		msg ="홍길동\b입니다.";
		System.out.println(msg);
		
		// 5. \", \', \\
		// 요구사항] 홍길동: "안녕하세요" > 출력
		msg = "홍길동: \"안녕하세요\"";
		System.out.println(msg);
		
		// 요구사항] 수업 폴더 경로를 출력
		// C:\class\code\java
		
		//Invalid escape sequence (valid ones are \b \t \n \f \r \" \' \\)
		System.out.println("수업 폴더: C:\\class\\code\\java");
	}

}
