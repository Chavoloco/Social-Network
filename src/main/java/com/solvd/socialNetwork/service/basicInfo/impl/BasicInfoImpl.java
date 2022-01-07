package com.solvd.socialNetwork.service.basicInfo.impl;

import com.solvd.socialNetwork.binary.BasicInfo;
import com.solvd.socialNetwork.binary.Jobs;
import com.solvd.socialNetwork.binary.Location;
import com.solvd.socialNetwork.binary.School;
import com.solvd.socialNetwork.dao.mySQLImpl.BasicInfoDAOImpl;
import com.solvd.socialNetwork.service.basicInfo.BasicInfoService;
import com.solvd.socialNetwork.utils.JSONParser.jackson.JacksonBasicInfoParser;
import com.solvd.socialNetwork.utils.collections.linkedList.MyLinkedList;

import java.io.IOException;
import java.util.List;

public class BasicInfoImpl implements BasicInfoService {

    BasicInfoDAOImpl basicInfoDAO;

    @Override
    public void writeJsonFromDBInfo(long id) throws IOException {
        JacksonBasicInfoParser jacksonBasicInfoParser = new JacksonBasicInfoParser();
        BasicInfo basicInfo = basicInfoDAO.getById(id);
        jacksonBasicInfoParser.writeJSON(basicInfo);
    }

    @Override
    public void saveBasicInfoByJsonFile() throws IOException {
        JacksonBasicInfoParser jacksonBasicInfoParser = new JacksonBasicInfoParser();
        BasicInfo basicInfo = jacksonBasicInfoParser.readJSON();
        basicInfoDAO.saveBasicInfoByJsonFile(basicInfo);
    }

    @Override
    public void save(BasicInfo basicInfo) {
        basicInfoDAO.save(basicInfo);
    }

    @Override
    public BasicInfo getById(long id) {
        return basicInfoDAO.getById(id);
    }

    @Override
    public void delete(BasicInfo basicInfo) {
        basicInfoDAO.delete(basicInfo);
    }

    @Override
    public List<BasicInfo> getAll() {
        return basicInfoDAO.getAll();
    }

    @Override
    public MyLinkedList<Location> getRelatedLocationByFriendId(long id) {
        return basicInfoDAO.getRelatedLocationByFriendId(id);
    }

    @Override
    public MyLinkedList<School> getRelatedSchoolByFriendId(long id) {
        return basicInfoDAO.getRelatedSchoolByFriendId(id);
    }

    @Override
    public MyLinkedList<Jobs> getRelatedJobByFriendId(long id) {
        return basicInfoDAO.getRelatedJobByFriendId(id);
    }
}
