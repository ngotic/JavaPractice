package com.test.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import com.test.my.DBUtil;

public class Ex04_Select {
	public static void main(String[] args) {
	
		// m1(); 
		// m2();
		// m3();
		m4();
		
	}

	private static void m4() {
		
		  Connection conn = null;
	      Statement stat = null;
	      ResultSet rs = null;
	      
	      try {
	         
	         conn = DBUtil.open();
	         stat = conn.createStatement();
	      
	         // 사용자에게 부서 입력 > 부서 명단 출력 
	         Scanner scan = new Scanner(System.in);
	         
	         System.out.print("부서명: ");
	         String buseo = scan.nextLine();
	         
	         String sql = String.format("select * from tblInsa where buseo = '%s'"
	        		 						, buseo);
	         
	         rs = stat.executeQuery(sql);
	         
	         System.out.println("================================================");
	         System.out.println("              "+ buseo);
	         System.out.println("================================================");
	         System.out.println("[번호]\t[이름]\t[직위]\t   [급여]\t[수당]");
	         
	         while(rs.next()) {
	        
	        	 System.out.printf("%s\t%s\t%s\t%,12d\t%,d\n"
	        			 , rs.getString("num")
	        			 , rs.getString("name")
	        			 , rs.getString("jikwi")
	        			 , rs.getInt("basicpay")
	        			 , rs.getInt("sudang"));
	        	 
	         }
	         
	         rs.close();
	         stat.close();
	         conn.close();
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	}

	private static void m3() {
		
		  // 결과셋: N행 1열 
		   
		  Connection conn = null;
	      Statement stat = null;
	      ResultSet rs = null;
	      
	      try {
	         
	         conn = DBUtil.open();
	         stat = conn.createStatement();
	         
	         String sql = "select name from tblInsa order by name";
	         
	         // 60명 레코드 
	         rs = stat.executeQuery(sql);
	         
			/*
			 * rs.next(); System.out.println(rs.getString("name"));
			 * 
			 * rs.next(); System.out.println(rs.getString("name"));
			 * 
			 * rs.next(); System.out.println(rs.getString("name"));
			 */
	         
	         while(rs.next()) { 
	        	 System.out.println(rs.getString("name"));
	         } // EOF(End of File) 끝을 만나면 > False를 반환해서 빠져 나간다. 
	         
	         
	         // System.out.println(rs.getString("name"));
	         // > java.sql.SQLException: 결과 집합을 모두 소모했음
	         // ResultSet > 커서가 어디있는지? 
	         
	         rs.close();
	         stat.close();
	         conn.close();
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	}

	private static void m2() {
		
		// 결과셋: 1행 N열 
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select name, age, tel, address from tblAddress where seq = 3";
			
			rs = stat.executeQuery(sql);
			
			if( rs.next() ) {
				
				System.out.println("이름 : " + rs.getString("name"));
				System.out.println("나이 : " + rs.getString("age"));
				System.out.println("주소 : " + rs.getString("address"));
				
			} else {
				
				System.out.println("데이터가 없음");
				
			}
			// rs.next()를 했는데 만약에 비어있는 상태로 rs.getString을하면 에러가 난다. 

			
			rs.close();
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

	private static void m1() {
		
		//[ 단일값 반환 ] 
		// - 결과셋 : 1행 1열인 경우  
		
		Connection conn = null; 
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.open();
			stat = conn.createStatement();
			// String sql = "select count(*) as cnt from tblInsa";
			// String sql = "select count(*) cnt from tblInsa";
			String sql = "select name from tblInsa where num = 1010";
			
			
			rs = stat.executeQuery(sql);
			
			// ResultSet == 오라클 커서(Cursor) : 스트림, Iterator, 향상된 for
			// resultSet 첫번쨰 화살표 위를 가리켰다.
			// BOF(Begin of File) → > 파일의 시작 
			// 56                   > 값
			
			rs.next(); // 데이터가 있으면 true 없으면 false> 커서를 한줄 전진(이동)
			
			// 현재 커서가 가르키고 있는 레코드 접근 > 특정 컬럼값을 읽기
			//- rs.getXXX();
			//rs.getString
			// rs.getInt(index) // :컬럼인덱스 > 컬럼번호 > 파라미터
			// rs.getInt(label) // :컬럼라벨   > 컬럼이름 > 파라미터
			
			// int count = rs.getInt(1);
			
			// int count = rs.getInt("count(*)"); // 이건 이름이 아니다. > 이렇게 쓰지 마라
			
			//int count = rs.getInt("cnt"); // > alias를 붙이자. // number > int      //
			//String count2 = rs.getString("cnt"); 			   // number > String   //
			// > 자바와 오라클의 자료형은 상관이 없다.
			// 이것도 그 상황이다. 한번은 자바로 가져올 때
			// int 또한번은 String인데 아무 상관이 없다. > 꼭 자료형을 맞춘다는 것은 의미가 없다. 

			//System.out.println("카운트: " + count);
			
			String name = rs.getString("name");
			System.out.println(name);
			
			rs.close();
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace(); 
		}

	}
} // main
