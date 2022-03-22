/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.exemplejpa.main;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
@Entity
@Table(name = "personnes")
public class Personne {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int p_id;
    String nom;
    String prenom;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personne")
    List<Vehicule> vehicules;
    
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "personnes")
    List<Poste> postes;

    public Personne() {
    }

    public Personne(int id, String nom, String prenom) {
        this.p_id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }
    
    public List<Poste> getPostes() {
        return postes;
    }

    public void setPostes(List<Poste> postes) {
        this.postes = postes;
    }
    
}
