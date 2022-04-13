package com.example.JSONParsing3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {
	
//	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
/*		System.out.println("**** Creating JSONArray of JSONObject");
		JSONObject dinerListObject = new JSONObject();
		
		JSONArray dinerList = new JSONArray();
		
		JSONObject diner1 = new JSONObject();		
		diner1.put("name","Jane Stark");
		diner1.put("age", 22);
		diner1.put("gender", "female");
		diner1.put("isAllergic", false);
		diner1.put("amountSpent", 153.27);
		
		JSONArray contactList = new JSONArray();
		JSONObject contact1 = new JSONObject();
		
		contact1.put("type", "home");
		contact1.put("number", "212-555-1234");
		
		JSONObject contact2 = new JSONObject();
		
		contact2.put("type", "mobile");
		contact2.put("number", "646-555-4567");
		
		contactList.add(contact1);
		contactList.add(contact2);
		
		diner1.put("contact", contactList);
		
		dinerList.add(diner1);
		
		dinerListObject.put("diners",dinerList);
		
		System.out.println(dinerListObject);
		
		try (FileWriter file = new FileWriter("diner.json")){
			dinerListObject.writeJSONString(file);			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("**** Writing out JSONArray of JSONObjects"); */
		
		System.out.println("**** Reading JSON");
		
		try(FileReader reader = new FileReader("diner.json")){
			
			//JSON parser object to parse read file
			JSONParser jsonParser = new JSONParser();
			
			JSONObject dinerListObject = (JSONObject) jsonParser.parse(reader);
			System.out.println(dinerListObject);
			
			JSONArray dinerList = (JSONArray) dinerListObject.get("diners");
			
			for (Object object : dinerList) {
				JSONObject diner = (JSONObject) object;
				
				System.out.println("\n**** Diner");
				
				for(Object keyObj: diner.keySet()) {
					String key = (String) keyObj;
					
					if(key.equals("contact")) {
						JSONArray contactList = (JSONArray) diner.get(key);
						
						System.out.println("Contacts: ");
						for (Object contact : contactList) {
							
							JSONObject contactJSON = (JSONObject) contact;
							
							System.out.format("{**Number: %s, Type: %s**}\n",
									contactJSON.get("number"), contactJSON.get("type"));									
						}
					}
				}
			}
		} catch(IOException | ParseException e) {
			e.printStackTrace();
		}
		System.out.println("**** Completed reading JSON");
	}

}
