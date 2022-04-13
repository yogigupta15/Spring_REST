package com.example.JSONParsing6;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;

public class Main {
	

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException{
		
		System.out.println("**** Creating JSONObject");
		
		JSONObject movie = new JSONObject();
		
		movie.put("name", "Back to Future");
		movie.put("releaseYear", 1985);
		movie.put("boxOffice", 388.8);
		movie.put("director","Robert Zemeckis");
		
		StringWriter out = new StringWriter();
		movie.writeJSONString(out);
		
		System.out.println(movie.toString());
		
		System.out.println("**** Stream encoding of JSON object");
		
	}
}
