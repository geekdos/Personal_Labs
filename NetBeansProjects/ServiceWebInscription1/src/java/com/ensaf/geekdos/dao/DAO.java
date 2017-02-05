/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensaf.geekdos.dao;

import java.sql.*;

/**
 *
 * @author theXuser
 */
public abstract class DAO {

    private static Connection connection = null;
    private String driver;
    private String host;
    private String database;
    private String port;
    private String provider;
    private String type;
    private String url;
    private String user;
    private String password;
    private String query;
    protected DAO() {}

    /** 
     * This is the getConnection()
     * this is singleton class
     * @return Connection
     * @throws java.sql.SQLException
     */
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        System.out.println("The conection has been done");
        if(connection == null){
            Class.forName(driver);
            connection = DriverManager.getConnection(this.getUrl(), user, password);
        }
        return connection;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        this.url = this.type+":"+this.provider+"://"+this.host+":"+this.port+"/"+this.database;
        return url;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }    
}
