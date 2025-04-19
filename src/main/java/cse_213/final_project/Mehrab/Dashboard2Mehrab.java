package cse_213.final_project.Mehrab;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Dashboard2Mehrab
{
    @javafx.fxml.FXML
    private BorderPane dashboardBP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void dispatchMaintenanceButton(ActionEvent actionEvent)throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Dispatch Maintenance Team.fxml"));
    Node node = fxmlLoader.load() ;
    dashboardBP.setCenter(node);
}

    @javafx.fxml.FXML
    public void logTrafficIncidentButton(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Traffic Incident Log.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);
    }

    @javafx.fxml.FXML
    public void signOutOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene("login.fxml",actionEvent, "DashBoard");

    }

    @javafx.fxml.FXML
    public void sendAlertButton(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sendAlert.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);
    }

    @javafx.fxml.FXML
    public void evaluateResponseButton(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Evaluate Response Performance.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);
    }

    @javafx.fxml.FXML
    public void generateReportButton(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Generate Emergency Response Report.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);
    }

    @javafx.fxml.FXML
    public void OverviewOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(""));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);
    }

    @javafx.fxml.FXML
    public void monitorIncidentTImeOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MonitorIncidentResponseTime.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);
    }

    @javafx.fxml.FXML
    public void monitorRoadConditionsOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Monitor Road Conditions.fxml"));
        Node node = fxmlLoader.load() ;
        dashboardBP.setCenter(node);
    }
}