package com.example.JSONParsing4;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

	public static void main(String [] args) {
		System.out.println("**** Reading very large file");
		
		JSONParser jsonParser = new JSONParser();
		
		try (FileReader reader = new FileReader("src/test/java/employee.json")){
			Object obj  = jsonParser.parse(reader);
			
			ParsingHandler parsingHandler = new ParsingHandler();
			
			JSONArray jsonObject = (JSONArray) obj;
			System.out.println(jsonObject);
			
			jsonParser.parse(obj.toString(), parsingHandler, true);			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		System.out.println("**** Completed reading JSON");
	}
}
