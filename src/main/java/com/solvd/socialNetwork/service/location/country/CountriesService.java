package com.solvd.socialNetwork.service.location.country;

import com.solvd.socialNetwork.binary.Countries;

import java.util.List;

public interface CountriesService {

    void save(Countries countries);

    Countries getById(long Id);

    void delete(Countries countries);

    List<Countries> getAll();
}
