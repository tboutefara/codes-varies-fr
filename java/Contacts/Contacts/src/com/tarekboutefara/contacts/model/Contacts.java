/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.contacts.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class Contacts {
    
    private static List<Personne> personnes;
    
    public static List<Personne> listeContacts(){
        if(personnes == null)
            personnes = new ArrayList<>();
        
        return personnes;
    }
    
    public static void initialiserListeContacts(List<Personne> liste){
        personnes = liste;
    }
    
}
