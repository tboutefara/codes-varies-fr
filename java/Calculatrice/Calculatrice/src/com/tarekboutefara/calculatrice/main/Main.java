/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.calculatrice.main;

import com.tarekboutefara.calculatrice.controller.MoteurCalculatrice;
import com.tarekboutefara.calculatrice.gui.MainFrame;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        MoteurCalculatrice mc = new MoteurCalculatrice(mf);
        mf.attacherMoteur(mc);
        mf.setVisible(true);
    }
    
}
