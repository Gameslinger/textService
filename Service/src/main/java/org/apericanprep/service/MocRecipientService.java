/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apericanprep.service;

import java.util.ArrayList;
import java.util.List;
import org.apericanprep.apis.RecipientsService;
import org.apericanprep.apis.models.Recipient;

/**
 *
 * @author Gabriel.Maxfield
 */
public class MocRecipientService implements RecipientsService{
    
    private final String[] firstNames = {"Bob","John","Alex","Ham","Piglet"};
    private final String[] lastNames = {"Bacon","Cena","Steves","Sandwich","Pig"};
    private final String[] phoneNumbers = {"801-572-3560","666-666-6666","123-456-7891","555-555-5555","543-345-2347"};
    
    @Override
    public boolean exists(String recipientName) {
        return true;
    }

    @Override
    public List<Recipient> findAll() {
        List<Recipient> all = new ArrayList();
        for(int i = 0; i < firstNames.length; i++){
            all.add(new Recipient(firstNames[i],lastNames[i],phoneNumbers[i]));
        }
        return all;
    }
    
}
