package com.test.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q062 {

	public static void main(String[] args) {
		// 요구사항] 학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
		// 조건 이름을 오름차순으로 정렬하시오.
		//		입력..
		//		학생 수: 6 
		//		학생명: 홍길동 
		//		학생명: 아무개 
		//		학생명: 하하하 
		//		학생명: 호호호 
		//		학생명: 후후후 
		//		학생명: 헤헤헤
		
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수: ");
		int num = scan.nextInt();
		scan.nextLine();
		
		String[] names = new String[num];
		
		// 학생 이름 입력
		for(int i=0;i < num ; i++) {
			System.out.print("학생명: ");
			names[i] = scan.nextLine();
		}
		// Arrays.sort(names, new MyComparator() ); // 역순, 대소문자 구분 x
		//Arrays.sort(names);
		// mySort(names);
		// System.out.println(Arrays.toString(names));
		System.out.printf("입력한 학생은 총 %d명입니다.\n", num);
		
		for(int i=0; i<num; i++) 
			System.out.printf("%d. %s\n", i+1, names[i]);
		
		scan.close();
	}
	
	public static void mySort(String[] names) {
		for(int i=0; i<names.length-1; i++) { // cycle - Outer Loop
		for(int j=0; j<names.length-i-1 ;j++) { // Inner Loop
				if( names[j].compareTo(names[j+1]) >0) {
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				}
			}
		}
	}
	
}


class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		if( o1 instanceof Comparable && o2 instanceof Comparable ) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c2.compareTo(c1); // 
		}
		return -1;
		
	}
}

class MyComparatorCaseInsensitive implements Comparator{

	@Override
	public int compare(Object o1, Object o2) { 
		if( o1 instanceof String && o2 instanceof String ) {
			String c1 = (String) o1;
			String c2 = (String) o2;
			return c1.toLowerCase().compareTo(c2.toLowerCase()); // 
		}
		return -1;
	}
}
