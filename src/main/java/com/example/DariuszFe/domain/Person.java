package com.example.DariuszFe.domain;

public class Person {
	
	private String firstName = "firstname";
	private int yob = 1992;
	
	public Person() {
		super();
	}
	
	public Person(String firstName, int yob) {
		super();
		this.firstName = firstName;
		this.yob = yob;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
}
