package com.test.collection;

import java.util.ArrayList;

public class Ex74 {

	public static void main(String[] args) {
		
		// 선생님 > 3명
		// 학생 > 30명 
//		Teacher t1 = new Teacher("홍길동" , "hong", "111", "국어");
//		t1.login();
//		t1.test();
//		t1.check();
//		t1.logout();
//		Student s1 = new Student("아무개", "test", "1111");
//		
//		s1.login();
//		
//		s1.setKor(100);
//		s1.setEng(90);
//		s1.setMath(80);
//		
//		s1.score();
//		s1.logout();
		
		// 더미 데이터 랜덤 조합 .... 
		//  
		String[] name1 = {"김","이","박","최","정",
		          "연","조","정","유","양"};

		String[] name2 = {"수","경","동","재","진",
		          "아","지","태","재","우",
		          "소","기","연","효","정",
		          "우","현","채","수","원",
		          "민"};
		
		// 1. 길이 고정 vs 가변
		// 2. 사용법
		// 선생님 배열 > 고정
		Teacher[] tlist = new Teacher[3];
		
		String temp = "ABCDEFGHIJKLMNOPQRXYZabcdefghijklmnopqrxyz";
		String[] subject = {"국어", "영어", "수학"};
		
		for(int i = 0; i < tlist.length ; i++) {
			String name = "";
			String id = "";
			String pw = "1111";
			
			name = generateName(name1, name2);
			id = generateId(temp, id);
			
			tlist[i] = new Teacher(name, id, pw, subject[i]);
		}
		
		
		// 학생 배열 > 들락 날락 > 컬랙션		
		ArrayList<Student> slist = new ArrayList<Student>();
		
		for(int i=0;i<6;i++) {
			String name = "";
			String id = "";
			String pw = "1111";
			
			name = generateName(name1, name2);
			id = generateId(temp, id);
			
			slist.add(new Student(name, id, pw));
		}
		
		for (int i=0; i <slist.size(); i++) {
			// slist[i].setKor();
			slist.get(i).setKor( (int) (Math.random() * 41)+60);
			slist.get(i).setEng( (int) (Math.random() * 41)+60);
			slist.get(i).setMath( (int) (Math.random() * 41)+60);
		}
		for(Teacher t : tlist) {
			System.out.println(t);
		}
		System.out.println();
		
		for(Student s : slist ) {
			System.out.println(s);
		}
		//System.out.println(tlist.toString());
		
		
	}
	private static String generateId(String temp, String id) {
		int max = (int)(Math.random() * 6 )+5;
		          //   여기 중간 조건식은 재실행되서 변화되는 조건을 넣으면 안된다. //
		for(int j=0; j <max ; j++) {
			id +=temp.charAt((int)(Math.random() * temp.length()));
		}
		return id;
	}
	// refactor에서 만든다.
	private static String generateName(String[] name1, String[] name2) {
		return name1[(int)(Math.random() * name1.length)]+ name2[(int)(Math.random() * name2.length)] + name2[(int)(Math.random() * name2.length)];
	}

}

// 온라인 교육하는 학원] 회원
// 1. 선생님
// 2. 학생
//>> 클래스 설계를 한다. 

// 공통인 부모
// >1. 그냥 클래스, 2. 추상 클래스, 3. 인터페이스
interface User {
// 이걸 추상클래스로 만들거나 중간에 추상 클래스를 넣거나 한다.
	void login();
	void logout();
	void info(); // 자기 정보를 보는 메서드
}

abstract class AbstractUser implements User{
	private String name;
	private String id;
	private String pw;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

}

class Teacher extends AbstractUser {

	
//	private String name;
//	private String id;
//	private String pw;
	
	private String subject;
	 
	public Teacher(String name, String id, String pw, String subject) {
//		this.name = name;
//		this.id = id;
//		this.pw = pw;
		setName(name);
		setId(id);
		setPw(pw);
		this.subject = subject;
	}
	// getter, setter 

	///// 더버깅용 ///// 
	@Override
	public String toString() {
		return "Teacher [name=" + getName() + ", id=" + getId() + ", pw=" + getPw() + ", subject=" + subject + "]";
	} ////////////////

	
	@Override //  > 이걸 지우면 에러가 사라진다.
	public void login() {
		System.out.printf("%s(%s) 선생님이 로그인했습니다.\n",
				getName(), getId());

	}


	@Override // 오버라이딩은 부모인데 Abstract는 저 메서드가 없다.
	public void logout() {
		System.out.printf("%s(%s) 선생님이 로그아웃했습니다.\n",
				getName(), getId());

	}

	@Override
	public void info() {
		System.out.println("[교사정보]");
		System.out.println("이름: "+getName());
		System.out.println("아이디: "+getId());
		System.out.println("담당과목: "+this.subject);
	}
	
	public void test() {
		System.out.println("시험을 출제합니다.");
	}
	public void check() {
		System.out.println("학생 성적을 점검합니다.");
	}
	
	
}

class Student extends AbstractUser {

//	private String name;
//	private String id;
//	private String pw;
	// 원래부터 갖는 정보
	
	// 위의 3개와 아래 3개는 다르다.
	
	// 아래는 시험을 봐야 얻는 정보
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, String id, String pw) {
		setName(name);
		setId(id);
		setPw(pw);
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + getName() + ", id=" + getId() + ", pw=" + getPw() + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}

	@Override
	public void login() {	
		System.out.printf("%s(%s) 학생이 로그인했습니다.\n",getName(), getId());
	}

	@Override
	public void logout() {
		System.out.printf("%s(%s) 학생이 로그아웃했습니다.\n",getName(), getId());
	}

	@Override
	public void info() {
		System.out.println("[학생 정보]");
		System.out.println("이름: " + getName());
		System.out.println("아아디: " + getId());
	}
	
	public void score() {
		System.out.printf("[%s 성적 ]\n", getName());
		System.out.println("국어: "+this.kor);
		System.out.println("영어: "+this.eng);
		System.out.println("수학: "+this.math);
	}

}

// 컨트롤 + 스페이스를 눌러서 한개씩 자동완성 가능하다.
