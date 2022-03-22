/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.exemplemsaccess.main;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://./exemple.accdb");
            
            String requeteSuppression = "Delete From Personne";
            Statement statementSuppression = connection.createStatement();
            int intS = statementSuppression.executeUpdate(requeteSuppression);
            
            System.out.println(intS + " ligne(s) supprimée(s)");
            
            String requeteInsertion = "Insert into Personne Values (1, 'Test', 'Test')";
            Statement statementInsertion = connection.createStatement();
            int intR = statementInsertion.executeUpdate(requeteInsertion);
            
            System.out.println(intR + " ligne(s) insérée(s)");
            
            String requeteSelection = "Select * from Personne";
            Statement statementSelection = connection.createStatement();
            ResultSet rsR = statementSelection.executeQuery(requeteSelection);
            
            while(rsR.next()){
                System.out.printf("%d\t%s\t%s\n", rsR.getInt("id"), rsR.getString("nom"), rsR.getString("prenom"));
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erreur");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("Erreur");
            ex.printStackTrace();
        }
        
    }
    
}
