package com.test.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Ex89_lambda {

	public static void main(String[] args) {
		// Ex89_lambda.java // user.txt를 정렬해보자
		// 람다식
		// 1. 컬랙션(배열) 정렬
		// 2. 옛날거 건드리다가 오히려 망할 수 있다....
		// 3. 스트림(Stream) : 이건 '람다식' 도배
		// 자바에서 람다식 배우는 목적 뭐냐?....
		// 스트림에다가 람다식 쓰려고 배웠다고 말해도 될 정도임
		// 본격적으로 람다들이 여기저기에 많이 쓰일 것이다. 
		
		// m1();
		// m2();
		m3(); // 다중 기준 정렬
	} // main

	private static void m3() {
		// 30살을 총 4명을 만듬
		ArrayList<User> list = new ArrayList<User>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(".\\dat\\user.txt"));

			String line = null;

			// 엔터까지 읽지만 변수에는 엔터를 '버리고' 넣는다.
			while ((line = reader.readLine()) != null) {
				// System.out.println(line);
				String[] temp = line.split(",");
				User user = new User(temp[0], temp[1], Integer.parseInt(temp[2]), temp[3], temp[4], temp[5]);
				list.add(user);
			} //
			reader.close();
			
			//정렬
			//1. 나이 정렬
			//2. 성별 정렬
			//3. 도시 정렬
			list.sort( (u1, u2)-> {
				if ( u1.getAge() > u2.getAge()) {
					return -1;
				} else if( u1.getAge() < u2.getAge()) {
					return 1;
				} else { /* if(u1.getAge()==u2.getAge()) */
					// 나이가 똑같은 애들은 이제 한번더 물어봐야 한다.
					// return 0;
					if(u1.getGender().compareTo(u2.getGender()) > 0) {
						return -1;
					} else if(u1.getGender().compareTo(u2.getGender())<0) {
						return 1;
					} else {
						if(u1.getCity().compareTo(u2.getCity()) > 0) {
							return 1;
						}else if(u1.getCity().compareTo(u2.getCity()) <0) {
							return -1;
						} else {
							return 0;
						}
					}
				}
			});
			
			for (User user : list) {
				System.out.printf("%s. %s(%d) %s %s\n",
						user.getNo(), user.getName(),
						user.getAge(), user.getGender(),
						user.getCity());
			}
			// 지역은 대도시 순으로 정렬하기도 하는데...
			System.out.println();
			
		} catch (Exception e) {

		}
	}

	private static void m2() {

		ArrayList<User> list = new ArrayList<User>();

		try {

			BufferedReader reader = new BufferedReader(new FileReader(".\\dat\\user.txt"));

			String line = null;

			// 엔터까지 읽지만 변수에는 엔터를 '버리고' 넣는다.
			while ((line = reader.readLine()) != null) {
				// System.out.println(line);
				String[] temp = line.split(",");
				User user = new User(temp[0], temp[1], Integer.parseInt(temp[2]), temp[3], temp[4], temp[5]);
				list.add(user);
			} //

			reader.close();

			for (User user : list) {
				System.out.println(user.getNo() + ": " + user.getName());
			}
			System.out.println();

			// ★ 나이순 정렬 Int는 - 연산자!
			list.sort((u1, u2) -> u1.getAge() - u2.getAge());

			for (User user : list) {
				System.out.printf("%s. %s(%d)\n", user.getNo(), user.getName(), user.getAge());
			}
			System.out.println();

			// ★ 이름순 정렬 : String이니까 compareTo를 쓰는 것
			list.sort((u1, u2) -> u1.getName().compareTo(u2.getName()));

			// 성별순
			list.sort((u1, u2) -> u1.getGender().compareTo(u2.getGender()));

			// 지역순
			list.sort((u1, u2) -> u1.getCity().compareTo(u2.getCity()));

			list.sort((u1, u2) -> { // 람다식을 써도 얘 자체가 덩치가 크다.
				int a1 = 0; // u1의 지역
				int a2 = 0; // u2의 지역
				// 데이터 자체는 정렬이 불가능하지만 내가 임의대로 정렬하고 싶으면
				// 대응되는 숫자들을 만들어서 숫자를 정렬하면 유사한 결과를 만들 수 있다.
				if (u1.getCity().equals("서울"))
					a1 = 1;
				else if (u1.getCity().equals("인천"))
					a1 = 2;
				else if (u1.getCity().equals("천안"))
					a1 = 3;
				else if (u1.getCity().equals("대전"))
					a1 = 4;
				else if (u1.getCity().equals("강릉"))
					a1 = 5;
				else if (u1.getCity().equals("광주"))
					a1 = 6;
				else if (u1.getCity().equals("부산"))
					a1 = 7;
				// 1~7사이중 하나로 지역에 적용
				if (u2.getCity().equals("서울"))
					a2 = 1;
				else if (u2.getCity().equals("인천"))
					a2 = 2;
				else if (u2.getCity().equals("천안"))
					a2 = 3;
				else if (u2.getCity().equals("대전"))
					a2 = 4;
				else if (u2.getCity().equals("강릉"))
					a2 = 5;
				else if (u2.getCity().equals("광주"))
					a2 = 6;
				else if (u2.getCity().equals("부산"))
					a2 = 7;
				// a1 - a2기준으로 바꾼다. '우리가 원하는 순서대로 배치'
				return a2 - a1;
			});

			for (User user : list) {
				System.out.printf("%s. %s(%d) %s %s\n", user.getNo(), user.getName(), user.getAge(), user.getGender(),
						user.getCity());
			}
			// 지역은 대도시 순으로 정렬하기도 하는데...
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void m1() {

		/*
		 * 자바의 정수 리터럴 1. 10진수 - 0 ~ 9 - 1234567890
		 * 
		 * 2. 8진수 - 0~7 : 8진법 표기인데 8을 쓰면 에러다. 아까 020228라고 적어서 에러다. - 12345670 - 0NNNN -
		 * 이렇게 적으면 이걸 8진수 숫자라고 생각한다.
		 * 
		 * 3. 16진수 - 0 ~ F - 0123456789ABCDEF - 0xNNNN : 이렇게 표현하면 16진수다.
		 * 
		 */
		int jumin = 950228;
		System.out.println("주민등록번호: " + jumin);

		int jumin2 = 020227; // The literal 020228 of type int is out of range
		// 마지막에 8이라는 숫자를 적어서 에러다.
		// 020228; 에러
		// 020227; 에러 안남
		System.out.println("주민등록번호: " + jumin2); // 8343 출력
		// 출력시엔 자동으로 10진수로 바뀌어서 출력된다.

		// 그래서 함부로 앞에다가 0을 붙이지 마라
		int color = 0xF;
		System.out.println(color); // 15라는 숫자가 나온다.
		color = 0xFF;
		System.out.println(color); // 255라는 숫자가 나온다.

		String jumin3 = "020225"; // 문자열로 만들었어야지...
		System.out.println("주민등록번호: ");

	}

}
//1,홍길동,25,M,서울,010-1234-5678 
//이 한줄을 User라는 객체에 담을 것이다.
// *** 산술 연산을 하는 숫자 > 숫자형
// *** 산술 연ㅅ나을 절대 하지 않는 숫자 > 문자열

// 9502251012345 : 이걸 숫자로 입력??? 안된다.
class User {
	private String no;
	private String name;
	private int age;
	private String gender;
	private String city;
	private String tel;

	public User(String no, String name, int age, String gender, String city, String tel) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.tel = tel;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", age=" + age + ", gender=" + gender + ", city=" + city + ", tel="
				+ tel + "]";
	}

} ////////////