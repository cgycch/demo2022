package org.example.demo03.zzz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
    public static final String driver = "oracle.jdbc.OracleDriver";
    public static final String url = "jdbc:oracle:thin:@localhost:1521:CGYCCH";
    public static final String user = "scott";
    public static final String password = "root123";

    public static void main(String[] args) {
        System.out.println("JDBCTest.main");
        Connection conn = getConnection();
        System.out.println("conn = " + conn);
        closeConnection(conn);
    }
    
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void closeConnection(Connection conn ){
        if (conn == null) {
            return;
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
