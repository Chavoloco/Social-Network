package com.solvd.socialNetwork.dao.mySQLImpl;

import com.solvd.socialNetwork.binary.Friends;
import com.solvd.socialNetwork.binary.Profile;
import com.solvd.socialNetwork.binary.User;
import com.solvd.socialNetwork.dao.interfaces.AbstractDAO;
import com.solvd.socialNetwork.dao.interfaces.IUserDAO;
import com.solvd.socialNetwork.utils.collections.linkedList.MyLinkedList;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl extends AbstractDAO implements IUserDAO {
    private final static String GET_USER_BY_ID = "SELECT * FROM user WHERE id=?";
    private final static String GET_USER_BY_USERNAME = "SELECT * FROM user WHERE username=?";
    private final static String GET_USER_ALL = "SELECT * FROM user";
    private final static String UPDATE_USER_BY_ID = "UPDATE USER SET user_name WHERE id=?";
    private final static String INNER_JOIN_BY_ID = "SELECT u.id, p.profile_details FROM user u\n" +
            "INNER JOIN profile p ON u.profile_id = p.id\n" +
            "WHERE u.id=?";
    private final static String INNER_JOIN_ALL = "SELECT u.id, p.profile_details FROM user u\n" +
            "INNER JOIN profile p ON u.profile_id = p.id\n";
    private final static String INSERT_USER = "INSERT INTO user(userName, password, profileId, friendId) VALUES(?,?,?,?)";

    @Override
    public void saveByXmlFile(List<User> userList) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(INSERT_USER);

            for (User user :  userList) {
                ps.setLong(1, user.getId());
                ps.setString(2, user.getUserName());
                ps.setString(3, user.getPassword());
                ps.setLong(4, user.getProfileId());
                ps.setLong(5, user.getFriendId());
                ps.executeUpdate();
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
    public void save(User user) {
        throw new UnsupportedOperationException("Operation is not supported");
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
            rs = ps.executeQuery();
            while (rs.next()) {
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
    public List<User> getForUserName(String username) {
        List<User> userList = new ArrayList<>();
        User user = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_USER_BY_USERNAME);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
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
        }
        return userList;
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
        throw new UnsupportedOperationException("Operation is not supported");
    }

    @Override
    public MyLinkedList<Profile> getProfileByUserId(long userId) {
        MyLinkedList<Profile> profileList = new MyLinkedList<>();
        User user = null;
        Profile profile = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(INNER_JOIN_BY_ID);
            ps.setLong(1, userId);
            rs = ps.executeQuery();
            if (rs.next()) {
                user = new User();
                profile = new Profile();
                user.setId(rs.getLong("id"));
                profile.setId(rs.getLong("id"));
                profile.setProfileDetails(rs.getString("profile_datails"));
                profileList.add(user.getId(), profile);
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
        return profileList;
    }

    @Override
    public MyLinkedList<Friends> getFriendsByUserId(long id) {
        throw new UnsupportedOperationException("Operation is not supported");
    }

    @Override
    public MyLinkedList<Profile> getAllRelatedProfile() {
        MyLinkedList<Profile> profileList = new MyLinkedList<>();
        User user = null;
        Profile profile = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(INNER_JOIN_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                user = new User();
                profile = new Profile();
                user.setId(rs.getLong("id"));
                profile.setId(rs.getLong("id"));
                profile.setProfileDetails(rs.getString("profile_details"));
                profileList.add(user.getId(), profile);
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
        return profileList;
    }

    @Override
    public MyLinkedList<Friends> getAllRelatedFriends() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public void updatePassword(Integer id, String password) {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
