package com.test.question;

public class Q104 {

	public static void main(String[] args) {
//		MyArrayList list = new MyArrayList();
//		
//		System.out.println(list.size());
//		list.add("멍멍이");
//		
//		System.out.println(list.size());
//		list.add("고양이");
//		
//		System.out.println(list.size());
//		list.add("캥거루");
//		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		
//		list.add("낙타");
//		list.add("앵무새");
////		System.out.println("---------");
////		for(int i=0 ;i<list.size(); i++) {
////			System.out.println(list.get(i));
////		}
//		
//		list.add("악어새");
//		list.add("부엉이");
//		
//		System.out.println("---------");
//		for(int i=0 ;i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//	
//		System.out.println(">>>"+list.remove(3));
//		System.out.println("---------");
//		for(int i=0 ;i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		//배열 생성
		MyArrayList list = new MyArrayList();

		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");

		//읽기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		//개수
		System.out.println(list.size());
		System.out.println();
		
		//탐색 + 읽기
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
		System.out.println();
		//수정
		list.set(0, "우하하");
		System.out.println(list.get(0));
		System.out.println();
		//삭제
		list.remove(1);
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
		System.out.println();
		//삽입
		list.add(1, "호호호");
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
		System.out.println();
		//검색
		if (list.indexOf("홍길동") > -1) {
		      System.out.println("홍길동 있음");
		} else {
		      System.out.println("홍길동 없음");
		}
//
//		//초기화
		list.clear();
		System.out.println(list.size());
	}

}



//홍길동 //System.out.println(list.get(0));
//아무개 //System.out.println(list.get(1));
//하하하 //System.out.println(list.get(2));
//3 //System.out.println(list.size());
//
////탐색 + 읽기
//홍길동 
//아무개 
//하하하 
//
//우하하 //list.set(0, "우하하");
//
////삭제
//우하하 
//하하하 
//
////삽입
//우하하 
//호호호 
//하하하 
//
//홍길동 없음 //검색
//0 //초기화
