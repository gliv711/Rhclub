package users.Services;

import users.Modules.users;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static dbconnection.dbconnection.getMysqlConnection;

public class usersServices {

    public static void ajouterUsers(users u) {

        try {
            Connection connection = getMysqlConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO users(login,pass)" + "VALUES('" + u.getLogin() + "','" + u.getPass() + "')");
            System.out.println("Inserted");


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
