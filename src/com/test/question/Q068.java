package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {

	public static void main(String[] args) {
		// 요구사항 ] 배열의 요소를 삭제하시오.
		//		조건..
		//		배열 길이: 10
		//		마지막 요소는 0으로 채우시오.
		 Scanner scan = new Scanner(System.in);
		 //int[] nums = {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		 int[] nums = {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
		 System.out.print("삭제 위치: ");
		 int pos = scan.nextInt();
		 
		 // 원본
		 System.out.println(Arrays.toString(nums));
		 
		 //Sort
		 for(int i=pos; i< nums.length-1; i++) {
			 nums[i] = nums[i+1];
			 
		 }
		 
		 // 마지막 요소는 0으로 채우시오.
		 nums[nums.length-1] = 0;
		 // 정렬본
		 System.out.println(Arrays.toString(nums));
		 
		 scan.close();
	}

}
