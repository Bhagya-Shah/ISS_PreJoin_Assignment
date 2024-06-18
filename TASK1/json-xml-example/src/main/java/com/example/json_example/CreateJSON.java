package com.example.json_example;

import org.json.JSONObject;
import org.json.JSONArray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateJSON {
	public static void main(String[] args) {
		// Creating a JSONObject for the employee
		JSONObject employee = new JSONObject();
		employee.put("id", 1);
		employee.put("name", "Bhagya Shah");
		employee.put("age", 22);

		// Creating a JSONArray for the courses
		JSONArray roles = new JSONArray();
		roles.put("Analyst");
		roles.put("SDE");
		roles.put("Management");

		// Adding the JSONArray to the JSONObject
		employee.put("roles", roles);

		// Creating a JSONObject for the salary
		JSONObject salary = new JSONObject();
		salary.put("basic", 90000);
		salary.put("bonus", 10000);
		salary.put("tax", 7000);

		// Adding the salary JSONObject to the employee JSONObject
		employee.put("salary", salary);

		// Writing JSON to a file
		try {
			Files.write(Paths.get("employee.json"), employee.toString(4).getBytes());
			System.out.println("JSON file created: employee.json");
		} catch (IOException e) {
			System.err.println("Error writing JSON to file: " + e.getMessage());
		}
	}
}
