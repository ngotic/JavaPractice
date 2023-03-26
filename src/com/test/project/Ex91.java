package com.test.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex91 {

	public static void main(String[] args) throws IOException {
		//프로젝트
		// - 파일 입출력 기반(데이터) + 자바 콘솔(응용) 프로젝트
		//컬랙션(배열) vs 파일입출력
		// - JavaTest > dat > "member.txt"
		//m1();
		//m2();
		
		// 배열의 장점 + 파일 입출력의 장점
		
		Scanner scan = new Scanner(System.in);
		byte[] c = {'f','3','2'};
		int sd =System.in.read(c);
		String str = scan.next();
		System.out.println(str);
		
		
		
	}

	private static void m2() {
		
		// 파일 입출력
		// -
		// 장점
		// - 영구 보관이 가능하다.-
		// 단점
		// -
		
		
		try {
			String path = "C:\\class\\code\\java\\JavaTest\\dat\\member.txt";
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = null;
			int count=0;
			System.out.println("[전체 회원 목록]");
			
			while( (line = reader.readLine())!=null ) {
				
				System.out.println(line);
				
			}
			
			
//			
//			Scanner scan = new Scanner(System.in);
//			System.out.print("이름: ");
//			String input = scan.nextLine();
//			
//			reader = new BufferedReader(new FileReader(path));
//			line = null;
//			while( (line = reader.readLine())!=null ) {
//				//5,하하하,22,남자
//				String[] temp = line.split(",");
//				if(temp[1].equals(input)) {
//					System.out.println(line);
//					break;
//				}
//			}
			
			line = null;
			// 회원 검색> 파일 입출력은 한줄씩 소비를 하면 그걸로 끝이다.
			System.out.println("[회원 인원수]");
			reader = new BufferedReader(new FileReader(path));
			// 파일이 몇줄인지 세고 싶은데...? 
			while( (line = reader.readLine())!=null ) {
				
				count++;
				
			}
			System.out.println("출력 : " + count);
			reader.close();
			// scan.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m1() {
		
		// 배열
		// - Member[] list
		// - ArrayList<Member> list
		
		// 장점
		// - 입출력 속도 빠름(메모리 입출력)
		// - API가 많다.(기능 풍부)
		
		// 단점
		// - 영구 보관이 불가능하다.
		ArrayList<Member> list = new ArrayList<Member>();
		
		Member m1 = new Member("1", "홍길동", "20", "남자");
		Member m2 = new Member("2", "아무개", "22", "남자");
		Member m3 = new Member("3", "호호호", "25", "여자");
		Member m4 = new Member("4", "테스트", "24", "남자");
		Member m5 = new Member("5", "하하하", "23", "남자");
		// 실행중에 확보된 모든 데이터는 메모리에만
		// 저장이 되다보니 영구보관이 불가능하다.
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		for ( Member m: list) {
			System.out.println(m);
		}
		
		// 회원 검색
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String input = scan.nextLine();
		
		for(Member m : list) {
			if(m.getName().equals(input)) {
				System.out.println(m);
				break;
			}
		}
		
		System.out.println("전체 인원수 : " + list.size());
		
		scan.close();
	}
}

class Member {
	private String no;
	private String name;
	private String age;
	private String gender;
	
	public Member(String no, String name, String age, String gender) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}