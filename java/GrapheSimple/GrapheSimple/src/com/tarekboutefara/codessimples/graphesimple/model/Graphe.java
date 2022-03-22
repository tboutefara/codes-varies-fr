/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.codessimples.graphesimple.model;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class Graphe {
    
    int n;
    int[][] graphe;
    
    String[] etiquettes = null;

    public Graphe(int n) {
        this.n = n;
        this.graphe = new int[n][n];
    }
    
    public Graphe(int n, String[] etiquettes) {
        this.n = n;
        this.graphe = new int[n][n];
        
        this.etiquettes = etiquettes;
    }
    
    public int getN(){
        return n;
    }
    
    public void definirArrete(int i, int j){
        graphe[i][j] = 1;
    }
    
    public void supprimeArrete(int i, int j){
        graphe[i][j] = 0;
    }
    
    public boolean noeudsLies(int i, int j){
        return graphe[i][j] == 1;
    }
    
    public String getEtiquette(int i){
        if(etiquettes == null){
            return null;
        }else{
            return etiquettes[i];
        }
    }
}
