package com.test.question;

public class Book {
	private String title;          // gs
	private int price;             // gs
	private String author;         // gs
	private String publisher;        //s
	private String pubYear = "2019"; //g
	private String isbn;             //gs
	private int page;                //gs

	// getter, setter

	public String info() {
		return String.format("제목: %s\n가격: %d원\n저자: %s\n출판사: %s\n발행년도: %s년\nISBN: %s\n페이지: %d\n",
				this.title,
				this.price,
				this.author,
				this.publisher,
				this.pubYear,
				this.isbn,
				this.page
				);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		
		// 한글 '가'~'힣'
		// (한글, 영어, 숫자, 공백) 허용 > (단, 특문 제외)
		if(title.length() < 50) {
			
			for(int i=0; i< title.length(); i++) {
				char ch = title.charAt(i);
				if( ( ch >= 'a'&&  ch<= 'z') || ( ch >= 'A'&&  ch<= 'Z') || ( ch >= '0'&&  ch<= '9')  || ( ch >='가' && ch<= '힣') || ch==' ' ) {
					
				} else {
					System.out.println("한글, 영어, 숫자, 공백만 가능합니다.");
					return ;
				}
			} // 유효성 검사 완료
			
			this.title = title;
		}
		else {
			System.out.println("제목이 깁니다.");
		}
	}

	public int getPrice() {
		
		return price;
	}

	public void setPrice(int price) {
		
		if( price >= 0 && price <= 1000000 )
			this.price = price;
		else 
			System.out.println("0 이상 1000000 이하");
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		
		if(page > 0)
			this.page = page;
		else 
			System.out.println("올바른 페이지 수를 입력하세요.");
	}

	public String getPubYear() {
		return pubYear;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
