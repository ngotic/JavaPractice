package com.test.question;

public class Q017 {

	public static void main(String[] args) {
		// 요구사항] 인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하시오.
		// 조건..
		//	사원 → 대리 → 과장 → 부장
		//	void position(String)
		//	void position(String, String)
		//	void position(String, String, String)
		//	void position(String, String, String, String)
		
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");	
	}


//  다른풀이 ) > 로직 자체가 단순 > 가변인자를 사용하면 오버로딩을 할 이유가 없음 > 메서드 오버로딩과 혼용 x
	final static String[] POSITION = {"사원", "대리", "과장", "부장"};
	public static void position(String...str) {
		int i=0;
		for(String person : str) {
			System.out.printf("%s : %s\n", POSITION[i], person );	
			i++;
		}
		System.out.println();
	}
	
//	public static void position(String p1) {
//		System.out.printf("사원 : %s\n\n" , p1 );
//	}
//	public static void position(String p1, String p2) {
//		System.out.printf("사원 : %s\n" , p1 );
//		System.out.printf("대리 : %s\n\n" , p2 );
//	}
//	public static void position(String p1, String p2, String p3) {
//		System.out.printf("사원 : %s\n" , p1 );
//		System.out.printf("대리 : %s\n" , p2 );
//		System.out.printf("과장 : %s\n\n" , p3 );
//	}
//	public static void position(String p1, String p2, String p3, String p4) {
//		System.out.printf("사원 : %s\n" , p1 );
//		System.out.printf("대리 : %s\n" , p2 );
//		System.out.printf("과장 : %s\n" , p3 );
//		System.out.printf("부장 : %s\n\n" , p4 );
//	}
}
