/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarekboutefara.contacts.dataaccess;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class DataAccessManager {
    
    private static DataAccess dataAccess;
    
    public static void setDataAccess(DataAccess da){
        dataAccess = da;
    }
    
    public static DataAccess getDataAccess(){
        return dataAccess;
    }
    
}
