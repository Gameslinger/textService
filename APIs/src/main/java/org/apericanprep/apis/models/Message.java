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
    
    public enum Status {
    SUCCESSFUL, PENDING, FAILED
}
    final int id;
    static int currentId = 0;
    private Status status;
    private String content;

    public Message(String msg, List<Recipient> recipients) {
        this.content = msg;
        this.status = Status.PENDING;
        this.id = currentId++;
    }
    public Message(){
        this.id = currentId++;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public String getStatus() {
        return status.toString();
    }

    public int getId() {
        return id;
    }
    
    
}

