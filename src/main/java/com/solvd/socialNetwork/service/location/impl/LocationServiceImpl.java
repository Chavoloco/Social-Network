package com.solvd.socialNetwork.service.location.impl;

import com.solvd.socialNetwork.binary.Cities;
import com.solvd.socialNetwork.binary.Countries;
import com.solvd.socialNetwork.binary.Location;
import com.solvd.socialNetwork.binary.States;
import com.solvd.socialNetwork.dao.mySQLImpl.LocationDAOImpl;
import com.solvd.socialNetwork.service.location.LocationService;

import java.util.List;

public class LocationServiceImpl implements LocationService {

    LocationDAOImpl locationDAO;

    @Override
    public void save(Location location) {
        locationDAO.save(location);
    }

    @Override
    public Location getById(long id) {
        return locationDAO.getById(id);
    }

    @Override
    public void delete(Location location) {
        locationDAO.delete(location);
    }

    @Override
    public List<Location> getAll() {
        return locationDAO.getAll();
    }

    @Override
    public List<Countries> getAllCountries() {
        return locationDAO.getAllCountries();
    }

    @Override
    public List<States> getAllStatesByCountryId() {
        return locationDAO.getAllStatesByCountryId();
    }

    @Override
    public List<Cities> getAllCitiesByStateId() {
        return locationDAO.getAllCitiesByStateId();
    }

    @Override
    public String getCompleteLocation() {
        return locationDAO.getCompleteLocation();
    }

    @Override
    public void saveCity(Cities cities) {
        locationDAO.save(cities);
    }

    @Override
    public Cities getCityById(long id) {
        return (Cities) locationDAO.getById(id);
    }

    @Override
    public void deleteCity(Cities cities) {
        locationDAO.delete(cities);
    }

    @Override
    public void saveCountry(Countries countries) {
        locationDAO.save(countries);
    }

    @Override
    public Countries getCountryById(long id) {
        return (Countries) locationDAO.getById(id);
    }

    @Override
    public void deleteCountry(Countries countries) {
        locationDAO.delete(countries);
    }

    @Override
    public void saveState(States states) {
        locationDAO.save(states);
    }

    @Override
    public States getStateById(long id) {
        return (States) locationDAO.getById(id);
    }

    @Override
    public void deleteState(States states) {
        locationDAO.delete(states);
    }
}
