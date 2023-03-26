package com.test.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q066 {

	public static void main(String[] args) {
		// 요구사항
		// 중복되지 않는 임의의 숫자 6개를 만드시오.(로또)

		//조건..
		//숫자의 범위: 1 ~ 45
		//오름차순 정렬 
// 풀이 1.
//		Set<Integer> set = new HashSet<>();
//		int cnt = 6;
//		
//		while(cnt>0) {
//			while( !set.add(drawNumber(45)) );
//			cnt--;
//		}	
//		System.out.println(set);
//		
// 풀이 2.
//    
		//  [   ]  [    ]   [   ]   [   ]  [    ] 
		//         [rand]
		int[] nums = new int[6];
		for(int i=0 ; i< 6 ; i++) {
			nums[i] = drawNumber(45);
			for(int j=0; j<i ;j++) {
				if ( nums[i] == nums[j] ) { // 중복 발생
					i--;
					break;
				} // i-- 해버리면
			}
		} // 여기서 ++ 되서 제자리에 값이 다시 대입됨
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

	}
	
	public static int drawNumber(int num) {
		return (int)(Math.random()*num)+1;
	}

}
