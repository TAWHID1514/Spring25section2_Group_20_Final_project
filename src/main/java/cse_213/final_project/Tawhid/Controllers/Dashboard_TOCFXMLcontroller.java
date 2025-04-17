package cse_213.final_project.Tawhid.Controllers;

import cse_213.final_project.SceneSwitcher;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Dashboard_TOCFXMLcontroller
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void ResolveDipositeOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/Controllers/TrafficControlOfficer/.fxml");
    }

    @javafx.fxml.FXML
    public void FlagASuspicusCarOA(ActionEvent actionEvent) throws IOException {
    }

    @javafx.fxml.FXML
    public void trackUnpaidTollVehicleOA(ActionEvent actionEvent) throws IOException {
    }

    @javafx.fxml.FXML
    public void EmergencyMovementOA(ActionEvent actionEvent) throws IOException {
    }

    @javafx.fxml.FXML
    public void UpdateTollViolationOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo(".fxml");
    }

    @javafx.fxml.FXML
    public void LogOutOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("login.fxml");
    }

    @javafx.fxml.FXML
    public void ManageExpemptionOA(ActionEvent actionEvent) throws IOException {
    }

    @javafx.fxml.FXML
    public void dashboardOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/Controllers/TrafficControlOfficer/Dashboard_TCO.fxml");
    }

    @javafx.fxml.FXML
    public void GenerateDailyReportOA(ActionEvent actionEvent) throws IOException {
    }

    @javafx.fxml.FXML
    public void manageLaneOA(ActionEvent actionEvent) throws IOException {
    }

    @javafx.fxml.FXML
    public void emergencyModeOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/Controllers/TrafficControlOfficer/G_8_VIPMovement.fxml");
    }
}