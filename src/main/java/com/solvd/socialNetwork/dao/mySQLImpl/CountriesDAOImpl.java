package com.solvd.socialNetwork.dao.mySQLImpl;

import com.solvd.socialNetwork.binary.Countries;
import com.solvd.socialNetwork.binary.User;
import com.solvd.socialNetwork.dao.interfaces.AbstractDAO;
import com.solvd.socialNetwork.dao.interfaces.ICountriesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CountriesDAOImpl extends AbstractDAO implements ICountriesDAO {

    private final static String GET_COUNTRY_BY_ID = "SELECT * FROM countries WHERE id=?";

    @Override
    public void save(Countries countries) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public Countries getById(long id) {
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
    public void delete(Countries countries) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public List<Countries> getAll() {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
