package com.test.codingTest;
import java.util.*;

public class ArrayListChange {

	public static void main(String[] args) {
		// 변환 : Collection <-> 기본형 배열
		
		// 시나리오 1.] ArrayList<Integer> -> int[] Array
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		// java8 이후로는 이 방식대로 int, double, Long 형들을 배열로 바꾼다.
		int[] arr1 = array.stream().mapToInt(i->i).toArray();
		System.out.println(Arrays.toString(arr1)); // 출력
	
		// 시나리오 2. ] String -> char[]
		String test = "Hello world";
		char[] test2 = test.toCharArray();
		String test3 = new String(test2);
		
		// 시나리오 3.] ArrayList<String> -> String[] sArray
		List<String> sArray = new ArrayList<String>();
		sArray.add("홍");
		sArray.add("길");
		sArray.add("동");
		System.out.println(sArray.toArray().getClass());// 모르고 쓰면 이게 String[]으로 되는 줄 안다. 하지만 Object 타입이다.
		System.out.println(sArray.toArray(new String[sArray.size()]).getClass());// 이게 진퉁이다.
		System.out.println(sArray.toArray(new String[0]).getClass());// 이게 진퉁이다.
		System.out.println(Arrays.toString(sArray.toArray(new String[0])));// 출력
		                           // 참조형인경우 그냥 toArray를 출력해서 안에다가 new 클래스명[0] 을 넣으면 됨
	}
	
	
	

}
