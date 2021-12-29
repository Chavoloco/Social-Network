package com.solvd.socialNetwork.dao.mySQLImpl;

import com.solvd.socialNetwork.binary.*;
import com.solvd.socialNetwork.dao.interfaces.AbstractDAO;
import com.solvd.socialNetwork.dao.interfaces.IBasicInfoDAO;
import com.solvd.socialNetwork.utils.collections.linkedList.MyLinkedList;

import java.util.List;

public class BasicInfoDAOImpl extends AbstractDAO implements IBasicInfoDAO {

    @Override
    public MyLinkedList<Location> getRelatedLocationByFriendId(long id) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public MyLinkedList<School> getRelatedSchoolByFriendId(long id) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public MyLinkedList<Jobs> getRelatedJobByFriendId(long id) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public void save(BasicInfo basicInfo) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public BasicInfo getById(long Id) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public void delete(BasicInfo basicInfo) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public List<BasicInfo> getAll() {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
