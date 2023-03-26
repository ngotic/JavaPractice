package com.test.question;

public class Q094 {

	public static void main(String[] args) {
		
		Bugles snack = new Bugles();
		
		snack.setWeight(500);
		
		snack.setCreationTime("2023-02-17");
		System.out.println("가격 : " + snack.getPrice() + "원");
		System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다."); // 유통기한이 남았으면 양수 
		snack.eat();

	
		
		Bugles snack2 = new Bugles();
		snack2.setWeight(300);
		snack2.setCreationTime("2023-02-09");
		System.out.println("가격 : " + snack2.getPrice() + "원");
		System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다."); // 유통기한이 지나면 음수

		snack2.eat();
	}

}
