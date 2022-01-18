package com.solvd.socialNetwork.dao.mySQLImpl;

import com.solvd.socialNetwork.binary.Messages;
import com.solvd.socialNetwork.dao.interfaces.AbstractDAO;
import com.solvd.socialNetwork.dao.interfaces.IMessagesDAO;

import java.util.List;

public class MessagesDaoImpl extends AbstractDAO implements IMessagesDAO {
    @Override
    public void save(Messages messages) {
        throw new UnsupportedOperationException("Operation is no supported");
    }

    @Override
    public Messages getById(long Id) {
        throw new UnsupportedOperationException("Operation is no supported");
    }

    @Override
    public void delete(Messages messages) {
        throw new UnsupportedOperationException("Operation is no supported");
    }

    @Override
    public List<Messages> getAll() {
        throw new UnsupportedOperationException("Operation is no supported");
    }
}
