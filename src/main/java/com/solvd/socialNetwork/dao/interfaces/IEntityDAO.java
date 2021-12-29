package com.solvd.socialNetwork.dao.interfaces;

import com.solvd.socialNetwork.binary.User;

import java.util.List;

public interface IEntityDAO <T>{

    void save(T t);

    T getById(long Id);

    void delete(User u);

    List<User> getAll();
}
