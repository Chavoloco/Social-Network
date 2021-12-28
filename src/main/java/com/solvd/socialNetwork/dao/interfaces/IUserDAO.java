package com.solvd.socialNetwork.dao.interfaces;

import com.solvd.socialNetwork.binary.User;

import java.util.List;

public interface IUserDAO extends IEntityDAO<User> {

    void delete(User u);
    List<User> getAll();
    User getForUserName(String username);
    void updateUserName(Integer id, String userName);
}
