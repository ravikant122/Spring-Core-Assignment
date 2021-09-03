package com.TraineeMgt.dao.factory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnectionFactory {
    private static Connection  connection=null;
   
    private DBConnectionFactory() {}
   
    public static Connection getConnection() {
       
        InputStream is=DBConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
       
               
        Properties properties=new Properties();
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
       
        String url=properties.getProperty("jdbc.url");
        String driverName=properties.getProperty("jdbc.driverName");
        String username=properties.getProperty("jdbc.username");
        String password=properties.getProperty("jdbc.password");
       
        //load the driver
        try {
            Class.forName(driverName);
        }catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            connection=DriverManager.getConnection(url, username, password);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
        return connection;
       
    }
}
