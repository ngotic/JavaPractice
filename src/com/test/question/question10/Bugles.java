package com.test.question;
import java.util.Calendar;

public class Bugles {
	    private int price;  // 가격
	    private int weight; // 용량 
	    private Calendar creationTime; // 생산 일자
	    private int expiration; // 남은 유통기한

	    //getter, setter 구현
	    
		// 읽기 전용, 850원(300g), 1200원(500g), 1950원(850g)
		public int getPrice() {
			if( this.weight == 300 ) //
				return price = 850 ;
			else if( this.weight == 500 ) { //
				return price = 1200 ;
			} else  if( this.weight == 850 ) {
				return price = 1950 ;
			} else {
				return price;
			}
		}
		
		
		// 쓰기 전용, 300g, 500g, 850g
		public void setWeight(int weight) {
			
			if ( weight == 300 || weight == 500 || weight == 850 )
				this.weight = weight;
			else 
				System.out.println("제공하지 않는 용량입니다.");
			
		}
		
	
		// 생산일자 쓰기 전용
		public void setCreationTime(String currentTime) { // 예제를 보면 String으로 받는다.
			//format : "2023-02-06" 이걸 파싱 > split으로 3개가 들어와야 한다.

			String[] timesplit = currentTime.split("-");
		
			int year = Integer.parseInt(timesplit[0]);
			int month = Integer.parseInt(timesplit[1]); // 앞자리 0도 신경안써도 된다. 
			int day = Integer.parseInt(timesplit[2]);
			
			Calendar cTime = Calendar.getInstance();
			cTime.set(year, month-1, day);
			
			this.creationTime = cTime;
		}
		
		// 남은 유통기한 : 읽기 전용
		public int getExpiration() {
			// 300 그람짜리는 7일 지나야하고
			// 500 그람은 10일
			// 850 그람짜리는 15일
			// 생산 일자 - 오늘 날짜 : 남은 유통기한 구한다.
			// 유통기한이 양수면 남았다. 음수면 지났다.
			Calendar today = Calendar.getInstance();
			int eday ; // 무게별 유통기한
			
			// 유통기한 - 현재 - 오늘 
			if ( this.weight == 300 ) {
				eday = 7;
			}
			else if ( this.weight == 500 ) {
				eday = 10;
			}
			else if ( this.weight == 850 ) {
				eday = 15;
			}
			else 
				eday = 0;
			//2023 2 15       2023 2 19        2023 2 25 / 500g
			//  생산일               오늘              유통기한
			// 19 20 21 22 23 24 25(x) 
			
			
			
			//2023 2 07       2023 2 14         2023 2 19 / 300g
			                     //15 16 17 18 19 20
			// 1. day <= eday // 남았다.
			// 그냥 day 리턴
			// 2. day > eday
			// eday - day; 음수
			
			// 생산일 + 유통기한 - 오늘
			
			this.creationTime.add(Calendar.DATE, eday); // 생산일 기준으로 유통기한 뒤를 계산
			
			// 그리고 오늘로 뺀다.
			int day = (int)( this.creationTime.getTimeInMillis() - today.getTimeInMillis())/(1000*60*60*24);
				
			
			return this.expiration = day;
			
		}
		
	    public void eat() { // 과자를 먹기 
	    	if( this.expiration>=0 )
	    		System.out.println("과자를 맛있게 먹습니다.\n");
	    	else 
	    		System.out.println("유통기한이 지나 먹을 수 없습니다.\n");
	    }

}
