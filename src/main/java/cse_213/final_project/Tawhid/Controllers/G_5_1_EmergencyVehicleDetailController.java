package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.IOException;

public class G_5_1_EmergencyVehicleDetailController
{
    @javafx.fxml.FXML
    private Label rasonlabel;
    @javafx.fxml.FXML
    private Label Namelabel;
    @javafx.fxml.FXML
    private Label phoneNoLabel;
    @javafx.fxml.FXML
    private Label vehilceregNoLabel;
    @javafx.fxml.FXML
    private Label drivLicenceNoLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void notifyVehicleOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/G_5_emergancymode.fxml");
    }
}