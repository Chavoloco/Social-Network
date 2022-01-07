package com.solvd.socialNetwork.dao.mySQLImpl;

import com.solvd.socialNetwork.binary.*;
import com.solvd.socialNetwork.dao.interfaces.AbstractDAO;
import com.solvd.socialNetwork.dao.interfaces.IBasicInfoDAO;
import com.solvd.socialNetwork.utils.collections.linkedList.MyLinkedList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BasicInfoDAOImpl extends AbstractDAO implements IBasicInfoDAO {
    private final static String INSERT_BASIC_INFO = "INSERT INTO basic_info(countries_id, school_id, jobs_id) VALUES(?,?,?)";

    @Override
    public void saveBasicInfoByJsonFile(BasicInfo basicInfo) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(INSERT_BASIC_INFO);
            ps.setLong(1, basicInfo.getId());
            ps.setLong(2, basicInfo.getLocationId());
            ps.setLong(3, basicInfo.getSchoolId());
            ps.setLong(4, basicInfo.getJobsId());
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
    public MyLinkedList<Location> getRelatedLocationByFriendId(long id) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public MyLinkedList<School> getRelatedSchoolByFriendId(long id) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public MyLinkedList<Jobs> getRelatedJobByFriendId(long id) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public void save(BasicInfo basicInfo) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public BasicInfo getById(long Id) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public void delete(BasicInfo basicInfo) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override
    public List<BasicInfo> getAll() {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
