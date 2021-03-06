/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.codessimples.graphesimple.gui;

import com.tarekboutefara.codessimples.graphesimple.model.Graphe;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class MainFrame extends javax.swing.JFrame {

    Graphe graphe;
    /**
     * Creates new form MainFrame
     */
    public MainFrame(Graphe g) {
        graphe = g;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modes = new javax.swing.ButtonGroup();
        radioLineaire = new javax.swing.JRadioButton();
        radioCircle = new javax.swing.JRadioButton();
        radioAleatoire = new javax.swing.JRadioButton();
        btnDessiner = new javax.swing.JButton();
        canvas = new PanneauDeDessin(graphe);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graphe Simple");
        setResizable(false);

        modes.add(radioLineaire);
        radioLineaire.setText("Linéaire");

        modes.add(radioCircle);
        radioCircle.setText("Circle");

        modes.add(radioAleatoire);
        radioAleatoire.setText("Aleatoire");

        btnDessiner.setText("Dessiner");
        btnDessiner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDessinerActionPerformed(evt);
            }
        });

        canvas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioAleatoire, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(radioCircle, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(btnDessiner, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(radioLineaire)))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioLineaire)
                    .addComponent(radioCircle)
                    .addComponent(radioAleatoire))
                .addGap(18, 18, 18)
                .addComponent(btnDessiner)
                .addGap(18, 18, 18)
                .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDessinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDessinerActionPerformed
        
        if(radioAleatoire.isSelected())
            ((PanneauDeDessin)canvas).setMode(PanneauDeDessin.MODE_ALEATOIRE);
        else if(radioCircle.isSelected())
            ((PanneauDeDessin)canvas).setMode(PanneauDeDessin.MODE_CIRCULAIRE);
        else
            ((PanneauDeDessin)canvas).setMode(PanneauDeDessin.MODE_LINEAIRE);
        
        canvas.validate();
        canvas.repaint();
    }//GEN-LAST:event_btnDessinerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDessiner;
    private javax.swing.JPanel canvas;
    private javax.swing.ButtonGroup modes;
    private javax.swing.JRadioButton radioAleatoire;
    private javax.swing.JRadioButton radioCircle;
    private javax.swing.JRadioButton radioLineaire;
    // End of variables declaration//GEN-END:variables
}
