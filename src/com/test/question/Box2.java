package com.test.question;

public class Box2 {

   //***
   private Macaron2[] list = new Macaron2[10];

   public void cook() {
      
      //마카롱 > 임의 > 10개
      //- 생산 크기(5cm ~ 15cm) → 판매 유효 크기(8cm ~ 14cm)
      //- 생산 색상(red, blue, yellow, white, pink, purple, green, black) → 판매 유효 색상(black을 제외한 모든 색상)
      //- 생산 샌드 두께(1mm ~ 20mm) → 판매 유효 두께(3mm ~ 18mm)
      
      String[] colors = { "red", "blue", "yellow", "white", "pink", "purple", "green", "black" };
      
      for (int i=0; i<list.length; i++) {
         
         int size = (int)(Math.random() * 11) + 5;
         String color = colors[(int)(Math.random() * colors.length)];
         int thickness = (int)(Math.random() * 20) + 1;
         
         Macaron2 m = new Macaron2(); //생산
         m.setSize(size);
         m.setColor(color);
         m.setThickness(thickness);
         
         list[i] = m; //포장
         
      }
      
      System.out.printf("마카롱을 %d개 만들었습니다.\n", list.length);
      
   }

   public void check() {
      
      //[박스 체크 결과]
      //QC 합격 개수 : 8개
      //QC 불합격 개수 : 2개
      
      //- 생산 크기(5cm ~ 15cm) → 판매 유효 크기(8cm ~ 14cm)
      //- 생산 색상(red, blue, yellow, white, pink, purple, green, black) → 판매 유효 색상(black을 제외한 모든 색상)
      //- 생산 샌드 두께(1mm ~ 20mm) → 판매 유효 두께(3mm ~ 18mm)
      
      int passed = 0;
      int failed = 0;
      
      for (int i=0; i<list.length; i++) {
         
         if (checkSize(list[i].getSize())
               && checkColor(list[i].getColor())
               && checkThickness(list[i].getThickness())) {      
            
            passed++;
            list[i].setResult("합격");
            
         } else {            
            
            failed++;
            list[i].setResult("불합격");
            
         }
         
      }
      
      
      System.out.printf("QC 합격 개수 : %d개\n", passed);
      System.out.printf("QC 불합격 개수 : %d개\n", failed);
      
   }
   
   private boolean checkThickness(int thickness) {
      
      if (thickness >= 3 && thickness <= 18) {
         return true;
      } else {
         return false;
      }
      
   }
   
   private boolean checkColor(String color) {
      
      if (!color.equals("black")) {
         return true;
      } else {
         return false;
      }
      
   }
   
   private boolean checkSize(int size) {
      
      if (size >= 8 && size <= 14) {
         return true;
      } else {
         return false;
      }
      
   }

   public void list() {
      
      System.out.println("[마카롱 목록]");
      
      for (int i=0; i<list.length; i++) {
         
         System.out.printf("%d번 마카롱 : %dcm(%s, %dmm) : %s\n"
                        , i + 1
                        , list[i].getSize()
                        , list[i].getColor()
                        , list[i].getThickness()
                        , list[i].getResult());
         
      }
      
   }

}

class Macaron2 {

	   private int size;
	   private String color;
	   private int thickness;
	   
	   private String result; //합격 or 불합격
	   
	   
	   
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
	   public String getResult() {
	      return result;
	   }
	   public void setResult(String result) {
	      this.result = result;
	   }

}

