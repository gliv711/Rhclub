import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static dbconnection.dbconnection.getMysqlConnection;

public class login {
    @FXML
    private TextField login;

    @FXML
    private TextField pass;
    @FXML
    private Label errorlabel ;
    @FXML
    private Label signup ;
    @FXML
    public void switchToMainMenu() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Menu/GUis/menu.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void pressLogin(ActionEvent event) {
        String query = "select count(*) from users where login like '" + login.getText() + "' and pass like '" + pass.getText() + "'";
        try {
            Connection connection = getMysqlConnection();
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery(query);
            res.next();

            if (res.getInt(1) == 0) {
                errorlabel.setVisible(true);
            } else {
                switchToMainMenu();
                res.close();
            }


        } catch (SQLException | IOException throwables) {
            throwables.printStackTrace();
        }
    }
    @FXML
    public void signup() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signup.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
}
