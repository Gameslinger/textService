/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apericanprep.apis.models;

/**
 *
 * @author Gabriel.Maxfield
 */
public class Recipient {
    private final String lastName,firstName,phoneNumber;

    public Recipient(String firstName,String lastName, String phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return firstName+" "+lastName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getNumber() {
        return phoneNumber;
    }
    
}
