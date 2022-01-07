package com.solvd.socialNetwork.service.friends.impl;

import com.solvd.socialNetwork.binary.Friends;
import com.solvd.socialNetwork.dao.mySQLImpl.FriendsDAOImpl;
import com.solvd.socialNetwork.service.friends.FriendsService;
import com.solvd.socialNetwork.utils.JSONParser.jackson.JacksonFriendsParser;

import java.io.IOException;
import java.util.List;

public class FriendsServiceImpl implements FriendsService {
    FriendsDAOImpl friendsDAO;

    @Override
    public void writeJsonFromDBInfo() throws IOException {
        JacksonFriendsParser jacksonFriendsParser = new JacksonFriendsParser();
        List<Friends> friendsList = friendsDAO.getAll();
        jacksonFriendsParser.writeJSONFromList(friendsList);
    }

    @Override
    public void saveFriendsByJsonFile() throws IOException {
        JacksonFriendsParser jacksonFriendsParser = new JacksonFriendsParser();
        Friends friends = jacksonFriendsParser.readJSON();
        friendsDAO.saveFriendsByJsonFile(friends);
    }

    @Override
    public void saveFriendsListByJsonFile() throws IOException {
        JacksonFriendsParser jacksonFriendsParser = new JacksonFriendsParser();
        List<Friends> friendsList = jacksonFriendsParser.readJSONFromList();
        friendsDAO.saveFriendsByJsonFile(friendsList);
    }

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
