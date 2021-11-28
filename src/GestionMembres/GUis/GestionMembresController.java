package GestionMembres.GUis;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class GestionMembresController {
    @FXML
    private Button retour ;
    @FXML
    private Button ajouter ;
    @FXML
    private Button supprimer ;
    @FXML
    private Button modifier ;




    @FXML
    public void retour(ActionEvent event) throws IOException {
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }

    @FXML
    public void switchToajouter() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/GestionMembres/GUis/ajouter-membre.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
    @FXML
    public void switchTomodifier() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/GestionMembres/GUis/modifier-membre.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
    @FXML
    public void switchTosupprimer() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/GestionMembres/GUis/confirmation.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
}
