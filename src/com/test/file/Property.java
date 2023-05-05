package com.test.file;
import java.util.Properties;
import java.io.FileReader;

public class Property {

	public static void main(String[] args) throws Exception{
		
		Properties p = new Properties(); 
		// Properties라는 클래스가 있다.
		p.load(new FileReader("context_test.xml")); 
		// 파일에 값을 Key value형식으로 저장한다. 
		System.out.println(p.getProperty("car"));
		
	}

}
