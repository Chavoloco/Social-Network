package com.solvd.socialNetwork.service.user;

import com.solvd.socialNetwork.binary.Friends;
import com.solvd.socialNetwork.binary.Profile;
import com.solvd.socialNetwork.binary.User;
import com.solvd.socialNetwork.utils.collections.linkedList.MyLinkedList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public interface UserService {

    void save(User user);

    List<User> getAllUsers();

    List<User> loadByUserName(String username);

    void updateUserName(Integer id, String userName);

    User getById(long id);

    void delete(User user);

    MyLinkedList<Profile> getProfileByUserId(long userId);

    MyLinkedList<Profile> getAllRelatedProfile();

    MyLinkedList<Friends> getFriendsByUserId(long id);

    MyLinkedList<Friends> getAllRelatedFriends();

    void updatePassword(Integer id, String password);

    void saveByXmlFile() throws IOException, ParserConfigurationException, SAXException;

    void saveByJsonFileList() throws IOException;

    void saveByJsonFile() throws IOException;

    void writeJsonFromDBInfo() throws IOException;
}
