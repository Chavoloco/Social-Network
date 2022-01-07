package com.solvd.socialNetwork.service.user.impl;

import com.solvd.socialNetwork.binary.Friends;
import com.solvd.socialNetwork.binary.Profile;
import com.solvd.socialNetwork.binary.User;
import com.solvd.socialNetwork.dao.mySQLImpl.UserDAOImpl;
import com.solvd.socialNetwork.service.user.UserService;
import com.solvd.socialNetwork.utils.JSONParser.jackson.JacksonUserParser;
import com.solvd.socialNetwork.utils.collections.linkedList.MyLinkedList;
import com.solvd.socialNetwork.utils.parserDemo.DomParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDAOImpl userDAO;

    @Override
    public void writeJsonFromDBInfo() throws IOException {
        JacksonUserParser jacksonUserParser = new JacksonUserParser();
        List<User> userList = userDAO.getAll();
        jacksonUserParser.writeJSONFromList(userList);
    }

    @Override
    public void saveByXmlFile() throws IOException, ParserConfigurationException, SAXException {
        List<User> userList = DomParser.setParseUser();
        userDAO.saveByXmlFile(userList);
    }

    @Override
    public void saveByJsonFile() throws IOException {
        JacksonUserParser jacksonUserParser = new JacksonUserParser();
        User user = jacksonUserParser.readJSON();
        userDAO.saveByJsonFile(user);
    }

    @Override
    public void saveByJsonFileList() throws IOException {
        JacksonUserParser jacksonUserParser = new JacksonUserParser();
        List<User> userList = jacksonUserParser.readJSONFromList();
        userDAO.saveByJsonFile(userList);
    }

    @Override
    public List<User> loadByUserName(String username) {
        return userDAO.getForUserName(username);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAll();
    }

    @Override
    public void updateUserName(Integer id, String userName) {
        userDAO.updateUserName(id, userName);
    }

    @Override
    public User getById(long id) {
        return userDAO.getById(id);
    }

    @Override
    public MyLinkedList<Profile> getProfileByUserId(long userId) {
        return userDAO.getProfileByUserId(userId);
    }

    @Override
    public MyLinkedList<Profile> getAllRelatedProfile() {
        return userDAO.getAllRelatedProfile();
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Override
    public MyLinkedList<Friends> getFriendsByUserId(long id) {
        return userDAO.getFriendsByUserId(id);
    }

    @Override
    public MyLinkedList<Friends> getAllRelatedFriends() {
        return userDAO.getAllRelatedFriends();
    }

    @Override
    public void updatePassword(Integer id, String password) {
        userDAO.updatePassword(id, password);
    }
}
