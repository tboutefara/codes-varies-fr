/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.contactstext.model;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class Personne {
    
    int code;
    String nom;
    String prenom;
    String adresse;
    String nTel;
    String deuxiemeAdresse;
    String deuxiemeNTel;
    String email;
    String siteWeb;
    String fax;
    String profession;
    String adresseProfessionnelle;
    String nTelProfessionel;

    public Personne() {
    }

    public Personne(int code, String nom, String prenom, String adresse, String nTel) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.nTel = nTel;
    }

    public Personne(int code, String nom, String prenom, String adresse, String nTel, String deuxiemeAdresse, String deuxiemeNTel, String email, String siteWeb, String fax, String profession, String adresseProfessionnelle, String nTelProfessionel) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.nTel = nTel;
        this.deuxiemeAdresse = deuxiemeAdresse;
        this.deuxiemeNTel = deuxiemeNTel;
        this.email = email;
        this.siteWeb = siteWeb;
        this.fax = fax;
        this.profession = profession;
        this.adresseProfessionnelle = adresseProfessionnelle;
        this.nTelProfessionel = nTelProfessionel;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getnTel() {
        return nTel;
    }

    public void setnTel(String nTel) {
        this.nTel = nTel;
    }

    public String getDeuxiemeAdresse() {
        return deuxiemeAdresse;
    }

    public void setDeuxiemeAdresse(String deuxiemeAdresse) {
        this.deuxiemeAdresse = deuxiemeAdresse;
    }

    public String getDeuxiemeNTel() {
        return deuxiemeNTel;
    }

    public void setDeuxiemeNTel(String deuxiemeNTel) {
        this.deuxiemeNTel = deuxiemeNTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAdresseProfessionnelle() {
        return adresseProfessionnelle;
    }

    public void setAdresseProfessionnelle(String adresseProfessionnelle) {
        this.adresseProfessionnelle = adresseProfessionnelle;
    }

    public String getnTelProfessionel() {
        return nTelProfessionel;
    }

    public void setnTelProfessionel(String nTelProfessionel) {
        this.nTelProfessionel = nTelProfessionel;
    }
    
    
    
            
    
}
