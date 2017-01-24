/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apericanprep.apis;

import java.util.List;
import org.apericanprep.apis.models.Recipient;

/**
 *
 * @author Gabriel.Maxfield
 */
public interface RecipientsService {
    public boolean exists(String recipientName);
    public List<Recipient> findAll();
}
