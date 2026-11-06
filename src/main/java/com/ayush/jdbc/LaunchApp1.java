package com.ayush.jdbc;

import java.sql.*;

public class LaunchApp1 {

    public static void main(String[] args) throws Exception {

        // Load and register driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Database details
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String username = "root";
        String password = "Ayush1790@@##"  ;

        // Establish connection
        Connection connect = DriverManager.getConnection(url, username, password);

       // creating statement
        Statement statement=connect.createStatement();
        // execute query
        //process  the result
        //close the resources
        statement.close();
        connect.close();
    }
}
