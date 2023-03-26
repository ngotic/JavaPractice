package com.test.question;

public class Q079 {

	public static void main(String[] args) {

		// 배열 사이즈 지정
		int matSize = 3;
		int[][] num = new int[matSize][matSize];

		/// 예제 > 시작 위치 ////////// > 시작 위치 이슈
		int rows = 0;
		int cols = 1;
		///////////////////////////
		int nextRows;
		int nextCols;
		///////////////////////////
	
		// rows는 -1이라 0보다 작으면 안대고 작으면 n-1
		// cols는 +1해서 n-1보다 크면 크면 0
		// 한쪽 했는데 안되면 둘다 이상
		
		int value = 1;
		
		num[rows][cols] = value++;
		
		for (int i = 1; i <= matSize * matSize - 1; i++) {
			// 1. 현재 값 지정
			// 2. 다음 인덱스값으로 이동
			// > 1). 범위체크
			nextRows = rows - 1;
			nextCols = cols + 1;

			// 둘 중 한범위로 귀결
			if (nextRows < 0 && nextCols > matSize - 1) { // 대각 꼭지점 한 군데
				nextRows = rows + 1;
				nextCols = cols;
			} else if (nextRows < 0) { //
				nextRows = matSize - 1;
			} else if (nextCols > matSize - 1) { //
				nextCols = 0;
			}

			if (num[nextRows][nextCols] != 0) {
				
			  // 이슈 ! : 1의 위치에 따라 조건문을 걸고 따라서 어떻게 처리할 지 수정할 것 
			  //cols = cols - 1;  // 마진진의 1의 위치가 1,2일때
			  rows = rows + 1;  // 마방진의 1의 위치가 0,1일때
				
				num[rows][cols] = value++;
			} else {
				rows = nextRows;
				cols = nextCols;
				num[rows][cols] = value++;
			}

		}

		for (int i = 0; i < matSize; i++) {
			for (int j = 0; j < matSize; j++) {
				System.out.printf("%2d\t", num[i][j]);
			}
			System.out.println();
		}
	}
	
	

}
