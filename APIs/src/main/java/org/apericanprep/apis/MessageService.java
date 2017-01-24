/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apericanprep.apis;

import java.util.List;
import org.apericanprep.apis.models.Message;

/**
 *
 * @author Gabriel.Maxfield
 */
public interface MessageService {
    public boolean exists(int id);
    public List<Message> findAll();
    
}
