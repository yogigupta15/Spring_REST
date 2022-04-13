package com.example.JSONParsing9;

import org.json.simple.JSONAware;

public class Diner implements JSONAware {
	
	private String name;
	private int age;
	private String gender;
	private float amountSpent;
	
	public Diner(String name, int age, String gender, float amountSpent) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.amountSpent = amountSpent;
	}
	
	@Override
	public String toJSONString() {
		return String.format("{\"name\": \"%s\", \"age\": %d, \"gender\": \"%s\",\"amountSpent\": %f}",
				name,age,gender,amountSpent);
	}
	
}
