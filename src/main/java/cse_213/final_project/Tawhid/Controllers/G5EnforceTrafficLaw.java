package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.IOException;

public class G5EnforceTrafficLaw
{
    @javafx.fxml.FXML
    private Label totalAmountTextlabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void collectAmountOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void impoundVehicleOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/PoliceAuthurity/Dashboard_PA.fxml");
    }
}