package com.test.obj;

public class Cup {

	private String color;
	private int weight;
	private int price;
	private String type;
	
	
	public int getPrice() {
		return price;
	}
	
	// color > Setter + Getter
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	// weight > Setter > 쓰기 전용멤버
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// Getter
	public int getLevel() {
		
		if(this.weight < 500 && this.price < 1000) {
			
			return 3;//등급
			
		} else if(this.weight < 700 && this.price < 5000 ) {
			
			return 2;
			
		} else {
			
			return 3;
			
		}
	}
}
