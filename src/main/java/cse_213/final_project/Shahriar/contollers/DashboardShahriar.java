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
    @javafx.fxml.FXML
    private Label tollPlazaAdminstratorfxid;

    // Helper method for scene switching
    private void switchScene(ActionEvent event, String fxmlFile) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/" + fxmlFile));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }


    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void handleFlaggedVehicles(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "flagged_vehicles.fxml");//goal5
    }

    @Deprecated
    public void handleLanePerformance(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "lane_performance.fxml");//goal3
    }

    @Deprecated
    public void handleSetTollFees(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "set_toll_fee.fxml");//goal1
    }

    @Deprecated
    public void handleUpdateTollFees(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "update_toll_fee.fxml");//goal2
    }

    @javafx.fxml.FXML
    public void logoutonaction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleRevenueReport(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "revenue_report.fxml");//goal4
    }

    @Deprecated
    public void handleAnnouncements(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "announcement_dashboard.fxml");//goal8

    }

    @Deprecated
    public void handleSystemHealth(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "system_health.fxml");//goal7
    }



    @Deprecated
    public void handleTollTrafficReports(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "toll_traffic_report.fxml");//goal6
    }

    @javafx.fxml.FXML
    public void LanePerformanceDashboardOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void maintenanceSecheduleOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void managrtollCollectorsOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ShiftScheduleManagementOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RevenueReportonaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void FlaggedVehiclesOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void VehiclesStatisticsOnaction(Event event) {
    }

    @javafx.fxml.FXML
    public void tollratemangamentOnaction(ActionEvent actionEvent) {
    }
}