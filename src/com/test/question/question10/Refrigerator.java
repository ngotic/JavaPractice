package com.test.question;

import java.util.Calendar;

class Refrigerator {
	private Item[] items = new Item[100];
	int index = 0;

	public void add(Item item) { // 냉장고에 넣는다.
		if(index < 100) {
			System.out.printf("'%s'를 냉장고에 넣었습니다.\n", item.getName());
			items[index++] = item;
		}
		else 
			System.out.println("더이상 넣을 수 없습니다.");
	}

	public Item get(String name) { // 꺼내는 메서드다.
		if (index != 0) {
			int delIndex = 0;
			Item result = null;
			boolean search = false;
			// 1. Search
			for (int i = 0; i < items.length; i++) {
				if (items[i].getName().equals(name)) {
					delIndex = i;
					result = items[i];
					search = true;
					break;
				}
			}
			if (search == false)
				return null;

			// 2. arrange Array
			for (int i = delIndex; i < items.length - 1; i++) {
				items[i] = items[i + 1];
			}
			items[items.length - 1] = null;
			index--;
			return result;

		} else {
			return null;
		}
		//

	}

	public int count() { // 냉장고에 있는 item의 개수 확인
		return index;
	}

	public void listItem() { // 냉장고 아이템 목록 출력
		System.out.println("[냉장고 아이템 목록]");
		for(int i=0 ; i<index; i++) {
			System.out.printf("%s(%s)\n", items[i].getName(), items[i].getExpiration());
		}
	}
}

class Item {
	private String name;
	private Calendar expiration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpiration() {
		return String.format("%tF", expiration);
	}

	public void setExpiration(String expiredTime) throws InterruptedException {
		String[] timeSplit = expiredTime.split("-");

		int year = Integer.parseInt(timeSplit[0]);
		int month = Integer.parseInt(timeSplit[1]); // 앞자리 0도 신경안써도 된다.
		int day = Integer.parseInt(timeSplit[2]);

		Calendar cTime = Calendar.getInstance();
		cTime.set(year, month - 1, day);

//		while(true) { // Calendar 객체는 값이 한번 셋팅되면 시간이 픽스됨
//			System.out.println("" + cTime.getTimeInMillis() );
//			Thread.sleep(1000);
//			System.out.println("" + cTime.getTimeInMillis() );			
//		}

		this.expiration = cTime;
	}

}