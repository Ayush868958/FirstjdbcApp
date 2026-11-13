package com.ayush.jdbc;

import java.sql.*;

public class LaunchApp1 {

    public static void main(String[] args) throws Exception {

        // Load and register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
      //driver ko use karke database connection banata hai
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        // Database details
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String username = "root";
        String password = "Ayush1790@@##"  ;

        // Establish connection
        Connection connect = DriverManager.getConnection(url, username, password);

       // creating statement
        Statement statement=connect.createStatement();
        // execute query
        String sql="INSERT INTO student_info(sid,sname,scity)VALUES(25,'Raj','Bihar')";
       // String sql ="INSERT INTO student_info(sid,sname,scity)VALUES(24,'Ayush','Guna')";
        int rowAffected=statement.executeUpdate(sql);
        //process  the result
        if(rowAffected==0){
            System.out.println("Unable to insert student");
        }
        else{
            System.out.println("Successfully inserted student");
        }
        //close the resources
        statement.close();
        connect.close();
    }
}
