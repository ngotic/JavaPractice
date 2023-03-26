package com.test.question;

public class Q093 {

	public static void main(String[] args) {

//		■■■■■■ 노트 정보 ■■■■■■
//		소유자 : 홍길동
//		특성 : 노란색 얇은 B4노트
//		가격 : 1,150원
//		■■■■■■■■■■■■■■■■■■■■■■
//
//		■■■■■■ 노트 정보 ■■■■■■
//		주인 없는 노트
//		■■■■■■■■■■■■■■■■■■■■■■
		
		Note note = new Note();

		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");

		System.out.println(note.info());

		Note note2 = new Note();

		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);

		System.out.println(note2.info());
	}

}
