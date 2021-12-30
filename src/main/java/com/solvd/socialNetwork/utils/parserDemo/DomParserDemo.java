package com.solvd.socialNetwork.utils.parserDemo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DomParserDemo {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/main/resources/parsers/user.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root elemnet: " + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("user");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("id : "
                            + eElement.getAttribute("id"));
                    System.out.println("Username : "
                            + eElement
                            .getElementsByTagName("username")
                            .item(0)
                            .getTextContent());
                    System.out.println("Password : "
                            + eElement
                            .getElementsByTagName("password")
                            .item(0)
                            .getTextContent());
                    System.out.println("Profile id : "
                            + eElement
                            .getElementsByTagName("profileId")
                            .item(0)
                            .getTextContent());
                    System.out.println("Friend id : "
                            + eElement
                            .getElementsByTagName("friendId")
                            .item(0)
                            .getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
