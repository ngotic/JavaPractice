package com.test.question;

public class Packer {
	private static int pencilCount;
	private static int eraserCount;
	private static int ballPointPenCount;
	private static int rulerCount;

	public void packing(Pencil pencil) { // 포장을 성공할 수도, 실패할 수도 있따. '검수한다' >>
		
		System.out.print( "포장 전 검수 : " + pencil.info());
		
		String[] rate = {"4B", "3B", "2B", "B", "HB", "H", "2H", "3H", "4H"}; // 맞는거 하나 있으면 break
		
		for(int i=0; i<rate.length; i++) {
			
			if( rate[i].equals(pencil.getHardness()) ) { // 어떤걸 먼저 앞으로 보낼지 고민
				System.out.println("포장을 완료하였습니다.");
				pencilCount++;
				return ;
			}
			
		}
		
		System.out.println("포장에 실패하였습니다.");
		
	} // 포장 전 검수 : HB 진하기 연필입니다. 포장을 완료하였습니다.

	public void packing(Eraser eraser) {
		System.out.print( "포장 전 검수 : "+eraser.info());
		// 새롭게 추가될거같지 않은 건 이렇게 if문
		if( "Large".equals(eraser.getSize()) || "Medium".equals(eraser.getSize()) || "Small".equals(eraser.getSize()) ) {
			System.out.println("포장을 완료하였습니다.");
			eraserCount++;
			return ;
		}
		
		System.out.println("포장에 실패하였습니다.");
	}

	public void packing(BallPointPen ballPointPen) { // 인자 두개
		
		System.out.print( "포장 전 검수 : "+ballPointPen.info());
		
		if( checkBallPointPenThickness(ballPointPen.getThickness()) &&  checkBallPointPenColor(ballPointPen.getColor())) {
			System.out.println("포장을 완료하였습니다.");
			ballPointPenCount++;
		}
		else
			System.out.println("포장에 실패하였습니다.");
	}

	public void packing(Ruler ruler) { // 2개 인자.
		System.out.print( "포장 전 검수 : "+ruler.info());		
		// 맞으면 넘어가 
		// 재사용 x, 단지 여기서만 쓸건데 굳이 메서드로 빼야 하나?
		if( checkRulerShape(ruler.getShape()) && checkRulerLength(ruler.getLength()) ) {
			System.out.println("포장을 완료하였습니다.");
			rulerCount++;
		}
		else
			System.out.println("포장에 실패하였습니다.");

	}
	
	private boolean checkBallPointPenThickness(double thickness) {
		double[] thicknessList = { 0.3, 0.5, 0.7, 1, 1.5 };
		
		for(int i=0; i<thicknessList.length ; i++) {
			if(thicknessList[i] == thickness) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean checkBallPointPenColor(String color) {
		String[]  colorList = {"red", "blue", "green", "black"};
		
		for(int i=0; i<colorList.length ; i++) {
			if(colorList[i].equals(color)) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean checkRulerLength(int length) {
		int[] lengthList = {30, 50, 100};
		
		for(int i=0; i<lengthList.length ; i++) {
			if( lengthList[i] == length )
				return true;
		}
		
		return false;
	}
	
	private boolean checkRulerShape(String shape) {
		String[] shapeList = {"줄자", "운형자", "삼각자"};
		
		for(int i=0; i<shapeList.length ; i++) {
			if(shapeList[i].equals(shape)) {
				return true;
			}
		}
			
		return false;
	}
	
	public void countPacking(int type) {
		
		System.out.println("=====================");
		System.out.println("       포장 결과");
		System.out.println("=====================");

		switch (type) {
			case 0:
				System.out.printf("연필 %d회\n", pencilCount);
				System.out.printf("지우개 %d회\n", eraserCount);
				System.out.printf("볼펜 %d회\n", ballPointPenCount);
				System.out.printf("자 %d회\n", rulerCount);
				break;
			case 1:
				System.out.printf("연필 %d회\n", pencilCount);
				break;
			case 2:
				System.out.printf("지우개 %d회\n", eraserCount);
				break;
			case 3:
				System.out.printf("볼펜 %d회\n", ballPointPenCount);
				break;
			case 4:
				System.out.printf("자 %d회\n", rulerCount);
				break;
				
			default:
				System.out.println("잘못된 타입입니다.");
				break;
	
		}
		System.out.println();
	}

}

// setter 정의
class Pencil {
	private String hardness;

	public void setHardness(String hardness) {
		this.hardness = hardness;
	}

	public String getHardness() {
		return hardness;
	}

	public String info() {
		return String.format("%s 진하기 연필입니다.\n", this.hardness);
	}
}

class BallPointPen {
	private double thickness;
	private String color;

	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String info() {
		return String.format("%s 색상 %.1fmm 볼펜입니다.\n", this.color, this.thickness);
	}
}

class Ruler {
	private int length;
	private String shape;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String info() {
		return String.format("%scm %s입니다.\n", this.length, this.shape);
	}
}

class Eraser {
	private String size;
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String info() {
		return String.format("%s 사이즈 지우개입니다.\n", this.size);
	}
}