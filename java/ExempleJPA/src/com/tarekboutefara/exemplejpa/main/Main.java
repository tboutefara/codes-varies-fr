/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.exemplejpa.main;

import java.util.List;
import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("person_pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Personne p = new Personne(0, "Test", "Test");
        List<Vehicule> vehicles = Arrays.asList(
                new Vehicule(0, "123 118 18", "Dacia", "Logan", "Blanche", p)
        );
        Poste po = new Poste(0, "Enseignant");
        po.setPersonnes(Arrays.asList(p));
        List<Poste> postes = Arrays.asList(po);
        p.setPostes(postes);
        p.setVehicules(vehicles);
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
