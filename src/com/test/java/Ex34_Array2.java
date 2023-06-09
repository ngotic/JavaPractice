package com.test.java;

import java.util.Arrays;
import java.util.Calendar;

public class Ex34_Array2 {

	public static void main(String[] args) {
		
		/*
		
			배열, Array
			- 자료형 중 하나 > 데이터 저장 구조 + 규칙
			- 참조형
			- 집합 > 집합 자료형 > 데이터를 여러개 저장할 수 있는 자료형
			- 같은 자료형을 저장하는 집합 > 같은 자료형 변수들의 집합
			- *** 방들은 연속으로 생성(***)
			
			동일한 성격 + 동일한 자료형 > 데이터가 여러개 > 배열 사용!!!!
		
		
		*/
		
		
		//*** 자바의 식별자는 조합해서 만들어낼 수 없다. 
		//*** 자바의 식별자는 한번에 만들어야 한다.
		
		int n1; 
		
		//String s1 = "n";
		//String s2 = "1";
		
		//int s1 + s2;]
		
		
		int[] ns = new int[3];
		int index = 0;
		
		ns[0] = 100;
		ns[index] = 100; // 배열의 첨자는 변수/상수가 올 수 있다.
		
		int m1;
		int m2;
		int m3; 
		
		//m1 > m2 > m3
		

		
		//m1(); 
		//m2(); //1번과 같은 문제 배열로
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		//m14(); //날짜
		// m15();
		
		
		
	}//main

	private static void m16() {
		
		
	}

	private static void m15() {
		
		//자바의 정렬 기능 사용
		
		int[] nums = { 5, 3, 1, 4, 2 };
		
		Arrays.sort(nums); //정렬 > Quick 정렬 알고리즘
		
		System.out.println(Arrays.toString(nums));
		
		
		//문자열 정렬
		String[] names = {
				"홍길동",
				"아무개",
				"테스트",
				"유재석",
				"김철수",
				"나영희",
				"고길동"
		};
		
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		
		
		//날짜
		Calendar[] list = new Calendar[5];
		
		list[0] = Calendar.getInstance();
		list[0].add(Calendar.DATE, -2);
		
		list[1] = Calendar.getInstance();
		list[1].add(Calendar.DATE, 1);
		
		list[2] = Calendar.getInstance();
		list[2].add(Calendar.DATE, -7);
		
		list[3] = Calendar.getInstance();
		list[3].add(Calendar.DATE, 3);
		
		list[4] = Calendar.getInstance();
		
		Arrays.sort(list);
		
		//toString ㄴㄴ
		for (int i=0; i<list.length; i++) {
			
			System.out.printf("%tF\n", list[i]);
			
		}
		
		
		
	}//m15

	private static void m14() {
		
		Calendar c1 = Calendar.getInstance();
		c1.add(Calendar.DATE, -1); //어제
		
		Calendar c2 = Calendar.getInstance(); //오늘
		
		//System.out.println(c1 > c2);
		
		System.out.println(c1.getTimeInMillis() > c2.getTimeInMillis());
		
		//날짜 비교
		System.out.println(c1.compareTo(c2));
		System.out.println(c2.compareTo(c1));
		System.out.println(c1.compareTo(c1));
		
		Calendar[] list = new Calendar[5];
		
		list[0] = Calendar.getInstance();
		list[0].add(Calendar.DATE, -2);
		
		list[1] = Calendar.getInstance();
		list[1].add(Calendar.DATE, 1);
		
		list[2] = Calendar.getInstance();
		list[2].add(Calendar.DATE, -7);
		
		list[3] = Calendar.getInstance();
		list[3].add(Calendar.DATE, 3);
		
		list[4] = Calendar.getInstance();
		
		
		
		//오름차순 정렬
		for (int i=0; i<list.length-1; i++) {
			
			for (int j=0; j<list.length-1-i; j++) {
				
				if ( list[j].compareTo(list[j+1]) > 0 ) {
					
					Calendar temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					
				}
				
			}
			
		}
		
		
		
		//System.out.println(Arrays.toString(list));
		
		for (int i=0; i<list.length; i++) {
			
			System.out.printf("%tF\n", list[i]);
			
		}
		
		
		
	}//m14

	private static void m13() {
		
		//문자열 정렬 + 버블 정렬
		//String s1 = "A";
		//String s2 = "B";
		
		//System.out.println(s1 > s2); //문자열끼리 비교X
		
		//char c1 = 'A';
		//char c2 = 'B';
		
		//System.out.println(c1 > c2); //숫자형 비교
		
		//오름차순(가나다순으로): 아무개 > 홍길동
		String s1 = "홍길동입니다";
		String s2 = "홍길동";
		
		System.out.println(compare(s1, s2));
		
		
		
		String[] names = {
				"홍길동",
				"아무개",
				"테스트",
				"유재석",
				"김철수",
				"나영희",
				"고길동"
		};
		
		
		for (int i=0; i<names.length-1; i++) {
			
			for (int j=0; j<names.length-1-i; j++) {
				
				//if (compare(names[j], names[j+1]) > 0) {
				
				//직접만든 위 compare랑 똑같은 메서드 
				if (names[j].compareTo(names[j+1]) > 0) {
					
					String temp= names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
					
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(names));
		
		
		
	}//m13

	// 두 문자열의 문자코드값을 비교하는 로직
	//1 : 앞이 큼
	//-1 : 뒤
	//0 : 동일
	private static int compare(String s1, String s2) {
		
		int length = s1.length() > s2.length() ? s2.length() : s1.length();
		
		for (int i=0; i<length; i++) {
			
			char c1 = s1.charAt(i); //'홍'
			char c2 = s2.charAt(i); //'아'
			
			if (c1 > c2) {
				return 1;
			} else if (c1 < c2) {
				return -1; 
			} 
			
			
		}
		
		if (s1.length() > s2.length()) {
			return 1;
		} else if (s1.length() < s1.length()) {
			return -1;
		}
		
		return 0;
		
	}

	private static void m12() {
		
		//데이터 집합 or 배열 > 정렬
		//- 크기 비교 후 > 재배치
		
		//1. 오름차순
		// a. 숫자: 작은수 > 큰수
		// b. 문자(열): 문자코드값 순으로
		// c. 날짜시간: 과거 > 미래
		
		//2. 내림차순
		// a. 숫자: 큰수 > 작은수
		// b. 문자(열): 문자코드값 역순으로
		// c. 날짜시간: 미래 > 과거
		
		
		//정렬 > 기술 면접(코딩 테스트) 질문
		//1. 직접 구현 > 정렬 알고리즘 > 버블 정렬
		//2. JDK 기능 사용 
		
		int[] nums = {5, 3, 1, 4, 2};
		
		System.out.println(Arrays.toString(nums));
		System.out.println();
		
		for (int i=0; i<nums.length-1; i++) { //0, 1, 2, 3 > N Cycle
			
			System.out.printf("%d cycle\n", i);
			System.out.println(Arrays.toString(nums));
			
			//i(0) j(0, 1, 2, 3)
			//i(1) j(0, 1, 2)
			//i(2) j(0, 1)
			//i(3) j(0)
			for (int j=0; j<nums.length-i-1; j++) {
				
				//오름차순. 내림차순은 부등호 반대로
				if (nums[j] > nums[j+1]) {
					
					//swap
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					
				}
				
				System.out.println(Arrays.toString(nums));
				
			}
			
		}
		
		System.out.println();
		System.out.println("result");
		System.out.println(Arrays.toString(nums));
		
		
		
	}

	private static void m11() {
		
		//배열 자동 초기화 > 초기화 리스트
		
		int[] nums1 = new int[5];
		System.out.println(Arrays.toString(nums1)); //
		
		//직접 초기화 > 수정하기
		nums1[0] = 96;
		nums1[1] = 79;
		nums1[2] = 99;
		nums1[3] = 85;
		nums1[4] = 65;
		System.out.println(Arrays.toString(nums1));
		
		
		//초기화 리스트 > 배열 생성과 동시에 초기화
		int[] nums2 = new int[] { 96, 79, 99, 85, 65 };
		System.out.println(Arrays.toString(nums2));
		
		//더 간단히(가장 많이 사용)
		int[] nums3 = {96, 79, 99, 85, 65};
		System.out.println(Arrays.toString(nums3));
		
		
		
		String[] name1 = new String[3];
		name1[0] = "홍길동";
		name1[1] = "아무개";
		name1[2] = "하하하";
		
		String[] name2 = {"홍길동", "아무개", "하하하"};
		
		System.out.println(Arrays.toString(name1));
		System.out.println(Arrays.toString(name2));
		
		
	}

	private static void m10() {
		
		//The local variable a may not have been initialized
		int a;
		//System.out.println(a);
		
		int[] nums = new int[3]; //int x 3
		System.out.println(nums[0]); //컴파일 오류(X), 런타임 오류(X), 0
		System.out.println(Arrays.toString(nums));
		
		//배열 자동 초기화
		//- 배열은 생성 직후에 개발자가 아무것도 안해도 자동으로 값이 초기화
		//- 생성자를 통해서 자동 초기화
		
		//초기화 규칙(***)
		//1. 정수배열 > 0
		//2. 실수배열 > 0.0
		//3. 문자배열 > \0
		//4. 논리배열 > false
		//5. 참조형배열 > null
		
		double[] nums2 = new double[3];
		System.out.println(Arrays.toString(nums2));
		
		char[] list1 = new char[3];
		System.out.println(Arrays.toString(list1));
		
		boolean[] list2 = new boolean[3];
		System.out.println(Arrays.toString(list2));
		
		String[] list3 = new String[3];
		System.out.println(Arrays.toString(list3));
		
		
		
	}

	private static void m9() {
		
		//유틸리티 클래스
		//- byte > Byte
		//- short > Short
		//- int > Integer
		
		//Arrays 클래스
		//- 배열과 관련된 작업(기능)들을 미리 제공해주는 클래스
		
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		//배열의 상태?? > 배열안에 데이터가 잘 들어있는지?
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println();
		
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println();
		
		System.out.println(nums); //[ I @59f95c5d(16진수) > nums의 진짜 메모리 주소번지
		System.out.println();
		
		printArray(nums); //int[] nums
		
		printArray(nums);
		
		
		//Arrays.toString()
		//- 데이터를 가지는 공간내부의 상태를 문자열로 반환 > 행동 > 덤프(dump)
		System.out.println(Arrays.toString(nums));
		System.out.println();
		
		
		//nums > copy 깊은 복사
		int[] copy;
		
		//깊은 복사
		copy = Arrays.copyOfRange(nums, 0, nums.length);
		
		nums[0] = 100;
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(copy));
		
		
		
		
	}//m9
	
	public static void printArray(int[] nums) {
		
		for (int i=0; i<nums.length; i++) {
			System.out.printf("[%d] = %d\n", i, nums[i]);
		}
		System.out.println();
		
	}

	private static void m8() {
		
		//배열 복사
		
		//1. 얕은 복사, Shallow Copy
		//- 주소값 복사
		//- Side Effect 발생(원본 <-> 수정본)
		//- 기본 동작
		
		//2. 깊은 복사, Deep Copy
		//- 실제 값 복사
		//- Side Effect 발생 안함
		
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		//int[] copy;
		
		//참조형끼리 복사, 참조형 변수끼리 복사
		//얕은 복사
		
		//int[] = int[] > 참조형 복사 > 주소값 복사 > 얕은 복사
		//copy = nums;
		
		
		int[] copy = new int[3];
		
		//int = int > 값형 복사 > 값 복사 > 깊은 복사
		//copy[0] = nums[0];
		//copy[1] = nums[1];
		//copy[2] = nums[2];
		
		for(int i=0; i<nums.length; i++) {
			copy[i] = nums[i];
		}
		
		
		nums[0] = 100;
		
		System.out.println(copy[0]);
		
		
	}//m8

	private static void m7() {
		
		//*********************
		//배열 복사(= 참조형 복사)
		
		
		//값형(원시형)끼리의 복사
		int a = 10; //원본
		int b;		//복사본
		
		b = a;
		
		//원본을 수정해도 복사본에는 영향을 주지 않는다. > Side Effect가 없다. 
		a = 20; //원본 수정
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		
		
		
		//참조형끼리의 복사
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		int[] copy;
		
		//int[] = int[]
		//복사 > nums와 copy가 한몸~
		copy = nums;
		
		//원본을 수정하면 복사본도 수정이 된다. > Side Effect가 있다. 
		//반대로 복사본을 수정하면 원본도 수정이 된다. 
		nums[0] = 100; 
		copy[2] = 300;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println();
		
		System.out.println(copy[0]);
		System.out.println(copy[1]);
		System.out.println(copy[2]);
		
		
		int[] temp;
		
		temp = copy;
		
		
	}

	private static void m6() {
		
		//***** 메모리의 공간은 한번 할당되면 절대로 늘리거나 줄일 수 없다. 
		
		int[] nums = new int[3]; //int x 3 = 4byte = 12byte
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		//사용하다보니.. 어라? 배열의 길이가 조금 부족함;;; 길이 5개!!!
		// > 불가능!!!!!!!
		// > ****** 미리 예측!!! > 사용할 배열의 길이가 충분한지!!!(이것 말고 대응방법X)
		
		//학생 성적 처리 프로그램
		// > 교장 선생님 > 학생 수 몇명? > 280명(지금) > 250~320명
		int[] kors = new int[350]; //3!!!!
		
		
	}

	private static void m5() {
		
		//성적표
		//- 10명
		//- 국어, 영어, 수학 > 난수
		
		
		//데이터 저장 > 배열
		int size = 10;
		
		String[] name = new String[size]; //학생명
		int[] kor = new int[size]; //국어점수
		int[] eng = new int[size]; //영어점수
		int[] math = new int[size]; //수학점수
		
		
		//데이터 확보
		name[0] = "홍길동";
		name[1] = "아무개";
		name[2] = "유재석";
		name[3] = "임성빈";
		name[4] = "유찬욱";
		name[5] = "김한빈";
		name[6] = "유정목";
		name[7] = "이채린";
		name[8] = "차지니";
		name[9] = "송재경";
		
		for (int i=0; i<size; i++) {
			
			//60~100
			//0 ~ 40
			
			//:> (int)(Math.random()*(max-min+1)) + min; // 공식으로 외워라
			kor[i]  = (int)(Math.random()*41) + 60;
			eng[i]  = (int)(Math.random()*41) + 60;
			math[i] = (int)(Math.random()*41) + 60;
			
		}
		
		//점수 계산 > 총점, 평균
		//1. 총점배열, 평균배열 > 미리 계산 > 저장
		//2. 출력할 때 즉시 계산

		
		
		
		//화면 설계
		System.out.println("=============================================");
		System.out.println("                    성적표");
		System.out.println("=============================================");
		
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		int total = 0; //반 전체 평균
		
		for (int i=0; i<size; i++) {
			System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n"
								, name[i]
								, kor[i]
								, eng[i]
								, math[i]
								, kor[i] + eng[i] + math[i]
								, (kor[i] + eng[i] + math[i]) / 3.0);
			
			total += kor[i] + eng[i] + math[i]; //모든 학생의 총점 누적
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.printf("반평균\t\t\t\t\t%5.1f\n"
							, total / 3.0 / 10);
		
		
	}//m5

	private static void m4() {
		
		//각 자료형 > 배열
		
		//정수 배열(byte, short, int, long)
		byte[] list1 = new byte[5]; //***
		list1[0] = 10;
		System.out.println(list1[0]);
		
		//실수 배열(float, double)
		double[] list2 = new double[5];
		list2[0] = 3.14;
		System.out.println(list2[0]);
		
		//문자 배열(char)
		char[] list3 = new char[5];
		list3[0] = 'A';
		System.out.println(list3[0]);
		
		//논리 배열(boolean)
		boolean[] list4 = new boolean[5];
		list4[0] = true;
		list4[1] = false;
		System.out.println(list4[0]);
		System.out.println(list4[1]);
		
		//참조형
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);
		
		
		//*** 잘 생각!!
		Calendar c1; //변수
		c1 = Calendar.getInstance(); // 값
		
		Calendar[] list6 = new Calendar[5]; //변수 x 5개
		list6[0] = Calendar.getInstance(); //값
		
		
		
	}//m4

	private static void m3() {
		
		//- int[] > int 배열
		//- nums > 변수 > 배열
		//- 10 > 배열의 길이(=방의 개수)
		//- 방번호 > 첨자(index)
		//- 방 1개(=데이터) > 요소(element)
		int[] nums = new int[10];
		
		
		//배열의 길이 = 10
		//첨자의 범위 = 0 ~ 9
		//첨자의 범위 = 0 ~ length-1
		
		nums[0] = 10;
		nums[4] = 50;
		nums[9] = 100;
		
		//***** 배열 사용 시 주의점!!!!
		//- 컴파일 에러(X) > 런타임 에러(O)
		// java.lang.ArrayIndexOutOfBoundsException
		//- Index 10 out of bounds for length 10
		//nums[10] = 110; //없는 방번호 > 접근할 수 없다.
		
		
		//인덱서(Indexer)
		//- nums[0]
		
		//방10개 > 하나씩;;
		
		// 루프 변수의 초기값 0인 이유 > 배열의 방번호가 0부터라서..
		for (int i=0; i<nums.length; i++) {
			
			//nums[i] = i;
			
			nums[i] = (int)(Math.random()*10) +1; //1~10 난수
			
		}
		
		for ( int i=0; i<nums.length; i++) {
			
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
			
		}
		
		
	}//m3

	private static void m2() {
		
		//요구사항] 학생 3명 > 국어 점수 > 총점, 평균(소수 1자리)
		//추가사항] 학생 수 증가 > 300명
		
		//배열 선언하기(생성하기)
		//- 자료형[] 배열명 = new 자료형[길이];
		
		//int[] kors = new int[3];
		
		//자료형(int[]) 변수명 (kors)
		//int[] kors; //kor의 자료형은? int[]입니다. int 배열입니다.
		//kors = new int[3]; //int 변수를 3개 만들어라!!!
		
		
		//int[] kors = new int[3];
		int[] kors = new int[300];
		
		//변수 > 필드(field), 프로퍼티(property), 속성(attribute)
		//kors 배열의 길이 == 방의 개수
		System.out.println(kors.length);
		
		
		//배열의 방에 접근하기(데이터 입출력)
		//int[] = int
		//kors = 100; //cannot convert from int(값형) to int[](참조형)
		
		//int = int
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		//..
		kors[299] = 60;
		
		//int total = kors[0] + kors[1] + kors[2]; // + kors[299]
		
		int total = 0; //누적변수
		
		for (int i=0; i<kors.length; i++) {
			
			//i: 0 > 1 > 2
			//System.out.println(kors[i]);
			
			total += kors[i]; //누적 == 총점
			
		}
		
		
		
		double avg = (double)total / kors.length;
		
		System.out.printf("총점: %d점\n", total);
		System.out.printf("평균: %.1f점\n", avg);
		
		
	}//m2

	private static void m1() {
		
		//요구사항] 학생 3명 > 국어 점수 > 총점, 평균(소수 1자리)
		//추가사항] 학생 수 증가 > 300명
		
		int kor1;
		int kor2;
		int kor3;
		//+297
		int kor300;
		
		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		//+297
		
		int total = kor1 + kor2 + kor3; // .. + kor300
		
		double avg = total / 3.0; 
		
		System.out.printf("총점: %d점\n", total);
		System.out.printf("평균: %.1f점\n", avg);
		
		
	}

}
