package cse_213.final_project.Fima.Controllers;

import cse_213.final_project.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class StaffMeetingsBriefingsL5
{
    @javafx.fxml.FXML
    private RadioButton StaffAttendeesyesradiobutton;
    @javafx.fxml.FXML
    private TableColumn StaffAttendeestablecolumn;
    @javafx.fxml.FXML
    private TableColumn meetingdatetablecolumn;
    @javafx.fxml.FXML
    private RadioButton StaffAttendeesnoradiobutton;
    @javafx.fxml.FXML
    private DatePicker meetingdatedatepicker;
    @javafx.fxml.FXML
    private TableColumn MeetingTimetablecolumn;
    @javafx.fxml.FXML
    private TableView showdatratableview;
    @javafx.fxml.FXML
    private TextField MeetingTimetextfield;
    @javafx.fxml.FXML
    private TableColumn MeetingInfotablecolumn;
    @javafx.fxml.FXML
    private TextArea MeetingInfotextarea;

    @javafx.fxml.FXML
    public void initialize() {

        ArrayList<StaffMeetingsBriefingsL5> staffMeetingsBriefingsL5ArrayList;
        ToggleGroup tg;

        String StaffAttendees="";
        if(StaffAttendeesyesradiobutton.isSelected())
            StaffAttendees="Yes";
        else if (StaffAttendeesnoradiobutton.isSelected())
            StaffAttendees="No";
    }

    @javafx.fxml.FXML
    public void homeonactionbutton(ActionEvent actionEvent)  throws IOException {

    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LiaisonOfficer_Dashboard_V2.fxml"));
    Scene scene = new Scene(fxmlLoader.load());
    Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
    stage.setTitle("Hello");
    stage.setScene(scene);
    stage.show();
    }

    @javafx.fxml.FXML
    public void submitonactionbutton(ActionEvent actionEvent) {
    }
}