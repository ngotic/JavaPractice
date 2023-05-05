package com.test.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import com.test.my.DBUtil;

public class Ex03_Statement {

	public static void main(String[] args) { // 이거 오타나면 run config안뜸
		/*
 		 
		 JDBC 클래스 > 5개의 클래스를 배우는 수업이다. 
		 	* 중요한 것은 얘네들이 안쓰이는 것이 없다. 
		 1. Connection 
		 	- DB 연결/해제
		 2. Statement
		 	- 문장 > SQL 실행
		 	a. Statement
		 		- 기본
		 	b. PreparedStatement
		 		- 매개변수 특화
		 	c. CallableStatement
		 		- 프로시저 전용
		 		
		 3. ResultSet ( 결과 데이터를 이곳에서 받는다. ) 
		 	- select 결과 참조 클래스 
		 	> 우리가 날리는 상당수가 Select인데 데이터를 가져오기 위함인데 그걸 담는 역할..
		 	
		 */	
		// -> db.sql을 만들었따. 근데 왠만해서 스크립트 작업은 
		//m1();
		//m2();
		m3();
	} // 

	private static void m3() {
		// UI + SQL
		// - 사용자 입력 > insert 
		// - ex) 게시판 글쓰기
		
		Connection conn = null;
		Statement stat = null; 
		
		Scanner scan = new Scanner(System.in);
		
		try {
			
			System.out.println("이름 : ");
			String name = scan.nextLine();
			
			System.out.println("나이 : ");
			String age = scan.nextLine(); 
			// 오라클은 number라도 자바에선 String으로 나이를 해도 상관이 없다. 
			
			System.out.println("성별(m, f) : ");
			String gender = scan.nextLine();
			
			System.out.println("전화번호 : ");
			String tel = scan.nextLine();
			
			System.out.println("주소 : ");
			String address = scan.nextLine();
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = String.format("insert into tblAddress(seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, '%s', %s, '%s', '%s', '%s', default)",
								name,age,gender,tel,address );
			// 숫자를 올바르게 쿼리로 작성하면 끝나는 얘긴데 걍 문자열로 받는 것, 조심하는 것
			// ★ 문자 > 'm', 숫자 > 5
			int result = stat.executeUpdate(sql);
			System.out.println(result);
			
			stat.close();
			conn.close();
			
		} catch (Exception e) {	
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		Connection conn = null;
		Statement stat = null;
		
		try {
			
			conn = DBUtil.open(); // 새로 트랜잭션이 열림. 
			if(!conn.isClosed()) {
				System.out.println("접속 성공");
			}
			
			stat = conn.createStatement(); // stat을 만들고 
			// String sql = "update tblAddress set age = age +1 where seq = 2";
			// String sql = "delete from tblAddress where seq = 2"; // 성공
			
			//String sql = "create sequence seqTemp"; 
			// ★ 이경우는 무조건 0이 나온다. 
			// ★ create는 무조건 반영할 것이 없으니까
			
			// String sql = "drop sequence seqTemp";
			
			// String sql = "drop table tblAddress";
			
			
			String sql = "create table tblAddress (\r\n"
					+ "    seq number primary key,\r\n"
					+ "    name varchar2(10) not null,\r\n"
					+ "    age number(3) not null  check(age between 1 and 99), --\r\n"
					+ "    gender char(1) not null check(gender in ('m','f')),  -- \r\n"
					+ "    tel varchar2(15) not null,\r\n"
					+ "    address varchar2(300) not null,\r\n"
					+ "    regdate date default sysdate not null -- 테이블마다 시간을 넣는다. \r\n"
					+ ")";
			// ORA-00955: name is already used by an existing object
			int result = stat.executeUpdate(sql); 
			System.out.println(result);
			
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	private static void m1() {

		// insert 실행 
		// 1. DB  연결
		// 2. SQL 실행
		// 3. DB  종료 
		// Ctrl + Shift + O 
		// 둘다 interface이다. 
		Connection conn = null;
		Statement stat = null;
		
		try {
			// 1.
			conn = DBUtil.open(); // 새로 트랜잭션을 여는 것 
			
			if(!conn.isClosed()) {
				
				System.out.println("접속 성공");
				
				//2.
				// - 자바는 SQL을 모른다. > SQL을 문자열 취급한다. (아무의미 없음 )
				// sql developer에서 먼저 확인을 해보고 이걸 자바로 가져온다. 
				String sql = "insert into tblAddress(seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, '아무개', 22, 'm', '010-5555-5555', '서울시 강남구 대치동 100', default)";
				// 여기서 반영한 내용은 우리가 보았다.
				
				// ★★★ > 그 이유는 모든 jdbc 작업은 auto commit이다. 
				// ★★★ > 서비스 상에선 일부 작업 자체가 바로 커밋이 된다.
				
				// * 끝에 ;를 쓴 경우
				//String sql = "insert into tblAddress(seq, name, age, gender, tel, address, regdate) "
				//		+ "values (seqAddress.nextVal,"
				//		+ " '아무개', 22, 'm', '010-5555-5555', '서울시 강남구 대치동 100', default);";
				// ★ ORA-00911: invalid character > 끝에 ;를 쓰면 못쓴다. 문장 종결자를 못쓴다.
				// 한번에 최대 하나의 문장만 실행
				
				// stat > SQL 실행 > 어느 DB + 어떤 계정으로 실행할지??? 
				stat = conn.createStatement();
				
				// SQL 실행
				// a. 반환값이 없는 쿼리 > select를 뺀 나머지 
				// > int executeUpdate()
				// b. 반환값이 있는 쿼리 > select 
				// > ResultSet executeQuery() 
				
				// SQL Developer > Ctrl + Enter 동일! 
				int result = stat.executeUpdate(sql); // 받기 싫으면 안받아도 된다.  
				// 쿼리 날리면 적용된 행의 개수를 반환한다. > 그 때의 숫자이다.
				
				if ( result == 1 ) {
					System.out.println("SQL 실행 성공");
				} else {
					System.out.println("SQL 실행 실패");
				}
			
			} else {
				System.out.println("접속 실패");
			}
			// 3.
			conn.close();
			stat.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//m1

}
