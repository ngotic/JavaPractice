package com.test.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex81_File {
	// 상수야 
	private final static String SCORE = ".\\dat\\score.txt";
	
	public static void main(String[] args) {
		// Ex81_File
		/*
		  1. 파일 / 디렉토리 조작
		  2. 파일 입출력
		  		a. 텍스트 입출력(수업)
		  			- 메모장
		  			- 응용 프로그램 <-> ( 데이터 ) <-> 보조기억장치
		  			 
		  		b. 비텍스트 입출력 
		  		    - 그림판 
		  			- 동영상 플레이어  
		  			- 음악 플레이어
		  			
		   [ 저장 장치 ]
		   - 데이터 1,0으로 저장	
		   - 데이터 자료형 존재(X) > 모든 걸 문자열로 저장하면 이해하기 쉽다. > 자기만의 방식으로 저장 > 
		   - 물리적으로 문자코드로 변환해서 저장 > 자바와 호환되는 패턴은 아니다. 자바와 종속적이면 다른 언어랑도 헷갈리니까   
		   - data.txt 
		   
		   [ 인코딩, Encoding ]
		   - 문자 코드(응용 프로그램 데이터)를 부호화(1, 0) 시키는 작업 
		   - 자바 프로그램("홍길동") > 텍스트파일(100100100010) : 인코딩
		   
		   [ 디코딩, Decoding ]
		   - 부호 데이터를 문자 코드를 변환하는 작업(복호화) 
		   - 텍스트파일(100100100010) > 자바 프로그램("홍길동") : 디코딩
		   
		   [ 인코딩/디코딩 규칙 ]
		   --------한글데이터 구분하는데 이 4개는 동일 ---------
		   1. ANSI
		   4. ISO-8859-1
		   5. EUC-KR
		   6. MS949  
		   --------------------------------------------
		   2. UTF-8
		   --------------------------------------------
		   3. UTF-16
		   ______________________________________________________________________________
		   얘네들은 알아야 한다.
		   
		   ANSI : 미국 표준
		   - 영어(서유럽문자) ( 알파벳에 첨자붙은거 겁나 엤날 알파벳 + 숫자 + 특수문자 + 제어문자 ) : 1byte
		   - 한글(일본어, 한자 등) : 2byte
		   
		   UTF-8 ( 얘는 거의 국제표준에 가깝다 )... 
		   - 영어: 1byte
		   - 한글: 3byte
		   UTF-16
		   - 영어: 2byte
		   - 한글: 2byte
		   ______________________________________________________________________________
		   String name = scan.nextLine();   
		   // 이걸 ansi 방식으로 저장? 영어는 1글자당 1바이트로 하드에 저장, 한글이면 1글자당 2바이트에 저장한다.
		    * name이 "Lee" 면 하드에 한바이트씩 3바이트 잡아서 저장
		    * name이 홍길동이면 메모리는 6칸 확보한다. 2바이트당 한글자 적는다.
		   // UTF-8로 저장할래
		    * 영어는 ANSI와 동일하게 3바이트로 저장
		    * 한글은 한글자당 3바이트씩이니까 9칸을 잡는다. > 많이 잡는다.    
		   // UTF-16으로 저장하면?
		    * 영어나 한글이나 둘다 한글자당 2바이트씩 잡는다. 
		    * 자바는 한글자당 2byte씩 쓴다. > 근데 하드에 저장할 때는 자바 입장엔 중요하지 않고 
		    * ANSI냐 UTF-8이냐 UTF-16이냐에 방식에 따른다. 그럼 하드에 저장할 때 이중에 뭘 써야 할까?
		    * 우리의 자유다. 최대한 용량을 적게 차지 하는걸 쓰는게 좋다.
		   ex) UTF-8 한글 >>> 100MB
		   	   ANSI 는 줄어든다.
		   	   
		   	* 하드에 저장할 때만 뿐만아니라 데이터가 네트워크 상에서 돌아다닐 때도 인코딩과 디코딩 과정이 필요하다.
		   	* 이런것에 용량차이가 발생한다.... 용량 차이는 비용차이가 난다.
		   	* 
		   	* 나혼자 쓸 프로그램이면 뭔 인코딩타입을 쓰던 상관없는데 지금은 utf-8을 반강제적으로 쓴다.
		   	* 왜 그러냐면 영어데이터는 용량 적으면서 + (영어는 ANSI보다 표현범위가 넓다.) / 그리고 한글깨짐 같은 이러한 문제가 많았다.
		   	* 그래서 의도적으로 utf-8로 대부분 맞추는 추세임 [자바, 오라클도 UTF-8이다.]      
		   	* A라는 사람이 파일을 전송하는데 ANSI로 저장했다가 받는 사람 B가 읽을 때 UTF-8로 읽는 경우가 있다.
		   	* 이때는 변환 자체를 하는데 에러가 없다고 한다. 근데 영어 읽을 땐 문제가 없는데 한글을 읽을 때 문제다.
		   	* utf-8은 3바이트를 한글자라고 생각하고 읽는다. 그러면 ANSI의 2byte씩으로 되어있는걸
		   	* 3byte로 읽으려니까 글자가 깨지는 것이다. 
		   	* 저장할 떄 사용하는 바이트, 읽을 때 사용하는 바이트가 어긋나면 글자가 꺠진다.
		   	* 영어도 ANSI로 쓰다가 UTF-8로 읽을 때 다 깨진다.  
		   	* 요즘 브라우저는 인코딩 어긋나면 자기가 알아서 변환을 해준다. 요즘에는 깨진걸 볼수가 없다.
		   	* 
		   	*  
		   	*  [ANSI]영어.txt
		   	*  [ANSI]한글.txt
		   	*  
		   	*  [UTF-8]영어.txt
		   	*  [UTF-8]한글.txt
		   	*  
		   	*  [UTF-16]영어.txt
		   	*  [UTF-16]한글.txt
		   	*  
		*/
		//m1();
		// m2();
		// m3();
		// m4(); // 메모장을 만들어보자 정확하게 메모장에서 글쓰는 작업을 콘솔로 하자.
		// m5();
		//m6();
		// m7();
		//m8();
		// m9();
		//m10();
		 m11();
		
	}

	private static void m11() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(SCORE));
			System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
			String line = null;
			while( ( line=reader.readLine() ) != null) {
				
				//System.out.println(line);
				//line = 홍길동,100,90,80
				String[] temp = line.split(",");
				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);
				int total = kor + eng + math;
				double avg = total / 3.0;
				
				System.out.printf("%s\t%4d\t%4d\t%4d\t%4d\t%4.1f\n", 
						temp[0],
						kor,
						eng,
						math,
						total,
						avg);
				// DB도 불편한점 많다. DB는 무겁다. 근데 규모가 커지면 DB가 속도가 빠르다.
				// 파일 입출력은 데이터가 적으면 빠르다.
			}
			
		} catch (Exception e) {
			
		}
		
	}

	private static void m10()  {
		// 더미 데이터를 만들자
		String[] names = {"김","이","박","최","정","현","민","유","재","신" };
		
		 
		// . : 현재 프로그램이 있는 폴더
		// 자바 콘솔 프로그램은 > 현재 위치 > 프로젝트 폴더
		// 우리는 project폴더 밑에다가 data라고 만들어놓음 그리고 그안에 score.txt를 만듬
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(SCORE));
			for ( int i=0; i<30; i++ ) {
				String name = "";
				name = names[(int)(Math.random() * names.length )]
					  +names[(int)(Math.random() * names.length )]
					  +names[(int)(Math.random() * names.length )];
				
				int kor = (int)(Math.random() * 61) + 40;
				int eng = (int)(Math.random() * 61) + 40;
				int math = (int)(Math.random() * 61) + 40;
				writer.write(String.format("%s,%d,%d,%d\r\n",  name, kor, eng, math));
				
			} // 
			 
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void m9() { // "지금 수업하는 파일이 이렇다".
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\file\\Ex81_File.java"));
			// 이걸 콘솔창에 출력해보자
			String line = null;
			int lineNumber = 1;
			while( (line= reader.readLine()) != null) {
				System.out.printf("%03d: %s\n", lineNumber, line); // 줄번호를 입력해주겠다. 
				lineNumber++;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

	private static void m8() {
		try {
			// 이 친구는 콘솔에 있는거 받으려면 new InputStreamReader(System.in)를 넣는다.
			// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			// 이걸끼면 저게되고 이걸끼면 이게 되고 그래서 범용성이다. 파일을 받으려면 FileReader를 받는다.
			BufferedReader reader2 = new BufferedReader(new FileReader("c:\\class\\code\\java\\file\\data4.txt")); // 이걸 넣으면 파일입력이 된다.
			////////////////////////////////////////////////////////
//			String line = reader2.readLine(); // 한 줄씩 읽는 메서드가 제공된다. 
//			// 라인 단위로 읽는게 편하다. 
//			System.out.println(line); // "한 라인을 입력받았다." 
//			/////////// 코드는 이전에 했던 키보드 입력과 동일하다 /////////////
//			line = reader2.readLine(); // 한 줄씩 읽는 메서드가 제공된다. 
//			System.out.println(line); // "한 라인을 입력받았다." 
//			
//			line = reader2.readLine(); // 한 줄씩 읽는 메서드가 제공된다. 
//			System.out.println(line); // "한 라인을 입력받았다."
//			
//			line = reader2.readLine(); // 한 줄씩 읽는 메서드가 제공된다. 
//			System.out.println(line); // > 더이상 읽을 것이 없으면 null을 반환한다.
//			
			// 그러면 루프를 돌려보자
			String line = null;
			
			while( (line = reader2.readLine()) != null ) {
				System.out.println(line);
			} // String이라 실패시 null인데 null을 리턴하면 다읽은 것
			
			// FileWriter와 == BufferedWriter는 그놈이 그놈이다. 떙기는거 쓰라
			// FileReader << BufferedReader 는 라인단위로 읽는것은 BufferedReader얘만 한다.
			// 그래서 짞을 맞추는 경우가 많다 읽기 작업은 BufferedReader, 쓰기는 BufferedWriter
			// 가장 많이 쓰는 스타일은 [ BufferedReader(*), BufferedWriter(*) ] 요렇게 쓴다.
			
					
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m7() {
		//                                                       얘네는 키보드 입력뿐 아니라 파일의 데이터도 읽는다.
		// FileOutputStream 불편 > FileWriter 편해짐 > 조금 더 편해짐 > BufferWriter(범용) 
		// FileInputStream  불편 > FileReader 편해짐 > 조금 더 편해짐 > BufferReader(범용) 
		                                                       // -> (파일에 있는거 읽을수 있고, 네트워크에 있는것도 읽고, 키보드도 읽음)
		//파일 쓰기
		try {
			BufferedWriter writer = new BufferedWriter( new FileWriter("c:\\class\\code\\java\\file\\data4.txt") );
			writer.write("안녕하세요");
			writer.write("\r\n");
			writer.write("홍길동입니다.");
			writer.newLine(); // \r\n와 동일하다.
			writer.write("반갑습니다.");
			writer.close();
			System.out.println("완료"); // 
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	private static void m6() {
		try {
			// 파일 읽기 > 파일 경로 입력
			Scanner scan = new Scanner(System.in);
			
			System.out.print("파일 경로: "); //C:\class\code\java\JavaTest\src\com\test\collection\Ex74.java
			String path = scan.nextLine();
			
			FileReader reader = new FileReader(path); // fileReader와 fileWriter만 있으면 된다. 
			int code = -1;
			while( (code=reader.read()) != -1) {
				System.out.print((char)code);
			}
			reader.close();
			scan.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m5() {
		try {
			//FileWriter
			//FileReader
			FileReader reader = new FileReader("C:\\class\\code\\java\\file\\data.txt");
			
//			int code = reader.read();
//			System.out.println(code); // 한 글자만 읽는다.
//			
//			code = reader.read();
//			System.out.println(code); // 한 글자만 읽는다. // 얘는 한글을 읽을 수 있다.
			int code = -1;
			
			while( ( code=reader.read())!=-1 ) { // "외우는 코드"
				System.out.print((char)code); 
			} // 한글이 읽힌다. 한글자씩 읽어와도 한글이 깨짐없이 읽히니까 쓸만하다.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void m4() {
		// 메모장 콘솔 버전 > 쓰기 > 이것이 현역코드다. 이걸 베이스로 쓰기할 때 이용해라 
		// FileWriter의 write 메서드 쓰라
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("저장할 파일명 : ");
			String fileName = scan.nextLine();
			
			// 프로그램 사용자 환경 
			// 1. CLI > Command Line Interface > 콘솔창 
			// 2. GUI > Graphic User Interface > 현재 대부분 프로그램
			FileWriter writer = new FileWriter("c:\\class\\code\\java\\file\\" + fileName);
			
			// 작성을 하고나서 마무리를 하기가 애매하다. 
			boolean loop = true;
			
			while(loop) { // 사용자가 어떤 걸 입력하도록 할건데 머머를 몇번씩이나 입력할지 미리 예측 못해서 무한루프로 시작
				System.out.print("입력: ");
				String line = scan.nextLine();
				if(line.equals("exit")) 
					break;
                 				   // ★ 엔터가 자동으로 들어가지 않아서 우리가 자동으로 넣어준다.
				writer.write(line);// [ 한줄 입력 > 텍스트 파일 한줄 쓰기 ]
				writer.write("\r\n");
			}
			scan.close();
			writer.close();
			System.out.println("쓰기 종료");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m3() {
		// FileOutputStream > FileWriter : 얘는 쓸만해.
		// 그리고 얘네는 try - catch를 거의 달고 다닌다.
		try {
			// 좀더 안전성 있게 할려면 파일 객체를 만들어서 체크 근데 얘는 바로 path를 넣으니까 바로 함
			// 문자 단위 쓰기( 2byte )씩 > 그래서 한글도 무리없이 저장이 된다.
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\data3.txt");// 생성자 목록엔 여러가지가 있다.
			
			writer.write("ABC"); // 얘는 이렇게 문자열을 넣을 수 있어서 편하다.
			writer.write("홍길동"); // 얘는 이렇게 문자열을 넣을 수 있어서 편하다.
			
			writer.close();
			// 문자열을 한방에 넣어서 절차가 간단해졌다. 
			
			System.out.println("완료");
			
		} catch(Exception e) {
			
		}
		
	}

	private static void m2() {
		// 파일 읽기
		//- " 읽기 스트림 객체 " > 읽기 전용 빨대
		/*
		data.txt 내용 ↓
		ABC
		Java Programming
		Hello world!
		*/

		File file = new File("C:\\class\\code\\java\\file\\data.txt");
		
		////////////////// 이것도 잘 안쓴다. 불편해 ↓ ////////////////////////
		try {
			
			if(file.exists()) {
				FileInputStream stream = new FileInputStream(file); // 
//				int code = stream.read();  // 문자 코드값 반환한다. int형....
//				System.out.println(code);
//				
//				code = stream.read();
//				System.out.println(code);
//				
//				code = stream.read();
//				System.out.println(code);
//				// 만약에 더이상 읽을 것이 없다면 -1을 반환한다.
				// 루프를 만들자. 
				int code = -1;
				
				while( (code = stream.read())!= -1  ) {
					//System.out.println(code);    // 유니코드 출력
					System.out.print((char)code);  // 진짜 문자 출력
					// 이건 두바이트씩 읽는다. 그래서 만약에 한글 3바이트인데 이걸 읽으려면 쪼개진다.
					// 홍길동이 > íê¸¸ë 이렇게 된다.
				} 
				// 13
				// 10 은 엔터이다 \r\n 이것
			
				stream.close(); // 메모리 관리 효율적 항상 닫아주작....
				// 다른 프로그램으로 스트림 꽂혀있으면 내가 쓰려고 해도 못쓰는 경우가 있다
				// 그래서 내가 열었으면 명시적으로 끊자.... 열었으면 닫자구  
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m1()  {
		
		// 파일 쓰기(출력)
		// 기본적으로 덮어쓰기 모드이다. 따로 지정하지 않는 이상 덮어쓰기 모드라는 것이다.
		
		// 파일 쓰기 모드
		// 1. 덮어쓰기 모드(기본)
		//    - 기존 내용을 삭제하고 다시 파일을 생성 후 데이터를 작성한다.
		//    - 파일이 있으면 > 파일을 다시 생성
		//    - 파일이 없으면 > 파일을 새로 생성
		
		String path = "C:\\class\\code\\java\\file\\data.txt"; // 아직 없는 파일이다.
		String path2 = "C:\\class\\code\\java\\file\\data2.txt"; // 아직 없는 파일이다.
		

//		try {
//			
//			// 데이터를 저장할 파일을 참조한 것이다.
//			File file = new File(path); //
//			
//			// 저장할 파일의 스트림 객체 생성 > 예외처리 안했다고 나는 것이다.
//			FileOutputStream stream = new FileOutputStream(file); // 이친구는 내보내는 스트림이다.
//			// 빨대를 꽂는 작업이 이것이다. > "스트림 Open" 프로그램과 파일간의 통로를 만든 것이다.
//			
//			// 쓰기 > int형 문자코드값인데 > 65 > 파일에선 A로 보인다.   
//			stream.write(68); // 빨대는 사용을 다하면 빼야 한다.    
//			stream.write(69); // 빨대는 사용을 다하면 빼야 한다.    
//			stream.write(70); // 빨대는 사용을 다하면 빼야 한다.  
//			// 메모리에 적힌다. 임시공간에 쓴 상태이다. 이 상태에서    
//			
//			// - 빨대 뽑기
//			// - 스트림 닫기 > 진짜 파일에 옮겨적는 작업을 해야하는데 close()를 해야 데이터가 파일에 적힌다.
//			stream.close(); // 이걸해야 데이터가 저장이 된다.
//			System.out.println("완료됬어요..");
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		// 2. 이어쓰기 모드
		//    - 기존 내용을 유지하고, 이어서 데이터를 추가한다. 
		//    - 파일 있으면 > 파일을 그대로 사용
		//    - 파일 없으면 > 파일을 새로 생성
		try {
		
			// 데이터를 저장할 파일을 참조한 것이다.
			File file2 = new File(path2); //
			
			// 저장할 파일의 스트림 객체 생성 > 예외처리 안했다고 나는 것이다.  // boolean append이다. true하면 이어쓰기 모드이다.
			FileOutputStream stream = new FileOutputStream(file2, true); // 이친구는 내보내는 스트림이다.
			// 빨대를 꽂는 작업이 이것이다. > "스트림 Open" 프로그램과 파일간의 통로를 만든 것이다.
			
			// 쓰기 > int형 문자코드값인데 > 65 > 파일에선 A로 보인다.   
//			stream.write(71); // 빨대는 사용을 다하면 빼야 한다.    
//			stream.write(72); // 빨대는 사용을 다하면 빼야 한다.    
//			stream.write(73); // 빨대는 사용을 다하면 빼야 한다.  
			// 메모리에 적힌다. 임시공간에 쓴 상태이다. 이 상태에서
			// 근데 저렇게 write 메서드가 매우 불편하다. 문자 코드로 써야함
			
//			stream.write('\r');
//			stream.write('\n');
//			// 근데 문자코드로 적어도 저장시에 int형으로 형변환되어서 저장된다.
//			stream.write('J');
//			stream.write('a');
//			stream.write('v');
//			stream.write('a'); // 이리 적어도 저장이 잘된다.
// 엔터가 들어와서 2번쨰줄에 Java가 쓰임	
		
			//for문
//			String txt = "Hello Java!";
//			
//			for(int i=0; i<txt.length(); i++) {
//				char c =txt.charAt(i);
//				stream.write(c);
//			}
//			
//			// byte배열 받도록 오버로딩 되어있다.
//			byte[] list = {'A','B','C'};
//			stream.write(list);
			
//			String txt = "Java Programming"; // <★> String엔 getBytes()라는 것이 있다. 바이트배열로만듬
//			// txt.toCharArray(); // 한 글자씩 뽑아서 character 배열로 만들어준다.
//			
//			stream.write(txt.getBytes());;
			
			// 바이트 단위 쓰기(1byte씩 저장)
			// 자바에서 영어는 2바이트로 저장하긴 해도 실제로 1바이트를 초과하지 않는다. 빈 한바이트는 0만 8개 있다.
			// 그래서 영어 2바이트를 1바이트씩 저장해도 문제가 되지 않는다.
			// 한글은 문제다. 1바이트씩 저장하니까 깨짐
//			stream.write('가');
//			stream.write('나');
//			stream.write('다');
			// '섆'이라고 뜬다....
			// 2바이트씩 끊어서 저장해야하는데 한바이트씩 저장하니까 이게 글자가 깨진다. 우리가 직접 바이트 결합을 시켜도 되는데
			// 근데 그걸하기가 귀찮다.
			// 1.사용법 불편, 2.바이트 단위 저장해서 한글저장시 깨져서 추가작업 필요
			// 근데 write가 기본이 되는 도구이긴 하다.
			
			// 근데 자바쪽에서 얘를 감싼 개량형 클래스를 제공해준다. > 그걸 쓰면된다.
			
			
			
			// - 빨대 뽑기
			// - 스트림 닫기 > 진짜 파일에 옮겨적는 작업을 해야하는데 close()를 해야 데이터가 파일에 적힌다.
			stream.close(); // 이걸해야 데이터가 저장이 된다.
			System.out.println("완료됬어요..");
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
