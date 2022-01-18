package com.solvd.socialNetwork.dao.interfaces;

import com.solvd.socialNetwork.binary.Messages;

import java.util.List;

public interface IMessagesPoolDAO extends IEntityDAO<Messages> {
    List<Messages> getByUserId(long id);

}
