package com.test.obj;




public class Ex46_Data {

	public static void main(String[] args) {
		
		
		
	// [ 프로그램 제작 ]
	// > 데이터 확보의 문제
	// 1. 실제 데이터 > 정당한 비용을 지불하면 합법적으로 구할순 있다. 혹은 open API나 공공재들은 가능인데 그건 나중에 얻어올 순 있다. 
	// 2. 가상 데이터 > 가상으로 만드는 수 밖에 없다. 인터넷 - 우연히 학생 정보 > 직접 만든다.
			
	// [ 데이터의 구축 ]
	// [ 학생 정보    ]  > 클래스 단위로 저장하고 학급과 한년 단위로 배열까지 만들어서 구체적으로 데이터를 구축한다. 
	// - 중학교
	// - 1~3학년
	// - 학년당 5 학급
	// - 학급당 30명
	//   - 이름 
	//   - 나이
	//   - 학년
	//   - 반
	//   - 번호
	//   - 주소		
	// - 450명의 데이터를 만들어야 한다.
	// - 가장 단순한 방법 "직접 만든다."
		
	// 더미 데이터 : 가장 좋은 방법은 진짜 데이터를 가져오는 방법이다. 정확도가 좋다. 
	
	// 이름 
//	String[] name1 = {"김","이","박","최","정",
//			          "연","조","정","유","양"};
//	
//	String[] name2 = {"수","경","동","재","진",
//			          "아","지","태","재","우",
//			          "소","기","연","효","정",
//			          "우","현","채","수","원",
//			          "민"};
//	
//	String name = "";
//	
//	name += name1[(int)(Math.random() * name1.length)]; // 이게 성이다.
//	name += name2[(int)(Math.random() * name2.length)]; // 이게 성이다.
//	name += name2[(int)(Math.random() * name2.length)]; // 이게 성이다.
//	
//	// 이렇게만 뽑아도 꾀 그럴싸하다.	
//	System.out.println(name);	
//		
//	int age = 0;
//	age = 14;
//	
//	
//    //// 다량의 데이터가 필요하면 데이터를 만드는 프로그램을 따로 짜서 확보한다. //////////////////////////
//	// 주소도 마찬가지다.
//	// 주소
//	String[] address1 = {"서울시", "인천시", "대전시", "광주시", "부산시", "제주시"};
//	String[] address2 = {"강남구", "강동구", "강서구", "북구",  "남구",  "서대문구", "동작구", "은평구", "동대문구"};
//	String[] address3 = {"역삼동", "대치동", "회기동", "휘경동", "이문동", "천호동", "둔촌동", "길동", "명일동"};
//	
//	String address= "";
//	address += address1[(int)(Math.random() * address1.length)]+" ";
//	address += address2[(int)(Math.random() * address1.length)]+" ";
//	address += address3[(int)(Math.random() * address1.length)]+" ";
//	address += (int)(Math.random() * 40) + 10 + "번지";
//	
//	System.out.println(address);
	// 이것은 더미일 뿐 지도 연동을 하는 경우에는 진짜 데이터를 확보해야 한다. > 9는 맘대로 데이터, 1은 진짜 데이터
	///////////////////////////////////////////////////////////////////////////////////

String[] name1 = {"김","이","박","최","정",
        "연","조","정","유","양"};

String[] name2 = {"수","경","동","재","진",
        "아","지","태","재","우",
        "소","기","연","효","정",
        "우","현","채","수","원",
        "민"};		

String[] address1 = {"서울시", "인천시", "대전시", "광주시", "부산시", "제주시"};
String[] address2 = {"강남구", "강동구", "강서구", "북구",  "남구",  "서대문구", "동작구", "은평구", "동대문구"};
String[] address3 = {"역삼동", "대치동", "회기동", "휘경동", "이문동", "천호동", "둔촌동", "길동", "명일동"};


		Student[][][] list = new Student[3][5][30];

	    // 학생 > 3학년 > 5학급 > 30명
		int index = 0;
		for(int i=1 ;i<=3 ; i++) { // 학년
			for(int j=1;j<=30 ;j++) { // 반 
				for(int k=1; k<30; k++) { // 번호로 쓰인다. 
					Student s = new Student();
					s.setName(name1[(int)Math.random() * name1.length)]
							+name2[(int)Math.random() * name1.length)]
							+name2[(int)Math.random() * name1.length)]);
					s.setAge(13+i);
					s.setGrade(i);
					s.setClassNo(j);
					s.setNum(k);
					s.setAddress( address1[(int)(Math.random()*address1.length)] 
							+ " "
							+address2[(int)(Math.random()*address1.length)]
							+" " 
							+address3[(int)(Math.random()*address1.length)]
							+" "
							+(int)(Math.random()*40) + 10 +"번지");
					//list[index] = s;
					//index++;
					list[i-1][j-1][k-1] = s;
					
				}
				
			}
		}
	
		for(int i=0; i<list.length ;i++) {
			System.out.println("%s\t %s\t %s\t %s\t %s\t %s\n"
					,list[i].getName()
					,list[i].getAge()
					,list[i].getGrade()
					,list[i].getClassNo()
					,list[i].getNum()
					,list[i].getAddress() );
					
		}
		
		
	}

}
