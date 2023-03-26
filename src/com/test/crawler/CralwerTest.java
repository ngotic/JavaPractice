package com.test.crawler;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

public class CralwerTest {
	private final static String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36";
	public static void main(String[] args) {
		

		//System.out.println("[채용공고 등록]");
	    //int no = Prompt.inputInt("사람인으로부터 몇 개의 채용공고를 가져오시겠습니까?");
		int no  = 10;
	    try {
	      String URL = "https://www.saramin.co.kr/zf_user/search?searchword="+"Spring"+"&searchType=connect&search_done=y&recruitPage=1&recruitSort=apply_cnt&recruitPageCount=10&inner_com_type=scale003&company_cd=0%2C1%2C2%2C3%2C4%2C5%2C6%2C7%2C9%2C10&show_applied=&quick_apply=&except_read=&ai_head_hunting=&mainSearch=y";

	      Connection conn = Jsoup.connect(URL)
					.header("Content-Type", "application/json;charset=UTF-8")
                  .userAgent(USER_AGENT)
                  .method(Connection.Method.GET)
                  .ignoreContentType(true);
	      Document doc = conn.get();
	      String baseURL = "https://www.saramin.co.kr";
	      Elements e1 = doc.select(".content .item_recruit");

	      System.out.println("중견/중소 지원자순 정렬 10개씩 크롤링");
	      for(Element e : e1) {
	    	System.out.println("[회사 : ] "+e.select(".area_corp .corp_name" ).text());
	    	System.out.println("[제목 : ] "+e.select(".job_tit span" ).text());
	    	System.out.println("[링크 : ]"+baseURL+e.select(".job_tit a" ).attr("href")); // 이거에 베이스 주소 붙이기
	     
	    	System.out.println("[날짜 : ]"+e.select(".job_date .date" ).text());
	    	System.out.println("[직업 조건 : ] "+e.select(".job_condition").text());
	    	System.out.println("[직업 영역 : ] "+e.select(".job_sector a").text());
	    	System.out.println();
	    		    	  
	    	  
	      }

	    } catch(Exception e) {
	      e.printStackTrace();
	    }
	    
	  }
		
}


