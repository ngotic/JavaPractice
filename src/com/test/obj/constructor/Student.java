package com.test.obj.constructor;

public class Student {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	

	 // A 생성자가 할 수 있느 일은 B 생성자도 할 수 있다.  
	 // A 생성자가 할 수 있는 일은 C 생성자도 할 수 있다.
	 // C 생성자가 할 수 있는 일은 B 생성자도 할 수 있다.
	 // - 개발자가 그 어떤 생성자도 만들지 않았을 경우에만 아래의 기본 생성자가 자동으로 만들어진다 .
	 //A.
	 public Student() {
		this(null, 0, 0, 0); //B 생성자를 호출한다. 맨 앞에밖에 못온 다.
//	 	this.name = null;
//	 	this.kor  = 0;
//	 	this.eng  = 0;
//	 	this.math = 0;
	 }
	 
	// 개발자가 생성자를 하나라도 만들면 기본생성자는 안만들어진다.
	// 근데 기본생성자가 이 때도 필요하면 우리가 직접 만들어야 한다. 
	
	//B.
	// 개발자가 생성자를 만들어버리면 저기 기본 생성자는 만들어지지 않는다. 사용자가 만들었으니까
	// 굳이 서비스로 만들필요가 없다고 생각한다.
	public Student(String name, int kor , int eng, int math) {
		// 유효성 검사
		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		this.name = null;
		if( kor>=0 && kor <=100) {
			this.kor = kor;
		}
		if( eng>=0 && eng <=100) {
			this.eng = eng;
		}
		if( math>=0 && math <=100) {
			this.math = math;
		}
		
		
		
	}
	// C
	public Student(int kor, int eng, int math) {
		
//		this.name = null;
//		if( kor>=0 && kor <=100) {
//			this.kor = kor;
//		}
//		if( eng>=0 && eng <=100) {
//			this.eng = eng;
//		}
//		if( math>=0 && math <=100) {
//			this.math = math;
//		}
		//B 생성자를 호출
		this(null, kor, eng, math); // 한쫃으로 몰아줘서 코딩하낟.
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String info() {
		
		return String.format("%s(%d, %d, %d)",
				             this.name,
				             this.kor,
				             this.eng,
				             this.math);
	}
	
}
