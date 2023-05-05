package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.test.my.DBUtil;

public class Ex05_PrepareStatement {
	
	public static void main(String[] args) {
		// Statement
		// 1. Statement
		// 2. PreparedStatement
		// 3.  
		
		// Statement vs PreparedStatement
		// - 매개변수 처리 지원 유무
		// - Statement > 정적 SQL
		// - PreparedStatement > 동적 SQL
		
		
		
		// m1();
		// m2();
		// m3();
		m4();
		
		// 정적 SQL > Statement > 매개변수X
		// 동적 SQL > PreparedStatement > 매개변수
		
		// select * from tblInsa; -- 정적 SQL
		// select * from tblInsa where num = 사용자입력; -- 정적SQL or 동적 SQL 
		// 중간중간에 쿼리의 입력이 바뀐다. 
		
	}

	private static void m4() {
		
		
		String name = "하하하";
		String age = "22";
		String gender = "m";
		String tel ="010-1234-5678";
		String address = "서울시 동대문구 이문동";
		//String address = "서울시 동대문구 이문동 쌍용's 8층"; 
		// >> PreparedStatement는 '를 써도 제대로 처리가 된다. 
		// - 유효하지 않은 몇몇 문자를 이스케이프 처리를 자동으로 해준다. 
		
		Connection conn = null;
		Statement stat = null;
		PreparedStatement pstat = null;
		
		try {
	
			conn = DBUtil.open();
			                                                                                       // 시퀀스를 따로 불러오지도 안았는데?? 
			String sql = "insert into tblAddress (seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, ?, ?, ?, ?, ?, default)";
			// 미정상태이다. > 데이터가 미확정인 상태로 인식한다. 
			
			pstat = conn.prepareStatement(sql);// 미리 받는다.
			
			for ( int i= 0 ; i< 10 ; i++) {
				
				pstat.setString(1, name+i);
				pstat.setString(2, age); 
				pstat.setString(3, gender);
				pstat.setString(4, tel);
				pstat.setString(5, address);
				
				// 10번의 쿼리를 모두다 동일한 쿼리라고 인식을 한다.(단, 데이터만 바꾼다.) 
				// -> 데이터 뺸 나머지 부분에 대한 작업은 재사용이 된다. 
				int result = pstat.executeUpdate();
				System.out.println(result);
			}
			
			pstat.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m3() {
		
		// 주소록 x 10 명 추가(난수)
		// - SQL 동일 + 데이터 상이 > 작업 반복
		String name = "하하하";
		String age = "22";
		String gender = "m";
		String tel ="010-1234-5678";
		String address = "서울시 동대문구 이문동";
		                                      // error난다.
		address = address.replace("'", "''"); // 혼따옴표를 적고 싶으면 '' 로 대체해라 
		
		Connection conn = null;
		Statement stat = null;
		PreparedStatement pstat = null;
		
		try {
			
			conn = DBUtil.open(); // DB연결 1회만! 
			stat = conn.createStatement(); // 1회 > 이걸로 쿼리를 여러번 재사용해도 된다. 10번 실행
			
			for (int i=0; i <= 9; i++) {
				String sql = String.format("insert into tblAddress (seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, '%s', '%s', '%s', '%s', '%s', default)", 
						name+i, age, gender, tel, address ); 
				        // 서로 다른 데이터로 된 insert 여러번 
				int result = stat.executeUpdate(sql);
				
				System.out.println(result);
			}
			// 동일 쿼리, 데이터만 바뀐 상황 10번 
			
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private static void m2() {
		
		// SQL Injection
		// - 해킹기술 
		
		// 로그인
		// -> id : hong
		// -> pw : 1234
		
		// select * from tblUser where id = '"+ id + "' and pw = '"+pw + "'";
		// - id : hong 
		// - pw: 1' or 1=1 or ' // 이러면 막 뚫린다. 
		// select * from tblUser where id = 'hong' and pw = '1234'";
		// select * from tblUser where id = 'hong' and pw = '1' or 1=1 or ''";
		
		// 유저 테이블에 뒤져서 해당 아이디가 사용자의 아이디면서 사용자의 패스워드 인 것을 찾아라 검색함
		// 둘다 맞으면 한명이 있다. 결과셋이 레코드가 한줄이 나오고 
		// 아이디가 틀리거나 패스워드 틀리면 레코드 없다. 
		
		String name = "하하하";
		String age = "22";
		String gender = "m";
		String tel ="010-1234-5678";
		String address = "서울시 동대문구 이문동";
		//String address = "서울시 동대문구 이문동 쌍용's 8층"; 
		// >> PreparedStatement는 '를 써도 제대로 처리가 된다. 
		// - 유효하지 않은 몇몇 문자를 이스케이프 처리를 자동으로 해준다. 
		
		Connection conn = null;
		Statement stat = null;
		PreparedStatement pstat = null;
		
		try {
	
			conn = DBUtil.open();
			                                                                                       // 시퀀스를 따로 불러오지도 안았는데?? 
			String sql = "insert into tblAddress (seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, ?, ?, ?, ?, ?, default)";
			// 변수라서 ''로 묵지마라 ?만 적어라 
//			stat = conn.createStatement();
//			stat.executeUpdate(sql);
			
			pstat = conn.prepareStatement(sql);// 미리 받는다.
			// 전달받은 sql을 보고 내가 접근해야하는 ?가 이만큼이다 하고 인식한다.
			// < pstat이 참조하는 SQL에서 첫번째 매개변수에다 name을 대입해라 >
			// 내가 가진 데이터를 물음표에 넣을 때 타입이 무엇이냐를 지정해줄 수 있다. 
			pstat.setString(1, name);
			pstat.setString(2, age); 
			// 내가 나이를 숫자로 해놨으면 SetInt로 해야 한다. 
			pstat.setString(3, gender);
			pstat.setString(4, tel);
			pstat.setString(5, address);
			// 오라클의 타입으로 받는게 아니라 자바의 타입으로 어떻게 넘겨줄 것인가를 지정한다.
			
			int result = pstat.executeUpdate();
			
			System.out.println(result);
			
			pstat.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void m1() {
		// 주소록 > 행 추가(+ 사용자 입력)
				String name = "하하하";
				String age = "22";
				String gender = "m";
				String tel ="010-1234-5678";
				// String address = "서울시 동대문구 이문동 쌍용";
				String address = "서울시 동대문구 이문동 쌍용 's 8층 new "; //: ORA-00917: missing comma
				                                       // error난다.
				address = address.replace("'", "''"); // 혼따옴표를 적고 싶으면 '' 로 대체해라 
				
				Connection conn = null;
				Statement stat = null;
				PreparedStatement pstat = null;
				
				try {
					
					conn = DBUtil.open();
					
					String sql = String.format("insert into tblAddress (seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, '%s', '%s', '%s', '%s', '%s', default)", 
							name, age, gender, tel, address ); 
					
					stat = conn.createStatement();
					int result = stat.executeUpdate(sql);
					
					System.out.println(result);
					
					stat.close();
					conn.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
	
	
}
