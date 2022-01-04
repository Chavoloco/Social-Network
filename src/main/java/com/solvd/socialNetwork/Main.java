package com.solvd.socialNetwork;

import com.solvd.socialNetwork.binary.User;
import com.solvd.socialNetwork.utils.ConnectionPool;
import com.solvd.socialNetwork.utils.parserDemo.DomParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {
    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args)  {


        ConnectionPool cp = ConnectionPool.getInstance();

        CompletableFuture<Void> thread1 = CompletableFuture
                .runAsync(() -> {
                    try {
                        cp.getConnection();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                });

        CompletableFuture<Void> thread2 = CompletableFuture
                .runAsync(() -> {
                    try {
                        cp.getConnection();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                });

        CompletableFuture<Void> thread3 = CompletableFuture
                .runAsync(() -> {
                    try {
                        cp.getConnection();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                });

        CompletableFuture<Void> thread4 = CompletableFuture
                .runAsync(() -> {
                    try {
                        cp.getConnection();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                });

        while (!thread1.isDone()) {

        }

        if (thread1.isDone()) {
            log.info("thread1 is done");
        }
    }
}
