package com.test.java;

import java.util.Arrays;
import java.util.Calendar;

public class Ex34_Array {

	public static void main(String[] args) {
		/*
		 * 배열, Array - 자료형 중 하나 > 데이터 저장 구조 + 규칙 - 참조형 - 집합 > 집합 자료형 > 데이터를 여러개 저장할 수 있는
		 * 자료형 - 같은 자료형을 저장하는 집합 > 같은 자료형 변수들의 집합 방들은 연속으로 생성된다. 동일한 성격 + 동일한 자료형 > 데이터가
		 * 여러개 > 배열사용!! 자바의 식별자는 조합해서 만들어낼 수 있다. 자바의 식별자는 한번에 만들어야 한다.
		 *** 
		 * 
		 */
		// m1();
		// m2();
		// String s1 = "n1";
		// String s2 = "n1";
		// m3();
		// int s1 +s2; 이건 안대
		// int [] ns = new int[3];
		// int index =0;
		// ns[0] = 100;
		// ns[index] = 100; // 배열이 첨자는 변수/상수가 올 수 있다.
		// m4();
		// m5();
		// m7();
		// m8();
		// m9();
		// m10();
		// m11();
		// m12();
		// m13();
		// m14();
		// m15();
		// m16();
		// m17();
		// m18();
		// m19();
		// m20();
		m21();

	}

	private static void m21() {
		// 삭제 
		// 배열의 원하는 위치의 요소를 삭제 / 값 하나를 빼고 오른쪾에서 왼쪾으로 하나씩 옮긴다. 
		// Left Shift
		String[] list = { "A", "B", "C", "D", "E" }; // 끼어들 위치를 한칸씩 민다.
		int index = 1;
		System.out.println("before : "+Arrays.toString(list));
		for (int i=index ; i < list.length-1 ; i++) {
			list[i] = list[i+1];
		}
		
		list[list.length-1] = null;
		System.out.println("after : "+Arrays.toString(list));
	}

	private static void m20() {
		// 삽입(*****)
		// 배열의 원하는 위치에 요소를 삽입
		// Right Shift
		String[] list = { "A", "B", "C", "D", "E" }; // 끼어들 위치를 한칸씩 민다.
		int index = 1;
		String value = "F"; // 끼어넣을 값
		
		System.out.println("before : "+Arrays.toString(list));
		//list[index] = "F";
		//1, 2, 3 
		for( int i= list.length-2 ; i >= index ; i--) {
			System.out.println(i);
			list[i+1] = list[i];
		}
		
		list[index] = value; // 마지막
		
		System.out.println("after : "+Arrays.toString(list));
	}

	private static void m19() {
		// - 추출
		// - charAt(배열, 방번호)
		// - subArray(배열, 시작 방번호, 끝 방번호) > 부분 집합 가져오기
		// - subArray(배열, 시작 방번호) > 시작하는 위치만 알려줄 테니까 끝까지 떼와라
		String[] colors = { "red", "yellow", "blue", "white", "black", "green", "purple", "gold", "silver" };
		System.out.println(colorAt(colors, 5));
		System.out.println(colors[5]);

		String[] sub = subArray(colors, 2, 5); // "blue" ,"white" ,"black"
		System.out.println(Arrays.toString(sub));

		sub = subArray(colors, 5);

		System.out.println(Arrays.toString(sub));

	}

	public static String[] subArray(String[] colors, int beginIndex) {

		String[] temp = new String[colors.length - beginIndex];
		for (int i = beginIndex; i < colors.length; i++) { // endIndex는 포함 x
			// 추출하고 싶은 영역의 인덱스
			temp[i - beginIndex] = colors[i];
			// 여기 인덱싱 잘보자 beginIndex로 - 가 되서 normalizing 된 것
		}
		return temp; // 부분적으로 뽑아낸다.
	}

	public static String[] subArray(String[] colors, int beginIndex, int endIndex) {

		// 또 다른 배열을 만들어서 돌려줘야 한다.
		String[] temp = new String[endIndex - beginIndex];
		for (int i = beginIndex; i < endIndex; i++) { // endIndex는 포함 x
			// 추출하고 싶은 영역의 인덱스
			temp[i - beginIndex] = colors[i];
			// 여기 인덱싱 잘보자 beginIndex로 - 가 되서 normalizing 된 것
		}
		return temp; // 부분적으로 뽑아낸다.
	}

	public static String colorAt(String[] colors, int index) {
		return colors[index];
	}

	private static void m18() {
		// - 깊은 복사
		String[] colors = { "red", "yellow", "blue", "white", "black", "green", "purple", "gold", "silver" };
		String[] copy = deepCopy(colors);
		copy[0] = "빨강";
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.toString(colors));
	}

	public static String[] deepCopy(String[] colors) {

		// 원본과 동일한 타입 + 동일한 길이 > 배열 생성
		String[] temp = new String[colors.length];

		for (int i = 0; i < colors.length; i++) {
			temp[i] = colors[i];
		}
		// 얕은 복사
		// temp = colors;
		return temp;
	}

	private static void m17() {
		// - 검색
		// - int indexOf(배열, 검색대상)
		// - 검색대상이 배열의 몇번째 방에서 발견됬는지? 방번호 반환
		String[] colors = { "red", "yellow", "blue", "white", "black", "green", "purple", "gold", "silver" };

		System.out.println(indexOf(colors, "white"));
		System.out.println(indexOf(colors, "skyblue"));
	}

	public static int indexOf(String[] colors, String color) {

		for (int i = 0; i < colors.length; i++) {

			if (colors[i].equals(color)) {
				// return true;
				return i; // 찾은 방의 번호를 돌려준다.
			}
		}
		return -1; // 찾지 못하면 존재하지 않는 방번호를 돌려준다.
		// 음수중 가장 간단한 숫자
	}

	private static void m16() {
		// 배열을 대상으로 자주하는 행동들 .. > 메소드 구현
		// - 검색
		// - boolean contains(배열, 검색대상)
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		if (contains(nums, 5))
			System.out.println("숫자 발견");
		else
			System.out.println("발견 못함");

		String[] colors = { "red", "yellow", "blue", "white", "black", "green", "purple", "gold", "silver" };

		if (contains(colors, "red"))
			System.out.println("색깔 발견");
		else
			System.out.println("색깔 발견 못함");

	}

	public static boolean contains(String[] colors, String color) {

		for (int i = 0; i < colors.length; i++) {
			if (colors[i].equals(color)) {
				return true;
			}
		}
		return false;
	}

	public static boolean contains(int[] nums, int num) {
		// 모든 방에 있는 값을 1:1로 비교
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == num) {
				return true;
			}

		}
		return false;
	}

	private static void m15() {
		// 자바의 정렬 기능 사용
		int[] nums = { 5, 3, 1, 4, 2 };

		Arrays.sort(nums); // 정렬은 Quick 정렬 알고리즘을 쓴다. // 보통 다른 언어는 reverse라는 이름으로 기능을 제공함.
		// Arrays.sort(nums, (a, b)-> a > b );
		System.out.println(Arrays.toString(nums));

		String[] names = { "홍길동", "아무개", "테스트", "유재석", "김철수", "나영희", "고길동" };

		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

		// 즉, 날짜도 정렬이 가능하다.
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

		for (int i = 0; i < list.length; i++) {
			System.out.printf("%tF\n", list[i]);
		}

	}

	private static void m14() {
		Calendar c1 = Calendar.getInstance(); // 어제
		c1.add(Calendar.DATE, -1);

		Calendar c2 = Calendar.getInstance(); // 오늘

		// System.out.println(c1 > c2); //에러
		System.out.println(c1.getTimeInMillis() > c2.getTimeInMillis());
		// 날짜 끼리 비교한다.
		System.out.println(c1.compareTo(c2)); //
		System.out.println(c2.compareTo(c1)); // 오늘 것이 더크다. 미래가 크다.
		System.out.println(c1.compareTo(c1)); //

		// 즉, 날짜도 정렬이 가능하다.
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

		// 오름차순 정렬
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = 0; j < list.length - i - 1; j++) {
				if (list[j].compareTo(list[j + 1]) < 0) {
					Calendar temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}

		// System.out.println(Arrays.toString(list)); // 얘는 덤프 안된다.
		// Calendar는 toString이 복잡해
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%tF\n", list[i]);
		}

	}

	private static int compare(String s1, String s2) {
		// 1 : 앞
		// -1 : 뒤
		// 0 : 동일
		int small = s1.length() > s2.length() ? s2.length() : s1.length();
		for (int i = 0; i < small; i++) {

			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if (c1 > c2) {
				return 1;
			} else if (c1 < c2) {
				return -1;
			}
		}

		if (s1.length() > s2.length())
			return 1;
		else if (s1.length() < s2.length())
			return -1;

		return 0;
	}

	private static void m13() {
		// 문자열 정렬 + 버블 정렬
//		String s1 = "A";
//		String s2 = "B";// 이건 부등호로 비교 x
//		
//		char c1 = 'A';
//		char c2 = 'B';  //이건비교가능
		String s1 = "홍길동";
		String s2 = "홍길동입니다.";
		System.out.println(compare(s1, s2));

		String[] names = { "홍길동", "아무개", "테스트", "유재석", "김철수", "나영희", "고길동" };

		for (int i = 0; i < names.length - 1; i++) {
			// 한 사이클 마다 숫자가 하나씩 줄어서 i를 한번더 뺸다.
			for (int j = 0; j < names.length - i - 1; j++) {

				// if( compare(names[j], names[j+1])>0 ) {
				if (names[j].compareTo(names[j + 1]) > 0) {
					String temp = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(names));

	}

	private static void m12() {
		// 데이터 집합 or 배열 > 정렬
		// 1. 오름차순
		// a. 숫자 : 착은 숫자 > 큰 수
		// b. 문자(열) : 문자코드값 순으로 정렬
		// c. 날짜시간: 과거 > 미래
		// 2. 내림차순
		// a. 숫자: 큰수 > 작은수
		// b. 문자(열) : 문자코드값 역순으로
		// c. 날짜시간: 미래 > 과거
		// 정렬 > 기술 면접(코딩 테스트) 질문
		// 1. 직접 구현 > 정렬 알고리즘
		// 2. JDK 기능 사용
		int[] nums = { 5, 3, 1, 4, 2 };
		for (int i = 0; i < nums.length - 1; i++) {
			// i(0) j(0,1,2,3)
			// i(1) j(0,1,2)
			// i(2) j(0,1)
			// i(3) j(0)
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) { // 앞에 것이 크면 뒤로 옮겨라
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
			System.out.printf("%d cycle\n", i);
			System.out.println(Arrays.toString(nums));
		}
		System.out.println(Arrays.toString(nums));
	}

	private static void m11() {
		// 배열 자동 초기화 > 초기화 리스트
		int[] nums1 = new int[5];
		System.out.println(Arrays.toString(nums1));
		// 직접 초기화
		nums1[0] = 96;
		nums1[1] = 79;
		nums1[2] = 99;
		nums1[3] = 85;
		nums1[4] = 65;
		System.out.println(Arrays.toString(nums1));

		// 초기화 리스트 > 배열 생성과 동시에 초기화
		int[] nums2 = new int[] { 96, 79, 99, 85, 65 };
		// int[] nums3 = new int[5] {96, 79, 99, 85, 65}; // 숫자 적으면 에러

		System.out.println(Arrays.toString(nums2));

		int[] nums3 = { 96, 79, 99, 85, 65 };
		System.out.println(Arrays.toString(nums3));

		String[] name1 = new String[3];
		name1[0] = "홍길동";
		name1[1] = "아무개";
		name1[2] = "하하하";

		String[] name2 = { "홍길동", "아무개", "하하하" };
		System.out.println(Arrays.toString(name1));
		System.out.println(Arrays.toString(name2));
	}

	private static void m10() {
//		int a;
//		System.out.println(a);
//		
		int[] nums = new int[3];
		System.out.println(nums[0]);
		// 배열 자동 초기화
		// 배열은 생성 직후에 개발자가 아무것도 안해도 자동으로 값이 초기화
		// 생성자를 통해서 자동 초기화
		// 초기화 규칙(***)
		// 1. 정수배열 > 0
		// 2. 실수배열 > 0.0
		// 3. 문자배열 > \0
		// 4. 논리배열 > false
		// 5. 참조형배열 > null
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
		// 유틸리티 클래스
		// -byte > byte
		// -short > short
		// -int > Integer
		// Arrays 클래스
		// - 배열과 관련된 작업(기능)들을 미리 제공해주는 클래스

		int[] nums = new int[3];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		printArray(nums);
		// Arrays.toString()
		// - 데이터를 가지는 공간 내부의 상태를 문자열로 반환 > 행동 > 덤프
		System.out.println(Arrays.toString(nums)); // 배열안의 상태 확인할 때 쓴다.

		int[] copy;
		copy = Arrays.copyOfRange(nums, 0, 3);

		nums[0] = 100;
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.toString(nums));

	}

	public static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("[%d] = %d\n", i, nums[i]);
		}
		System.out.println();
	}

	private static void m8() {
		// 배열의 복사
		// 1. 얕은 복사 shallow copy
		// - 주소값 복사
		// - side Effect 발생 ( 원본 <-> 수정본 )
		// - 기본 동작

		// 2. 깊은 복사 deep copy
		// 실제값 복사
		// - side Effect 발생하지 않는다. ( 원본 <-> 수정본 )

		int[] nums = new int[3];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;

		// int[] copy;
		// 요놈 주소값만 복사
		// copy = nums;

		int[] copy = new int[3];

//		copy[0] = nums[0];
//		copy[1] = nums[1];
//		copy[2] = nums[2];

		for (int i = 0; i < nums.length; i++)
			copy[i] = nums[i];

	}

	private static void m7() {
		// *****************
		// 배열 복사(= 모든 참조형 복사)
		int a = 10; // 원본
		int b; // 복사본

		b = a;
		a = 20;
		// 원본을 수정해도 복사본에는 영향을 안미침
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();

		// 참조형 끼리의 복사
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		int[] copy;
		copy = nums;
		// 원본을 수정하면 복사본도 수정된다.
		nums[0] = 100;
		copy[2] = 300;

		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println();
		System.out.println(copy[0]);
		System.out.println(copy[1]);
		System.out.println(copy[2]);

	}

	private static void m5() {
		// 성적표
		// 10명
		// 국어 영어 수학 > 난수

		// 데이터 저장 > 배열
		int size = 100;
		String[] names = new String[10]; // 학생명
		int[] kor = new int[size]; // 국어점수
		int[] eng = new int[size]; // 영어점수
		int[] math = new int[size]; // 수학점수

		names[0] = "일";
		names[1] = "이";
		names[2] = "삼";
		names[3] = "사";
		names[4] = "오";
		names[5] = "육";
		names[6] = "칠";
		names[7] = "팔";
		names[8] = "구";
		names[9] = "십";

		// 데이터 확보
		// 점수 계싼
		// 화면설계
		System.out.println("===================");
		System.out.println("             성적표");
		System.out.println("===================");

		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		System.out.println("홍길동\t100\t90\t80\t270\t90.0");
		System.out.println("홍길동\t100\t90\t80\t270\t90.0");
		System.out.println("홍길동\t100\t90\t80\t270\t90.0");
		System.out.println("홍길동\t100\t90\t80\t270\t90.0");
		System.out.println("홍길동\t100\t90\t80\t270\t90.0");
		System.out.println("홍길동\t100\t90\t80\t270\t90.0");
		System.out.println("홍길동\t100\t90\t80\t270\t90.0");

	}

	private static void m4() {
		// 각 자료형 > 배열
		// 정수배열(byte, short, int, long)
		byte[] list1 = new byte[5];
		list1[0] = 10;
		System.out.println(list1[0]);

		// 실수 배열(float, double)
		double[] list2 = new double[5];
		list2[0] = 3.15;
		System.out.println(list2[0]);

	}

	private static void m3() {
		// -int[] > int 배열
		// -num3 > 변수 > 배열
		// -10 > 배열의 길이(=방의 개수)
		// -방번호 > 첨자(index)
		// -방 1개(=데이터) > 요소(element)
		// 배열의 길이 = 10;
		// 첨자의 벙뮈 0~9
		// 첨자의 범위 = 0 ~ length -1
		int[] nums = new int[10];
		nums[0] = 10;
		nums[4] = 50;
		nums[9] = 100;

		nums[10] = 110; // 없는 방번호 런타임 에러
		// - Index 10 out of bounds for length 10

	}

	private static void m2() {
		// 요구사항 ] 학생 3명 > 국어 점수 > 총점, 평균
		// int[] kors = new int[3];
		// 자료형, 변수명;
		int n; // n 숫자가 들어있찌만 메모리상에 잡아놓은 물리적인 주소
		int[] kors; // kors의 자료형은? int[]입니다. int배열입니다.
		kors = new int[3]; // int 변수를 3개를 만들어라
		// 변수 > 필드(field) >>> 프로퍼티(property), 속성(attribute)
		// kors 배열의 길이 == 방의 개수
		System.out.println(kors.length);

		// 배열의 방에 접근하기(데이터 입출력)
		// kors = 100; 을넣으면 어디다가 넣음?? > 내가 알려줭 한다.
		// int = int
		// 왼자 오자 일치해야 한다.
		kors[0] = 100; // int 방이다. 점수 넣을 수 있다.
		kors[1] = 90; // int 방이다. 점수 넣을 수 있다.
		kors[2] = 80;
		int total = kors[0] + kors[1] + kors[2];
		double avg = total / kors.length;
		System.out.printf("총점: %d점\n", total);
		System.out.printf("평균: %.1f점\n", avg);

	}

	private static void m1() {
		// 요구사항 ] 학생 3명 > 국어 점수 > 총점, 평균
		// 추가사항 ] 학생 수 증가 > 300명
		int kor1;
		int kor2;
		int kor3;
		// + 297명

		kor1 = 100;
		kor2 = 90;
		kor3 = 80;

		int total = kor1 + kor2 + kor3;

		double avg = total / 3.0;

		System.out.printf("총점: %d점\n", total);
		System.out.printf("평균: %.1f점\n", avg);
	}

}
