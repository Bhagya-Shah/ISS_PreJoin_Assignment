package com.example.xml_example;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXML {
	public static void main(String[] args) {
		try {
			// Path to the XML file
			File xmlFile = new File("employee.xml");

			// Creating a Document
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);

			// Normalizing the document
			doc.getDocumentElement().normalize();

			// Reading employee details
			Element root = doc.getDocumentElement();

			String id = root.getElementsByTagName("id").item(0).getTextContent();
			String name = root.getElementsByTagName("name").item(0).getTextContent();
			String age = root.getElementsByTagName("age").item(0).getTextContent();

			System.out.println("Employee ID: " + id);
			System.out.println("Employee Name: " + name);
			System.out.println("Employee Age: " + age);

			// Reading roles
			NodeList roleList = root.getElementsByTagName("role");
			System.out.println("Roles: ");
			for (int i = 0; i < roleList.getLength(); i++) {
				Node role = roleList.item(i);
				System.out.println("  - " + role.getTextContent());
			}

			// Reading salary details
			Element salary = (Element) root.getElementsByTagName("salary").item(0);
			String basic = salary.getElementsByTagName("basic").item(0).getTextContent();
			String bonus = salary.getElementsByTagName("bonus").item(0).getTextContent();
			String tax = salary.getElementsByTagName("tax").item(0).getTextContent();

			System.out.println("Salary Details: ");
			System.out.println("  Basic: " + basic);
			System.out.println("  Bonus: " + bonus);
			System.out.println("  Tax: " + tax);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
