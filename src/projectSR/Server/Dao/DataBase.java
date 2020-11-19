package projectSR.Server.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
    // settings
    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    String DB_URL = "jdbc:mysql://localhost:3306/tprmi";
    // Database credentials
    String USER = "root";
    String PASS = "";

    private Connection conn = null;

    public DataBase() throws ClassNotFoundException, SQLException {
        //Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        //Open a connection
        System.out.println("Connecting to a selected database...");
        this.conn = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println("Connected database successfully...");
        this.setConn(conn);
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
}
