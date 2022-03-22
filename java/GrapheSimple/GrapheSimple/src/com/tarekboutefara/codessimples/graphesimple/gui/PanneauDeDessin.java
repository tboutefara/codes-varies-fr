/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.codessimples.graphesimple.gui;

import com.tarekboutefara.codessimples.graphesimple.model.Graphe;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.ColorModel;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class PanneauDeDessin extends JPanel {
    
    public static int MODE_ALEATOIRE = 0;
    public static int MODE_CIRCULAIRE = 1;
    public static int MODE_LINEAIRE = 2;
    
    Graphe graphe;
    int mode = MODE_ALEATOIRE;
    
    Position[] positions;

    public PanneauDeDessin(Graphe graphe) {
        this.graphe = graphe;
        positions = new Position[graphe.getN()];
    }
    
    public void setMode(int mode){
        this.mode = mode;
    }
    
    public void setGraphe(Graphe g){
        this.graphe = g;
        positions = new Position[graphe.getN()];
    }
    
    @Override
    public void paint(Graphics g){
        
        super.paint(g);
        
        if(mode == MODE_CIRCULAIRE){
            double angle = 2*Math.PI/graphe.getN();
            
            int xCentre = getWidth()/2;
            int yCentre = getHeight()/2;
            
            for(int i = 0; i < graphe.getN(); i++){
               
                g.setColor(Color.RED);
                
                int xPosition = (int) (xCentre + 100 * cos(angle * i));
                int yPosition = (int) (yCentre + 100 * sin(angle * i));
                g.fillOval(xPosition, yPosition, 20, 20);
                
                positions[i] = new Position(xPosition, yPosition);
                
                g.setColor(Color.BLACK);
                String etiquette = graphe.getEtiquette(i);
                if(etiquette != null){
                    g.drawString(etiquette, xPosition, yPosition + 40);
                }
               
            }
            
        }else if(mode == MODE_ALEATOIRE){
            
            Random r = new Random();
            
            for(int i = 0; i < graphe.getN(); i++){
               
                g.setColor(Color.RED);
                
                int xPosition = (int) (r.nextInt(350));
                int yPosition = (int) (r.nextInt(350));
                
                g.fillOval(xPosition, yPosition, 20, 20);
                positions[i] = new Position(xPosition, yPosition);
                
                g.setColor(Color.BLACK);
                String etiquette = graphe.getEtiquette(i);
                if(etiquette != null){
                    g.drawString(etiquette, xPosition, yPosition + 40);
                }
               
            }
            
        }else{
            
            int pointDebutX = 20;
            int pointDebutY = 20;
            boolean deplacement = false;
            int pas = 50;
            
            int xPosition = pointDebutX;
            int yPosition = pointDebutY;
            
            for(int i = 0; i < graphe.getN(); i++){
               
                g.setColor(Color.RED);
                
                g.fillOval(xPosition, yPosition, 20, 20);
                positions[i] = new Position(xPosition, yPosition);
                
                g.setColor(Color.BLACK);
                String etiquette = graphe.getEtiquette(i);
                if(etiquette != null){
                    g.drawString(etiquette, xPosition, yPosition + 40);
                }
                
                if(deplacement){
                    xPosition += pas;
                    yPosition -= pas;
                }else{
                    yPosition += pas;
                }
                
                deplacement = !deplacement;
               
            }
            
        }
        
        for (int i = 0; i < graphe.getN(); i++) {
            for (int j = 0; j < graphe.getN(); j++) {
                if(graphe.noeudsLies(i, j)){
                    g.drawLine(positions[i].x + 10, positions[i].y + 10, positions[j].x + 10, positions[j].y + 10);
                }
            }
        }
        
    }
    
}

class Position {
    public int x, y;

    public Position() {
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
