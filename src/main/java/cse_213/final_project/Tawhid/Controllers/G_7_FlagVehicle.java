package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.IOException;

public class G_7_FlagVehicle
{
    @javafx.fxml.FXML
    private TextField regNOTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void ShowinfoOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void illigalparkingOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LicenceExpOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void overSpeedingOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void flagCarOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void StolenCarOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/Dashboard_TCO.fxml");
    }
}