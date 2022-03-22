/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.codessimples.graphesimple.main;

import com.tarekboutefara.codessimples.graphesimple.gui.MainFrame;
import com.tarekboutefara.codessimples.graphesimple.model.Graphe;
import java.util.Random;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graphe g = donneesAleatoires(5);
        
        // A test
        /*
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(g.noeudsLies(i, j) + "\t");
            }
            System.out.println("");
        }
        */
        
        (new MainFrame(g)).setVisible(true);
    }
    
    public static Graphe donneesAleatoires(int n){
        
        String[] e = new String[n];
        
        for (int i = 0; i < n; i++) {
            e[i] = String.valueOf(i);
        }
        
        Graphe g = new Graphe(n, e);
        Random r = new Random();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j){
                    double v = r.nextDouble();
                    if(v <= 0.5){
                        g.definirArrete(i, j);
                    }else{
                        g.supprimeArrete(i, j);
                    }
                }else{
                    g.supprimeArrete(i, j);
                }
            }
        }
        
        return g;
    }
    
}
