package com.solvd.socialNetwork.service.location.cities.impl;

import com.solvd.socialNetwork.binary.Cities;
import com.solvd.socialNetwork.dao.mySQLImpl.CitiesDAOImpl;
import com.solvd.socialNetwork.service.location.cities.CitiesService;

import java.util.List;

public class CitiesServiceImpl implements CitiesService {
    CitiesDAOImpl citiesDAO;

    @Override
    public void save(Cities cities) {
        citiesDAO.save(cities);
    }

    @Override
    public Cities getById(long id) {
        return citiesDAO.getById(id);
    }

    @Override
    public void delete(Cities cities) {
        citiesDAO.delete(cities);
    }

    @Override
    public List<Cities> getAll() {
        return citiesDAO.getAll();
    }
}
