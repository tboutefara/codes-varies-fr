/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.contactstext.dataaccess;

import com.tarekboutefara.contactstext.model.Personne;
import com.tarekboutefara.contactstext.model.PersonneBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class DataAccess {

    private static List<Personne> cache;
    private static final String FICHIER = "donnees.txt";

    public static List<Personne> listePersonnes() {
        try {
            chargerFichierDonnees();
            return cache;
        } catch (IOException ex) {
            return null;
        }
    }

    public static Personne unePersonneParCode(int code) {

        try {
            chargerFichierDonnees();
        } catch (IOException ex) {
            return null;
        }

        int i = 0;
        Personne p = null;

        while (i < cache.size() && p == null) {
            if (cache.get(i).getCode() == code) {
                p = cache.get(i);
            } else {
                i++;
            }
        }

        return p;
    }

    public static void sauverPersonne(Personne p) {

        try {
            chargerFichierDonnees();
        } catch (IOException ex) {
            // TO-Do
        }

        boolean trouve = false;
        int i = 0;

        while (i < cache.size() && !trouve) {
            if (cache.get(i).getCode() == p.getCode()) {
                trouve = true;
            } else {
                i++;
            }
        }

        if (!trouve) {
            cache.add(p);
        }

        try {
            sauverCache();
        } catch (IOException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mettreAJourPersonne(Personne p) {

        try {
            chargerFichierDonnees();
        } catch (IOException ex) {
            // TO-Do
        }

        boolean trouve = false;
        int i = 0;

        while (i < cache.size() && !trouve) {
            if (cache.get(i).getCode() == p.getCode()) {
                trouve = true;
            } else {
                i++;
            }
        }

        if (!trouve) {
            cache.add(p);
        } else {
            cache.remove(i);
            cache.add(i, p);
        }

        try {
            sauverCache();
        } catch (IOException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void supprimerPersonne(Personne p) {

        try {
            chargerFichierDonnees();
        } catch (IOException ex) {
            // TO-Do
        }

        boolean trouve = false;
        int i = 0;

        while (i < cache.size() && !trouve) {
            if (cache.get(i).getCode() == p.getCode()) {
                trouve = true;
            } else {
                i++;
            }
        }

        if (trouve) {
            cache.remove(i);
            try {
                sauverCache();
            } catch (IOException ex) {
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private static void chargerFichierDonnees() throws IOException {

        List<String> lignes = Files.readAllLines(Path.of(FICHIER));
        List<Personne> liste = new ArrayList<>();

        for (String a : lignes) {
            String[] champs = a.split(";");
            if (champs.length > 4) {
                Personne p = PersonneBuilder.creerNouveau()
                        .avecCode(Integer.parseInt(champs[0]))
                        .avecNom(champs[1])
                        .avecPrenom(champs[2])
                        .avecAdresse(champs[3])
                        .avecNTel(champs[4])
                        .creerReduit();

                liste.add(p);
            }
        }

        cache = liste;
    }

    private static void sauverCache() throws IOException {

        String donnees = "";
        for (Personne p : cache) {
            donnees += lignePersonne(p);
        }

        Files.writeString(Paths.get(FICHIER), donnees);

    }

    private static String lignePersonne(Personne p) {
        return p.getCode() + ";" + p.getNom() + ";" + p.getPrenom() + ";" + p.getAdresse() + ";" + p.getnTel() + "\n";
    }

}
