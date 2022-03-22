/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.contacts.controller;

import com.tarekboutefara.contacts.dataaccess.DataAccess;
import com.tarekboutefara.contacts.dataaccess.DataAccessManager;
import com.tarekboutefara.contacts.gui.GUI;
import com.tarekboutefara.contacts.model.Contacts;
import com.tarekboutefara.contacts.model.Personne;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class MainController {

    public static void mettreAJour(int courrant) {
        DataAccessManager.getDataAccess().mettreAJourPersonne(Contacts.listeContacts().get(courrant));
        GUI.mf.actualiser();
    }

    public static void sauver(Personne p) {
        DataAccessManager.getDataAccess().sauverPersonne(p);
        Contacts.listeContacts().add(p);
        GUI.mf.actualiser();
    }

    public static void supprimer(int courrant) {
        DataAccessManager.getDataAccess().supprimerPersonne(Contacts.listeContacts().get(courrant));
        Contacts.listeContacts().remove(courrant);
        GUI.mf.actualiser();
    }
    
}
