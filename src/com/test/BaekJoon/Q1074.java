package com.test.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1074 { // 나중에 다시 풀기 
	
	public static int targetX;
	public static int targetY;
	public static int resultP;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner scan = new Scanner(System.in);
		String[] inputs = br.readLine().split(" ");
		int S = Integer.parseInt(inputs[0]);
		int N = (int)Math.pow(2, S);
		// check = new boolean[N][N];
				
		targetX = Integer.parseInt(inputs[1]);
		targetY = Integer.parseInt(inputs[2]);
		result((int)Math.pow(2, S), 0, 0); // 시작 위치
	}
	
	// 행, 열 순이고 
		// 한번 방문한데 또 방문불가 방문할때마다 resultP++ 된다. 
		private static void result(int s, int y, int x) {
			// box의 크기가 중요, 1이면 off, 2일 때만 동작이고 나머지 크기일때는 X
			// 그래서 각 한번씩만 방문 
			if(s == 1) return;
			if(s == 2) { // leaf 재귀만 반복되는 구조로 설계해야 한다.
				// 탈출 조건
				if(x == targetX && y == targetY) {
					System.out.println(resultP);
					return;
				}
				resultP++;
				if((x+1) == targetX && y == targetY) {
					System.out.println(resultP);
					return;
				}	
				resultP++;
				if(x == targetX && y+1 == targetY) { 
					System.out.println(resultP);
					return;
				}
				resultP++;
				if(x+1 == targetX && y+1 == targetY) { 
					System.out.println(resultP);
					return;
				}
				resultP++;
			}
			
			int Square = s/2;
			result(Square, x, y);
			result(Square, x+Square, y);
			result(Square, x, y+Square);
			result(Square, x+Square, y+Square);
		}
}

	// 행, 열 순이고 
	// 한번 방문한데 또 방문불가 방문할때마다 resultP++ 된다.
	// 답은 맞는데 메모리 제한 있어서 이방법 Non pass > 배열없이 해야함
//	private static void result(int s, int y, int x) {
//		
//		//System.out.println("s: "+ s+", x: "+x+", y: "+y+" > "+targetX+", "+ targetY);
//		
//		if(s == 1) return;
//			
//		// 탈출 조건
//		if(x == targetX && y == targetY) {
//			System.out.println(resultP);
//			return;
//		}
//		// System.out.println(x+","+y+"result"+resultP);
//		if(check[x][y]==false) { 
//			check[x][y]=true;
//			resultP++;
//		}
//		
//		if((x+1) == targetX && y == targetY) {
//			System.out.println(resultP);
//			return;
//		}
//		
//		// System.out.println((x+1)+","+y+"result"+resultP);
//		if(check[x+1][y]==false) { 
//			check[x+1][y]=true;
//			resultP++;
//		}
//		
//		if(x == targetX && y+1 == targetY) { 
//			System.out.println(resultP);
//			return;
//		}
//		// System.out.println(x+","+(y+1)+"result"+resultP);
//		if(check[x][y+1]==false) { 
//			check[x][y+1]=true;
//			resultP++;
//		}
//		
//		if(x+1 == targetX && y+1 == targetY) { 
//			System.out.println(resultP);
//			return;
//		}
//		
//		// System.out.println((x+1)+","+(y+1)+"result"+resultP);
//		if(check[x+1][y+1]==false) { 
//			check[x+1][y+1]=true;
//			resultP++;
//		}
//		
//		
//		int Square = s/2;
//		result(Square, x, y);
//		result(Square, x+Square, y);
//		result(Square, x, y+Square);
//		result(Square, x+Square, y+Square);
//		
//	}
	
	
	

