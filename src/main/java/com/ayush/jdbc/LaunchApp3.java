package com.ayush.jdbc;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class LaunchApp3{

    public static void main(String[] args) throws Exception {

        // Load and register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //driver ko use karke database connection banata hai
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        // Database details
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String username = "root";
        String password = "Ayush1790@@##";

        // Establish connection
        Connection connect = DriverManager.getConnection(url, username, password);

        // creating statement
        Statement statement = connect.createStatement();
        //execute query
        String sql="SELECT * from student_info";
        ResultSet rs=statement.executeQuery(sql);
    //boolean status=statement.execute (sql);
  // process the result
        while(rs.next()){
         //int sid=  rs.getInt(1);
         //   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            System.out.println(rs.getInt("sid")+" "+rs.getString("sname")+" "+rs.getString("scity"));
        }
        //close the resoursces
        rs.close();
        statement.close();
        connect.close();
    }
}
