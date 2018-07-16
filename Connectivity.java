/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.student;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * 
 */
public class Connectivity {
    private static Connection con;
    public static Connection  getConnection()
    {
        try {
            if(con==null)
                    con=DriverManager.getConnection("jdbc:mysql://localhost/?", "root","admin");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
    public static void closeConnection()
    {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

/**
 *
 * @author hp
 */
