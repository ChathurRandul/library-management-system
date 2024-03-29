package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","1234");
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static DBConnection getInstance() {
        return dbConnection = ((dbConnection == null) ? new DBConnection(): dbConnection);
    }

    public Connection getConnection() {
        return connection;
    }
}
