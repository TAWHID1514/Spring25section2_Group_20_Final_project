package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;



public class ShiftAttendance {

    @FXML
    private DatePicker DATEDATEPICKER;

    @FXML
    private RadioButton DAYRADIOBUTTON;

    @FXML
    private TableColumn<String, ShiftAttendance> DateTABLECOLUMN;

    @FXML
    private TextField ENDTIMETEXTFIELD;

    @FXML
    private TableColumn<String, ShiftAttendance> EndTimeTABLECOLUMN;

    @FXML
    private TableColumn<String, ShiftAttendance> IDTABLECOLUMN;

    @FXML
    private TextField IDTEXTFIELD;

    @FXML
    private RadioButton NIGHTRADIOBUTTON;

    @FXML
    private TextField OPERATORNAMETEXTFIELD;

    @FXML
    private TableColumn<String, ShiftAttendance> OperatorNameTABLECOLUMN;

    @FXML
    private TableView<ShiftAttendance> SHOWDATATABLEVIEW;

    @FXML
    private TextField STARTTIMETEXTFIELD;

    @FXML
    private TableColumn<String, ShiftAttendance> ShiftTABLECOLUMN;

    @FXML
    private TableColumn<String, ShiftAttendance> StartTimeTABLECOLUMN;

    @FXML
    private TableColumn<String, ShiftAttendance> TollBoothNumberTABLECOLUMN;
    @FXML
    private ComboBox TOLLBOOTHnumberCOMBOBOX;


    @javafx.fxml.FXML
    public void initialize() {


        TOLLBOOTHnumberCOMBOBOX.getItems().addAll("1","2","3","4","5","6");


        IDTABLECOLUMN.setCellValueFactory(new PropertyValueFactory<String,ShiftAttendance>("ID"));
        OperatorNameTABLECOLUMN.setCellValueFactory(new PropertyValueFactory<String,ShiftAttendance>("Operator Name"));
        DateTABLECOLUMN.setCellValueFactory(new PropertyValueFactory<String,ShiftAttendance>(" Date "));
        ShiftTABLECOLUMN.setCellValueFactory(new PropertyValueFactory<String,ShiftAttendance>("Shift"));
        TollBoothNumberTABLECOLUMN.setCellValueFactory(new PropertyValueFactory<String,ShiftAttendance>("Toll Booth Number"));
        StartTimeTABLECOLUMN.setCellValueFactory(new PropertyValueFactory<String,ShiftAttendance>("Start Time"));
        EndTimeTABLECOLUMN.setCellValueFactory(new PropertyValueFactory<String,ShiftAttendance>("End Time"));



        ArrayList<ShiftAttendance> shiftAttendanceArrayList;
        ToggleGroup tg;

        String Shift ="";

        if(DAYRADIOBUTTON.isSelected())
            Shift="Day";
        else if (NIGHTRADIOBUTTON.isSelected())
            Shift="Night";

    }

    @FXML
    void BACKONACTIONBUTTON(ActionEvent event) {

    }

    @FXML
    void SUBMITONACTIONBUTTON(ActionEvent event) {

    }

}
