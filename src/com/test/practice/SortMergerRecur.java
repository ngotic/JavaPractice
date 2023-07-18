package com.test.practice;

public class SortMergerRecur {
	//	8
	//	7 6 3 1 5 2 4 8
	// 길이는 8, 0 번째는 더미노드
	private static int[] data = {0, 7, 6, 3, 1, 5, 2, 4, 8};
	private static int[] tmp = new int[10];
	public static void main(String[] args) {
		System.out.print("before: ");
		for(int i=1;i< data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		divide(1, 8);
		System.out.print("after : ");
		for(int i=1;i< data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	// 종료조건을 뭘까? divide(s,t) > s<t라는 조건이다. s>=t면 종료
	private static void divide(int start, int end) {
		int mid;
		int p1, p2, p3;
		if(start < end) {
			// 이분 탐색의 기법이용 > 배열을 두 부분으로 나눔
			mid= (start+end)/2;
			divide(start, mid); // part1
			divide(mid+1, end); // part2
			// Point 3개를 잡는다.
			// 1. p1 : part1의 첫 인덱스
			// 2. p2 : part2의 첫 인덱스
			// 3. p3 : 두 부분을 합쳐서 만든 새배열의 첫 인덱스
			p1 = start;
			p2 = mid+1;
			p3 = start;
			while(p1<=mid && p2 <=end) { // 범위 체크
				if(data[p1] < data[p2]) tmp[p3++] = data[p1++]; // 작은걸 저장
				else tmp[p3++] = data[p2++];
			}
			// 이제 나머지 답는다.
			while(p1<=mid) tmp[p3++] = data[p1++]; // p1이 도달못하면 그거 나머지 담기 
			while(p2<=end) tmp[p3++] = data[p2++]; // p2가 도달못하면 그거 나머지 담기
			for(int i=start ; i<=end; i++) {
				data[i]=tmp[i];
			}
		}
	//1 2 3 4 5 6 7 8 : 1~ mid=4, 5 ~ end=8 
	}
}
