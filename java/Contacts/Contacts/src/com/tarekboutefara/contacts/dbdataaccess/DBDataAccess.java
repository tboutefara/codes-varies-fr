/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.contacts.dbdataaccess;

import com.tarekboutefara.contacts.dataaccess.DataAccess;
import com.tarekboutefara.contacts.model.Personne;
import com.tarekboutefara.contacts.model.PersonneBuilder;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class DBDataAccess implements DataAccess {
    
    private static Connection connection;
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        if(connection == null){
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/contacts");
        }
        return connection;
    }

    @Override
    public List<Personne> listePersonnes() {
        try {
            String requete = "Select * from Personne";
            
            Statement statement = getConnection().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            List<Personne> liste = new ArrayList<>();
            
            while(resultat.next()){
                Personne p = PersonneBuilder.creerNouveau()
                        .avecCode(resultat.getInt("code"))
                        .avecNom(resultat.getString("nom"))
                        .avecPrenom(resultat.getString("prenom"))
                        .avecAdresse(resultat.getString("adresse"))
                        .avecNTel(resultat.getString("ntel"))
                        .creerReduit();
                
                liste.add(p);
            }
            
            return liste;
            
        } catch (SQLException ex) {
            return null;
        } catch (ClassNotFoundException ex) {
            return null;
        }
    }

    @Override
    public Personne unePersonneParCode(int code) {

        try {
            String requete = "Select * from Personne Where code = " + code;
            
            Statement statement = getConnection().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            
            
            Personne p = null;
            
            if(resultat.next()){
                p = PersonneBuilder.creerNouveau()
                        .avecCode(resultat.getInt("code"))
                        .avecNom(resultat.getString("nom"))
                        .avecPrenom(resultat.getString("prenom"))
                        .avecAdresse(resultat.getString("adresse"))
                        .avecNTel(resultat.getString("ntel"))
                        .creerReduit();
                
                
            }
            
            return p;
            
        } catch (SQLException ex) {
            return null;
        } catch (ClassNotFoundException ex) {
            return null;
        }
        
        
    }

    @Override
    public void sauverPersonne(Personne p) {

        try {
            String requete = "Insert into Personne (code, nom, prenom, adresse, ntel) "
                    + "Values (?, ?, ?, ?, ?)";
            
            PreparedStatement statement = getConnection().prepareStatement(requete);
            
            statement.setInt(1, p.getCode());
            statement.setString(2, p.getNom());
            statement.setString(3, p.getPrenom());
            statement.setString(4, p.getAdresse());
            statement.setString(5, p.getnTel());
            
            statement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void mettreAJourPersonne(Personne p) {

        try {
            String requete = "Update Personne Set "
                    + "nom = ?, "
                    + "prenom = ?, "
                    + "adresse = ?, "
                    + "ntel = ? "
                    + "Where code = ?";
            
            PreparedStatement statement = getConnection().prepareStatement(requete);
            
            statement.setString(1, p.getNom());
            statement.setString(2, p.getPrenom());
            statement.setString(3, p.getAdresse());
            statement.setString(4, p.getnTel());
            statement.setInt(5, p.getCode());
            
            statement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void supprimerPersonne(Personne p) {

        try {
            String requete = "Delete from Personne Where code  = ?";
            
            PreparedStatement statement = getConnection().prepareStatement(requete);
            
            statement.setInt(1, p.getCode());
            
            statement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
    
}
