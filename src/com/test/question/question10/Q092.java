package com.test.question;

public class Q092 {

	public static void main(String[] args) {
		
//		출력..
//		제목: 자바의 정석
//		가격: 45,000원
//		저자: 남궁성
//		출판사: 도우출판
//		발행년도: 2019년
//		ISBN: 8994492038         
//		페이지: 1,022장
		
		Book b1 = new Book();

		b1.setTitle("자바의 정석");
		b1.setPrice(45000);
		b1.setAuthor("남궁성");
		b1.setPublisher("도우출판");
		b1.setIsbn("8994492038");
		b1.setPage(1022);

		System.out.println(b1.info());
	}

}
