package com.geekdos.model.DAO;

import com.geekdos.model.Etudiant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by theXuser on 11/12/2016.
 */
public class EtudianDAO implements DAOInterface {
    Statement statement = null;
    ResultSet resultSet = null;

    public EtudianDAO() {
        try {
            this.statement = DAO.getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save(Etudiant etudiant) {
        String query = "INSERT INTO students ('first', 'last', 'age', 'cne') VALUES(";
        query += "'" + etudiant.getPrenom() + "', '" + etudiant.getNom() + "', '" + etudiant.getAge() + "', '" + etudiant.getCne() + "');";
        try {
            this.statement.execute(query);
            System.out.println("L'etudiant " + etudiant.getNom() + " est bien save dans la BD");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy(int id) {

    }

    @Override
    public ResultSet selectAllFrom(String table) {
        table = "etudiants";
        String query = "SELECT * FROM " + table + "ORDER BY id DESC";
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    @Override
    public ResultSet selectById(String table, int id) {
        table = "etudiants";
        String query = "SELECT * FROM " + table + " WHERE id = " + id;
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
