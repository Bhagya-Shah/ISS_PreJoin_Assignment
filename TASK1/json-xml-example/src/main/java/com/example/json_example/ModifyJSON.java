package com.example.json_example;

import org.json.JSONObject;
import org.json.JSONArray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ModifyJSON {
	public static void main(String[] args) {
		// Path to the JSON file
		String filePath = "employee.json";

		try {
			// Reading the JSON file -> String
			String content = new String(Files.readAllBytes(Paths.get(filePath)));
			JSONObject employee = new JSONObject(content);

			// Modifying details
			employee.put("age", 23);

			// Adding new role
			JSONArray roles = employee.getJSONArray("roles");
			roles.put("Testing");

			// Modifying salary
			JSONObject salary = employee.getJSONObject("salary");
			salary.put("basic", 95000); 
			salary.put("bonus", 12000);

			// Writing back
			Files.write(Paths.get(filePath), employee.toString(4).getBytes());
			System.out.println("JSON file modified: employee.json");

		} catch (IOException e) {
			System.err.println("Error reading/writing JSON file: " + e.getMessage());
		} catch (org.json.JSONException e) {
			System.err.println("Error modifying JSON content: " + e.getMessage());
		}
	}
}
