package cse_213.final_project.Tawhid.Controllers;

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

    @javafx.fxml.FXML
    public void ResolveDipositeOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void FlagASuspicusCarOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void trackUnpaidTollVehicleOA(ActionEvent actionEvent) throws IOException {
        Parent root =null;
        FXMLLoader fxmlLoader = new FXMLLoader(UnpaidTollVehicleFXMLController.class.getResource("UnpaidTollVehicle.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
//        Stage stage = new Stage();
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Create your Account!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void EmergencyMovementOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void UpdateTollViolationOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LogOutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ManageExpemptionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dashboardOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void GenerateDailyReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void manageLaneOA(ActionEvent actionEvent) {
    }
}