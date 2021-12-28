package com.solvd.socialNetwork.dao.mySQLImpl;

import com.solvd.socialNetwork.binary.User;
import com.solvd.socialNetwork.dao.interfaces.AbstractDAO;
import com.solvd.socialNetwork.dao.interfaces.IUserDAO;

import javax.naming.OperationNotSupportedException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl extends AbstractDAO implements IUserDAO {
    private final static String GET_USER_BY_ID = "SELECT * FROM user WHERE id=?";
    private final static String GET_USER_BY_USERNAME = "SELECT * FROM user WHERE username=?";
    private final static String GET_USER_ALL = "SELECT * FROM user";
    private final static String UPDATE_USER_BY_ID = "UPDATE USER SET user_name WHERE id=?";

    @Override
    public void save(User user) {
        throw new RuntimeException("Operation is not supported");
    }

    @Override
    public List<User> getAll() {
        User user = null;
        List<User> userList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_USER_ALL);
            //ps.setArray(1, (Array) userList);
            rs = ps.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(rs.getLong("id"));
                user.setUserName(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                userList.add(user);
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
            return userList;
        }
    }

    @Override
    public User getForUserName(String username) {
        User user = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_USER_BY_USERNAME);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(rs.getLong("id"));
                user.setUserName(rs.getString("username"));
                user.setPassword(rs.getString("password"));
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
        return user;
    }

    @Override
    public void updateUserName(Integer id, String userName) {
        User user = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(UPDATE_USER_BY_ID);
            ps.setLong(1, id);
            ps.setString(1, userName);
            rs = ps.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(rs.getLong("id"));
                user.setUserName(rs.getString("username"));
                user.setPassword(rs.getString("password"));
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
    }

    @Override
    public User getById(long id) {
        User user = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_USER_BY_ID);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(rs.getLong("id"));
                user.setUserName(rs.getString("username"));
                user.setPassword(rs.getString("password"));
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
        return user;
    }

    @Override
    public void delete(User u) {
        throw new RuntimeException("Operation is not supported");
    }
}
