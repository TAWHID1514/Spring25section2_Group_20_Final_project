package cse_213.final_project;

import cse_213.final_project.Tawhid.Controllers.Dashboard_TOCFXMLcontroller;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

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
    public void loginOA(ActionEvent actionEvent) throws IOException {
//        if (userIDtf.getText().isEmpty()){
//            errormassageLabel.setText("Fill your user ID");
//            return;
//        }
//        if (passwordTF.getText().isEmpty()){
//            errormassageLabel.setText("Fill your accurate password");
//            return;
//        }
//        else {
//            errormassageLabel.setText(" ");
//
//        }
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/Dashboard_TCO.fxml");
    }

    @javafx.fxml.FXML
    public void addEmployeeOA(ActionEvent actionEvent) throws IOException {

    }
}