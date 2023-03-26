package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q124 {

	public static void main(String[] args) throws Exception {
		// 검색회원 : 1,정재재,서울시 강동구 라동
		// 검색주문 : 1,마우스,19,53
		
//		==== 구매내역 ==== 
//		[번호]    [이름]    [상품명]    [개수]    [배송지]
//		  3       홍길동     마우스      3    서울시 강동구 천호동
		String path = "C:\\class\\code\\java\\파일_입출력_문제\\검색_회원.dat";
		BufferedReader reader = new BufferedReader(new FileReader(path));
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		String name = scan.nextLine();
		// 홍길동을 입력 받으면
		// 검색회원에서 숫자, 주소를 찾는다.
		
		String line = null;
		String num = null;
		String address = null;
		while( (line=reader.readLine())!=null  ) {
			if( line.contains(name) ) {
				String[] temp = line.split(",");
				num = temp[0];
				address = temp[2];
			}
		}
		
		reader.close();
		
		boolean buy=false;
		String result ="";
		if(num != null) {
			
			String path2 = "C:\\class\\code\\java\\파일_입출력_문제\\검색_주문.dat";
			BufferedReader reader2 = new BufferedReader(new FileReader(path2));
			
			while( (line=reader2.readLine())!=null  ) {
				
				String[] temp = line.split(",");
				String no = temp[0];
				String item = temp[1];
				String cnt = temp[2];
				String customerNum = temp[3];
				if(num.equals(customerNum)) {
					buy=true;
					result+= String.format("%3s\t%3s\t%3s\t%3s\t%3s\n",no, name, item, cnt, address);
				}
			}
			
			reader2.close(); 
			
			if(buy) {
				System.out.println("==================== 구매내역 ====================");
				System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");
				System.out.print(result);
			}
			
			
		} else {
			System.out.println("해당 회원이 없습니다.");
			scan.close();
			return;
		} 
		
		if(!buy)
			System.out.println("구매 이력이 없습니다.");
		
		scan.close();
	}

}
