package com.solvd.socialNetwork.service.location.states;

import com.solvd.socialNetwork.binary.States;

import java.util.List;

public interface StatesService {

    void save(States states);

    States getById(long Id);

    void delete(States states);

    List<States> getAll();
}
