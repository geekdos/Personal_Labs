/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geekdos.models;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author theXuser
 */
public abstract class Model {
    private Statement statement;
    private ResultSet resultSet;

    /**
     *
     * @return
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     *
     * @param statement
     */
    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    /**
     *
     * @return
     */
    public ResultSet getResultSet() {
        return resultSet;
    }

    /**
     *
     * @param resultSet
     */
    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    /**
     *
     * @return
     */
    public abstract List getAll();

    /**
     *
     * @return
     */
    public abstract int save();

    /**
     *
     * @param id
     * @return
     */
    public abstract Object getElementById(int id);

    /**
     *
     * @param id
     * @return
     */
    public abstract int updateElementById(int id);

    /**
     *
     * @param id
     * @return
     */
    public abstract int deleteElementById(int id);
}
