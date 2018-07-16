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
public class Bus {
    private int Bid,Booked_seats,Total_seats,Available_seats;
  private  Date date1;
    private String Bname;

    public int getBid() {
        return Bid;
    }

    public int getBooked_seats() {
        return Booked_seats;
    }

    public int getTotal_seats() {
        return Total_seats;
    }

    public int getAvailable_seats() {
        return Available_seats;
    }

    public Date getDate1() {
        return date1;
    }

    public String getBname() {
        return Bname;
    }

    @Override
    public String toString() {
        return "Bus{" + "Bid=" + Bid + ", Booked_seats=" + Booked_seats + ", Total_seats=" + Total_seats + ", Available_seats=" + Available_seats + ", Bname=" + Bname + '}';
    }

    public Bus( int Booked_seats, int Total_seats, int Available_seats, Date date1, String Bname) {
        this.Booked_seats = Booked_seats;
        this.Total_seats = Total_seats;
        this.Available_seats = Available_seats;
        this.date1 = date1;
        this.Bname = Bname;
    }
public Bus()
{
    
}
    public Bus( int Booked_seats, int Total_seats, int Available_seats, String Bname) {
       
        this.Booked_seats = Booked_seats;
        this.Total_seats = Total_seats;
        this.Available_seats = Available_seats;
        this.Bname = Bname;
    }

    public void setBid(int Bid) {
        this.Bid = Bid;
    }

    public void setBooked_seats(int Booked_seats) {
        this.Booked_seats = Booked_seats;
    }

    public void setTotal_seats(int Total_seats) {
        this.Total_seats = Total_seats;
    }

    public void setAvailable_seats(int Available_seats) {
        this.Available_seats = Available_seats;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public void setBname(String Bname) {
        this.Bname = Bname;
    }
    
    
}
