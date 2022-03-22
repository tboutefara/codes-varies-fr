/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.exemplejpa.main;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
@Entity
@Table(name = "vehicules")
public class Vehicule {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int v_id;
    String matricule;
    String marque;
    String modele;
    String couleur;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "p_id")
    Personne personne;

    public Vehicule() {
    }

    public Vehicule(int id, String matricule, String marque, String modele, String couleur, Personne personne) {
        this.v_id = id;
        this.matricule = matricule;
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.personne = personne;
    }

    public int getV_id() {
        return v_id;
    }

    public void setV_id(int v_id) {
        this.v_id = v_id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    
    
    
}
