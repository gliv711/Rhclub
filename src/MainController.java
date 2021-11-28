import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
private Stage stage ;
private Scene scene ;

@FXML
    private Button membres ;
    private Button rd ;
    private Button deconnecter ;


@FXML
    public void switchTomembres() throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GestionMembres/GUis/membre-list.fxml"));
    Parent root1 = (Parent) fxmlLoader.load();
    Stage stage = new Stage();
    stage.setScene(new Scene(root1));
    stage.show();
}

@FXML
    public void switchTord() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GestionRD/GUis/GestionRD.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }


@FXML
    public void deco() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }





}