package com.solvd.socialNetwork.service.location.impl;

import com.solvd.socialNetwork.binary.Cities;
import com.solvd.socialNetwork.binary.Countries;
import com.solvd.socialNetwork.binary.Location;
import com.solvd.socialNetwork.binary.States;
import com.solvd.socialNetwork.dao.mySQLImpl.LocationDAOImpl;
import com.solvd.socialNetwork.service.location.LocationService;
import com.solvd.socialNetwork.utils.jaxbparser.JaxbLocationParser;

import javax.xml.bind.JAXBException;
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
        locationDAO.saveCity(cities);
    }

    @Override
    public Cities getCityById(long id) {
        return (Cities) locationDAO.getCityById(id);
    }

    @Override
    public void deleteCity(Cities cities) {
        locationDAO.deleteCity(cities);
    }

    @Override
    public void saveCountry(Countries countries) {
        locationDAO.saveCountry(countries);
    }

    @Override
    public Countries getCountryById(long id) {
        return (Countries) locationDAO.getCountryById(id);
    }

    @Override
    public void deleteCountry(Countries countries) {
        locationDAO.deleteCountry(countries);
    }

    @Override
    public void saveState(States states) {
        locationDAO.saveState(states);
    }

    @Override
    public States getStateById(long id) {
        return (States) locationDAO.getStateById(id);
    }

    @Override
    public void deleteState(States states) {
        locationDAO.deleteState(states);
    }

    @Override
    public void saveFromXml() throws JAXBException {
        JaxbLocationParser jaxb = null;
        locationDAO.saveFromJaxb(jaxb.readXmlLocationFile());
    }

    @Override
    public void writeXmlFromDb() throws JAXBException {
        JaxbLocationParser jaxb = null;
        jaxb.writeAXmlLocationFile(locationDAO.readLocationsFromDb());
    }
}
