package com.solvd.socialNetwork.dao.interfaces;

import com.solvd.socialNetwork.binary.*;

import java.util.List;

public interface ILocationDAO extends IEntityDAO<Location> {

    List<Countries> getAllCountries();

    List<States> getAllStatesByCountryId();

    List<Cities> getAllCitiesByStateId();

    String getCompleteLocation();

    void saveCity(Cities cities);

    Cities getCityById(long Id);

    void deleteCity(Cities cities);

    void saveCountry(Countries countries);

    Countries getCountryById(long Id);

    void deleteCountry(Countries countries);

    void saveState(States states);

    States getStateById(long Id);

    void deleteState(States states);

    void saveFromJaxb(LocationList locations);

    LocationList readLocationsFromDb();
}
