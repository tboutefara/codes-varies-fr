/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.contactstext.gui;

import com.tarekboutefara.contactstext.model.Contacts;
import com.tarekboutefara.contactstext.model.Personne;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class MainFrame extends javax.swing.JFrame {
    
    MonModele monModele = new MonModele();

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    
    public void actualiser(){
        monModele.fireTableDataChanged();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitre = new javax.swing.JLabel();
        btnGestion = new javax.swing.JButton();
        sclListContacts = new javax.swing.JScrollPane();
        tblListeContacts = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contacts");
        setResizable(false);

        lblTitre.setText("Liste des Contacts");

        btnGestion.setText("Gestion des Contacts");
        btnGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionActionPerformed(evt);
            }
        });

        tblListeContacts.setModel(monModele);
        sclListContacts.setViewportView(tblListeContacts);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sclListContacts, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGestion)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitre)
                    .addComponent(btnGestion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sclListContacts, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionActionPerformed
        (new Contact()).setVisible(true);
    }//GEN-LAST:event_btnGestionActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestion;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JScrollPane sclListContacts;
    private javax.swing.JTable tblListeContacts;
    // End of variables declaration//GEN-END:variables
}

class MonModele extends AbstractTableModel {

    @Override
    public int getRowCount() {
        return Contacts.listeContacts().size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Personne p = Contacts.listeContacts().get(row);
        switch(column){
            case 0 : return "" + p.getCode();
            case 1 : return p.getNom();
            case 2 : return p.getPrenom();
            case 3 : return p.getAdresse();
            case 4 : return p.getnTel();
        }
        
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0 : return "Code";
            case 1 : return "Nom";
            case 2 : return "Pr??nom";
            case 3 : return "Adresse";
            case 4 : return "Num. T??l??phone";
        }
        
        return "";
    }
    
}
