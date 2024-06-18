package com.example.xml_example;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXML {
	public static void main(String[] args) {
		try {
			// Creating a new Document
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();

			// Root element
			Element rootElement = doc.createElement("employee");
			doc.appendChild(rootElement);

			// Employee ID
			Element id = doc.createElement("id");
			id.appendChild(doc.createTextNode("1"));
			rootElement.appendChild(id);

			// Employee Name
			Element name = doc.createElement("name");
			name.appendChild(doc.createTextNode("Bhagya Shah"));
			rootElement.appendChild(name);

			// Employee Age
			Element age = doc.createElement("age");
			age.appendChild(doc.createTextNode("22"));
			rootElement.appendChild(age);

			// Roles
			Element roles = doc.createElement("roles");
			rootElement.appendChild(roles);

			Element role1 = doc.createElement("role");
			role1.appendChild(doc.createTextNode("Analyst"));
			roles.appendChild(role1);

			Element role2 = doc.createElement("role");
			role2.appendChild(doc.createTextNode("SDE"));
			roles.appendChild(role2);

			Element role3 = doc.createElement("role");
			role3.appendChild(doc.createTextNode("Management"));
			roles.appendChild(role3);

			// Salary
			Element salary = doc.createElement("salary");
			rootElement.appendChild(salary);

			Element basic = doc.createElement("basic");
			basic.appendChild(doc.createTextNode("90000"));
			salary.appendChild(basic);

			Element bonus = doc.createElement("bonus");
			bonus.appendChild(doc.createTextNode("10000"));
			salary.appendChild(bonus);

			Element tax = doc.createElement("tax");
			tax.appendChild(doc.createTextNode("7000"));
			salary.appendChild(tax);

			// Writing the content into XML file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("employee.xml"));

			transformer.transform(source, result);

			System.out.println("XML file created: employee.xml");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
