/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apericanprep.apis.models;

import java.util.List;

/**
 *
 * @author Gabriel.Maxfield
 */
public class Message {

    List<Recipient> recipients;

    final int id;
    static int currentId = 0;
    private String status;
    private String content;

    public Message(String msg, List<Recipient> recipients) {
        this.content = msg;
        this.status = "PENDING";
        this.id = currentId++;
    }

    public Message() {
        this.id = currentId++;
        this.status = "PENDING";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFailure() {
        this.status = "FAILURE";
    }
    
    public void setSuccess() {
        this.status = "SUCCESS";
    }
    
    public void setPending() {
        this.status = "PENDING";
    }
    
    public void setPartial() {
        this.status = "PARTIAL";
    }
    
    public String getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

}
