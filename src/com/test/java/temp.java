package com.test.java;


public class temp {
	// Encoding format : utf-8
	public static void main(String[] args) {
		// [ 요구사항 ] : 9개의 자료형, 각 자료형당 x 10개씩
		// 1. 주의의 데이터 선별 
		// 2. 데이터 성격 		
		// 3. 변수 생성 
		// 4. 값 대입 
		// 5. 출력
		
		// < 자료형 종류 >
		// 1. 기본형 x 8
		// boolean  1 byte 논리형
		// byte     1 byte 정수형 -128~127
		// short    2 byte 정수형
		// char     2 byte 문자형
		// int      4 byte 정수형
		// float    4 byte 실수형 온도
		// long     8 byte 정수형
		// double   8 byte 실수형
		// 2. 참조형 x 1
		// String, 특정 객체의 주소값

		// 1. boolean 
		boolean lampSwitch;       // 1.전등의 스위치 
		lampSwitch  = true;       //   
		System.out.println("전등의 스위치 상태는 "+(lampSwitch? "On":"Off" )+" 입니다" );
		boolean isRain;           // 2. 오늘 비가 오는지 여부
		isRain = false;           //    
		System.out.println("오늘은 비가 왔습니까? "+isRain);
		boolean trueAndFalse;     // 3. 명제의 참.거짓
		trueAndFalse = true;     
		System.out.println("자바는 객체지향 언어이다. "+trueAndFalse);
		boolean pass;              // 4. 합격 불합격  
		pass = true;
		System.out.println("시험에 붙었나요? "+pass);
		boolean isLate;            // 5. 학원에 늦었는지  
		isLate = false;
		System.out.println("학원에 늦었나요? "+isLate);
		boolean married;           // 6. 결혼여부
		married = false;
		System.out.println("결혼 했나요? "+married);
		boolean showDialog;        // 7. 대화창이 떴는지 flag
		showDialog = false;
		System.out.println("대화창이 떠있나요? "+showDialog);
		boolean tired;             // 8. 피곤한지
		tired = true;
		System.out.println("파곤한가요? "+tired);
		boolean isFinish;          //9. 수업이 끝났는지
		isFinish = true;
		System.out.println("수업이 끝났나요? "+isFinish);
		boolean brokenPc;          //10. 컴퓨터가 고장났는지
		brokenPc = false;
		System.out.println("PC가 고장났나요? "+ brokenPc);
		
		// 2. byte
		byte mathScore;            // 1. 수학점수
		mathScore = 90;
		System.out.println("수학점수는 " +mathScore+"점 입니다." );
		byte engScore;             // 2. 영어점수
		engScore = 95;
		System.out.println("영어점수는 " +engScore+"점 입니다." );
		byte sciScore;             // 3. 과학점수
		sciScore = 93;
		System.out.println("과학점수는 " +sciScore+"점 입니다." );
		byte korScore;              // 4. 국어점수
		korScore = 92;
		System.out.println("국어점수는 " +korScore+"점 입니다." );
		byte myClassDay;            // 5. 내 수업일수
		myClassDay = 2;
		System.out.println("수업일수는 " +myClassDay+"일 입니다." );
		byte alphaNum;              // 6. 알파벳 개수
		alphaNum = 26;
		System.out.println("알파벳 개수는 "+alphaNum+"개 입니다.");
		byte myBookCnt;             // 7. 내 책의 개수
		myBookCnt = 20;
		System.out.println("내 책의 개수 "+myBookCnt+"개 입니다.");
		byte waitNum;               // 8. 대기자수
		waitNum = 50;
		System.out.println("대기자 수는 "+waitNum+"명 입니다.");
		byte myWeight;               // 9. 내몸무게
		myWeight = 85;
		System.out.println("내 몸무게는 "+myWeight+"kg 입니다.");
		byte distance;               // 10. 학원까지 거리
		distance = 30;
		System.out.println("학원까지 거리가 "+distance+"킬로 입니다.");
		
		// 3. short ~32768 ~ 32767
		short coffeePrice;           // 1. 커피값
		coffeePrice = 4000;
		System.out.println("커피값은 "+coffeePrice+"원 입니다.");
		short studentNum;            // 2. 학생수
		studentNum = 200;
		System.out.println("학생 수는 "+studentNum+"명 입니다.");
		short height;                 // 3. 키
		height = 178;
		System.out.println("내 키는 "+height+"cm 입니다.");
		short subjectSum;             // 4. 과목총점
		subjectSum=400;
		System.out.println("과목총점은 "+subjectSum+"점 입니다.");
		short runningTime;            // 5. 영화 상영시간
		runningTime = 122; 
		System.out.println("영화 상영시간은 "+runningTime+"분 입니다.");
		short stock;                  // 6. 재고
		stock=1000;
		System.out.println("물건의 재고는 "+stock+"개 남았습니다.");
		short busNum;                  //7.버스번호
		busNum = 3003;
		System.out.println("버스의 번호는 "+busNum+"번 입니다.");
		short processCnt;              //8.프로세스 수
		processCnt = 1400;
		System.out.println("동작중인 프로세스 수는 "+processCnt+"개 입니다.");
		short year;                    //9. 연도
		year=2023;
		System.out.println("올해 연도는 "+year+"년 입니다.");
		short mailCnt;                  //10. 저장된 메일수
		mailCnt=2000;
		System.out.println("저장된 메일 수는 "+mailCnt+"개 입니다.");
		
        // 4. char
		char firstAlpha;            //1. 알파벳 첫글자
		firstAlpha='a';
		System.out.println("알파벳 첫글자는 "+firstAlpha+" 입니다.");
		char blank;                 // 2. 공백문자
		blank = ' ';
		System.out.println("공백출력 : "+ blank);
		char classRoomNum;           // 3. 교실번호
		classRoomNum='1';
		System.out.println("교실번호는 : "+ classRoomNum+"입니다");
		char grade;                  // 4. 성적
		grade='A';
		System.out.println("성적은 "+grade+"등급 입니다.");
		char usbPortNum;              //5. usb port 수
		usbPortNum = '5';
		System.out.println("usb 포트수는 "+usbPortNum+"개 입니다.");
		char rank;                    // 6. 랭크
		rank='S';
		System.out.println("랭크는 "+rank+" 입니다.");
		char size;                     //7. 사이즈
		size = 'M';                     
		System.out.println("옷의 사이즈는 "+size+" 입니다.");
		char level;                    //8. 레벨
		level='5';
		System.out.println("레벨은 "+level+" 입니다.");
		char dir;                      //9. 방향
		dir='N';
		System.out.println("방향은 "+dir+" 입니다.");
		char newLine;                  //10. 줄바꿈
		newLine='\n';
		System.out.println("줄바꿈"+newLine);
		
	    // 5. int
		int readCnt;                    //1. 조회수
		readCnt = 10000;
		System.out.println("조화수는 "+readCnt+" 입니다.");
		int fee;                         //2. 회비
		fee = 100000;
		System.out.println("회비는 "+fee+" 입니다.");
		int notebookPrice;                //3. 노트북 가격
		notebookPrice = 2000000;
		System.out.println("노트북 가격은 "+notebookPrice +" 원 입니다.");
		int phonePrice;                   // 4. 핸드폰 가격
		phonePrice= 500000;
		System.out.println("핸드폰 가격 : "+phonePrice+" 원 입니다.");
		int wordCnt;                       // 5. 단어수
		wordCnt = 10000;
		System.out.println("단어수 : "+wordCnt);
		int lineCnt;                        // 6. 줄 수
		lineCnt = 400;                   
		System.out.println("줄 수 : "+ lineCnt);
		int peopleCnt;                       // 7. 인구수
		peopleCnt=5_000_000_00;
		System.out.println("인구 수는 "+ peopleCnt+"명 입니다.");
		int salary;							// 8. 월급
		salary = 10000000;    
		System.out.println("월급은 "+salary+"원 입니다.");
		int resolution;                     // 9.해상도
		resolution= 1024 * 768;
		System.out.println("해상도는 "+resolution+" 입니다.");
		int change;                         // 10. 거스름돈
		change = 1500;
		System.out.println("거스름돈은 "+change+"원 입니다.");
		
		// 6. float.
		float radius;                       // 1. 반지름
		radius = 5.0f;
		System.out.println("반지름은 "+radius+" 입니다.");
		float diameter;                     // 2. 지름
		diameter = radius*2;
		System.out.println("지름은 "+diameter+" 입니다.");
		float areaOfCircle;                 // 3. 넓이 
		areaOfCircle = radius * radius * 3.14f;
		System.out.println("넓이는 "+areaOfCircle+" 입니다.");
		float averageScore;                  // 4. 평균점수
		averageScore = (mathScore+engScore+sciScore+korScore)/4.f;
		System.out.println("평균점수 "+averageScore+"점 입니다.");
		float voltage;						 // 5. 전압
		voltage = 5.2f;
		System.out.println("전압은 "+voltage+"V 입니다.");
		
		float temperature;                    // 6.온도
		temperature = 35.3f;
		System.out.println("현재 온도는 "+temperature+"도 입니다.");
		
		float boilingPoint;                    // 7. 끓는점
		boilingPoint = -252.8f;
		System.out.println("수소의 끓는점은 "+boilingPoint+"도 입니다.");
		
		float probability;                     // 8. 확률
		probability = 99.9f;
		System.out.println("확률은 "+probability+"% 입니다.");
		
		float accuracy;                         // 9. 정확도
		accuracy = 95.7f;
		System.out.println("정확도는 "+accuracy+"% 입니다.");
		
		float recall;                            // 10. 재현율
		recall= 84.3f;
		System.out.println("재현율는 "+recall+"% 입니다.");
		
		// 7. long.
		long revenue;                 // 1. 한 해 수입
		revenue = 10_000_000_000L;
		System.out.println("수익은 "+revenue+" 원 입니다.");
		long damage;                  // 2. 피해량
		damage = 12345678;
		System.out.println("공격 피해량은 "+damage+" 입니다.");
		long deposit;                  // 3. 보증금
		deposit = 200_000_000;
		System.out.println("보증금은 "+deposit+" 원 입니다.");
		long tax;                       // 4. 세금
		tax = 34500000;
		System.out.println("세금은 "+tax+" 원 입니다.");
		
		long investmentMoney;           // 5. 투자금
		investmentMoney = 3_000_000_000L;
		System.out.println("투자금은 "+investmentMoney+"원 입니다.");
		
		long cost;                       // 6. 손실비용
		cost = 554000000;
		System.out.println("손실비용은 "+cost+"원 입니다.");
		
		long traffic;                     // 7. 트래픽
		traffic = 10*1000*1000L;
		System.out.println("트래픽은 "+traffic+"bps 입니다.");
		
		long voteCnt;                     // 8. 투표수
		voteCnt = 16320000;
		System.out.println("투표수는 "+voteCnt+" 입니다.");
		
		long powerConsumption;            //9. 전력소모량
		powerConsumption = 4320000;
		System.out.println("이번달 전력소모량은 "+powerConsumption+"W 입니다.");
		
		long GDP;                         //10. GDP
		GDP = 1811_000_000_000_000L;
		System.out.println("우리나라 GDP는 "+GDP+"원 입니다.");
		
		// 8. double.          
		double PI;                        // 1. 원주율
		PI = 3.14159265;
		System.out.println("원주율은 "+PI+" 입니다.");
		double e;                         // 2. 자연로그의 밑
		e  = 2.71828182846;
		System.out.println("자연로그의 밑은 "+e+" 입니다.");
		double xPoint;                    // 3. x좌표
		xPoint = 4.2;
		System.out.println("x 좌표는 "+xPoint+" 입니다.");
		
		double yPoint;                    // 4. y좌표
		yPoint = 5.3; 
		System.out.println("y 좌표는 "+yPoint+" 입니다.");
		
		double speedOfLight;              // 5. 빛의 속도
		speedOfLight =299792458d;
		System.out.println("빛의 속도는 "+ speedOfLight+"m/s 입니다.");
		 
		double returnOnAsset;              // 6. 총자산순이익율
		returnOnAsset = 3.52;      
		System.out.println("총 자산 순 이익률은 "+returnOnAsset+"% 입니다.");
		
		double loss;                        // 7. 손실률
		loss = 10.2;
		System.out.println("손실률은 "+loss+"% 입니다.");
		
		double margin;                      // 8. 영업 이윤
		margin = 20.23;
		System.out.println("영업 마진은 "+margin+"% 입니다.");
		
		double successRate;                  // 9. 성공률
		successRate = 95.2;
		System.out.println("성공률은 "+successRate+"% 입니다.");
		
		double cpuUtilization;               // 10.cpu 이용률
		cpuUtilization= 8.9223;
		System.out.println("현재 CPU 이용률은 "+ cpuUtilization+"% 입니다.");
		
		
		// 9. 참조
		String name;                     // 1. 이름의 성
		name = "남건욱";
		System.out.println("이름은 "+ name+"입니다.");
		
		String academy;                  // 2. 학원이름
		academy="쌍용교육센터";
		System.out.println("학원이름은 "+ academy+"입니다.");

		String empty;                    // 3. 빈문자열
		empty=" ";
		System.out.println("빈문자열 출력 ["+ empty+"]");
		
		String color;                     // 4. 색깔
		color = "blue";
		System.out.println("색깔은 "+color+" 입니다.");
		
		String subject;                   // 5. 과목
		subject = "math";
		System.out.println("과목은 "+subject+" 입니다.");
		
		String department;                // 6. 부서
		department = "marketing";
		System.out.println("여기는 "+ department+" 부서입니다.");
		
		String job;                       // 7. 직업
		job = "programmer";
		System.out.println("내 직업은 "+job+" 입니다.");
		
		String language;                  // 8. 언어
		language="English";
		System.out.println("언어는 "+ language +" 를 합니다.");
		
		String day;                        // 9. 요일
		day = "월";
		System.out.println("오늘은 "+day+"요일 입니다.");
		
		String brand;                      // 10. 브랜드
		brand ="samsung";
		System.out.println("브랜드는 "+brand+"을 씁니다.");
	}

}
