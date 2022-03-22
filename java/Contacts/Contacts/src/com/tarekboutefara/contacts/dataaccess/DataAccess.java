/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.contacts.dataaccess;

import com.tarekboutefara.contacts.model.Personne;
import java.util.List;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public interface DataAccess {

    List<Personne> listePersonnes();

    void mettreAJourPersonne(Personne p);

    void sauverPersonne(Personne p);

    void supprimerPersonne(Personne p);

    Personne unePersonneParCode(int code);
    
}
