/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author adria
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    private static Connection mysqlconn;
    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/rhs_db";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconn = DriverManager.getConnection(url, user, pass);
            
        } catch(Exception e) {
            System.err.print(e.getMessage());
        }
        return mysqlconn;
    }
}
