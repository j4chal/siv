/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.beans;

import org.springframework.stereotype.Service;

/**
 *
 * @author willex
 */
@Service
public class OwnerSystem {
    
    private String id;
    private String dueño;
    
    public OwnerSystem(){}

    /**
     * @return the dueño
     */
    public String getDueño() {
        return dueño;
    }

    /**
     * @param dueño the dueño to set
     */
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
}
