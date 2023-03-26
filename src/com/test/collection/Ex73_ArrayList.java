package com.test.collection;

import java.util.ArrayList;
import java.util.Calendar;

public class Ex73_ArrayList {

	public static void main(String[] args) {
			
		// 컬랙션, Collection
		// JCF, java collection framework
		// - (향상된) 배열
		// - 기존의 순수 배열 > 성능, 사용법 등 개량 > 클래스
		// - ★ 길이 가변 > 방의 개수를 마음대로 늘리거나 줄이는게 가능
		//  
		// 컬랙션 종류
		// 1. List 게열
		// - ArrayList(*****)  : > 가장 많이 쓴다.
		//    - Serializable, Colonable, Iterable<E>
		//    - coletion<E> List<E>, RancomAccess
		// - LinkedList
		// - Queue
		// - Stack
		// - Vector(legacy)    : 잘안씀
		// 2. Set 계열
		//  -HashSet
		// - TreeSet
		// 3. Map 계열
		// - HashMap
		// - TreeMap 
		// - Properties(legacy) : 잘안씀
		// - HashTable(legacy)  : 잘안씀
		//ArrayList 클래스
		// - 순수 배열하고 구조가 가장 유사함
		// - 첨자를 사용해서 요소에 접근
		//m1();
		//m2();
		m3();
	}

	private static void m3() {
		
		// 정수배열
		int[] ns1 = new int[3];
		ArrayList<Integer> ns2  = new ArrayList<Integer>();
		
		double[] fs1 = new double[3];
		ArrayList<Double> fs2  = new ArrayList<Double>();
		
		
		boolean[] bs1 = new boolean[3];
		ArrayList<Boolean> bs2  = new ArrayList<Boolean>();
		
		// 문자열 배열
		String[] txt1 = new String[3];
		ArrayList<String> txt2 = new ArrayList<String>();
		
		// 참조형(클래스) 배열
		Calendar[] cs1 = new Calendar[3];
		ArrayList<Calendar> cs2= new ArrayList<Calendar>();
		
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		//-add(value> : Append
		//-add(index, value) : Insert
		
		for (int i=0; i<10; i++) {
			list.add((int)(Math.random() * 100));
		}
		// [ * add로 넣고 ]
		System.out.println(list);
		
		for(int i=0; i < list.size(); i++) {
			System.out.printf("lisy.get(%d) = %d\n", 
					i , 
					list.get(i));
		}// [ * get으로 꺼낸다. ]
	}

	private static void m2() {
		// ArrayList 사용법
		//1. 생성하기
		ArrayList<String> list = new ArrayList<String>(); /// 문자열 배열
		
		// 2. 요소 추가하기
		// - boolean add(T value)
		// - 배열의 맨 마지막에 추가하기 > Append model
		list.add("바나나");
		list.add("딸기");
		list.add("귤");
		list.add("포도");
		list.add("파인애플");
		
		
		//3. 요소의 개수
		// -int size();
		System.out.println(list.size());
		//4. 요소 읽기
		// T get(int index)
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		//System.out.println(list.get(5)); // 런타임에러라 조심 > indexOutofBoundsException
		System.out.println(list.get(list.size() - 1));// 리스트는 size()이다.
		
		//5. 요소의 수정 
		// -list[0] = 10; 대입 or 수정
		// T set(int index , T newValue )
		System.out.println("1.이미 toString 구현되있음 : "+list);
		
		String temp = list.set(0, "망고"); // List는 복사방식이 아니라 즉시적용방식!
		System.out.println("temp : "+temp); // set()은 수정을 받는 요소를 리턴한다.
		
		System.out.println("2.이미 toString 구현되있음 : "+list);
		System.out.println(list.get(0));
		// ArrayList는 이미 toString이 구현되어 있다.
		
		//6. 요소의 삭제
		
		//- 순수 배열은 방을 삭제 불가능
		// -컬렉션은 방을 삭제 가능
		// - T remove(int index); 방번호를 인자로 받는다.
		// - 레프트 시프트가 발생한다. !!! > 삭제된 방이후의 모든 요소는 방번호가 1씩 쭌다.
		// - ★ 순수배열은 방번호를 절대적으로 신뢰한다. > 근데 컬랙션은 다르다. 
		
		System.out.println();
		System.out.println("remove before : "+ list);
		list.remove(2); // 두번째 인덱스 요소가 삭제되고 앞으로 밀착됨
		System.out.println("remove after : "+ list);
		System.out.println(list.size());
		// 주의할 점은 index 번호를 절대적으로 신뢰하지 마라
		// 삭제시에 인덱스가 앞으로 떙겨진다.
		
		// 7. 탐색 
		// 루프 돌리겠다.
		for(int i=0 ; i<list.size() ; i++) {
			System.out.printf("list.get(%d) = %s\n", i, list.get(i) );
		}
		System.out.println();
		for ( String name : list) {
			System.out.println(name);
		}
		System.out.println();
		
		//8. 요소의 검색
		//- int indexOf(T value)
		//- int lastIndexOf(T value)
		//- boolean contains(T value)
		// [망고, 딸기, 포도, 파인애플]
		System.out.println(list.indexOf("사과"));    // -1
		System.out.println(list.indexOf("딸기"));    //1
		System.out.println(list.lastIndexOf("딸기")); //1
		System.out.println(list.contains("딸기")); //true
		System.out.println(list.contains("사과")); //false
		System.out.println();
		
		//9. 초기회
		//모든 요소 삭제 > 모든방.remove()
		// - void clear( );
		list.clear();
		System.out.println(list.size()); // 0
		System.out.println(list); // []
		
		
		// 10. 빈 배열 확인
		// boolean isEmpty();
		System.out.println(list.isEmpty());
		System.out.println(list.size() == 0);
		list.add("코코아");
		System.out.println(list.isEmpty());
		System.out.println(list.size() == 0);
		
		//11. 요소추가
		// - 중간에 삽입 > 배열의 중간에 끼워 넣기를 할 수 있다.  : 어디 사이에 끼어들어갈래?
		// - void add(int index , T value) 
		// - *** 우측 시프트 발생 > 삽입한 위치 이후의 모든 요소의 방번호가 + 1 된다.
		list.add("바나나");
		list.add("딸기");
		list.add("귤");
		list.add("포도");
		list.add("파인애플");
		System.out.println(list);
		System.out.println();
		
		list.add(2, "수박"); // 2번 인덱스에 값을 넣겠다. 2번인덱스로 다른걸 넣겠따. 그러면 기존 2번은 오른쪽으로 밀려남
		System.out.println(list);
	
// 		list.
		
	}

	private static void m1() {
		// 순수 배열
		// - 타입 명시(int)
		// - 길이 명시(3)
		int [] nums1 = new int[3];
		// 요소 접근 > 첨자(index) 사용
		nums1[0] = 10;
		nums1[1] = 20;
		nums1[2] = 30;
		
		System.out.println(nums1[0]);
		System.out.println(nums1[1]);
		System.out.println(nums1[2]);
		
		System.out.println(nums1.length);
		System.out.println();
		
		
		//컬랙션
		// - 타입 명시 > 제네릭 
		// - 길이 명시 > ??? > 가변 
		ArrayList<Integer> nums2 = new ArrayList<>();
		ArrayList<Integer> nums2_ = new ArrayList<Integer>();
		
		// 요소 접근  > Append > 차레대로(순서대로) 넣어라
		nums2.add(10); // 0번째 방에 추가
		nums2.add(20); // 1번쨰 방에 추가
		nums2.add(30); // 2번쨰 방에 추가
		// 제네릭이라서 여기 들어가는 요소는 Integer라고 찍히는 것이다. 
		
		
		System.out.println(nums2.get(0)); // nums1[0] //0번쨰 방을 가져온다.
		System.out.println(nums2.get(1)); // nums1[0] //0번쨰 방을 가져온다.
		System.out.println(nums2.get(2)); // nums1[0] //0번쨰 방을 가져온다.
		
		
		System.out.println(nums2.size());
		
		for(int i=0 ; i<nums2.size() ; i++) {
			System.out.println(nums2.get(i)); // get으로 가져온다.
		}
		
		System.out.println();
		
		nums2.add(40); // 다시 값을 넣을 땐
		nums2.add(50);
		
		System.out.println();
	}
}


class 컬렉션 {
	private int [] nums = new int [3];
}