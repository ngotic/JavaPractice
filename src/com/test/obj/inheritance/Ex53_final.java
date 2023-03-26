package com.test.obj.inheritance;

public class Ex53_final {
   
   public static void main(String[] args) {
      
      //Ex53_final.java
      /*
      
         final 키워드
         - 한번 결정하면 바꿀 수 없다. > 안정성
         1. 변수 적용
            - 지역 변수
            - 멤버 변수
            - 변수값 수정 금지 > 안정성
         
         2. 메소드 적용
            - 상속 + 오버라이딩
            - 오버라이딩을 금지 > 안정성
         
         3. 클래스 적용
            - 상속 
            - 상속금지 > 안정성 
      
      */
      
      //지역 변수
      int a = 10;
      a = 20;
      a = 30;
      
      final int b = 10;
      //b = 20;
      //b = 30;
      
      //이 방식 비권장 > 일반 변수처럼 보여서;;
      final int c;
      c = 10;
      //c = 20;
      
      //권장
      final int d = 10; // 선언 + 초기화
      
      //상수명의 모두 대문자로 작성한다. > 변수와 구분짓기 위해서
      final double PI = 3.14;
      
      
      
      FinalChild child = new FinalChild();
      
      child.test();
      
      
      
   }//main

}


class Gender {
   
   //남자(1), 여자(2)
   public final int MALE = 1;
   public final int FEMALE = 2;
   
   public Gender() {
      
      //this.MALE = 3; // 값을 대입하지 못한다.
      
   }
   
}


class FinalParent {
   
   //부모 클래스 설계 중..
   //- test() 메소드 > 나중에 이 클래스를 상속받는 클래스가 test() 메소드를 재정의하면 문제가 발생할거 같음
   
   public final void test() {
      System.out.println("부모가 만든 메소드");
      System.out.println(num()); //100 출력
   }
   
   public final int num() {
      return 100;
   }
   
}

class FinalChild extends FinalParent {
   
   //이클립스 > 오버라이딩
//   @Override
//   public void test() {
//      System.out.println("자식이 재정의한 메소드");
//      System.out.println(num()); //200 출력
//   }
   
   
   //Cannot override the final method from FinalParent
//   public int num() {
//      return 200;
//   }
   
}

// 클래스 선언 중... 자신이 없음 > 상속 못하게 금지
final class FinalMember {
	
} 

//The type FinalUser cannot subclass the final class FinalMember
// final class 멤버의 자식이 될 수 없다. 
//class FinalUser extends FinalMember {
//	
//}
//

