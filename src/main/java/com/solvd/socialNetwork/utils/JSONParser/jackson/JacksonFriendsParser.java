package com.solvd.socialNetwork.utils.JSONParser.jackson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.socialNetwork.binary.Friends;
import com.solvd.socialNetwork.binary.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JacksonFriendsParser {

    //read a friend and return a json file
    public void writeJSON(Friends friends) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/parsers/friends.json"), friends);
    }

    //read a json file and return a List of friends
    public List<Friends> readJSONFromList() throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, Friends.class);
        List<Friends> friendsList = mapper.readValue(new File("src/main/resources/parsers/friends.json"), type);
        return friendsList;
    }

    //read a json file and return a Friend
    public Friends readJSON() throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        Friends friends = mapper.readValue(new File("src/main/resources/parsers/friends.json"), Friends.class);
        return friends;
    }

    //read a list od friends and return a json
    public static void writeJSONFromList(List<Friends> friendsList) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/parsers/friends.json"), friendsList);
    }

}
