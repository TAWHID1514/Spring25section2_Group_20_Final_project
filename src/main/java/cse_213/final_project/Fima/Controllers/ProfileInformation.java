package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class ProfileInformation {

    @FXML
    private TableColumn<String, ProfileInformation> AGETABLECOLUMN;

    @FXML
    private TextField AGETEXTFIELD;

    @FXML
    private Label DateofBirthDATEPICKER;

    @FXML
    private TableColumn<String, ProfileInformation> DateofBirthTABLECOLUMN;

    @FXML
    private TableColumn<String, ProfileInformation> DateofJoiningTABLECOLUMN;

    @FXML
    private DatePicker DateofJoiningdatepicker;

    @FXML
    private RadioButton FemaleRADIOBUTTON;

    @FXML
    private TableColumn<String, ProfileInformation> GenderTABLECOLUMN;

    @FXML
    private TableColumn<String, ProfileInformation> IDTABLECOLUMN;

    @FXML
    private TextField IDTEXTFIELD;

    @FXML
    private RadioButton MALERADIOBUTTON;

    @FXML
    private TextField NAMETEXTFIELD;

    @FXML
    private TableColumn<String, ProfileInformation> NameTABLECOLUMN;

    @FXML
    private TableView<ProfileInformation> SHOWDATATABLEVIEW;

    @FXML
    private DatePicker dateofbirthdatepicker;


    @javafx.fxml.FXML
    public void initialize() {


        ArrayList<ProfileInformation> profileInformationArrayList;
        ToggleGroup tg;

        String gender="";
        if(MALERADIOBUTTON.isSelected())
            gender="Male";
        else if (FemaleRADIOBUTTON.isSelected())
            gender="Female";



    }

    @FXML
    void HOMEONACTIONBUTTON(ActionEvent event) {

    }

    @FXML
    void SUBMITONACTIONBUTTON(ActionEvent event) {

    }

}
