/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.contactsbdd.main;

import com.tarekboutefara.contactsbdd.dataaccess.DataAccess;
import com.tarekboutefara.contactsbdd.gui.GUI;
import com.tarekboutefara.contactsbdd.gui.MainFrame;
import com.tarekboutefara.contactsbdd.model.Contacts;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contacts.initialiserListeContacts(DataAccess.listePersonnes());
        GUI.mf = new MainFrame();
        GUI.mf.setVisible(true);
    }
    
}
