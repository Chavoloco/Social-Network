package com.solvd.socialNetwork.service.location.states.impl;

import com.solvd.socialNetwork.binary.States;
import com.solvd.socialNetwork.dao.mySQLImpl.StatesDAOImpl;
import com.solvd.socialNetwork.service.location.states.StatesService;

import java.util.List;

public class StatesServiceImpl implements StatesService {

    StatesDAOImpl statesDAO;

    @Override
    public void save(States states) {
        statesDAO.save(states);
    }

    @Override
    public States getById(long id) {
        return statesDAO.getById(id);
    }

    @Override
    public void delete(States states) {
        statesDAO.delete(states);
    }

    @Override
    public List<States> getAll() {
        return statesDAO.getAll();
    }
}
