package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class LiaisonOfficerDashboardV2 {

    @javafx.fxml.FXML
    private BorderPane DashboardBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void LogOutonactionbutton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane.setCenter(node);
    }

    @javafx.fxml.FXML
    public void ExternalInquiriesonactionbutton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(" External_InquiriesContractors_OfficialsL7.fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane.setCenter(node);
    }

    @javafx.fxml.FXML
    public void MeetingScheduleronactionbutton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(" StaffMeetings_BriefingsL5.fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane.setCenter(node);
    }

    @javafx.fxml.FXML
    public void SystemFailureReportonactionbutton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("System_FailuresL3.fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane.setCenter(node);
    }

    @javafx.fxml.FXML
    public void IncidentReportsfromPlazaonactionbutton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Incident_Reports_plazaL6.fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane.setCenter(node);
    }

    @javafx.fxml.FXML
    public void ShiftReportsonactionbutton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Daily_Shift_ReportsL2.fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane.setCenter(node);
    }

    @javafx.fxml.FXML
    public void CrisisResponseonactionbutton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Crisis_Response_CoordinationL8 .fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane.setCenter(node);
    }

    @javafx.fxml.FXML
    public void InterdepartmentalCommunicationonactionbutton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Interdepartmental_CommunicationL4 .fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane.setCenter(node);
    }

    @javafx.fxml.FXML
    public void TollBoothStaffandManagementonactionbutton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TollBooth_Staff_ManagementL1.fxml"));
        Node node = fxmlLoader.load() ;
        DashboardBorderPane.setCenter(node);
    }
}