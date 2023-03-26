package com.test.question;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
	
   private String name; //읽기/쓰기, 한글 2~5자 이내
   private String department; //읽기/쓰기, 영업부, 기획부, 총무부, 개발부, 홍보부
   private String position; //읽기/쓰기, 부장, 과장, 대리, 사원
   private String tel; //읽기/쓰기, 010-XXXX-XXXX 형식 확인
   private Employee boss; //읽기/쓰기, 다른 직원 중 한명, 같은 부서가 아니면 될 수 없음(유효성 검사)

   //getter, setter 구현

// info()는 아래를 출력한다. 
//   [홍길동]
//		   - 부서: 홍보부
//		   - 직위: 부장
//		   - 연락처: 010-1234-5678
//		   - 직속상사: 없음
   public void info() { // 직원 정보 확인
	   System.out.printf("[%s]\n", this.name);
	   System.out.printf("-부서: %s\n", this.department);
	   System.out.printf("-직위: %s\n", this.position);
	   System.out.printf("-연락처: %s\n", this.tel);
	   // System.out.printf("-직속상사:\n", this.boss);
	   if( this.boss == null)
		   System.out.printf("-직속상사: 없음\n");
	   else {
		   System.out.printf("-직속상사: %s(%s %s)\n", 
				   this.boss.getName(),
				   this.boss.getDepartment(),
				   this.boss.getPosition());
	   } 
		   
	   
	   System.out.println();
   }

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		boolean check  = true;
		for( int i=0 ; i<name.length() ; i++) {
			if(  name.charAt(i) <'가' ||  name.charAt(i) > '힣' ) {
				// false
				check = false;
			}
		}
		
		if( check ) 
			this.name = name;
		else 
			System.out.println("유효한 이름이 아닙니다.");
		
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		
		if(department.equals("영업부") ||department.equals("기획부") || department.equals("총무부")|| department.equals("개발부")|| department.equals("홍보부") )
			this.department = department;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		
		if(position.equals("부장") || position.equals("과장")  || position.equals("대리")  || position.equals("사원") )
			this.position = position;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		
		// contains, indexs, lastindexof, split
		// 010-xxxx-xxxx 형식 확인   > -으로 split 하고 3개 나와 all 숫자인지 확인, 근데 split 해버리면 위치점을 몰라
		//                           if문, string 메서드 잘써도 완벽한 매칭은 힘들다. 
		// 010-xxxx-xxxx          //  :> 결론은 정규식 사용하기
		// 1. pattern 설정
		// 2. 설정한 패턴 객체로 matcher() 메서드 사용으로 매칭 : 이러면 매칭되어 결과를 가지고 있음 
		Pattern pattern = Pattern.compile("\\d{3}-\\d{4}-\\d{4}"); // d: 숫자, {3} 3번이 연속으로 나온다.
		Matcher matcher = pattern.matcher(tel);
		
		
		
		if ( matcher.matches() ) //  하면 유효성 여부 확인 가능
			this.tel = tel;
		else {
			System.out.println("잘못뙨 전화번호! 000-0000-0000로 임의로 설정합니다.");
			this.tel = "000-0000-0000";
		}
	}
	
	public Employee getBoss() {
		return boss;
	}
	
	public void setBoss(Employee boss) {
		this.boss = boss;
	}
   
}
