package com.solvd.socialNetwork.utils.parserDemo;

import com.solvd.socialNetwork.binary.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DomParser {

    public static List<User> setParseUser() throws ParserConfigurationException, IOException, SAXException {
        List<User> userList = new ArrayList<>();
        User user = null;

        File inputFile = new File("src/main/resources/parsers/user.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("user");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                user = new User();
                user.setId(Integer.parseInt(eElement.getAttribute("id")));
                user.setUserName(eElement.getElementsByTagName("username").item(0).getTextContent());
                user.setPassword(eElement.getElementsByTagName("password").item(0).getTextContent());
                user.setFriendId(Long.parseLong(eElement.getAttribute("friendId")));
                user.setProfileId(Long.parseLong(eElement.getAttribute("profileId")));
                userList.add(user);
            }
        }
        return userList;
    }
}
