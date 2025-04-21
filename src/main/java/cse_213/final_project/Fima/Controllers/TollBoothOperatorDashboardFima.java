package cse_213.final_project.Fima.Controllers;

import cse_213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
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
    public void collecttollpaymentsonactionbutton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tollcollector.fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane_1.setCenter(node);

    }

    @javafx.fxml.FXML
    public void informationandsupportonactionbutton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Information_Support.fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane_1.setCenter(node);
    }


    @javafx.fxml.FXML
    public void logoutonactionbutton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane_1.setCenter(node);

    }

    @javafx.fxml.FXML
    public void profileinformationonactionbutton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ProfileInformation.fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane_1.setCenter(node);

    }

    @javafx.fxml.FXML
    public void shiftattendanceonactionbutton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(" ShiftAttendance .fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane_1.setCenter(node);


    }

    @javafx.fxml.FXML
    public void technicalissuesonactionbutton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(" TechnicalIssues.fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane_1.setCenter(node);

    }

    @javafx.fxml.FXML
    public  void vehicleinformationOnActionButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(" VehicleInformation.fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane_1.setCenter(node);

    }

    @javafx.fxml.FXML
    public void vipemergencyvehiclesonactionbutton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(" VipEmergencyVehicles.fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane_1.setCenter(node);

    }

}
