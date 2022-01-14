package com.solvd.socialNetwork.utils.JSONParser.jackson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.socialNetwork.binary.BasicInfo;

import java.io.File;
import java.io.IOException;

public class JacksonBasicInfoParser {

    //read a basicInfo obj and return a json file
    public void writeJSON(BasicInfo basicInfo) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/parsers/basicInfo.json"), basicInfo);
    }

    //read a json file and return a Friend
    public BasicInfo readJSON() throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        BasicInfo basicInfo = mapper.readValue(new File("src/main/resources/parsers/basicInfo.json"), BasicInfo.class);
        return basicInfo;
    }
}
