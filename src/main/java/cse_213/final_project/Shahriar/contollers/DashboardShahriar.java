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

public class DashboardShahriar
{
    // Helper method for scene switching
    private void switchScene(ActionEvent event, String fxmlFile) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/" + fxmlFile));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }


    @javafx.fxml.FXML
    private Label Tollplaza;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleFlaggedVehicles(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "flagged_vehicles.fxml");//goal5
    }

    @javafx.fxml.FXML
    public void handleLanePerformance(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "lane_performance.fxml");//goal3
    }

    @javafx.fxml.FXML
    public void handleSetTollFees(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "set_toll_fee.fxml");//goal1
    }

    @javafx.fxml.FXML
    public void handleUpdateTollFees(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "update_toll_fee.fxml");//goal2
    }

    @javafx.fxml.FXML
    public void logoutonaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRevenueReport(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "revenue_report.fxml");//goal4
    }

    @javafx.fxml.FXML
    public void handleAnnouncements(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "announcement_dashboard.fxml");//goal8

    }

    @javafx.fxml.FXML
    public void handleSystemHealth(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "system_health.fxml");//goal7
    }



    @javafx.fxml.FXML
    public void handleTollTrafficReports(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "toll_traffic_report.fxml");//goal6
    }
}