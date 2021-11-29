import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import users.Modules.users;
import users.Services.usersServices;

import java.io.IOException;

public class signup {
@FXML
private Button connecter ;
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField password1;

@FXML
private Label done ;
    @FXML
    private Button inscription ;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;

    public void inscription(){
        if (username.getText().isEmpty())
            label1.setVisible(true);else
        if (password.getText().isEmpty())
            label2.setVisible(true);
        else

        if (password1.getText().isEmpty()){
            label3.setText("Champ obligatoire");
            label3.setVisible(true);
        }

        else
        {
            users u1 = new users(username.getText(),password.getText());
            usersServices.ajouterUsers(u1);
            label1.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            done.setVisible(true);
            connecter.setVisible(true);
            inscription.setVisible(false);
        }


    }
    @FXML
    void retour(ActionEvent event) throws IOException {
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }
}
