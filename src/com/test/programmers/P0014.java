package com.test.programmers;

public class P0014 {

	public static void main(String[] args) {
		long ans = solution("onetwothreefourfivesixseveneightnine");
		System.out.println(ans);

	}
    public static long solution(String numbers) {
        long answer = 0;
        String[] tmp = {"zero", "one" ,"two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        String tempstr=numbers;
        for(int i=0 ; i<tmp.length; i++){
            if(tempstr.contains(tmp[i]))
                tempstr = tempstr.replace(tmp[i],i+""); // 대입해야해 반드시 참조 아니야 값이야
        }
        
        return Long.parseLong(tempstr); // parseLong이야
    }
}
