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
public class PersonneBuilder {
    
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

    public PersonneBuilder() {
    }
    
    public static PersonneBuilder creerNouveau(){
        return new PersonneBuilder();
    }
    
    public PersonneBuilder avecCode(int code){
        this.code = code;
        return this;
    }
    
    public PersonneBuilder avecNom(String nom){
        this.nom = nom;
        return this;
    }
    
    public PersonneBuilder avecPrenom(String prenom){
        this.prenom = prenom;
        return this;
    }
    
    public PersonneBuilder avecAdresse(String adresse){
        this.adresse = adresse;
        return this;
    }
    
    public PersonneBuilder avecNTel(String nTel){
        this.nTel = nTel;
        return this;
    }
    
    public PersonneBuilder avecDeuxiemAdresse(String da){
        this.deuxiemeAdresse = da;
        return this;
    }
    
    public PersonneBuilder avecDeuxiemeNTel(String dnt){
        this.deuxiemeNTel = dnt;
        return this;
    }
    
    public PersonneBuilder avecEmail(String email){
        this.email = email;
        return this;
    }
    
    public PersonneBuilder avecSiteweb(String siteWeb){
        this.siteWeb = siteWeb;
        return this;
    }
    
    public PersonneBuilder avecFax(String fax){
        this.fax = fax;
        return this;
    }
    
    public PersonneBuilder avecProfession(String profession){
        this.profession = profession;
        return this;
    }
    
    public PersonneBuilder avecAdresseProfessionnelle(String ap){
        this.adresseProfessionnelle = ap;
        return this;
    }
    
    public PersonneBuilder avecNTelProfessionnel(String ntp){
        this.nTelProfessionel = ntp;
        return this;
    }
    
    public Personne creerReduit(){
        return new Personne(code, nom, prenom, adresse, nTel);
    }
    
    public Personne creerComplet(){
        return new Personne(code, nom, prenom, adresse, nTel, deuxiemeAdresse, deuxiemeNTel, email, siteWeb, fax, profession, adresseProfessionnelle, nTelProfessionel);
    }
    
}
