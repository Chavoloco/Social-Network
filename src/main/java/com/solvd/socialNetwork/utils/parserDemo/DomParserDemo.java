package com.solvd.socialNetwork.utils.parserDemo;

import com.solvd.socialNetwork.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DomParserDemo {
    private NodeList nList;
    private static final Logger log = LogManager.getLogger(DomParserDemo.class);

    public DomParserDemo() {
        parse();
    }

    @Override
    public String toString() {
        return "DomParserDemo{" +
                "nList=" + nList +
                '}';
    }

    private void parse() {
        try {
            File inputFile = new File("src/main/resources/parsers/user.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            log.info("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("user");
            log.info("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                log.info("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    log.info("id : "
                            + eElement.getAttribute("id"));
                    log.info("Username : "
                            + eElement
                            .getElementsByTagName("username")
                            .item(0)
                            .getTextContent());
                    log.info("Password : "
                            + eElement
                            .getElementsByTagName("password")
                            .item(0)
                            .getTextContent());
                    log.info("Profile id : "
                            + eElement
                            .getElementsByTagName("profileId")
                            .item(0)
                            .getTextContent());
                    log.info("Friend id : "
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

    public static void main(String[] args) {

    }
}
