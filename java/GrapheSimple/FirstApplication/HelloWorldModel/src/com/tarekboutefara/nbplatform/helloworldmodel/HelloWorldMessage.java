/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.nbplatform.helloworldmodel;

import java.util.Date;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class HelloWorldMessage {
    
    String name;
    Date date;

    public HelloWorldMessage(String name) {
        this.name = name;
        this.date = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
