package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class LiaisonOfficerDashboard {


    @FXML
    public void initialize() {
    }

    @FXML
    void CrisisResponseonactionbutton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Dispatch Maintenance Team.fxml"));
        Node node = fxmlLoader.load() ;
        BorderPane dashboardBP = new BorderPane();
        dashboardBP.setCenter(node);


    }

    @FXML
    void ExternalInquiriesonactionbutton(ActionEvent event) {

    }

    @FXML
    void IncidentReportsfromPlazaonactionbutton(ActionEvent event) {

    }

    @FXML
    void InterdepartmentalCommunicationonactionbutton(ActionEvent event) {

    }

    @FXML
    void LogOutonactionbutton(ActionEvent event) {

    }

    @FXML
    void MeetingScheduleronactionbutton(ActionEvent event) {

    }

    @FXML
    void ShiftReportsonactionbutton(ActionEvent event) {

    }

    @FXML
    void SystemFailureReportonactionbutton(ActionEvent event) {

    }

    @FXML
    void TollBoothStaffandManagementonactionbutton(ActionEvent event) {

    }

}
