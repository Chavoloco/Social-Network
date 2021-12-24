package com.solvd.socialNetwork.dao.interfaces;

public interface IEntityDAO <T>{

    void save(T t);

    T getById(long Id);
}
