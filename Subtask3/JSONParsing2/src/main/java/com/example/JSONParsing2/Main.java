package com.example.JSONParsing2;

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
		
		JSONObject dinerListObject = new JSONObject();
		
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
		diner2.put("amountSpent", 750.5);
		
		dinerList.add(diner1);
		dinerList.add(diner2);
		
		dinerListObject.put("diners", dinerList);
		
		System.out.println(dinerListObject);;
		

		try(FileWriter file = new FileWriter("diner.json")){
			dinerList.writeJSONString(file);
			}catch(IOException e) {
				e.printStackTrace();
			}
		System.out.println("**** Writing out JSONArray of JSONObject");  */
		
		System.out.println("**** Reading JSON");
		
		try (FileReader reader = new FileReader("diner.json")){
			
			JSONObject dinerListObject = (JSONObject) JSONValue.parse(reader);
			System.out.println(dinerListObject);
			
			JSONArray dinerList = (JSONArray) dinerListObject.get("diners");
			
			for(Object object : dinerList) {
				JSONObject diner = (JSONObject) object;
				
				System.out.println("\n**** Diner");
				
				for(Object field: diner.entrySet()) {
					System.out.println(field);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("**** Completed reading JSON");
	}
}	
