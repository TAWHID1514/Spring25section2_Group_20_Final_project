package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

import static cse_213.final_project.Mehrab.SceneSwitcher.switchScene;

public class VehiclesDashboard
{
    @javafx.fxml.FXML
    private Label vehiclesOwnerfxid;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewtoolpaymenthistoryOnaction(ActionEvent actionEvent) {
        switchScene(actionEvent, "/fxml/view_history.fxml");//goal4
    }

    @javafx.fxml.FXML
    public void handleupdatevehiclesInformationOnaction(ActionEvent actionEvent) {
        switchScene(actionEvent, "/fxml/update_vehicle.fxml");//goal5
    }

    @javafx.fxml.FXML
    public void logOutOnaction(ActionEvent actionEvent) {
        switchScene(actionEvent, "/fxml/login.fxml");
    }

    @javafx.fxml.FXML
    public void handleDownloadTollRecieptOnaction(ActionEvent actionEvent) {
        switchScene(actionEvent, "/fxml/download_receipt.fxml");//goal7
    }

    @javafx.fxml.FXML
    public void handleRechargeEtagblanceOnaction(ActionEvent actionEvent) {
        switchScene(actionEvent, "/fxml/recharge_etag.fxml");//goal2
    }

    @javafx.fxml.FXML
    public void handleEtagBlanceOnaction(Event event) {
        switchScene((ActionEvent) event, "/fxml/check_balance.fxml");//goal8
    }

    @javafx.fxml.FXML
    public void handleReportaproblemOnaction(ActionEvent actionEvent) {
        switchScene(actionEvent, "/fxml/report_problem.fxml");//goal6
    }

    @javafx.fxml.FXML
    public void handlePaytoolboothOnaction(ActionEvent actionEvent) {
        switchScene(actionEvent, "/fxml/pay_toll.fxml");//goal3
    }

    @javafx.fxml.FXML
    public void handleRegisterVehiclesOnAction(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "/fxml/register_vehicle.fxml");//goal1
    }
    private void switchScene(ActionEvent event, String fxmlPath) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); // get current stage
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}