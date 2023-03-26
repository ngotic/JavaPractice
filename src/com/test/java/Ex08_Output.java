package com.test.java;

public class Ex08_Output {

	public static void main(String[] args) {
		
		/*
		 `(역따옴표, back quote)
		 ! @ #$%
		 ^(xor, carrot)
		 &*-+
		 ~(틸드, tild)
		 -
		 ;'
		 :"
		 ,./
		 ?
		 \
		 |(pipe, or, vertival Bar)
		 () 소괄호
		 [] 대괄호
		 {} 중괄호
		 <> 화살표괄호
		 A  > B
		 A >= B
		 
		 콘솔 입출력
		 - 콘솔 환경에서 프로그램 > 데이터를 입출력
		 - Console Input Output > IO
		 - 기본 입력 장치 : 키보드
		 - 기본 출력 장치 : 모니터
		 
		 콘솔 출력
		 - 클래스.필드.메소드()
		 
		 1. System.out.println(값)
		    - println 메소드
		    - print line > 값을 행단위로 출력한다. > 값을 출력한 뒤 엔터를 친다.
		 2. System.out.print(값)
		 	- print 메서드
		 3. System.out.printf(값)
		 	- printf 메서드
		    
		*/
		System.out.println(100); // 안에 있는 값을 찍고 끝내는게 아니라 엔터를 찍고 끝낸다.
		System.out.println(200); 
		System.out.print("하나"); //
		System.out.print("둘");  //
		System.out.println(300);
		System.out.print("셋");  //
		// 빈 라인 출력

		System.out.println("\n\n\n");
		System.out.println("새로운 내용");
		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;
		
		String name2 = "아무개";
		int kor2 = 95;
		int eng2 = 77;
		int math2 = 89;
		
		System.out.println("==============================");
		System.out.println("            성적표");
		System.out.println("==============================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
		System.out.printf("%s\t%5d\t%5d\t%5d\n", name1, kor1, eng1, math1);
		System.out.printf("%s\t%5d\t%5d\t%5d\n", name2, kor2, eng2, math2);
		
		
//		System.out.print(name1+"\t");
//		System.out.print(kor1+"\t");
//		System.out.print(eng1+"\t");
//		System.out.print(math1+"\r\n");
//		System.out.print(name2+"\t");
//		System.out.print(kor2+"\t");
//		System.out.print(eng2+"\t");
//		System.out.print(math2);
//		System.out.println();
		
		//printf()
		// - 형식 문자 제공
		
		// 형식 문자 > Place Holder 이다 자리 맡아주는 애
		// 1. %s > String 의 약자
		// 2. %d > decimal 의 약자 > byte, short, int, long
		// 3. %f > float(실수) > float, double
		// 4. %c > char
		// 5. %b > boolean
		// [요구사항] "안녕하세요. 홍길동님" 문장을 출력하시오.
		
		// %s는 모든 자료형을 출력할 수 있따. 
		
		String name = "홍길동";
		System.out.printf("안녕하세요. %s님\n",name);
		
		//insert into tblMember (seq, name, age, address, tel) values (1, '홍길동', 20, '서울시 강남구 역삼동', '010-1234-5678');
		
		name = "홍길동";
		String seq = "1";
		String age = "20";
		String address = "서울시 강남구 역삼동";
		String tel = "010-1234-5678";
		
		System.out.println("insert into tblMember (seq, name, age, address, tel) values ("+seq+",'"+name+"', "+ age+", '"+address+"', '"+tel + "');");
		
		System.out.printf("insert into tblMember (seq, name, age, address, tel) values (%s,'%s', %s, '%s', '%s');", seq, name, age, address, tel); 
		System.out.println();
		int a= 100;
		double b = 3.14;
		char c = 'A';
		boolean d = true;
		System.out.printf("문자열: %s\n", name);
		System.out.printf("정수: %d\n", a);
		System.out.printf("실수: %f\n", b);
		System.out.printf("문자: %c\n", c);
		System.out.printf("논리: %b\n", d);
		
		System.out.printf("%s\n", a); //String < int
		//System.out.printf("%d\n",name); // int < String 에러
	}
}
