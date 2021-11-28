package GestionMembres.Services;

import GestionMembres.Modules.Membre;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static dbconnection.dbconnection.getMysqlConnection;


public class MembreServices {

    public static void ajouter(Membre m) {
        String SQLquery = String.format("insert into membre values(" +
                "'%s'," +
                "'%s'," +
                "'%s'," +
                "'%s',",m.getName(),m.getLastname(),m.getTelephone(),m.getEmail());
        try {
            Connection connection = getMysqlConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(SQLquery);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }}
