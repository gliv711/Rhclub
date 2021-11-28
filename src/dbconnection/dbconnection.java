package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {


    public static Connection getMysqlConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            System.out.println("error : unable to load driver class!");
        } catch (IllegalAccessError ex) {
            System.out.println("error : access problem while loading!");
        } catch (IllegalAccessException e) {
            System.out.println("error 10");
        } catch (InstantiationException e) {
            System.out.println("error 100");
        }

        String URL = "jdbc:mysql://localhost:3306/lgc";
        String Username = "root";//we should use the same username
        String Password = "";//password too!

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, Username, Password);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println("error in connection");
            System.out.println(e.getErrorCode());
        }

        return connection;
    }
}
