package com.solvd.socialNetwork.service.location.country.impl;

import com.solvd.socialNetwork.binary.Countries;
import com.solvd.socialNetwork.dao.mySQLImpl.CountriesDAOImpl;
import com.solvd.socialNetwork.service.location.country.CountriesService;

import java.util.List;

public class CountriesServiceImpl implements CountriesService {
    CountriesDAOImpl countriesDAO;

    @Override
    public void save(Countries countries) {
        countriesDAO.save(countries);
    }

    @Override
    public Countries getById(long id) {
        return countriesDAO.getById(id);
    }

    @Override
    public void delete(Countries countries) {
        countriesDAO.delete(countries);
    }

    @Override
    public List<Countries> getAll() {
        return countriesDAO.getAll();
    }
}
