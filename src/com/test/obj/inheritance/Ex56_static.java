package com.test.obj.inheritance;

public class Ex56_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticStudent.setSchool("역삼 중학교");
		
		StaticStudent s1 = new StaticStudent();
		s1.setName("아무개");
		
		StaticStudent s2 = new StaticStudent();
		s1.setName("아무개");
		
		
		//hello() 앞에 s1이 적혀있다.
		// > s1이라는 학생이 인사를 합니다.> 개인이 하는 행동
		s1.hello();// 말이 안되는 표현이다. 
		// The static method hello() from the type StaticStudent should be accessed in a static way
		
		
		// hello() 앞에 Student가 적혀있다.
		// > 학생 전체가 인사를 한다. > 집단이 하는 행동(대표)
		StaticStudent.hello(); // 이것을 통해 Hello
	}

}



class StaticStudent {
	
	private String name;          // 개인 데이터
	private static String school; // 공용 데이터
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		StaticStudent.school = school;
	}
	
	// 학생에게 인사하는 메소드
	public static void  hello () { // 여기에 static 붙일지 고민
//		System.out.printf("안녕하세요. 저는 %s입니다.\n", 
//				this.name); // 개인 데이터, 한사람의 이름을 붙임
		
		System.out.println("안녕하세요. 역삼 중학교에 오신걸 환영합니다."); // 대표자가 하는 말
		System.out.printf("저는 %s에 다녀요\n", StaticStudent.school); // 대표자가 하는 말 
	}
}