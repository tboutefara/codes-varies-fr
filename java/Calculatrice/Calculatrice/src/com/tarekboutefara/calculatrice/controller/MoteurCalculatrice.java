/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.calculatrice.controller;

import com.tarekboutefara.calculatrice.gui.Effacer;
import com.tarekboutefara.calculatrice.gui.EffacerOperand;
import com.tarekboutefara.calculatrice.gui.EffacerTout;
import com.tarekboutefara.calculatrice.gui.Egale;
import com.tarekboutefara.calculatrice.gui.Nombre;
import com.tarekboutefara.calculatrice.gui.Operation;
import com.tarekboutefara.calculatrice.gui.Signe;
import com.tarekboutefara.calculatrice.gui.Virgule;
import com.tarekboutefara.calculatrice.gui.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class MoteurCalculatrice implements ActionListener {
    
    MainFrame mf;
    
    double operand01;
    double operand02;
    double resultat;
    
    String operation;
    
    boolean debutSaisie;
    boolean contientVirgule;
    

    public MoteurCalculatrice(MainFrame mf) {
        this.mf = mf;
        
        operation = "";
        debutSaisie = true;
        contientVirgule = false;
        
        mf.afficher("0");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source instanceof Nombre){
            saisie(((JButton)e.getSource()).getText());
        }else if(source instanceof Operation){
            saisieOperation(((JButton)e.getSource()).getText());
        }else if(source instanceof Signe){
            signe();
        }else if(source instanceof Virgule){
            virgule();
        }else if(source instanceof  Egale){
            egale();
        }else if(source instanceof Effacer){
            effacer();
        }else if(source instanceof EffacerOperand){
            effacerOperand();
        }else if(source instanceof EffacerTout){
            effacerTout();
        }
    }

    private void saisie(String nombre) {
        
        if(debutSaisie){
            mf.afficher(nombre);
            debutSaisie = false;
        }else{
            String a = mf.getAffichage();
            mf.afficher(a + nombre);
        }
        
    }

    private void saisieOperation(String o) {
        
        if(operation.equals("")){
            operand01 = Double.parseDouble(mf.getAffichage());
        }else{
            operand02 = Double.parseDouble(mf.getAffichage());
            calculer();
            mf.afficher(resultat + "");
            operand01 = resultat;
        }
        
        operation = o;
        debutSaisie = true;
        contientVirgule = false;
    }

    private void signe() {
        String a = mf.getAffichage();
        if(a.charAt(0) == '-'){
            mf.afficher(a.substring(1));
        }else{
            mf.afficher("-" + a);
        }
    }

    private void virgule() {
        if(!contientVirgule && !mf.getAffichage().contains(".")){
            mf.afficher(mf.getAffichage() + ".");
            contientVirgule = true;
            debutSaisie = false;
        }
    }

    private void egale() {
        if(!operation.equals("")){
            operand02 = Double.parseDouble(mf.getAffichage());
            calculer();
            mf.afficher(resultat + "");
            operation = "";
            debutSaisie = true;
            contientVirgule = false;
        }
    }

    private void effacer() {
        String a = mf.getAffichage();
        if(a.length() > 1){
            mf.afficher(a.substring(0, a.length() - 1));
        }else{
            mf.afficher("0");
            debutSaisie = true;
        }
        
    }

    private void effacerOperand() {
        mf.afficher("0");
        debutSaisie = true;
        contientVirgule = false;
    }

    private void effacerTout() {
        mf.afficher("0");
        debutSaisie = true;
        contientVirgule = false;
        operation = "";
    }

    private void calculer() {
        switch(operation){
            case "+" : resultat = operand01 + operand02; break;
            case "-" : resultat = operand01 - operand02; break;
            case "x" : resultat = operand01 * operand02; break;
            default : resultat = operand01 / operand02; break;
        }
    }
    
}
