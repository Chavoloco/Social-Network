package com.solvd.socialNetwork.dao.myBatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisDAOFactory {
    private final static MyBatisDAOFactory myBDF = new MyBatisDAOFactory();
    private static SqlSessionFactory ssf;

    private MyBatisDAOFactory(){
        try{
            Reader reader = Resources.getResourceAsReader("my-batis-config.xml");
            ssf = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSessionFactory(){
        return ssf;
    }
}
