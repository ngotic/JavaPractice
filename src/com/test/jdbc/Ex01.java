package com.test.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

public class Ex01 {
	
	// classpath 참조하는 걸 까먹지말자. 
	public static void main(String[] args) {
		//Ex01.java
		/*
			JDBC, Java Database Connectivity 
			- 응용 프로그램과 데이터베이스를 연결하는 기술 
				* 자바랑 오라클이랑 연결시켜주는 기능 
			- 영속성 계층(Persistance Layer)
			- 자바가 자기가 쓰는 데이터를 오라클에 저정하고 싶을 땐
			  	jdbc한테 맡긴다. 중간에 낀 jdbc라는 얘를 이용해서 전달한다. 
			  	영구적으로 데이터를 지속관리 한다해서 영속성 계층이다.
			  	 
		 	1. JDBC             > 레거시 
		 	2. Spring-JDBC      > (얘는 빈도수가 떨어짐)
		 	3. MyBatis(우리나라) >
		 	4. JPA    (전세계적) > 억제로 시간을 내서 해줌
		 	
		 	JDBC 준비 과정 
		 	- 각 데이터베이스 제조사별로 관련 클래스 제공 > *.jar
		 	- ojdbc6.jar 파일이 있어야 자바와 오라클을 연동한다. 
		 	- 프로젝트 > Build Path > 참조
		*/
		// java.sql 패키지
		// Java + JDBC > Connection 클래스 
		Connection conn = null;
		try {
			// 연결 문자열, Connection String
			// 여기는 오타나면 안된다. "jdbc:oracle:thin:@서버주소:포트번호:서비스아이디"
			// 내것을 접속 "jdbc:oracle:thin:@192.168.0.1:1521:xe";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "java1234";
			// 비번 틀리면 ORA-12505, TNS:listener does not currently know of SID given in connect descriptor
			// JDBC 드라이버 로딩
			// java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriveraaa > 오타있음
			// java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver > 라이브러리 임포트가 안댐 
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DB 접속
			// - Connection 객체 생성
			// - DB 접속 완료 
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println(conn.isClosed()); //접속 상태 확인 > true냐 false냐 ?
			// SQL 실행(******) > 무슨 쿼리를 날리는지만 달라진다.  
			conn.close(); // 연결 종료
			System.out.println(conn.isClosed());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		// > 포트번호는 준:비밀번호다. 
		// IO 오류: The Network Adapter could not establish the connection
		// 알려진 호스트가 없습니다 (localhost) > 이주소로 몇번 시도를 함
		
		// > 서비스명 틀리면 이렇게 나온다.
		// Listener refused the connection with the following error:
		// ORA-12505, TNS:listener does not currently know of SID given in connect descriptor
		
		// > 계정이 틀렸다. 
		//	try (
		//		
		//	) {
		//	}
	}//main
}




