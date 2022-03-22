/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.nbplatform.helloworld;

import com.tarekboutefara.nbplatform.helloworldmodel.HelloWorldMessage;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//com.tarekboutefara.nbplatform.helloworld//HelloWorld//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "HelloWorldTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE",
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "com.tarekboutefara.nbplatform.helloworld.HelloWorldTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_HelloWorldAction",
        preferredID = "HelloWorldTopComponent"
)
@Messages({
    "CTL_HelloWorldAction=HelloWorld",
    "CTL_HelloWorldTopComponent=HelloWorld Window",
    "HINT_HelloWorldTopComponent=This is a HelloWorld window"
})
public final class HelloWorldTopComponent extends TopComponent {

    InstanceContent content;
    
    public HelloWorldTopComponent() {
        initComponents();
        setName(Bundle.CTL_HelloWorldTopComponent());
        setToolTipText(Bundle.HINT_HelloWorldTopComponent());
        content = new InstanceContent();
        this.associateLookup(new AbstractLookup(content));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMessage = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnAction = new javax.swing.JButton();

        org.openide.awt.Mnemonics.setLocalizedText(lblMessage, org.openide.util.NbBundle.getMessage(HelloWorldTopComponent.class, "HelloWorldTopComponent.lblMessage.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lblName, org.openide.util.NbBundle.getMessage(HelloWorldTopComponent.class, "HelloWorldTopComponent.lblName.text")); // NOI18N

        txtName.setText(org.openide.util.NbBundle.getMessage(HelloWorldTopComponent.class, "HelloWorldTopComponent.txtName.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(btnAction, org.openide.util.NbBundle.getMessage(HelloWorldTopComponent.class, "HelloWorldTopComponent.btnAction.text")); // NOI18N
        btnAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName)
                            .addComponent(lblMessage))
                        .addGap(18, 18, 18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnAction)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMessage)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnAction)
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionActionPerformed
        String name = txtName.getText();
        if(!name.equals("")){
            lblMessage.setText("Hello " + name);
            content.add(new HelloWorldMessage(name));
        }else{
            lblMessage.setText("Hello World !");
        }
    }//GEN-LAST:event_btnActionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAction;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}