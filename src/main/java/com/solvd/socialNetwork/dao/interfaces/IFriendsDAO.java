package com.solvd.socialNetwork.dao.interfaces;

import com.solvd.socialNetwork.binary.Friends;

import java.util.List;

public interface IFriendsDAO extends IEntityDAO<Friends>{

    void updateNameById(long id, String name);

    void updateLastNameById(long id, String lastName);

    void saveFriendsByJsonFile(List<Friends> friendsList);

    void saveFriendsByJsonFile(Friends friends);
}
