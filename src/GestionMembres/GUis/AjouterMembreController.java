package GestionMembres.GUis;

import GestionMembres.Modules.Membre;
import GestionMembres.Services.MembreServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private TextField type;
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
    public void valider(ActionEvent event){
    if (name.getText().isEmpty()) label1.setVisible(true);
    else

    if (lastname.getText().isEmpty()) label2.setVisible(true);
    else

    if (telephone.getText().isEmpty()) label3.setVisible(true);else
    if (email.getText().isEmpty()) label4.setVisible(true);else
    if (type.getText().isEmpty()) label5.setVisible(true);

    else {
        Membre m = new Membre(name.getText(), lastname.getText(), telephone.getText(), email.getText(), type.getText());
        MembreServices.ajouter(m);
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }
}
@FXML
    void retour(ActionEvent event) throws IOException {
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }








}
