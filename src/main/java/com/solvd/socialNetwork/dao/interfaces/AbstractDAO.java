package com.solvd.socialNetwork.dao.interfaces;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import com.solvd.socialNetwork.utils.ConnectionPool;

import javax.sql.ConnectionPoolDataSource;
import java.sql.Connection;

public abstract class AbstractDAO {
    private ConnectionPool connectionPool = ConnectionPool.getInstance();

    public Connection getCon() {
        return connectionPool.getConnection();
    }

    public void realiseConnection(Connection connection) {
        connectionPool.getBack(connection);
    }
}
