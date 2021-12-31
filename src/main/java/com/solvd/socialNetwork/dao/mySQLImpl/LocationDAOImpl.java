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
    private static final String GET_COMPLETE_LOCATION_BY_INNER_JOIN = "SELECT * FROM country INNER JOIN\n" +
            "(states INNER JOIN cities ON states.cities_id=cities.id) ON tabla1.states_id=states.id";
    private final static String GET_CITY_BY_ID = "SELECT * FROM cities WHERE id=?";
    private final static String GET_COUNTRY_BY_ID = "SELECT * FROM countries WHERE id=?";
    private final static String GET_STATE_BY_ID = "SELECT * FROM states WHERE id=?";

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
                completeLocation = country.getName() + ", " + state.getName() + ", " + city.getName();
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

    @Override
    public void saveCity(Cities cities) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public Cities getCityById(long id) {
        Cities cities = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_CITY_BY_ID);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                cities = new Cities();
                cities.setId(rs.getLong("id"));
                cities.setName(rs.getString("username"));
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
        return cities    ;
    }

    @Override
    public void deleteCity(Cities cities) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public void saveCountry(Countries countries) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public Countries getCountryById(long id) {
        Countries countries = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_COUNTRY_BY_ID);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                countries = new Countries();
                countries.setId(rs.getLong("id"));
                countries.setName(rs.getString("username"));
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
        return countries    ;
    }

    @Override
    public void deleteCountry(Countries countries) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public void saveState(States states) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public States getStateById(long id) {
        States states = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_STATE_BY_ID);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                states = new States();
                states.setId(rs.getLong("id"));
                states.setName(rs.getString("username"));
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
        return states;
    }

    @Override
    public void deleteState(States states) {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
