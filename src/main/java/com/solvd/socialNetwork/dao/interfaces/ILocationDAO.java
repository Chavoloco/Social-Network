package com.solvd.socialNetwork.dao.interfaces;

import com.solvd.socialNetwork.binary.Cities;
import com.solvd.socialNetwork.binary.Countries;
import com.solvd.socialNetwork.binary.Location;
import com.solvd.socialNetwork.binary.States;

import java.util.List;

public interface ILocationDAO extends IEntityDAO<Location> {

    List<Countries> getAllCountries();

    List<States> getAllStatesByCountryId();

    List<Cities> getAllCitiesByStateId();

    String getCompleteLocation();
}
