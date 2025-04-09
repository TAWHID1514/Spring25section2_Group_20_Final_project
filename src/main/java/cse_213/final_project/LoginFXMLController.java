package cse_213.final_project;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class LoginFXMLController
{
    @javafx.fxml.FXML
    private TextField userIDtf;
    @javafx.fxml.FXML
    private PasswordField passwordTF;
    @javafx.fxml.FXML
    private Label errormassageLabel;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loginOA(ActionEvent actionEvent) {
        if (userIDtf.getText().isEmpty()){
            errormassageLabel.setText("Fill your user ID");
            return;
        }
        if (passwordTF.getText().isEmpty()){
            errormassageLabel.setText("Fill your accurate password");
            return;
        }
        else {
            errormassageLabel.setText(" ");

        }
    }

    @javafx.fxml.FXML
    public void addEmployeeOA(ActionEvent actionEvent) {
    }
}