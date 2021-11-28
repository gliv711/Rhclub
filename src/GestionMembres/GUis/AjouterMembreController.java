package GestionMembres.GUis;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class AjouterMembreController {

    @FXML
    private Button valider ;
    @FXML
    private Button annuler ;
    @FXML
    private TextField name,lastname,telephone,email ;
    @FXML
    private SplitMenuButton type;
    @FXML
    private Label label1 ;
    @FXML
    private Label label2 ;
    @FXML
    private Label label3 ;
    @FXML
    private Label label4 ;
    @FXML
    private Label label5 ;
@FXML
    public void valider(){
    if (name.getText().isEmpty()) label1.setVisible(true);
    if (lastname.getText().isEmpty()) label2.setVisible(true);
    if (telephone.getText().isEmpty()) label3.setVisible(true);
    if (email.getText().isEmpty()) label4.setVisible(true);
    if (type.getText().isEmpty()) label5.setVisible(true);
}
@FXML
    void retour(ActionEvent event) throws IOException {
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }








}
