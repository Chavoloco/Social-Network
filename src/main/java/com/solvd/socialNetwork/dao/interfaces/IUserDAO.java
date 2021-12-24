package com.solvd.socialNetwork.dao.interfaces;

import com.solvd.socialNetwork.binary.User;

public interface IUserDAO extends IEntityDAO<User> {

    void delete(User u);
}
