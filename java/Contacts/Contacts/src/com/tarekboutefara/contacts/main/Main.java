/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.contacts.main;

import com.tarekboutefara.contacts.dataaccess.DataAccessManager;
import com.tarekboutefara.contacts.dbdataaccess.DBDataAccess;
import com.tarekboutefara.contacts.gui.GUI;
import com.tarekboutefara.contacts.gui.MainFrame;
import com.tarekboutefara.contacts.model.Contacts;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataAccessManager.setDataAccess(new DBDataAccess());
        Contacts.initialiserListeContacts(DataAccessManager.getDataAccess().listePersonnes());
        GUI.mf = new MainFrame();
        GUI.mf.setVisible(true);
    }
    
}
