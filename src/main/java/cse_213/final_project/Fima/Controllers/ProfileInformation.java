package cse_213.final_project.Fima.Controllers;

import cse_213.final_project.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
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

    ArrayList<ProfileInformation> profileInformationArrayList;
    ToggleGroup tg;



    @javafx.fxml.FXML
    public void initialize() {


       tg = new ToggleGroup();
        MALERADIOBUTTON.setToggleGroup(tg);
        FemaleRADIOBUTTON.setToggleGroup(tg);






    }

    @FXML
    void HOMEONACTIONBUTTON(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TollBoothOperator_Dashboard_V1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setTitle("Hello");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void SUBMITONACTIONBUTTON(ActionEvent event) {
        String gender="";
        if(MALERADIOBUTTON.isSelected())
            gender="Male";
        else if (FemaleRADIOBUTTON.isSelected())
            gender="Female";




    }

}
