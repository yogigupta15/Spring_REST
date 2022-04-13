package com.example.JSONParsing;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
//	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
/*		System.out.println("**** Creating JSONArray of JSONObjects");
		
		JSONArray dinerList = new JSONArray();
		
        JSONObject diner1 = new JSONObject();		
		diner1.put("name","Jane Stark");
		diner1.put("age", 22);
		diner1.put("gender", "female");
		diner1.put("isAllergic", false);
		diner1.put("amountSpent", 153.27);
		
		JSONObject diner2 = new JSONObject();		
		diner2.put("name","Jon Snow");
		diner2.put("age", 25);
		diner2.put("gender", "male");
		diner2.put("isAllergic", false);
		diner2.put("amountSpent", 750.5);
		
		dinerList.add(diner1);
		dinerList.add(diner2);
		
		System.out.println(dinerList);
		

		try(FileWriter file = new FileWriter("diner.json")){
			dinerList.writeJSONString(file);
			}catch(IOException e) {
				e.printStackTrace();
			}
		System.out.println("**** Writing out JSONArray of JSONObject");
*/			
		System.out.println("**** Reading JSON ");
		
	    try(FileReader reader = new FileReader("diner.json")){
			
			JSONArray dinerList = (JSONArray) JSONValue.parse(reader);
			System.out.println(dinerList);
			
			for(Object object : dinerList) {
				JSONObject dinerData = (JSONObject) object;
				System.out.println("\n**** Diner");
				
				String name = (String) dinerData.get("name");
				System.out.println("\ndiner name: " + name);
				
				String gender = (String) dinerData.get("gender");
				System.out.println("\ndiner gender: " + gender);
				
				long age = (long) dinerData.get("age");
				System.out.println("\ndiner age: " + age);
				
				double amountSpent = (double) dinerData.get("amountSpent");
				System.out.println("\ndiner amountSpent: " + amountSpent);
				
				Boolean isAllergic = (Boolean) dinerData.get("isAllergic");
				System.out.println("\ndiner isAllergic: " + isAllergic);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	    System.out.println("**** Completed Reading JSON");
	}	
}