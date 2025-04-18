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
    private TableColumn<?, ?> MeetingInfotablecolumn;

    @FXML
    private TextArea MeetingInfotextarea;

    @FXML
    private TableColumn<?, ?> MeetingTimetablecolumn;

    @FXML
    private TextField MeetingTimetextfield;

    @FXML
    private ComboBox<?> MeetingTypecombobox;

    @FXML
    private TableColumn<?, ?> MeetingTypetablecolumn;

    @FXML
    private RadioButton StaffAttendeesnoradiobutton;

    @FXML
    private TableColumn<?, ?> StaffAttendeestablecolumn;

    @FXML
    private RadioButton StaffAttendeesyesradiobutton;

    @FXML
    private DatePicker meetingdatedatepicker;

    @FXML
    private TableColumn<?, ?> meetingdatetablecolumn;

    @FXML
    private TableView<?> showdatratableview;


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
