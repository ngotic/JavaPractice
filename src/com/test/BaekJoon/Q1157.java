package com.test.BaekJoon;


import java.util.Scanner;


// testCase aabbCCC 이때 조심
public class Q1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int [] cnt = new int[26]; // * 대소문자를 구분하지 않는다. 
		
		for(char a : str.toCharArray()) {
			
			if(a>='A' && a <= 'Z')
				cnt[a-'A']++;
			else
				cnt[a-'a']++;
				
		}
		int max = -1;
		int maxIdx = 0;
		String what = "?";
		// System.out.println(Arrays.toString(cnt));
		
		for(int i=0; i < 26; i++) {
			if ( cnt[i] > max ) {
				max = cnt[i];
				maxIdx = i;
				what="";
			} else if(max!=0 &&  cnt[i] == max) {
				what = "?";
			}
		}

		// System.out.println(maxIdx);
		if(what.equals("?"))
			System.out.println("?");
		else 
			System.out.println((char)(maxIdx+'A'));
		
	
	}
}
