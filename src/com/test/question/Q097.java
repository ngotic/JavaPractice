package com.test.question;

public class Q097 {

	public static void main(String[] args) throws InterruptedException {		
//		요구사항
//		Refrigerator 클래스와 Item 클래스를 설계하시오.
//
//		조건..
//		Refrigerator 객체의 정보
//		Item을 최대 100개까지 담을 수 있다.(멤버 변수 = Item 배열)
//		Refrigerator 객체의 사용
//		Item을 냉장고에 넣는다. void add(Item item);
//		Item을 냉장고에서 꺼낸다. Item get(String name);
//		냉장고에 있는 Item의 개수를 확인한다. int count();
//		냉장고에 있는 Item을 확인한다. void listItem();
//		Item 객체의 정보
//		식품명, 유통기한
//		출력..
//		'김치'를 냉장고에 넣었습니다. //r.add(item1);
//		'깍두기'를 냉장고에 넣었습니다. //r.add(item2);
//		'멸치볶음'를 냉장고에 넣었습니다. //r.add(item3);
//
//		깍두기의 유통기한 : 2023-02-27 //printf();
//		냉장고 안의 총 아이템 개수 : 2개 //printf();
//
//		[냉장고 아이템 목록] //r.listItem();
//		김치(2023-03-06) 
//		멸치볶음(2023-03-01)
		
		Refrigerator r = new Refrigerator();

		Item item1 = new Item();
		item1.setName("김치");
		item1.setExpiration("2023-03-06");
		r.add(item1);//냉장고에 넣기

		Item item2 = new Item();
		item2.setName("깍두기");
		item2.setExpiration("2023-02-27");
		r.add(item2);//냉장고에 넣기

		Item item3 = new Item();
		item3.setName("멸치볶음");
		item3.setExpiration("2023-03-01");
		r.add(item3);//냉장고에 넣기

		Item item4 = r.get("깍두기");//냉장고에서 꺼내기
		System.out.printf("%s의 유통기한 : %s\n", item4.getName(), item4.getExpiration());

		System.out.printf("냉장고 안의 총 아이템 개수 : %d개\n", r.count());

		r.listItem();
	}

}
