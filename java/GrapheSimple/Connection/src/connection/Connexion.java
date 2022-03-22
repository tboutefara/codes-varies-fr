/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class Connexion {
    
    public  void inserer(String nom, String prenom){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        
      Connection c;
            try {
                c = DriverManager.getConnection("jdbc:mysql://localhost/database1", "root", "");
                Statement s =c.createStatement();
        String requete = 
                "INSERT INTO `etudiant` (`id`, `nom`, `prenom`) VALUES (NULL, '"+nom+"', '"+prenom+"')";
                System.out.println(requete);
        int r =s.executeUpdate(requete);
        System.out.println("Enregistrement ajout :"+r);
            } catch (SQLException ex) {
                Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public  void selectionner(){
         
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection c;
             
             try {
                 c = DriverManager.getConnection("jdbc:mysql://localhost/database1","root","");
             
             
             Statement s = c.createStatement();
             String requete = "Select * from etudiant";
             ResultSet r=s.executeQuery(requete);
             System.out.println("Id\tNom\tPrenom");
             while(r.next()){
                int id= r.getInt("id");
                String nom= r.getString("nom");
                String prenom =r.getString("prenom");
                 System.out.println(id +"\t"+nom+"\t"+prenom);
                 
             }
             } catch (SQLException ex) {
                 Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
             }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
         }
          
         
     }
    
}
