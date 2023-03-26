package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class Q126 {

	public static void main(String[] args) throws Exception {
		//		요구사항
		//		직원들의 지각과 조퇴를 카운트하시오.
		//		조건..
		//		출근 : 오전 9시
		//		퇴근 : 오후 6시
		//		리소스..
		//		파일 > 출결.dat
		//		파일 다운로드
		//		출력..
		//		[이름]    [지각]    [조퇴] 
		//		홍길동      4회       0회 
		//		아무개      0회       0회 
		//		하하하      2회       3회 
		String path = "C:\\class\\code\\java\\파일_입출력_문제\\출결.dat";
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		//Map사용 이름으로 Key
		HashMap<String, Count> cntMap = new HashMap<>(); 
		
		String line = null;
		while( (line=reader.readLine()) !=null) {
			String[] temp = line.split(",");
			//String year X
			String name = temp[1];
			String arrive = temp[2];
			String leave = temp[3];
			if(cntMap.containsKey(name)) {
				Count cnt = cntMap.get(name);
				checkCount(arrive, leave, cnt);
			} else {
				Count cnt = new Count(); // 없으면 객체 생성해서 넣음	
				cntMap.put(name, cnt);
			} 
		}
		
		System.out.printf("[%2s]\t[%2s]\t[%2s]\n","이름","지각","조퇴");
		for ( Map.Entry<String, Count> entry: cntMap.entrySet() ) {
			System.out.printf("%2s\t%2d회\t%3d회\n",
					entry.getKey(),
					entry.getValue().getLate(),
					entry.getValue().getLeaving_early());
		}
		reader.close();
		
	}
	public static void checkCount(String arrive, String leave, Count cnt) {
		try {
			SimpleDateFormat sf= new SimpleDateFormat("HH:mm"); // 해당 데이터 포멧으로 받아서
			// Date 객체형태로 비교 > compareTo 사용
			if(  sf.parse(arrive).compareTo(sf.parse("9:00")) > 0 ) {
				cnt.cntLate();
			}
			if( sf.parse(leave).compareTo(sf.parse("18:00"))  < 0 ) {
				cnt.cntLeavingEarly();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

//if("12:20".compareTo("9:00")>0) // 이렇게.. 시간 비교 이렇게 하는건 말이 안됨
//  System.out.println("s");

class Count{

	private int late;
	private int leaving_early;
	public Count() {
		this.late = 0;
		this.leaving_early=0;
	}
	public int getLate() {
		return late;
	}
	public int getLeaving_early() {
		return leaving_early;
	}
	public void cntLate(){
		this.late++;
	}
	public void cntLeavingEarly() {
		this.leaving_early++;
	}
}
