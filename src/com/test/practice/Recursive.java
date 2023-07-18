package com.test.practice;

public class Recursive {

//	public static void main(String[] args) {
//		recur(3);
//	}
//	
//	public static void recur(int x) {
//		if( x ==0 ) return ;
//		else {
//			recur(x-1);
//			System.out.println(x);
//		}
//		
//	}
	public static void binary(int x) { //해당 값을 2로 최종적으로 나누면 0이다. 종료조건
		if ( x == 0) {
			return;
		}
		else {
			binary(x / 2);
			System.out.print(x % 2);
		}
	}
	public static void main(String[] args) {
		//binary(11);
		//DFS(1, 3); //h는 루트, 3은 어느 높이까지만 조합
		
		for(int i=1;i< num.length;i++) {
			total += num[i];
		}
		//System.out.println("total : "+total); // 32
		//sameSum(1, 6);
		//sameSumSimple(1, 0, 6);
		
		makeSpecial( 1 , 4, 0, 12 ); // 시작점, 최대레벨, 종료조건 기록
		System.out.println(cnt);
		
	}
	public static int cnt ;
	private static void makeSpecial(int L,int h, int sum, int M) { // sum이 12면 끝
		// if( flag == true) return; // 하나만 찾아도 되면 이렇게
		if( L == h+1 ) {
			if(sum==M) {
				System.out.println("YES");
				cnt++;
				// flag=true;
			}
			return ; 
		} // 종료
		else {
			makeSpecial(L+1, 4, sum+input[L], 12);
			makeSpecial(L+1, 4, sum-input[L], 12);
			makeSpecial(L+1, 4, sum, 12);
		}
		
	}
	public static int [] input = {0, 2, 4, 6, 12, 0, 0, 0, 0, 0};
	public static boolean flag = false;
	
	public static int total = 0;
	public static int [] num = {0, 1, 3, 5, 6, 7, 10, 0, 0, 0};// 1번째부터 쓴다. 0번째는 더미노드
	public static int [] check = new int[11]; // 0 인덱스는 안쓴다.
	
	public static void sameSum(int L, int h) {
		if(flag==true) return;
		if( L == h+1 ) { // L가 7부터 종료
			int sum =0;
			for(int i=1; i< L ;i++) {
				if(check[i] == 1) {
					sum += num[i];
					System.out.print(num[i]+" ");
				}
			}
			System.out.println("> "+sum);
			if((total-sum) == sum) {
				System.out.println("YES");
				flag = true;
			}
		} else {
			check[L]=1;
			sameSum(L+1, h);
			check[L]=0;
			sameSum(L+1, h);
		}
	}
	
	public static void sameSumSimple(int L, int sum, int h) {
		if(flag==true) return ;
		if(L == h+1 ) {
			if(sum == (total-sum)) {
				System.out.println("YES");
				flag=true;
			} // 이제 더이상 일할 필요가 없다.
			
		} else {
			sameSumSimple(L+1, sum + num[L], h); // num[L]을 쓰겠다.
			sameSumSimple(L+1, sum, h);          // num[L]을 쓰지 않겠다.  
		}
		
	}
	
	public static void DFS(int h, int n) {
		if( h == n+1 ) {
			for(int i=1; i<=n ; i++) {
				if(check[i]==1)
					System.out.print(i+" ");
			}
			System.out.println();
		} else {
			check[h] = 1;
			DFS(h+1, n);
			check[h] = 0;
			DFS(h+1, n);
		}
	}
	
	
	
}


