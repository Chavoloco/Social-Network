package com.solvd.socialNetwork;

import com.solvd.socialNetwork.binary.*;
import com.solvd.socialNetwork.utils.ConnectionPool;
import com.solvd.socialNetwork.utils.JSONParser.jackson.JacksonBasicInfoParser;
import com.solvd.socialNetwork.utils.JSONParser.jackson.JacksonFriendsParser;
import com.solvd.socialNetwork.utils.JSONParser.jackson.JacksonUserParser;
import com.solvd.socialNetwork.utils.xsdValidator.XsdValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {
    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        XsdValidator xsdValidator = new XsdValidator();
        String xmlFile = "src/main/resources/parsers/location.xml";
        String xsdFile = "src/main/resources/parsers/location.xsd";
        if(xsdValidator.validateXMLSchema(xsdFile, xmlFile)){
            log.info(xmlFile + " is valid against " + xsdFile);
        }

        try {
            writeAJsonUserFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            writeAJsonFriendFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            writeAJsonBasicInfoFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            writeAXmlLocationFile();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        try {
            readXmlLocationFile();
        } catch (JAXBException e) {
            e.printStackTrace();
        }


        ConnectionPool cp = ConnectionPool.getInstance();

        CompletableFuture<Void> thread1 = CompletableFuture
                .runAsync(() -> {
                    try {
                        cp.getConnection();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                });

        CompletableFuture<Void> thread2 = CompletableFuture
                .runAsync(() -> {
                    try {
                        cp.getConnection();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                });

        CompletableFuture<Void> thread3 = CompletableFuture
                .runAsync(() -> {
                    try {
                        cp.getConnection();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                });

        CompletableFuture<Void> thread4 = CompletableFuture
                .runAsync(() -> {
                    try {
                        cp.getConnection();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                });

        while (!thread1.isDone()) {

        }

        if (thread1.isDone()) {
            log.info("thread1 is done");
        }
    }

    public static void writeAJsonUserFile() throws IOException {
        User user1 = new User(1, "userName1", "password", 1, 1);
        User user2 = new User(2, "userName2", "password", 2, 2);
        User user3 = new User(3, "userName3", "password", 3, 3);
        User user4 = new User();

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        JacksonUserParser jacksonUserParser = new JacksonUserParser();

        //read a list and return a json
        jacksonUserParser.writeJSONFromList(userList);
    }

    public static void writeAJsonFriendFile() throws IOException {

        Friends friend1 = new Friends(1, "Charly", "Brown", 1);
        Friends friend2 = new Friends(2, "Hanna", "Montana", 2);
        Friends friend3 = new Friends(3, "Vitálik", "Buterin", 3);
        Friends friend4 = new Friends(4, "Barak", "Obama", 4);

        List<Friends> friendsList = new ArrayList<>();
        friendsList.add(friend1);
        friendsList.add(friend2);
        friendsList.add(friend3);
        friendsList.add(friend4);

        JacksonFriendsParser jacksonFriendsParser = new JacksonFriendsParser();

        //read a list and return a json
        JacksonFriendsParser.writeJSONFromList(friendsList);
    }

    public static void writeAJsonBasicInfoFile() throws IOException {

        BasicInfo basicInfo = new BasicInfo(1, 1, 1, 1);

        JacksonBasicInfoParser jacksonBasicInfoParser = new JacksonBasicInfoParser();

        //read a list and return a json
        jacksonBasicInfoParser.writeJSON(basicInfo);
    }

    public static void writeAXmlLocationFile() throws JAXBException {
        Location location = new Location(1, new Cities(1, "Villa Carlos Paz"), new Countries(1, "Argentina"),
                new States(1, "Cordoba"), new Date());

        File file = new File("src/main/resources/parsers/location.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Location.class);
        Marshaller marsh = jaxbContext.createMarshaller();
        marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marsh.marshal(location, file);
    }

    public static void readXmlLocationFile() throws JAXBException {
        Location location = new Location();

        File file = new File("src/main/resources/parsers/location.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Location.class);
        Location location2 = (Location) jaxbContext.createUnmarshaller().unmarshal(file);

        log.info(location2);
    }
}
