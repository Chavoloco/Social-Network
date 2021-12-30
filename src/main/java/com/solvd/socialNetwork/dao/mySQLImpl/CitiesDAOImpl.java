package com.solvd.socialNetwork.dao.mySQLImpl;

import com.solvd.socialNetwork.binary.Cities;
import com.solvd.socialNetwork.binary.Countries;
import com.solvd.socialNetwork.dao.interfaces.AbstractDAO;
import com.solvd.socialNetwork.dao.interfaces.ICitiesDAO;
import com.solvd.socialNetwork.dao.interfaces.ICountriesDAO;
import com.solvd.socialNetwork.dao.interfaces.IStatesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CitiesDAOImpl extends AbstractDAO implements ICitiesDAO {

    private final static String GET_CITY_BY_ID = "SELECT * FROM cities WHERE id=?";

    @Override
    public void save(Cities cities) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public Cities getById(long id) {
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
    public void delete(Cities cities) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public List<Cities> getAll() {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
