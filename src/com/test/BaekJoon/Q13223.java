package com.test.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13223 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String firstLine = br.readLine();
		StringTokenizer st = new StringTokenizer(firstLine,":");
		
		int hour1 = Integer.parseInt(st.nextToken());
		int minute1 = Integer.parseInt(st.nextToken());
		int second1 = Integer.parseInt(st.nextToken());
		
		String secondLine = br.readLine();
		st = new StringTokenizer(secondLine,":");
		

		int hour2 = Integer.parseInt(st.nextToken());
		int minute2 = Integer.parseInt(st.nextToken());
		int second2 = Integer.parseInt(st.nextToken());

		boolean sflag = false;
		boolean mflag = false;
		
		if(second2 >= second1) {
			second2 = second2 - second1;
		} else {
			second2 = 60 + second2 - second1;
			sflag = true;
		}
		
		if(sflag) minute1 +=1;
		
		if(minute2 >= minute1) {
			minute2 = minute2 - minute1;
		} else {
			minute2 = 60 + minute2 - minute1;
			mflag = true;
		}
		
		if(mflag) hour1+=1;
			
		if(hour2 >= hour1) {
			hour2 = hour2 - hour1;
		} else {
			hour2 = 24 + hour2 - hour1;
		}
		
		if(firstLine.equals(secondLine)) // 두 입력이 같을 때 결과
			System.out.printf("24:00:00\n");
		else 
			System.out.printf("%02d:%02d:%02d\n", hour2, minute2, second2);
		
	}

}

