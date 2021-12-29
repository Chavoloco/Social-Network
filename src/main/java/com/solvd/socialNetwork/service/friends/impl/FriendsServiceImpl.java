package com.solvd.socialNetwork.service.friends.impl;

import com.solvd.socialNetwork.binary.Friends;
import com.solvd.socialNetwork.dao.mySQLImpl.FriendsDAOImpl;
import com.solvd.socialNetwork.service.friends.FriendsService;

import java.util.List;

public class FriendsServiceImpl implements FriendsService {

    FriendsDAOImpl friendsDAO;

    @Override
    public void save(Friends friend) {
        friendsDAO.save(friend);
    }

    @Override
    public Friends getById(long id) {
        return friendsDAO.getById(id);
    }

    @Override
    public void delete(Friends friend) {
        friendsDAO.delete(friend);
    }

    @Override
    public List<Friends> getAll() {
        return friendsDAO.getAll();
    }

    @Override
    public void updateNameById(long id, String name) {
        friendsDAO.updateNameById(id, name);
    }

    @Override
    public void updateLastNameById(long id, String lastName) {
        friendsDAO.updateLastNameById(id, lastName);
    }
}
