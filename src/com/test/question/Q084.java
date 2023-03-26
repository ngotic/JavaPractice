package com.test.question;

public class Q084 {

	public static void main(String[] args) {
		// 요구사항 ] 특정 단어가 문장내에 몇회 있는지 수를 세라.
		//		조건..
		//		대상 문자열: String content = "안녕~ 길동아~ 잘가~ 길동아~";
		//		검색 문자열: String word = "길동";
		
		String dstStr = "안녕~ 길동아~ 잘가 ~ 길동아~";
		String match = "길동";
		int cnt = 0;
		int pos = 0;
		
		while( (pos = dstStr.indexOf("길동", pos  )) >0 ) {
			pos += match.length(); // update position! 
			cnt++;
		}
		
		System.out.printf("'%s'을 총 %d회 발견했습니다.\n",match, cnt );
	}

}
