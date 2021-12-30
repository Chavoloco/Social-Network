package com.solvd.socialNetwork.service.basicInfo.impl;

import com.solvd.socialNetwork.binary.BasicInfo;
import com.solvd.socialNetwork.binary.Jobs;
import com.solvd.socialNetwork.binary.Location;
import com.solvd.socialNetwork.binary.School;
import com.solvd.socialNetwork.dao.mySQLImpl.BasicInfoDAOImpl;
import com.solvd.socialNetwork.service.basicInfo.BasicInfoService;
import com.solvd.socialNetwork.utils.collections.linkedList.MyLinkedList;

import java.util.List;

public class BasicInfoImpl implements BasicInfoService {

    BasicInfoDAOImpl basicInfoDAO;

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
