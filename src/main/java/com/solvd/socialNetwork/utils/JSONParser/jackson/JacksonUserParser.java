package com.solvd.socialNetwork.utils.JSONParser.jackson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.socialNetwork.binary.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JacksonUserParser {

    //read a user and return a json file
    public void writeJSON(User user) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/parsers/user.json"), user);
    }

    //read a json file and return a List
    public List<User> readJSONFromList() throws JsonParseException, JsonMappingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, User.class);
        List<User> userList = mapper.readValue(new File("src/main/resources/parsers/user.json"), type);
        return userList;
    }

    //read a json file and return an object
    public User readJSON() throws JsonParseException, JsonMappingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(new File("src/main/resources/parsers/user.json"), User.class);
        return user;
    }

    //read a list and return a json
    public void writeJSONFromList(List<User> userList) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/parsers/user.json"), userList);
    }
}


