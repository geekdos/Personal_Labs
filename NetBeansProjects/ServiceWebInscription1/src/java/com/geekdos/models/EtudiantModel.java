/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geekdos.models;

import com.ensaf.geekdos.beans.Etudiant;
import com.ensaf.geekdos.beans.Filiere;
import com.ensaf.geekdos.dao.MysqlDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author theXuser
 */
public class EtudiantModel extends Model{
    private Etudiant etudiant;
    private MysqlDAO mysqlDAO = new MysqlDAO();
    private Connection connection;

    public EtudiantModel() throws SQLException, ClassNotFoundException {
        this.connection = this.mysqlDAO.getConnection();
        this.etudiant = new Etudiant();
    }
    
    public EtudiantModel(String nom, String prenom, String cne, String niveau, Filiere filiere) throws SQLException, ClassNotFoundException {
        this.etudiant.setNom(nom);
        this.etudiant.setPrenom(prenom);
        this.etudiant.setCne(cne);
        this.etudiant.setNiveau(niveau);
        this.etudiant.setFiliere(filiere);
        this.connection = this.mysqlDAO.getConnection();
    }
   
    @Override
    public List<Etudiant> getAll() {
        List<Etudiant> etudiants = new ArrayList<>();
        try {
            
            //System.out.println(this.connection);
            this.setStatement(this.connection.createStatement());
            String sql = "SELECT * FROM `etudiant` WHERE 1";
            this.setResultSet(this.getStatement().executeQuery(sql));
            while(this.getResultSet().next()){
                this.etudiant.setNom(this.getResultSet().getString("nom"));
                this.etudiant.setPrenom(this.getResultSet().getString("prenom"));
                this.etudiant.setCne(this.getResultSet().getString("cne"));
                this.etudiant.setNiveau(this.getResultSet().getString("niveau"));
                this.etudiant.setFiliere(this.getFiliere(this.getResultSet().getInt("id_filiere")));
                
                etudiants.add(this.etudiant);
            }            
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return etudiants;
    }

    @Override
    public int save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getElementById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateElementById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteElementById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Filiere getFiliere(int id) throws SQLException{
        String sql = "SELECT `id`, `titre` FROM `filiere` WHERE `id` = "+id;
        Filiere filiere = new Filiere();
        this.setStatement(connection.createStatement());
        this.setResultSet(this.getStatement().executeQuery(sql));
        while(this.getResultSet().next()){
           filiere.setId(this.getResultSet().getInt("id"));
           filiere.setLebele(this.getResultSet().getString("titre"));
        }
        return filiere;
    }
}
