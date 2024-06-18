package com.example.json_example;

import org.json.JSONObject;
import org.json.JSONArray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJSON {
	public static void main(String[] args) {
		// Path to the JSON file
		String filePath = "employee.json";

		try {
			// Reading the JSON file -> String
			String content = new String(Files.readAllBytes(Paths.get(filePath)));

			JSONObject employee = new JSONObject(content);

			// Printing employee details
			int id = employee.getInt("id");
			String name = employee.getString("name");
			int age = employee.getInt("age");

			System.out.println("Employee ID: " + id);
			System.out.println("Employee Name: " + name);
			System.out.println("Employee Age: " + age);

			// Printing courses
			JSONArray courses = employee.getJSONArray("roles");
			System.out.println("Roles: ");
			for (int i = 0; i < courses.length(); i++) {
				System.out.println("  - " + courses.getString(i));
			}

			// Printing salary details
			JSONObject salary = employee.getJSONObject("salary");
			int basic = salary.getInt("basic");
			int bonus = salary.getInt("bonus");
			int tax = salary.getInt("tax");

			System.out.println("Salary Details: ");
			System.out.println("  Basic: " + basic);
			System.out.println("  Bonus: " + bonus);
			System.out.println("  Tax: " + tax);

		} catch (IOException e) {
			System.err.println("Error reading JSON file: " + e.getMessage());
		} catch (org.json.JSONException e) {
			System.err.println("Error parsing JSON content: " + e.getMessage());
		}
	}
}
