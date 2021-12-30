package com.solvd.socialNetwork.service.location.cities;

import com.solvd.socialNetwork.binary.Cities;

import java.util.List;

public interface CitiesService {

    void save(Cities cities);

    Cities getById(long Id);

    void delete(Cities cities);

    List<Cities> getAll();
}

