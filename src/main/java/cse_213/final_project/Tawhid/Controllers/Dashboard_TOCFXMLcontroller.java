package cse_213.final_project.Tawhid.Controllers;

import cse_213.final_project.SceneSwitcher;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Dashboard_TOCFXMLcontroller
{
    @javafx.fxml.FXML
    private BorderPane TrafficControlOfficerBP;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void FlagASuspicusCarOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/G_7_flagVehicle.fxml");
    }

    @javafx.fxml.FXML
    public void trackUnpaidTollVehicleOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/G_1_UnpaidTollVehicle.fxml");
    }

    @javafx.fxml.FXML
    public void EmergencyMovementOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/G_8_VIPmovement.fxml");
    }

    @javafx.fxml.FXML
    public void UpdateTollViolationOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/G_2_updateViolationRecord.fxml");

    }

    @javafx.fxml.FXML
    public void LogOutOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("login.fxml");
    }

    @javafx.fxml.FXML
    public void ManageExpemptionOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/G_3_ManageExemption.fxml");
    }

    @javafx.fxml.FXML
    public void dashboardOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Dashboard_TCO.fxml");
    }

    @javafx.fxml.FXML
    public void GenerateDailyReportOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/G_4_dailyTollcollectionReport.fxml");
    }

    @javafx.fxml.FXML
    public void manageLaneOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/G_6_LaneManage.fxml");
    }

    @javafx.fxml.FXML
    public void emergencyModeOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/G_5_emergancymode.fxml");
    }
}