package GestionRD.GUis;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ajoutRDController {
    @FXML
    private TextField description;

    @FXML
    TextField montantr;

    @FXML
    TextField montantd;

    @FXML
    private DatePicker date;

    @FXML
    private Button valider;

    @FXML
    private Button annuler;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;

    @FXML
    void retour(ActionEvent event) throws IOException {
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }

    @FXML
    public void ajouterbutton() {
        if (montantr.getText().isEmpty()) {
            label1.setVisible(true);
        }

        if (montantd.getText().isEmpty()) {
            label2.setVisible(true);
        }


    }

}


