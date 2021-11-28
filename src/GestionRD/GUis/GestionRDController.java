package GestionRD.GUis;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class GestionRDController {

    @FXML
    private Button ajouter;
    @FXML
    private Button modifier ;
    @FXML
    private Button supprimer ;
    @FXML
    private Button retour ;
@FXML
    void switchtoajouter(ActionEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/GestionRD/GUis/ajoutRD.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
@FXML
    public void switchtosupprimer(ActionEvent event) throws IOException {//  a revoir car ca n'affiche que juste un messsage
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/GestionRD/GUis/confirmation.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
    @FXML
    public void switchtomodifier(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/GestionRD/GUis/modifierRD.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

    @FXML
    public void retour(ActionEvent event) throws IOException {
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }


}
