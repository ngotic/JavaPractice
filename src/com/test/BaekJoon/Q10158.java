package com.test.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




// JAVA11이 JAVA8보다 느리다. 그래서 BufferedReader를 쓴다. 

public class Q10158 {
	
	public static void main(String[] args) throws IOException {
		
		int xdir = 1;
		int ydir = 1;
		int min = 0;
		
		// BufferedReader로 받고 InputStreamReader로 받고
		// br.readLine()으로 StringTokenizer
		// nextToken 시에 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int maxX=Integer.parseInt(st.nextToken());
		int maxY=Integer.parseInt(st.nextToken());
	
		// currPoint
		st=new StringTokenizer(br.readLine());
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		// curr 위치 기준 
		
		// 경우의 수는 방향 4군데
		
		// 방향 전환 > 경계면을 만났을 때만 발동 
		// 일반적으로 풀면 돌아는 가는데 제출하면 시간초과다.
		// 시간 복잡도가 O(T)? 
		// 한계 T가 2억, 시간제한 0.15초 
//		
//		n = n % (maxX*maxY);
//		for( int i=0; i<n; i++ ) {
//			 if(x == maxX && (min < y &&  y < maxY)) {
//				//System.out.println(">2");
//				xdir*=-1;
//			} else if( ( min < x && x < maxX ) && y == maxY) {
//				//System.out.println(">3");
//				ydir*=-1;
//			} else if (y ==min) {
//				//System.out.println(">4");
//				ydir*=-1;
//			} else if(x == maxX && y == maxY) {
//				//System.out.println(">5");
//				xdir*=-1;
//				ydir*=-1;
//			}
//			
//			x+=xdir;
//			y+=ydir;
//		}
		
		// 왔다갔다 > 모듈러 연산
		
		// ★ 대칭이 아니다. >> 그래서 따로 구하는 게 맞다. 
		int xN=n%(2*maxX);
		while(xN-- >0){ // ★ 이런 표현 중요 
			if( x==maxX ) xdir = -1;
			else if (x == min) xdir = 1;
			x += xdir;
		}
		
		int yN=n%(2*maxY);
		while(yN-- >0){
			if( y== maxY ) ydir = -1;
			else if (y == min) ydir = 1;
			y += ydir;
		}
	
		StringBuilder sb = new StringBuilder();
		sb.append(x);
		sb.append(" ");
		sb.append(y);
		// String + 연산은 매우 느리다. 
		System.out.println(sb);
		
	}
	
}
