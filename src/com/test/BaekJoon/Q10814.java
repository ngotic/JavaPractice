package com.test.BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

class Man implements Comparable<Man>{
	
	private String name;
	private int age;
		
	public Man(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Man o) {
		// if( this.age == o.getAge() ) return this.name.compareTo(o.getName());
		// 별다른 처리를 안하면 먼저 가입한 순으로 친다.
		return this.age - o.age;
	}

	@Override
	public String toString() {
		return age+" "+name;
	}
	
}


public class Q10814 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		Man[] mlist = new Man[N];
		
		for(int i=0; i<N; i++) {
			int age = scan.nextInt();
			String name = scan.next();
			mlist[i] = new Man(name, age);
		}
		
		Arrays.sort(mlist);
		
		for(Man a : mlist)
			System.out.println(a);
		
	}
	
}
