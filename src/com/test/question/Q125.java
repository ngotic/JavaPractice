package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

public class Q125 {

	public static void main(String[] args) throws Exception {
		// 요구사항
		//		모든 괄호가 서로 짝이 맞는지 검사하시오.
		//
		//		조건..
		//		대상 괄호: (), {}
		//		Stack 사용
		//		리소스..
		//		파일 > 괄호.dat
		//		파일 다운로드
		//		출력..
		//		올바른 소스입니다.
		//		출력..
		//		올바르지 않은 소스입니다.
		// () ()))(
		
		// 단 괄호짝이 맞는지만 체크
		String path = "C:\\class\\code\\java\\파일_입출력_문제\\괄호.java";
		BufferedReader reader = new BufferedReader(new FileReader(path));
		Stack<String> st = new Stack<>();
		int ch;
		
		while( (ch=reader.read())!=-1) {
			// ( 이면 push, ) 이면 pop
			if( (char)ch=='('|| (char)ch=='{') {
				st.push(String.valueOf(ch));
			}
			if( (char)ch==')'|| (char)ch=='}') {
				if(st.size()!=0) st.pop();
			}
		}
		
		if(st.size()==0)
			System.out.println("올바른 소스입니다.");
		else
			System.out.println("올바르지 않은 소스입니다.");
		
		reader.close();
		
	}

}


// test(){
	
// } // 그럼 이것도 맞는 코드인가하면 > 틀리다.
// '(' 가 오면 ')'가오거나 { 가 올 수 있다.
// 이 문제에선 별다른 처리를 원하는 것 같진 않음.
// 제대로 풀려면 주석도 고려해야함
// 문제는 많은 코드 ({ 
//               })




