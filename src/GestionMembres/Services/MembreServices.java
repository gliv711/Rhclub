package GestionMembres.Services;

import GestionMembres.Modules.Membre;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static dbconnection.dbconnection.getMysqlConnection;


public class MembreServices {

    public static void ajouter(Membre m) {

        try {
            Connection connection = getMysqlConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO membre(nom,prenom,telephone,email,type )" + "VALUES('" + m.getName() + "','" + m.getLastname() +"','"+ m.getTelephone() + "','" + m.getEmail() +"','"+m.getType()   +"')");

            System.out.println("Membre inserted");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }}
