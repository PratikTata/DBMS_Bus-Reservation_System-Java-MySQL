/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.student;

/**
 *
 * @author hp
 */
public class User {
     int Id;
    private String Name,Gender,DOB,Address,EmailId,MobileNo,Password,ConfirmPassword;

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setEmailId(String EmailId) {
        this.EmailId = EmailId;
    }

    public void setMobileNo(String MobileNo) {
        this.MobileNo = MobileNo;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }

    public String getDOB() {
        return DOB;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmailId() {
        return EmailId;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public String getPassword() {
        return Password;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }
    
}
