package cse_213.final_project.Fima.Controllers;

import cse_213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class TollBoothOperatorDashboardFima {


    @FXML
    private BorderPane DashboardBorderPane_1;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void collecttollpaymentsonactionbutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("Fima/Controllers/TollBoothOperator/.fxml");

    }

    @FXML
    void informationandsupportonactionbutton(ActionEvent event) {

    }

    @FXML
    void logoutonactionbutton(ActionEvent event) {

    }

    @FXML
    void profileinformationonactionbutton(ActionEvent event) {

    }

    @FXML
    void shiftattendanceonactionbutton(ActionEvent event) {

    }

    @FXML
    void technicalissuesonactionbutton(ActionEvent event) {

    }

    @FXML
    void vehicleinformationOnActionButton(ActionEvent event) {

    }

    @FXML
    void vipemergencyvehiclesonactionbutton(ActionEvent event) {

    }

}
