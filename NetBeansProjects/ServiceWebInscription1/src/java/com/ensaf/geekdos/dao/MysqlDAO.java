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
public final class MysqlDAO extends DAO{
    
    public MysqlDAO(){
        this.setDriver("com.mysql.jdbc.Driver");
        this.setProvider("mysql");
        this.setType("jdbc");
        this.setHost("localhost");
        this.setPort("3306");
        this.setDatabase("ws_projet");
        this.setUser("root");
        this.setPassword("");
    }
}
