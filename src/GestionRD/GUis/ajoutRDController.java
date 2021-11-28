package GestionRD.GUis;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ajoutRDController {
    @FXML
    private TextField description;

    @FXML
    private TextField montantr;

    @FXML
    private TextField montantd;

    @FXML
    private DatePicker date;

    @FXML
    private Button valider;

    @FXML
    private Button annuler;


    @FXML
    void retour(ActionEvent event) throws IOException {
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }


}
