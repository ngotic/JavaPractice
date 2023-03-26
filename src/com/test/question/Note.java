package com.test.question;

public class Note {
	
   private String size; // s  A3, A4, A5, B3, B4, B5
   private String color; // s  검정색, 흰색, 노란색, 파란색
   private int page;    //s  // 10 ~ 200페이지 이내> 10~50(얇다), 51 ~ 100(보통), 101 ~ 200(두껍다)
   private String owner; //s //한글 2~5자이내.. 필수값
   private int price; //sg x 

   //setter, getter 구현
// A 가 숫자가 작아질수록 커진다.
   
//   Note가 잘 설계되었는지 객체를 가지고 사용해본다.
//   Note 객체 생성 → 값 넣기 + 값 출력 등
//   기본노트 > A5 + 흰색 + 10페이지 = 가격(500원)
   
//   size="A5"; color="흰색"; page = 10; price = 500;
   	public Note() {
   		this.size="A5";
   		this.color="흰색";
   		this.page = 10;
   		this.price = 500;
   		this.owner="";
   	}
   
	public void setSize(String size) {
		
		
		if( size.equals("A3") || size.equals("A4") || size.equals("A5") || size.equals("B3") || size.equals("B4") || size.equals("B5") )
			this.size = size;
		else 
			System.out.println("존재하지 않는 규격입니다.");
	}

	public void setColor(String color) {
		
		if(color.equals("검정색")|| color.equals("흰색") || color.equals("노란색") || color.equals("파란색"))
			this.color = color;
		else 
			System.out.println("존재하지 않는 색깔입니다.");
	}

	public void setPage(int page) {
		
		if( page >= 10 && page <=200 )
			this.page = page;
		else 
			System.out.println("잘못된 페이지 수 입니다.");
		
	}

	public void setOwner(String owner) {
		
//		// 한글이랬찌..
//		if ( owner.length() >=2 && owner.length() <=5 ) {
//		// 유효성 패턴이 많을수록 들여쓰기가 많아진다.	
//			boolean result = false;
//			for(int i=0; i<owner.length() ; i++) { // 하나씩 검사
//				char ch = owner.charAt(i);
//				if( ch < '가' || ch > '힣' ) {
//					result = true;
//					break;
//				}
//			}
//			if( !result )
//				this.owner = owner;
//			else 
//				System.out.println("잘못 입력하셨습니다.");
//		}
//		else 
//			System.out.println("잘못된 소유자 이름입니다.");
		
		// 코르 정리
		if(checkLength(owner) && checkKorean(owner)) {
			this.owner = owner;
		} else {
			System.out.println("잘못된 owner 입력");
		}
		
	}

	public boolean checkKorean(String owner) {
		for(int i=0; i<owner.length(); i++) {
			char ch = owner.charAt(i);
			if( ch <'가' || ch > '힣' ) return false;
		}
		return true;
	}
	
	public boolean checkLength(String owner) {
		if(owner.length()>=2 && owner.length() <= 5){
			return true;
		} else {
			return false;
		}
		
	} 
	
	public String info() {
		
		
		StringBuilder sb =new StringBuilder(); 
		
		sb.append("■■■■■■ 노트 정보 ■■■■■■\n");
		//String result = "■ ■ ■ ■ ■ ■ 노트 정보 ■ ■ ■ ■ ■ ■\n";
		String thick="얇은"; // 두께 
		
		if (this.owner.equals("")) {
			//result += "주인 없는 노트";
			sb.append("주인 없는 노트");
			//result = result + "\n■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■";
			sb.append("\n■■■■■■■■■■■■■■■■■■■■");
			return sb.toString();
		}
		
		// 크기 변경
		if( this.size.equals("A3")) 
			this.price += 400;
		else if( this.size.equals("A2"))
			this.price += 200;
		else if( this.size.equals("B3"))
			this.price += 500;
		else if( this.size.equals("B4"))
			this.price += 300;
		else if( this.size.equals("B5"))
			this.price += 100;
		
		// 색깔 변경에 따른 추가
		if( this.color.equals("검정색"))
			this.price += 100;
		else if( this.color.equals("노란색"))
			this.price += 200;
		else if ( this.color.equals("파란색"))
			this.price += 200;
		
		if ( this.page >=10 && this.page <= 50)
			thick="얇은";
		else if ( this.page >=51 && this.page <= 100)
			thick="보통";
		else if ( this.page >=101 && this.page <= 200)
			thick="두꺼운.";
		
		this.price+=(this.page - 10) * 10;
		
		sb.append(String.format("소유자: %s\n특성: %s %s %s노트\n가격: %,d원",
				this.owner,
				this.color,
				thick,
				this.size,
				this.price));
//				result += String.format("소유자: %s\n특성: %s %s %s\n가격: %,d원",
//				this.owner,
//				this.color,
//				thick,
//				this.size,
//				this.price);
		sb.append("\n■■■■■■■■■■■■■■■■■■■■\n");
		//result += "\n■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■\n";
		return sb.toString();
	}
   
}
