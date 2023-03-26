package com.test.question;


//조건..
//Box 객체의 정보
//1Box에는 10개의 마카롱을 담을 수 있다.(멤버 변수 = Macaron 배열)
//Box 객체의 사용
//Box 객체를 생성시 Box에 마카롱 객체를 10개 담는다.(무작위)
//품질 검사에 통과하지 못하는 마카롱을 구분한다.
//Macaron 객체의 정보
//생산 크기(5cm ~ 15cm) → 판매 유효 크기(8cm ~ 14cm)
//생산 색상(red, blue, yellow, white, pink, purple, green, black) → 판매 유효 색상(black을 제외한 모든 색상)
//생산 샌드 두께(1mm ~ 20mm) → 판매 유효 두께(3mm ~ 18mm)

public class Box {
	
	private Macaron[] list = new Macaron[10];// 객체 배열
	// 각 엘리먼트마다 new를 해야함 
	
	// ------- 유효성 ------- 해당 변수들을 여러군데서 접근하므로 한군데로 뻄
	String filterColor = "black"; 
	int validMinSize = 8, validMaxSize = 14;
	int validMinThick = 3, validMaxThick = 18;
	// ------------------------------------------------------
	
	Box(){
		
		for (int i = 0; i < list.length; i++) {
			Macaron item = new Macaron(); // 객체 생성을 생성자 부분에 넣어야함
			list[i] = item;               // 만약에 넣지 않고 cook에 넣으면 check나 list 메소드 간의 의존성이 생김 호출 순서가 정해짐
		}
		
	}
	
	public void cook() { // 마카롱 10개를 만든다.

		String[] colors = { "red", "blue", "yellow", "white", "pink", "purple", "green", "black" };
		int minSize = 5, maxSize = 15;
		int minThick = 1, maxThick = 20;
		
		for (int i = 0; i < list.length; i++) {
			
			// 크기 ,5 ~ 15
			int randSize = (int) (Math.random()*(maxSize-minSize+1))+minSize;
			
			list[i].setSize(randSize);
			
			// 색상			
			int randColorIndex = (int)(Math.random()* colors.length );
			list[i].setColor(colors[randColorIndex]);
			
			// 두께
			// 1 ~ 20
			int randThick = (int) (Math.random()*(maxThick-minThick+1))+minThick;
			list[i].setThickness(randThick);
			
		}
		System.out.printf("마카롱을 %d개 만들었습니다.\n", list.length);
		System.out.println();
	}

	public void check() { // QC를 하고 합격개수 불합격 개수 출력
		
		int pass=0, nonPass=0;
			
		for(int i=0; i<list.length; i++) {
			if( checkListValid(i) )
				pass++;
			else 
				nonPass++;
		}
			
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수 : %d개\n", pass);
		System.out.printf("QC 불합격 개수 : %d개\n",nonPass);
		System.out.println();
		
	}

	public void list() { // 각 마카롱 마다 개수 출력
		
		System.out.println("[마카롱 목록]");
		for(int i=0; i<list.length; i++) {
			Macaron item = list[i];
			String passNonPass = checkListValid(i) == true? "합격" : "불합격" ;
			System.out.printf("%d번 마카롱: %dcm(%s, %dmm): %s\n", 
					i+1,
					item.getSize(),
					item.getColor(),
					item.getThickness(),
					passNonPass);
		}
		System.out.println();
	}
	
	public boolean checkListValid(int i) { // i번째 리스트 요소의 유효성 검사
		
		boolean isPass = true;
		if ( list[i].getSize() < validMinSize || list[i].getSize() > validMaxSize)
			isPass = false;
		if ( list[i].getThickness() < validMinThick || list[i].getThickness() > validMaxThick)
			isPass = false;
		if (list[i].getColor().equals(filterColor)) 
			isPass = false;
		
		return isPass;
	}
}

//마카롱을 10개 만들었습니다. //box1.cook();
//[박스 체크 결과] //box1.check();
//QC 합격 개수 : 8개
//QC 불합격 개수 : 2개
//[마카롱 목록] //box1.list();
//1번 마카롱 : 10cm(red, 5mm) : 합격
//2번 마카롱 : 12cm(blue, 12mm) : 합격
//...
//9번 마카롱 : 13cm(yellow, 2mm) : 불합격
//10번 마카롱 : 10cm(black, 6mm) : 불합격

class Macaron {

	private int size;
	private String color;
	private int thickness;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {

		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {

		this.color = color;
	}

	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {

		this.thickness = thickness;
	}

}