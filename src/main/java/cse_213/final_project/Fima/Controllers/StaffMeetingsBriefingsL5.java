package cse_213.final_project.Fima.LiaisonOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class StaffMeetingsBriefingsL5 {

    @FXML
    private TableColumn<String, StaffMeetingsBriefingsL5> MeetingInfotablecolumn;

    @FXML
    private TextArea MeetingInfotextarea;

    @FXML
    private TableColumn<String, StaffMeetingsBriefingsL5> MeetingTimetablecolumn;

    @FXML
    private TextField MeetingTimetextfield;

    @FXML
    private ComboBox<String> MeetingTypecombobox;

    @FXML
    private TableColumn<String, StaffMeetingsBriefingsL5> MeetingTypetablecolumn;

    @FXML
    private RadioButton StaffAttendeesnoradiobutton;

    @FXML
    private TableColumn<String, StaffMeetingsBriefingsL5> StaffAttendeestablecolumn;

    @FXML
    private RadioButton StaffAttendeesyesradiobutton;

    @FXML
    private DatePicker meetingdatedatepicker;

    @FXML
    private TableColumn<String, StaffMeetingsBriefingsL5> meetingdatetablecolumn;

    @FXML
    private TableView<StaffMeetingsBriefingsL5> showdatratableview;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void homeonactionbutton(ActionEvent event) {

    }

    @FXML
    void submitonactionbutton(ActionEvent event) {

    }

}
