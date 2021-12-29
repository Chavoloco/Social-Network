package com.solvd.socialNetwork.dao.mySQLImpl;

import com.solvd.socialNetwork.binary.Friends;
import com.solvd.socialNetwork.binary.User;
import com.solvd.socialNetwork.dao.interfaces.AbstractDAO;
import com.solvd.socialNetwork.dao.interfaces.IFriendsDAO;
import com.solvd.socialNetwork.utils.collections.MyLinkedList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FriendsDAOImpl extends AbstractDAO implements IFriendsDAO {
    private final static String GET_FRIEND_BY_ID = "SELECT * FROM user WHERE id=?";
    private final static String INSERT_FRIEND = "INSERT INTO friends(name, last_name, basic_info_id) VALUES(?,?,?)";

    @Override
    public void save(Friends friend) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(INSERT_FRIEND);
            ps.setLong(1, friend.getId());
            ps.setString(2, friend.getName());
            ps.setString(3, friend.getLastName());
            ps.setLong(4, friend.getBasicInfoId());
            ps.executeUpdate();
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
    }

    @Override
    public Friends getById(long id) {
        Friends friends = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_FRIEND_BY_ID);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                friends = new Friends();
                friends.setId(rs.getLong("id"));
                friends.setName(rs.getString("name"));
                friends.setLastName(rs.getString("last_name"));
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
        return friends;
    }

    @Override
    public void delete(User u) {
        throw new UnsupportedOperationException("Operation is not supported");
    }

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Operation is not supported");
    }

    @Override
    public void updateNameById(long id, String name) {
        throw new UnsupportedOperationException("Operation is not supported");
    }

    @Override
    public void updateLastNameById(long id, String lastName) {
        throw new UnsupportedOperationException("Operation is not supported");
    }
}
