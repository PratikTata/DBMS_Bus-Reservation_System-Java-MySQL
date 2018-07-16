/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.student;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Ticket {
    private Date date1;
    private String P_id,source,dest;
    private int Bid;

    public Ticket(String P_id, String source, String dest, int Bid) {
        this.P_id = P_id;
        this.source = source;
        this.dest = dest;
        this.Bid = Bid;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public void setP_id(String P_id) {
        this.P_id = P_id;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setBid(int Bid) {
        this.Bid = Bid;
    }

    public Date getDate1() {
        return date1;
    }

    public String getP_id() {
        return P_id;
    }

    public String getSource() {
        return source;
    }

    public String getDest() {
        return dest;
    }

    public int getBid() {
        return Bid;
    }
    
}
