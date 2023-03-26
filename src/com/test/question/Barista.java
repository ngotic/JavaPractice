package com.test.question;

public class Barista {

// Coffer라는 공용 객체	

// 커피를 만들면서 누적되는 값은 Coffee 클래스에서 관리한다.
	public Espresso makeEspresso(int bean) {
//		에스프레소 1잔을 만든다.
//		int bean : 원두량(g)
//		return Espreeso : 에스프레소 1잔
		Espresso esp = new Espresso(bean);
		Coffee.countEspresso(esp);
		return esp;
	}

	public Espresso[] makeEspressoes(int bean, int count) {
// 내부에서 객체 배열을 생성, 값을 채운다.
//		에스프레소 N잔을 만든다.
//		int bean : 원두량(g)
//		int count : 음료 개수(잔)
//		return Espresso[] : 에스프레소 N잔
		Espresso[] esps = new Espresso[count]; // 객체 배열 선언에는 생성자가 없음
		for(int i=0; i<count ; i++) {
			Espresso esp = new Espresso(bean);
			Coffee.countEspresso(esp);
			esps[i] = esp;
		}
		return esps;
	}

	public Latte makeLatte(int bean, int milk) {
//		라테 1잔을 만든다.
//		int baen : 원두량(g)
//		int milk : 우유량(ml)
//		return Latte : 라테 1잔
		Latte lat = new Latte(bean, milk);
		Coffee.countLatte(lat);
		return lat;
	}

	public Latte[] makeLattes(int bean, int milk, int count) {
//		라테 N잔을 만든다.
//		int baen : 원두량(g)
//		int milk : 우유량(ml)
//		int count : 음료 개수(잔)
//		return Latte[] : 라테 N잔
		Latte[] lats = new Latte[count];
		for(int i=0 ;i<count; i++) {
			Latte lat = new Latte(bean, milk);
			Coffee.countLatte(lat);
			lats[i] = lat;
		}
		return lats;
	}

	public Americano makeAmericano(int bean, int water, int ice) {
//		아메리카노 1잔을 만든다.
//		int baen : 원두량(g)
//		int water : 물량(ml)
//		int ice : 얼음 개수(개)
//		return Americano : 아메리카노 1잔
		Americano ame = new Americano(bean, water, ice);
		Coffee.countAmericano(ame);
		return ame;
	}

	public Americano[] makeAmericanos(int bean, int water, int ice, int count) {
//		아메리카노 N잔을 만든다.
//		int baen : 원두량(g)
//		int water : 물량(ml)
//		int ice : 얼음 개수(개)
//		int count : 음료 개수(잔)
//		return Americano[] : 아메리카노 N잔
		Americano[] ames = new Americano[count];
		for( int i=0 ; i<count ;i++) {
			Americano ame = new Americano(bean, water, ice);
			Coffee.countAmericano(ame);
			ames[i] = ame; 
		}
		return ames;
	}

	public void result() {
//		판매 결과를 출력한다.
//		음료 판매량(에스프레소 판매 개수, 라테 판매 개수, 아메리카노 판매 개수)
//		원자재 소비량(원두 소비량, 물 소비량, 우유 소비량, 얼음 소비량)
//		매출액(원두 판매액, 물 판매액, 우유 판매액, 얼음 판매액)
		System.out.println("=================================");
		System.out.println("판매 결과");
		System.out.println("=================================\n");
		
		System.out.println("---------------------------------");
		System.out.println("음료 판매량");
		System.out.println("---------------------------------");
		System.out.printf("에스프레소 : %d잔\n", Coffee.espresso);
		System.out.printf("아메리카노 : %d잔\n", Coffee.americano);
		System.out.printf("라떼 : %d잔\n\n", Coffee.latte);
		
		System.out.println("---------------------------------");
		System.out.println("원자재 소비량");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,dg\n", Coffee.bean);
		System.out.printf("물 : %,dml\n", Coffee.water);
		System.out.printf("얼음 : %,d개\n", Coffee.ice);
		System.out.printf("우유 : %,dml\n\n", Coffee.milk);
		
		System.out.println("---------------------------------");
		System.out.println("매출액");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,d원\n", Coffee.beanTotalPrice);
		System.out.printf("물 : %,d원\n", Coffee.waterTotalPrice);
		System.out.printf("얼음 : %,d원\n", Coffee.iceTotalPrice);
		System.out.printf("우유 : %,d원\n", Coffee.milkTotalPrice);
		

	}
}

class Coffee { // 공용 상태 클래스
/////////////////////변할 수 있는 변수 //////////////////////
	public static int bean;
	// 총 원두량
	public static int water;
	// 총 물 용량
	public static int ice;
	// 총 얼음 개수
	public static int milk;
	// 총 우유 용량
///////////////////////////////////////////////변하지 않을 변수
	public static int beanUnitPrice;
//	원두 단가(원)
//	1g당 1원
	public static double waterUnitPrice;
//	물 단가(원)
//	1ml당 0.2원
	public static int iceUnitPrice;
//	얼음 단가(원)
//	1개당 3원
	public static int milkUnitPrice;
//	우유 단가(원)
//	1ml당 4원
	///////////////////////////////////////////////////////
///////////////////////변할 수 있는 변수 //////////////////////	
	public static int beanTotalPrice;
//  원두 총 판매액(원)
	public static int waterTotalPrice;
//	물 총 판매액(원)
	public static int iceTotalPrice;
//	얼음 총 판매액(원)
	public static int milkTotalPrice;
//	우유 총 판매액(원)
	public static int americano;
//	아메리카노 총 판매 개수(잔)
	public static int latte;
//	라테 총 판매 개수(잔)
	public static int espresso;
//	에스프레소 총 판매 개수(잔)	
	static {
		Coffee.beanUnitPrice = 1;
		Coffee.waterUnitPrice = 0.2;
		Coffee.iceUnitPrice = 3;
		Coffee.milkUnitPrice = 4;
		// 나머지는 default로 0이다.
	}

	public static void countEspresso(Espresso esp) {
		Coffee.espresso++;
		Coffee.bean += esp.getBean();
		Coffee.beanTotalPrice +=  Coffee.beanUnitPrice*esp.getBean();
	}
	
	public static void countLatte(Latte lat) {
		
		
		Coffee.latte++;
		Coffee.bean += lat.getBean();
		Coffee.beanTotalPrice +=  Coffee.beanUnitPrice * lat.getBean();
		Coffee.milk += lat.getMilk();
		Coffee.milkTotalPrice += Coffee.milkUnitPrice * lat.getMilk();
	}
	
	public static void countAmericano(Americano ame) {
		Coffee.americano++;
		
		Coffee.bean += ame.getBean();
		Coffee.beanTotalPrice +=  Coffee.beanUnitPrice * ame.getBean();
		
		Coffee.water += ame.getWater();
		Coffee.waterTotalPrice += Coffee.waterUnitPrice * ame.getWater();
		
		Coffee.ice += ame.getIce();
		Coffee.iceTotalPrice += Coffee.iceUnitPrice * ame.getIce();
		
	}

}

class Espresso {
	private int bean;

	public Espresso(int bean) {
		this.bean = bean;
	}
	
	
	
	public int getBean() {
		return bean;
	}



	public void setBean(int bean) {
		this.bean = bean;
	}



	public void drink() {
		System.out.printf("원두 %dg으로 만들어진 에스프레소를 마십니다.\n", 
				this.bean);
	} // 커피를 마신다 출력
}

class Latte {
	private int bean;
	private int milk;
	
	public Latte(int bean, int milk) {
		this.bean = bean;
		this.milk = milk;
	}
	
	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}


	public void drink() {
		System.out.printf("원두 %dg, 우유 %dml 만들어진 에스프레소를 마십니다.\n", 
				this.bean,
				this.milk);
	} // 커피를 마신다 출력

}

class Americano {
	private int bean;
	private int water;
	private int ice;

	public Americano(int bean, int water, int ice) {
		this.bean = bean;
		this.water = water;
		this.ice = ice;
	}
	
	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getIce() {
		return ice;
	}

	public void setIce(int ice) {
		this.ice = ice;
	}

	public void drink() {
		System.out.printf("원두 %dg, 물 %dml, 얼음 %d개로 만들어진 에스프레소를 마십니다.\n", 
				this.bean, 
				this.water,
				this.ice);
	} // 커피를 마신다 출력
}
