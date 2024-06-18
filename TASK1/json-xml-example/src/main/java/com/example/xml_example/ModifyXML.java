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
import org.w3c.dom.NodeList;

public class ModifyXML {
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

			// Modifying employee details
			Element root = doc.getDocumentElement();
			root.getElementsByTagName("age").item(0).setTextContent("23");

			// Adding a new role
			NodeList roles = root.getElementsByTagName("roles").item(0).getChildNodes();
			Element newRole = doc.createElement("role");
			newRole.appendChild(doc.createTextNode("Testing"));
			root.getElementsByTagName("roles").item(0).appendChild(newRole);

			// Modifying salary details
			Element salary = (Element) root.getElementsByTagName("salary").item(0);
			salary.getElementsByTagName("basic").item(0).setTextContent("95000");
			salary.getElementsByTagName("bonus").item(0).setTextContent("12000");

			// Writing the modified content back into XML file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("employee.xml"));

			transformer.transform(source, result);

			System.out.println("XML file modified: employee.xml");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
