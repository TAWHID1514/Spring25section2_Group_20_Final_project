package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.IOException;

public class G6InvastigateAccidentController
{
    @javafx.fxml.FXML
    private TextField regNoTF;
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private ComboBox AccidentLocationCombobox;
    @javafx.fxml.FXML
    private TextField DrivingLicenceTF;
    @javafx.fxml.FXML
    private TextArea AccidentTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/PoliceAuthurity/Dashboard_PA.fxml");
    }
}