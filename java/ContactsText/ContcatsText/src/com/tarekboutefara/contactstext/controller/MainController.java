/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.contactstext.controller;

import com.tarekboutefara.contactstext.dataaccess.DataAccess;
import com.tarekboutefara.contactstext.gui.GUI;
import com.tarekboutefara.contactstext.model.Contacts;
import com.tarekboutefara.contactstext.model.Personne;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class MainController {

    public static void mettreAJour(int courrant) {
        DataAccess.mettreAJourPersonne(Contacts.listeContacts().get(courrant));
        GUI.mf.actualiser();
    }

    public static void sauver(Personne p) {
        DataAccess.sauverPersonne(p);
        Contacts.listeContacts().add(p);
        GUI.mf.actualiser();
    }

    public static void supprimer(int courrant) {
        DataAccess.supprimerPersonne(Contacts.listeContacts().get(courrant));
        Contacts.listeContacts().remove(courrant);
        GUI.mf.actualiser();
    }
    
}
