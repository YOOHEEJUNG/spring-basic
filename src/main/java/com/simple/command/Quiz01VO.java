package com.simple.command;

public class Quiz01VO {
	
	private String year;
	private String day;
	private String month;
	

	//奄沙 持失切
	public Quiz01VO () {
	
	}
	
	//持失切
	public Quiz01VO(String year, String day, String month) {
		super();
		this.year = year;
		this.day = day;
		this.month = month;
	}
	
	
	
	//getter, setter
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return year + month+ day;
	}
	
	
	

}
