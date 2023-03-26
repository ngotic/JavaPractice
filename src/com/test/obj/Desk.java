package com.test.obj;

public class Desk {
	
	
	// white, black, blue, yellow
	private String color;

	public String getColor() {
		if(this.color.equals("white"))
			return "하얀색"; //
		else if (this.color.equals("blue")) {
			return "파란색";
		} else 
			return "";
	}

	public void setColor(String color) {
		
		if(color.equals("white") || color.equals("black")  || color.equals("yello")) 
			this.color = color;
		
	}

}
