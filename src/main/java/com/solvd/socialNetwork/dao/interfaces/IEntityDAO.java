package com.solvd.socialNetwork.dao.interfaces;

import com.solvd.socialNetwork.binary.Friends;
import com.solvd.socialNetwork.binary.User;

import java.util.List;

public interface IEntityDAO <T>{

    void save(T t);

    T getById(long Id);

    void delete(T t);

    List<T> getAll();
}
