package com.test.BaekJoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Q1181 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		
		// 1. Set 처리 
		Set<String> aset = new HashSet<String>();
		
		for(int i=0; i< N ;i++) {
			aset.add(scan.next());
		}
		
		// 2. Set 만큼 배열 할당
		String[] arr = new String[aset.size()];
		
		Iterator<String> it= aset.iterator();
		
		int i=0;
		while(it.hasNext()) {
			arr[i++] = it.next();
		}
		
		// 3. 정렬
		Arrays.sort(arr, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				if( o1.length() ==  o2.length() ) return o1.compareTo(o2);
				return o1.length() -  o2.length();
			}
		});
		
		// ★ int는 빼기, String이니까 compareTo
		
		for(String s: arr) {
			System.out.println(s);
		}
	}
	
}
