package com.solvd.socialNetwork.dao.mySQLImpl;

import com.solvd.socialNetwork.binary.Countries;
import com.solvd.socialNetwork.binary.States;
import com.solvd.socialNetwork.dao.interfaces.AbstractDAO;
import com.solvd.socialNetwork.dao.interfaces.ICountriesDAO;
import com.solvd.socialNetwork.dao.interfaces.IStatesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StatesDAOImpl extends AbstractDAO implements IStatesDAO {

    private final static String GET_STATE_BY_ID = "SELECT * FROM states WHERE id=?";

    @Override
    public void save(States states) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public States getById(long id) {
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
    public void delete(States states) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public List<States> getAll() {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
