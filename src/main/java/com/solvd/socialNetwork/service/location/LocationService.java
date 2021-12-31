package com.solvd.socialNetwork.service.location;

import com.solvd.socialNetwork.binary.Cities;
import com.solvd.socialNetwork.binary.Countries;
import com.solvd.socialNetwork.binary.Location;
import com.solvd.socialNetwork.binary.States;

import java.util.List;

public interface LocationService {

    void save(Location location);

    Location getById(long id);

    void delete(Location location);

    List<Location> getAll();

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

}
