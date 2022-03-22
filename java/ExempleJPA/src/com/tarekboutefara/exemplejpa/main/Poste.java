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
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
@Entity
@Table(name = "postes")
public class Poste {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int o_id;
    String appelation;
    
    @ManyToMany(cascade = CascadeType.ALL)
    List<Personne> personnes;

    public Poste() {
    }

    public Poste(int o_id, String appelation) {
        this.o_id = o_id;
        this.appelation = appelation;
    }

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public String getAppelation() {
        return appelation;
    }

    public void setAppelation(String appelation) {
        this.appelation = appelation;
    }

    public List<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(List<Personne> personnes) {
        this.personnes = personnes;
    }
    
    
    
}
