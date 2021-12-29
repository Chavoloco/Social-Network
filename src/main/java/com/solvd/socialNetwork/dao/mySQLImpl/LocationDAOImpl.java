package com.solvd.socialNetwork.dao.mySQLImpl;

import com.solvd.socialNetwork.binary.*;
import com.solvd.socialNetwork.dao.interfaces.AbstractDAO;
import com.solvd.socialNetwork.dao.interfaces.ILocationDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LocationDAOImpl extends AbstractDAO implements ILocationDAO {
    private static final String  GET_COMPLETE_LOCATION_BY_INNER_JOIN = "SELECT * FROM country INNER JOIN\n"+
            "(states INNER JOIN cities ON states.cities_id=cities.id) ON tabla1.states_id=states.id";

    @Override
    public void save(Location location) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public Location getById(long Id) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public void delete(Location location) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public List<Location> getAll() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public List<Countries> getAllCountries() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public List<States> getAllStatesByCountryId() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public List<Cities> getAllCitiesByStateId() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public String getCompleteLocation() {
        Location country;
        Location state;
        Location city;
        String completeLocation = "";
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_COMPLETE_LOCATION_BY_INNER_JOIN);
            rs = ps.executeQuery();
            if (rs.next()) {
                country = new Countries();
                state = new States();
                city = new Cities();
                country.setId(rs.getLong("id"));
                state.setId(rs.getLong("id"));
                city.setId(rs.getLong("id"));
                country.setName(rs.getString("name"));
                state.setName(rs.getString("name"));
                city.setName(rs.getString("name"));
                completeLocation = country.getName()+", "+state.getName()+", "+ city.getName();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            realiseConnection(connection);
            try {
                if (rs != null && ps != null) {
                    rs.close();
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return completeLocation;
    }
}
