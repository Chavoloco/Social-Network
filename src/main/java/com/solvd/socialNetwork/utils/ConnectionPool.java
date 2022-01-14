package com.solvd.socialNetwork.utils;


import com.solvd.socialNetwork.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;


public class ConnectionPool {
    private static final Logger log = LogManager.getLogger(Main.class);

    private static ConnectionPool connectionPool;
    private final String DB = "database";
    private static int contAmount = 0;

    private static final int MAX_CONNECTIONS = 5;
    private static List<Connection> connections = new ArrayList<>(MAX_CONNECTIONS);


    private ConnectionPool() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ConnectionPool getInstance() {
        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
            return connectionPool;
        }
        return connectionPool;
    }

    public synchronized Connection getConnection() throws SQLException {
        Connection conn = null;
        if (connections.isEmpty()) {
                try {
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/social_network?" + "user=root&password=admin");
                    connections.add(conn);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            return connections.stream().findFirst().get();
        } else if (contAmount == MAX_CONNECTIONS) {
            for (int i = 0; i < MAX_CONNECTIONS; i++) {
                try {
                    Thread.sleep(1000);
                    if (!connections.isEmpty()) {
                        return connections.stream().findFirst().get();
                    }
                } catch (InterruptedException e) {
                    log.error("Thread error" + e.getStackTrace());
                }
            }
            throw new RuntimeException("");
        } else {
            contAmount++;
            return conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/social_network?" + "user=root&password=admin");
        }
    }

    // public Connection getConnection() {
    //     Connection conn = null;
    //   try {
    //    conn = DriverManager.getConnection("jdbc:mysql://localhost/social_network" + "user=root&password=admin");
    //    } catch (SQLException e) {
    //   e.printStackTrace();
    //    }
    //    return conn;
    //}

    public synchronized void returnConnection(Connection connection) {
        connections.add(connection);
    }

    public void getBack(Connection connection) {
        connections.add(connection);
    }
}

