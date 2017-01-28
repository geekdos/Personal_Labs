package com.geekdos.model.DAO;

import java.sql.*;

/**
 * Created by theXuser on 06/12/2016.
 */
public class DAO {

    private static final String  DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String  DB_TYPE = "mysql";
    private static final String  DB_HOST = "localhost";
    private static final String  DB_PORT = "localhost";
    private static final String  DB_NAME = "noteManager";
    private static final String  DB_USER = "root";
    private static final String  DB_PASSWORD = "";
    private static Connection connection = null;
    private Statement statement = null;
    private String query;

    private DAO() {
        try {
            Class.forName(DB_DRIVER);
            this.connection.close();
            String url = "jdbc:"+DB_TYPE+"://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME;
            this.connection = DriverManager.getConnection(url,DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        if (connection == null)
            new DAO();
        return connection;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
