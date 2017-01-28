package com.geekdos.model.DAO;

import java.sql.ResultSet;

/**
 * Created by theXuser on 11/12/2016.
 */
public interface DAOInterface {

    public void destroy(int id);
    public ResultSet selectAllFrom(String table);
    public ResultSet selectById(String table, int id);
}
