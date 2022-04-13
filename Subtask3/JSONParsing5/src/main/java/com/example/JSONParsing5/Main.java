package com.example.JSONParsing5;

import org.json.simple.JSONObject;

public class Main {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		System.out.println("**** Creating JSONObject");
		
		JSONObject movie = new JSONObject();
		
		movie.put("name", "Back to Future");
		movie.put("releaseYear", 1985);
		movie.put("boxOffice", 388.8);
		movie.put("director","Robert Zemeckis");
		
		System.out.println(movie.toString());
		System.out.println(movie.toJSONString());
		
		System.out.println("**** String encoding of JSON object");
		
	}

}
