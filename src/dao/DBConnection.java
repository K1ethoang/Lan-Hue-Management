package dao;

import java.sql.*;

public class DBConnection {

    private static final String url = "jdbc:mysql://localhost:3306/lanhuemanagement";
    private static final String username = "root";
    private static final String password = "130320030348753499mysql"; //130320030348753499mysql // 23092003

    public static Connection getConnection() {
        try {
            Connection con = null;
            con = DriverManager.getConnection(url, username, password);
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
