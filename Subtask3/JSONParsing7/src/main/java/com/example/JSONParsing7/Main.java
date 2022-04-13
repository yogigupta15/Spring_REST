package com.example.JSONParsing7;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.json.simple.JSONValue;

public class Main {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException{
		
		System.out.println("**** Creating JSONObject");
		
		Map<String, Object> movie = new TreeMap<>();
		
		movie.put("name", "Back to Future");
		movie.put("releaseYear", 1985);
		movie.put("boxOffice", 388.8);
		movie.put("director","Robert Zemeckis");
		
		System.out.println(JSONValue.toJSONString(movie));
		
		System.out.println("**** Presictable ordering string encoding of JSON object");
		
	}
}
