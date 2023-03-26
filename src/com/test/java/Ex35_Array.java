package com.test.java;

import java.util.Arrays;

public class Ex35_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// m1();
		// m2();
		// m3();
		// m4();
		m5();
	}

	
	private static void m5() {
		int[][] nums = new int[5][5]; // 5행 5열
		
		System.out.println(Arrays.toString(nums));
		// Arrays.toString은 바깥쪽만 덤프한다.
		
//		int n=1;
//		for(int i=0; i<5; i++) {
//			for(int j=0 ; j<5 ; j++) {
//				nums[i][j] = n;
//				n++;
//			}
//		}
//	    1    2    3    4    5
//	    6    7    8    9   10
//	   11   12   13   14   15
//	   16   17   18   19   20
//	   21   22   23   24   25
//		n=1;
//		for(int j=0; j<5; j++) {
//			for(int i=0 ; i<5 ; i++) {
//				nums[i][j] = n;
//				n++;
//			}
//		}
//		1    6   11   16   21
//		2    7   12   17   22
//		3    8   13   18   23
//		4    9   14   19   24
//		5   10   15   20   25
		
		int n=1;
		// 루프가 방탐색순서
		for(int i=0; i<5; i++) {
			for(int j=i ; j<5 ; j++) {
				nums[i][j] = n;
				n++;
			}
		}
//	    1    2    3    4    5
//	    0    6    7    8    9
//	    0    0   10   11   12
//	    0    0    0   13   14
//	    0    0    0    0   15
		
		
		
		
		
		
		printArray(nums);
	
	}


	private static void printArray(int[][] nums) {
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[0].length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}


	private static void m4() {
		
		// 성적표
		// 여러명 국, 영, 수
		
		// int[]
		// String[] > 100 > "100" > Integer > Integer.parseInt("100")
		
		int[][] score = new int[10][3]; // 10명 x 3과목
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[0].length; j++) {
				score[i][j] = (int)(Math.random() * 41) + 60;
			}
		}
		
		for(int i=0; i<score.length; i++) { // 사람
			for(int j=0; j<score[0].length; j++) {
				System.out.printf("%5d\t",
								score[i][j]);
			}
			System.out.println();
		}
		
	}


	private static void m3() {
		
		// 초기화 리스트
		int[] nums1    = {10, 20, 30};
		
		int[][] nums2 = {{10, 20, 30},
					     {40, 50, 60}};
		
		int[][][] nums3 = {{{10, 20, 30},
		                    {40, 50, 60}} , {{10, 20, 30},
		                    				 {40, 50, 60}}};
		
		int[][][] num4 = {      // 가독성 버전
							{
								{10, 20, 30},
								{40, 50, 60}
							},
							{
								{10, 20, 30},
								{40, 50, 60}
							}
						 };
		
		
	}

	private static void m2() {
		int[] nums = new int[3];          // 자바 스타일
		// int nums[] = new int[3];       // C 스타일, 비권장
		
		int[] nums1 = new int[3];
		System.out.println(nums1.length); // 3
		
		int[][] nums2 = new int[2][3];
		System.out.println(nums2.length); // 길이? 2 앞에 숫자 리턴이다.
		System.out.println(nums2[0].length); 
		
		int[][][] nums3= new int[5][2][3];
		System.out.println(nums3.length); // 맨 앞의 숫자
		
		
		// num3 자료형? > int[][] > int 3차원 배열입니다.
		// num3[0] 자료형 > int[][] > int 2차원배열입니다.
		// num3[0][0] 자료형 > int[] > int 1차원배열입니다.
		// num3[0][0][0] 자료형 > int > int 
	}
	

	private static void m1() {
		// 1차원 배열
		int[] nums1 = new int[3];
		// 2차원 배열
		int[][] nums2 = new int[2][3];
								 // 2행 3열 
		                         // ***
		                         // ***
		
		// 3차원 배열
		int[][][] nums3= new int[2][2][3];//2(면), 2(행), 3(열)
		
		
		// 배열요소(방) 접근하기
		// 1차월 배열
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;
		
		//2차원배열
		nums2[0][0] = 100;
		nums2[0][1] = 200;
		nums2[0][2] = 300;
		
		nums2[1][0] = 400;
		nums2[1][1] = 500;
		nums2[1][2] = 600;
		
		// 3차원 배열 
		nums3[0][0][0] = 100;
		nums3[0][0][1] = 200;
		nums3[0][0][2] = 300;
		
		nums3[0][1][0] = 400;
		nums3[0][1][1] = 500;
		nums3[0][1][2] = 600;

		nums3[1][0][0] = 700;
		nums3[1][0][1] = 800;
		nums3[1][0][2] = 900;
		
		nums3[1][1][0] = 1000;
		nums3[1][1][1] = 1100;
		nums3[1][1][2] = 1200;
		
		for(int i=0; i< nums1.length ;i++) {
			System.out.printf("nums1[%d] = %d\n", i, nums1[i]);
		}
		System.out.println();
		
		for(int i=0; i<nums1.length; i++) {
			System.out.printf("%5d", nums1[i]);
		}
		
		// 2차원 탐색 > 2중 for문
		for(int i=0; i<2; i++) {
			for(int j=0 ; j<3 ; j++) {
				System.out.printf("nums2[%d][%d] = %d\n",i, j, nums2[i][j]);
			} 
		}
		System.out.println();
		
		for(int i=0; i<nums2.length; i++) {
			for(int j=0 ; j<nums2[0].length ; j++) {
				System.out.printf("%5d", nums2[i][j]);
			} 
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		// 3차원 탐색 
		for(int i=0; i<nums3.length; i++) {
			for(int j=0 ; j<nums3[0].length ; j++) {
				for(int k=0; k<nums3[0][0].length; k++) {
					System.out.printf("nums[%d][%d][%d] = %d\n", 
							i,j,k, nums3[i][j][k]);
				}
			}
		}
		
		for(int i=0; i<2; i++) {
			for(int j=0 ; j<2 ; j++) {
				for(int k=0; k<3; k++) {
					System.out.printf("%5d", nums3[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
	}

}
