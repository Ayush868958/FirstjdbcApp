
package com.ayush.jdbc;

import java.sql.*;

public class LaunchApp4 {

    public static void main(String[] args) {
      //  Connection connect=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbclearning";
            String username = "root";
            String password = "YOUR_PASSWORD";

            try (Connection connect =
                         DriverManager.getConnection(url, username, password);

                 Statement statement = connect.createStatement()) {

                String sql = "INSERT INTO student_info(sid, sname, scity) " +
                        "VALUES(24, 'Ayush', 'gwalior')";

                int rowAffected = statement.executeUpdate(sql);

                if (rowAffected > 0) {
                    System.out.println("Data inserted successfully");
                } else {
                    System.out.println("Unable to insert data");
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            statement.close();
            connect.close();
        }
    }
}

