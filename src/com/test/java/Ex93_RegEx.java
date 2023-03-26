package com.test.java;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex93_RegEx {

	public static void main(String[] args) { 
		//m1();
		// m2();
		long ex= Long.parseLong("1234");
		
		/*
		  
		  정규 표현식, Regular Expression
		  - 정규식
		  - "특정 패턴"의 문자열을 검색하는 도구
		  - 자바(X)
		  - 언어 / 기술에 독립적인 별도의 기술
		  - 유닉스
		  
		  정규 표현식 구성요소(문법)
		  
		  1. x 
		     - x는 임의의 문자 1개
		     - 고정문자
		     ex) "a"   > a
		     ex) "abc" > abc
		     
		  2. .
		          - 임의의 문자 1개 
		          - 와일드 카드(모든 문자)
		          ex) 홍.동      > 홍길동, 홍유동, 홍유동, 홍순동, 홍찬동
		          ex) 홍..      > 홍길동, 홍유동, 홍유동, 홍순동, 홍찬동
		          ex) "S....." > 긴 글자의 일부분도 찾는다. string도 찾음.(Case sensitive하다.)
		          ex)          > [Story ] : 공백도 글자라서 검색 대상이 된다.
		     
		     
		   3. 출현횟수
		      - 바로 앞의 문자(집합)의 출현 횟수를 표현
		     
		      3.1 생략
		          - 바로 앞의 대상이 생략x, 중복x : 그냥 딱맞는걸 찾곘다 이거임
		          - 출현 횟수 : 1
		          ex) "a?bc" > ab, abc, abbc, ac, bc, bbc, aaabc
		      
		      3.2 ?
		           - 바로 앞의 대상이 생략O, 중복X
		           - 출현 횟수: 0~1 
		           - ? 가 뜻하는게 없어도 찾아주고 있으면 하나 나와도 찾아준다. 
		           - 앞의 a의 출현횟수가 0 또는 1 이다.
		           ex) "a?bc" > ab, abc, abbc, ac, bc, bbc, aaabc
		              -"abc"
		              -"bc"
		           ex) "홍?길동" > 안녕~ 길동아~ 네 이름은 홍길동이지? 
		              - 홍길동도 검색해주고, 그냥 길동도 검색해준다.
		              "950303"-?1234567" > 950303-1234567
		                                   9503031234567
		           ex) "자바?코드"> 여기에 자바코드가 있습니다. 하지만 코드에 에러가 있어요.
		                  이 코드를 수정해주세요. 그리고 자바 코드를 제출해주세요.
		              - ?는 바라는 한글자에 영향을 미친다. "자코드" 도 매칭이 될 수 있다.
		              
		              "(자바)?코드"> 
		              - 이렇게하면 그룹이 된다. ?는 그룹기준으로 통제를 한다.
		              
		       3.3 + : 이걸 끝에다가 붙이면 덩어리로 찾는다.
		           - 바로 앞의 대상이 생략x, 중복O
		           - 출현 횟수 : 1 ~ 무한대
		           ex) "a+bc" > ab, abc, abbc, ac, bc, bbc, aaabc
		           - a가 한번 이상 나온 경우만을 찾는다. 
		           - aaaaaaaaaaaaaaaaaaaaaaabc
		           ex) "홍+길동"  > 안녕~ 길동아~ 네 이름의 홍길동이지? 홍홍길동, 홍홍홍길동, 홍홍홍홍홍길동
		           
		           ex)"(자바)?코드"> 여기에 자바코드가 있습니다. 하지만 코드에 에러가 있어요. 자바자바자바코드
		              자코드 자바자바자바자바코드
		              
		                
		       3.4 *
		           - 바로 앞의 대상이 생략O, 중복O
		           - 출현 횟수: 0~무한대
		           ex) "a*bc"   > ab, abc, abbc, ac, bc, bbc, aaabc
		           ex) "홍*길동"  > 안녕~ 길동아~ 네 이름의 홍길동이지? 홍홍길동, 홍홍홍길동, 홍홍홍홍홍길동
		           ex)"(자바)*코드"> 여기에 자바코드가 있습니다. 하지만 코드에 에러가 있어요. 자바자바자바코드
		              자코드 자바자바자바자바코드
		               
		       4. 선택, choice
		          4.1 [열거값]
		          	  - 열거된 값들 중 하나를 선택해서 검색
		          	  ex) "[291]" > 안녕하세요. 제 나이는 21살입니다. 제 동생은 19살입니다.
		          	  ex) "[0123456789]" > 화면에 모든 숫자만들 골라낸다. 
		          	  ex) "[김이박]길동"  > 홍길동, 김길동, 이길동, 박길동, 최길동
		          	              <홍길동은 안찾는다. 김길동, 이길동, 박길동, 최길동 찾음>
		          	  ex) "[123]45" > 12345, 145, 245, 45   >>
		          	       - 123 중에 하나를 선택한다. 345,145,245만 찾는다.
		          	  ex) "[123]?45" > 12345, 145, 245, 45  >> 앞에거 3개랑 45도 찾는다.
		          	      물음표를 붙인다. 바로 앞에 있는 애를 꾸민다. 선택이다. 선택을 안해도 해도 된다.
		          	  ex) "[123]+45" > 12345, 145, 245, 45  >> 생략할 순 없지만 중복을 할 수 있다.
		          	                              앞에 3개 찾고 45는 못찾는다.
		          	                              12245 
		          	  ex) "[123]*45" > 12345, 145, 245, 45  >>  0~무한대라서 45도 찾는다.
		          	  
		          	  ex) 페이지의 모든 숫자(한자리 이상~)  > [0123456789] : 한글자만
		          	       [0123456789]+            : 글자 통으로 탖는다.
		          	       [0123456789][0123456789] : 2자리 숫자씩 찾는다. 자기가 발견한 패턴이면 누군가의 일부분도 2자리 숫자씩 찾는다. 
		          	       " [0123456789][0123456789] " : 앞뒤에 공백이 드간 숫자 찾는다.
		          	       
		          	       11 22 33 : 11 , 33 찾는다. 11찾을 때 이미 찾아서 22 앞뒤에 공백은 못찾는다.
		          	   
		          	  ex) 주민등록번호 > 이렇게 생긴 애들은 주민등록 번호다. 찾기가 너무 힘들다. 
		          	      950303-2323456
		          	      
		          	      "[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]-[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]"
		          	      // 6번적는다. -는 그냥 적는다. 그리고 또 7번
		          	    
		          	      d{3}-d{3}[0123456789]?-d{4}
		          	  ex) 전화번호
		          	      010-[0123456789][0123456789][0123456789][0123456789]?-[0123456789][0123456789][0123456789][0123456789]  
		          	      010-2888-0517
		          	      010-1234-4444
		          	      010-1233-4444
		          	      010-133-4444
		          	      010-1223-4242
		          	      
		          	  ex) 영어 소문자 단어를 찾는다. // CaseSensitive 선택해야함
		          	      [abcdefghijklmnopqrstuvwxyz]+
		          	      
		          	  ex) 영어 대문자 
		          	  	  "[ABCDEFGHIJKLMNOPQRSTUVWXYZ]"
		          	  	  
		          	  ex) 영어 대소문자
		          	       [ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz]+
		          	       
		          	  ex) 한글
		          	      "[가나다라가갸ㄱ]"     
		          	    
		          	    *** 열거값 중 연속된(***) 문자를 간략하게 표현하는 방법
		          	    
		          	    ex) 숫자> "[0123456789]" > [0-9]
		          	    ex) 소문자 > "[abcdefghijklmnopqrstuvwxyz]" > "[a-z]"
		          	    ex) 소문자 > "[ABCDEFGHIJKLMNOPQRSTUVWXYZ]" > "[A-Z]"
		          	    ex) 영문자 > "[ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz]" > "[A-z]"  
 		          	               // A - 65, Z - 90 (쭈욱 연결), a - 97   연속되지 않는다 조심해라
 		          	               // "[A-Za-z]"
 		          	    ex) "[cdfeopqr]" >  "[c-r]"            
		          	                      > "[c-fo-r]"
		          	    ex) 한글은 어떤 글짜부터 어떤글자로 끝나는지 알아야 해! > "[가-힣]"
		          	    	"[가-힣]" : 한글자씩 찾기
		          	        "[가-힣][가-힣][가-힣]" : 세글자씩 찾기
		          	        "[가-힣]+"           : 단어 단위로 짜르기
		          	    
		          	    ex) 전화번호
		          	        "010-[0-9][0-9][0-9][0-9]?-[0-9][0-9][0-9][0-9]"
		          	        
		          	    ex) '홍'씨성을 가지는 이름을 찾자
		          	        "홍.."
		          	        홍길동, 홍순신, 홍영희, 홍ab, 홍$! 다 찾는다.
		          	        "홍[가-힣][가-힣]"
		          	        홍길동, 홍순신, 홍영희만 찾는다.
		          	         
		          	    ex) 소문자+숫자
		          	        "[a-z0-9]+" : 영어든 숫자든 포함시켜서 덩어리로 찾는다. 
		          	      
		          	    ex) 영문자(대소문자)+숫자
		          	        "[A-Za-z0-9]"
		          	     
		          	    ex) 영문자+숫자+한글
		          	        "[0-9a-zA-Z가-힣]"
		          	        "[가-힣0-9a-zA-Z]"
		          	        "[가-힣a-z0-9A-Z]"
		          	        // 뭔 조합으로 적든 상관없다.
		          	         
		          	         "[A-Za-z0-9]" // 익숙함 이런식으로 그냥 적긴한다. 
		          	    ex) 식별자로 적합한 문자(영문자 + 숫자 +_)
		          	         "[A-Za-z0-9_홍]" //이건 연속이고 순서가 맞아야하고
		          	         "[A-Z홍a-z_0-9]" // 이것도 된다. 연속이 끝난 부분엔 넣어도 된다.
		          	         "[A-Za-z홍0-9]"
		          	            
		          4.2 [^열거값]
		               - 열거값을 제외한 나머지를 탐색한다. 앞에 not을 붙인다.
		               ex) "[^123]"    : 1,2,3은 안찾는다.
		               ex) "[^0-9]"    : 숫자를 제외한 모든 문자 검색
		          	   ex) "[^A-Za-z]" : 영어가 아닌 모든 문자
		          	   ex) "[^가-힣]"   : 한글이 아닌 모든 문자 	
		                
		           
		          5. 출현횟수 
		             - 바로 앞의 문자(집합)의 출현 횟수를 표현
		             - ?, +, * > 더 세밀한 패턴이 가능하다.
		             
		             // 고정
		             5.1 {n}
		                  - n: (고정)출현횟수
		                  ex) "a{1}bc" > ab, bc, abc, ac, abbc, abcc, aabc, aaabc
		                      // 딱 abc만 찾는다.
		                  ex) "a{2}bc" > ab, bc, abc, ac, abbc, abcc, aabc, aaabc
		                      // 딱 aabc 찾는다.
						  ex) "a{3}bc" > ab, bc, abc, ac, abbc, abcc, aabc, aaabc
						      // 딱 aaabc 찾는다.
						       
						       
		             // 5.2, 5.3 범위 
		             5.2 {n,m}
		                  - n: 최소 출현횟수 
		                  - m: 최대 출현횟수
		                  ex) "a{1,2}bc" > ab, bc, abc, ac, abbc, abcc, aabc, aaabc
		                       ab, aab   > 최소 1번 최대2번
		                  ex) "a{2,3}bc" > ab, bc, abc, ac, abbc, abcc, aabc, aaabc
		                  	   aab, aaab > 최소 2번 최대3번
		                  ex) "a{0,1}bc" > ab, bc, abc, ac, abbc, abcc, aabc, aaabc
		                       bc,abc 	   
		                  
		             5.3 {n,}
		                  - n: 최소 출현횟수
		                  - 최대 출현횟수 무한대
		                  
		                  ex) "a{1,}bc" > ab, bc, abc, ac, abbc, abcc, aabc, aaabc
		                      a가 1개이상 몇개든 bc
		                      
		                  ex) "a{2,}bc" > ab, bc, abc, ac, abbc, abcc, aabc, aaabc
		                      a가 2개이상부터 몇개든 bc
		                      
		                  ex) "a{0,}bc" > ab, bc, abc, ac, abbc, abcc, aabc, aaabc
		                  // 0으로 a가 없어도 된다.

		             "a{0,}bc"
		             "a*bc" < 이게 가독성이 높다.
		             - x, ?, +, * > 얘네로 할 수 있는것은 얘네로 한다.
		             - {n}, {n, m}, {n, } > 위에것들로 못하는건 얘네로 한다.
		               
		             결국은 이 두개를 골고루 쓴다. > 그 기준이 이렇게 나눈다.
		             
		             > 이걸 자바에서 써먹을 수가 있다. 자바에서 활용하는 법을 알자
		             ex) 주민등록번호
			             [0-9][0-9][0-9][0-9][0-9][0-9]-?[0-9][0-9][0-9][0-9][0-9][0-9][0-9]
			             
			             "[0-9]{6}-[0-9]{7}"
			             
			         ex) 전화번호
			             "010-[0-9][0-9][0-9][0-9]?-[0-9][0-9][0-9][0-9]"
			             "010-[0-9]{3,4}-[0-9]{4}"
			             
			         ex) 영어단어 > 첫문자 대문자로 시작... 나머지는 소문자...
			             "[A-Z][a-z]{1,}" 처음에는 대문자를 찾고 소문자를 1회이상 찾아라     
			             "[A-Z][A-Za-z]{1,}"
			             // 대문자 첫번쨰 자리, 나머지는 대소문자
			             
		             6. 처음과 끝
		                6.1 ^ 
		                    - 뒤의 표현으로 반드시 시작
		                    - str.startsWith("홍")
		                    ex) "^홍길동"
		                
		                6.2 $
		                    - 앞의 표현으로 반드시 종료
		                    - str.endsWith("길")
		                    ex) "홍길동$"
		              
		              7. \d or \D
		                 - Digit > 숫자
		                 - "\d" > "[0-9]"  : 숫자를 찾아라
		                 - "D"  > "[^0-9]" : 숫자 빼고 나머지다.
		                 
		                 ex) "[0-9]{6}-[0-9]{7}"
		                 ex) "\d{6}-\d{7}"
		                 *
		                 6.2 \w or \W(영어 대소문자 + 숫자 + _ 빼고 다 찾아라)
		                   - \w는 word이다. > 영어 대소문자 + 숫자 + _ 이런걸 찾는다.
		                   ex) "\w{3,5}" > "[A-Za-z0-9_]{3,5}"
		                   
		                 
		                 6.3 \s or \S(공백이 아닌 나머지 애들찾아라)
		                     - 공백문자(스페이스, 탭, 엔터)
		                     ex) "\s+" 연속된 한글자 이상 공백문자 찾아라, xo
		                     스페이스는 몇글잔지 몰라서 \t라 쓰는데... 
		                        "\s+"
		             
		                 정규식을 많이 모아놓은 사이트가 있다.     
		                 https://regexlib.com/
		                 뒤에 오는 인터넷 도메인 패턴은 생각해본적 있나?? > 정규식 만들려면 이걸 알아야 한다.
		                 
		                 test@navercom // > 이게 점이 없으면 어렵다.
		                 https://regexlib.com/Search.aspx?k=email
		                - email > [\w-\.]+@([\w-]+\.)+[\w-]{2,4} : 이메일을 잘 찾아준다.
		                
		                test@gmail.com
		                aaa1234@naver.com
		                honlkejlkjassdfljas@daum.net
		                
		*/ 
		
		String regex1 = "[0-9]{5}";
		
		String regex2 = "\\d{5}"; //자바 땜에 escape시켜야 한다. 헥갈린다. 자바에서 할 떈 안쓴다. 
		
		// m3();
		//m4();
		//m5();
		// m6();
		m7();
		// m8();
		//m9();
	}

	private static void m9() {
		// 자바는 쇼트 서킷(short-circuit)을지원한다.
		int n = -10;
		
//		if(n>0 &&   n< 100     ) { // 오른쪾까지 안간다. 왼쪾이 false면 오른쪽까지 안가.
//			System.out.println("O");
//		} else {
//			System.out.println("X");
//		}
		
		if( n>0 ||   n< 100     ) { // 이경우도 오른쪽가지 안간다. 
			System.out.println("O");
		} else {
			System.out.println("X");
		}
	}

	private static void m8() {
		
		String txt = "홍길님이";
		//String regex = "^[가-힣]{3}"; 
		//String regex = "[가-힣]{3}$"; // 대상이 한글로 끝나야해요. 홍길동A - false 
		//"캐럿이 꾸미는건 한글 한글자다." 내가 검사하는 대상이 한글로 시작합니까?
		//"A홍길동"은 false 나온다. // ^붙이면 무조건 한글로 시작해야 true
		
		String regex = "^[가-힣]{3}$";// "한글 세글자가 무조건 한글로 시작하면서 한글로 끝난다라"는 뜻
		                             // 그리고 글자수도 맞아야한다.
		
		
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(txt);
		
		System.out.println(m1.find()); // 이미 한글 3글자 앞에걸 찾아서 true 나옴
		
	}

	private static void m7() {
		// 자바 > 정규 표현식의 목적
		// 1. 검색 > 치환
		// 2. 검색 > 추출
		// 3. 유효성 검사
		
		// 회원 가입 > 유효성 검사
		// 1. 이름   > 필수 입력, 한글, 2~5자 이내
		// 2. 나이   > 필수입력, 숫자, 18이상
		// 3. 아이디  > 필수입력, 영어+숫자+_, 숫자로 시작 불가능, 4~12자 이내
		
		// 만족했을 때 회원가입, 만족 못하면 out
		
		System.out.println("[회원 가입]");
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("이름: ");
		String name = scan.nextLine().trim(); // 
		
		System.out.print("나이: ");
		String age = scan.nextLine().trim(); //
		
		System.out.print("아아디: ");
		String id = scan.nextLine().trim(); // "trim() 처리"
		
		if(isValid(name, age, id)) {
			System.out.println("가입 완료");
		} else {
			System.out.println("가입 실패");
		}
		
		//날짜(2023-03-03) > "^[0-9]{4}-[0-9]{2}-[0-9]{2}$"
		//시간(14:30) > "^[0-9]{2}:[0-9]{2}$"
	
		scan.close();
	}

	private static boolean isValid(String name, String age, String id) {

		String regex = "";      // 정규식
		Pattern pattern = null; // 정규식 객체
		Matcher matcher = null; // 결과 객체
		
		//1. 이름 > 필수 입력, 한글, 2~5자 이내
		// regex = "[가-힣]{2,5}"; // 한글 2글자에서 5글자이내 >"홍길동입니다."가 통과된다. 홍길동 세글자만 찾는다.
		// find는 내가 발견한게 일부라도 있으면 true라고 리턴한다. 이게 No이어야 한다.
		// ★ 이걸 막으려고 캐럿^, 뒤에 $를 붙여야 한다. 
		regex = "^[가-힣]{2,5}$";  // > 앞에 ^붙이고 뒤에 $붙여서 2에서 5글자이고 한글로만 된 이름을 찾는다.
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(name); // 입력값을 대상으로 정규식 검사
		
		if (!matcher.find()) {
			// 한글로 된 2~5자를 못찾았습니다.!!
			return false;
		}
		
		//2. 나이 > 필수입력, 숫자, 18세 이상
		regex = "^[0-9]{2,}$";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(age);
		//                 || 하면 short circuit 떄문에 걍 매칭만 되면 나이 검사 안함
		if(!matcher.find() && (Integer.parseInt(age) < 18)) { // 범위검사는 정규식이 못한다.
			// 확실한거 앞으로  ,  문제가 생기는거 뒤로 보내라.
			System.out.println("나이를 필수입력, 숫자, 18세 이상 입력하세요.");
			return false;
		}
		
		//3. 아이디> 필수입력, 영어+숫자_, 숫자로 시작 불가능, 4~12자 이내
		// regex = "^[A-Za-z0-9_]{4, 12}$"; // 숫자로 시작하는걸 걸르고 싶다. // 영어 숫자 _ 시작하게 허용해서 문제가.
		regex = "^[A-Za-z_][A-Za-z0-9_]{3,11}$"; // 맨앞쪾에 숫자는 뺸다. 
		                         // { } 안에 띄어쓰기도 하지마라
		pattern = Pattern.compile(regex); 
		matcher = pattern.matcher(id);
		if(!matcher.find()) {
			System.out.println("아이디를 필수입력, 영어+숫자+_, 숫자로 시작 불가능");
		}
		
		return true;
	}

	private static void m6() {
		String txt = "안녕하세요. 저는 홍길동입니다. 네? 당신 이름도 길동이라구요? 아 김길동이군요. "
				+ "마침 저쪽에도 최길동이 있습니다. 어? 남궁길동도 있네요.";
		//String regex = "[홍김최남궁]?길동"; // 남궁은 못찾는다. 한글자씩이니까 ... 선택되는것
		
		//"[홍김최(남궁)]?길동" > 이래버리면 소괄호도 찾아버린다.... 그래서 쓰지마라
		
		String regex = "(홍|길|최|남궁)(길동)"; // 이럴땐 | 연산자가 구분자가 된다. | 넣을려면 소괄호로 넣자 [ ]는 한글자씩 적용
		                                    // 이름을 ( ) 묶어라
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(txt);
		
		while(m1.find()) {
			System.out.println("찾은 이름: "+ m1.group());
//			System.out.println("성: " + m1.group().substring(0, 1));
//			System.out.println("이름: " + m1.group().substring(1)); // 이리 그냥 짜르면 안된다. 남/궁 이래 두글자 못짤라
			System.out.println("성: " + m1.group(1));
			System.out.println("이름: " + m1.group(2)); // 이리 그냥 짜르면 안된다. 남/궁 이래 두글자 못짤라
			// 그래서 소괄호로 묶어라
			System.out.println();
		}
		
	}

	private static void m5() {
		
		// 정규 표현식 객체
		String txt = "안녕하세요. 홍길동입니다. 제 연락처는 010-1234-5678입니다. 혹시 이 번호로 연락이 안되면 010-5656-9876";
		// txt안에 전화번호가 포함되어 있는지 검사?
		String regex = "([0-9]{3})-([0-9]{3,4})-([0-9]{4})";
		// 정규식 객체(p1)
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(txt); //(CharSequence input) 이거니까 문자열 넣어주라
		
		
//		System.out.println(m1);
//		System.out.println(m1.find()); // 전화번호 찾았다.
		
//		if ( m1.find() ) // true 010-1234-5678 찾음
//			System.out.println("txt내에서 전화번호 발견O");
//		else 
//			System.out.println("txt내에서 전화번호 발견x");
//		
//		System.out.println(m1.find()); //true 010-5656-9876 찾음
//		System.out.println(m1.find()); //false
//		System.out.println(m1.find()); //false
//		System.out.println(m1.find()); //false
//		// 대상 문자열에 2개 전화번호 들음
		
//		int count = 0;
//		
//		while(m1.find()) {
//			count++;
//		}
//		
//		System.out.printf("txt에서 전화번호 %d회 발견했습니다.\n",count);
		
//		String regex = "([0-9]{3})-([0-9]{3,4})-([0-9]{4})"; 
		
		while(m1.find()) {
			System.out.println("[전화번호 발견]");
			System.out.println("전화번호: "+m1.group()); // 발견한걸 빼준다.
			System.out.println("전화번호: "+m1.group(0)); // 발견한걸 빼준다. 찾은 전체가 group(0)
			                                           // 그 안에다가 소그룹 만든다. > 소괄호
			System.out.println("전화번호: "+m1.group(1)); // 발견한걸 빼준다.
			System.out.println("전화번호: "+m1.group(2)); // 발견한걸 빼준다.
			System.out.println("전화번호: "+m1.group(3)); // 발견한걸 빼준다.
			// 찾은거에서 다 나아가 부분적으로 소괄호로 묶어서 하면 추출할 수 있다.
			System.out.println();
		}
		
	}

	private static void m4() {
		// split()
        // String txt = "홍길동,아무개,하하하;호호호,후후후";
        // String[] list = txt.split(",;"); // 이건 안된다. 이거 정규식이다.
		// ,, 이런식으로 구분자 연속으로 오면 사이 공간이 방하나로 잡힌다. 빈 방이 된다. > 그래서 "[,;]+" 로 한다. 빈방이 안생긴다. 
		String txt = "홍길동,아무개,하하하;호호호 후후후";
		                          // 공백도 들어간다. 공백은 \s이다. 이거나 \\s나 간ㅌ음
		String[] list = txt.split("[,;\s]+"); // 이건 안된다. 이거 정규식이다. 대괄호로 묶으면 된다. 초이스다.
		
		for(String name: list) {
			System.out.println(name);
		}
		
	}

	private static void m3() {
		// 자바의 정규표현식
		//1. 기존(문자열) 메소드 > 정규표현식 지원
		//2. 정규표현식 클래스
		
		// 동일한 replace인데 이름만 다르고 정규표현식을 지원한다.
		//"".replaceAll(null, null); //String regex는 정규표현식이다.
		//"".replaceFirst(null, null); //String regex는 정규표현식이다.
		
		// 게시판> 개인정보 마스킹
		String txt = "안녕하세요. 홍길동입니다. 제 연락처는 010-1234-5678입니다. 혹시 이 번호로 연락이 안되면 010-5656-9876";
		
		System.out.println(txt.replace("010-1234-5678", "xxx-xxxx-xxxx"));
		// 
		
		System.out.println(txt.replaceAll("[0-9]{3}-[0-9]{3,4}-[0-9]{4}", "xxx-xxxx-xxxx")); 
		// 정규표현식으로 처리가 가능해서 걸리는 패턴을 다 마스킹한다.
		
		System.out.println(txt.replaceFirst("[0-9]{3}-[0-9]{3,4}-[0-9]{4}", "xxx-xxxx-xxxx"));
		// 첫번쨰 패턴일치 문자열만 마스킹, 뒤에 나오는 패턴일치 문자열은 처리가 안된다.
		
	}

	private static void m2() {
		String txt = "홍길동 아무개 하하하 호호호 후후후";
		
		//2. StringTokenizer > 이터레이터
		// - token 더이상 쪼개지지 않는 요소를 말한다.
		// > 공백을 기준으로 쪼개진 최소 단위
		StringTokenizer st = new StringTokenizer(txt);
		
		while(st.hasMoreTokens()) { // iterator 같은 느낌이다.
			System.out.println(st.nextToken());
		}
		System.out.println("-------------------------------------");
		txt = "홍길동,아무개,하하하,호호호,후후후";
		st = new StringTokenizer(txt, ",");
		
		while(st.hasMoreTokens()) { // iterator 같은 느낌이다.
			System.out.println(st.nextToken());
		}
		System.out.println();
		System.out.println();
		System.out.println("-------------------------------------");
		txt = "홍길동,아무개,하하하,호호호,후후후";
		st = new StringTokenizer(txt, ",", true); // 구분자를 안 버린다. 
		while(st.hasMoreTokens()) { // iterator 같은 느낌이다.
			System.out.println(st.nextToken());
		}
		System.out.println();
		System.out.println();
		
		System.out.println("-------------------------------------");
		txt = "홍길동,아무개,하하하;호호호,후후후";
		st = new StringTokenizer(txt, ";,"); // 두개씩도 자른다. 
		while(st.hasMoreTokens()) { // iterator 같은 느낌이다.
			System.out.println(st.nextToken());
		}
		System.out.println();
		System.out.println();
	}

	private static void m1() {
		String txt = "홍길동,아무개,하하하,호호호,후후후";
		
		//1. split() // 구분자를 regex이다.
		String[] list = txt.split(",", 2);// ★ 조각의 최대 개수! 
		
		for(String name : list) {
			System.out.print(name+"  자릅니다.  ");
		}
		
		list = txt.split("무개");
		// list = txt.split("자바"); // 자를 구분자가 없다. 한덩어리로 나온다.
	
		for(String name : list ) {
			System.out.println(name);
		}
		
		System.out.println();
	}

}
