package cse_213.final_project.Fima.Controllers;

import cse_213.final_project.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ShiftAttendance
{
    @javafx.fxml.FXML
    private RadioButton NIGHTRADIOBUTTON;
    @javafx.fxml.FXML
    private TableColumn TollBoothNumberTABLECOLUMN;
    @javafx.fxml.FXML
    private TableColumn StartTimeTABLECOLUMN;
    @javafx.fxml.FXML
    private TableColumn DateTABLECOLUMN;
    @javafx.fxml.FXML
    private TextField IDTEXTFIELD;
    @javafx.fxml.FXML
    private TableView SHOWDATATABLEVIEW;
    @javafx.fxml.FXML
    private TableColumn OperatorNameTABLECOLUMN;
    @javafx.fxml.FXML
    private TableColumn ShiftTABLECOLUMN;
    @javafx.fxml.FXML
    private TextField STARTTIMETEXTFIELD;
    @javafx.fxml.FXML
    private TextField ENDTIMETEXTFIELD;
    @javafx.fxml.FXML
    private ComboBox TOLLBOOTHnumberCOMBOBOX;
    @javafx.fxml.FXML
    private RadioButton DAYRADIOBUTTON;
    @javafx.fxml.FXML
    private TableColumn EndTimeTABLECOLUMN;
    @javafx.fxml.FXML
    private TableColumn IDTABLECOLUMN;
    @javafx.fxml.FXML
    private TextField OPERATORNAMETEXTFIELD;
    @javafx.fxml.FXML
    private DatePicker DATEDATEPICKER;
    ToggleGroup tg;

    @javafx.fxml.FXML
    public void initialize() {
        tg = new ToggleGroup();
        NIGHTRADIOBUTTON.setToggleGroup(tg);
        DAYRADIOBUTTON.setToggleGroup(tg);





    }

    @javafx.fxml.FXML
    public void SUBMITONACTIONBUTTON(ActionEvent actionEvent) {
        String Shift="";
        if(NIGHTRADIOBUTTON.isSelected())
            Shift ="Night";
        else if (DAYRADIOBUTTON.isSelected())
            Shift="Day";
    }

    @javafx.fxml.FXML
    public void BACKONACTIONBUTTON(ActionEvent actionEvent)  throws IOException {

    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TollBoothOperator_Dashboard_V1.fxml"));
    Scene scene = new Scene(fxmlLoader.load());
    Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
    stage.setTitle("Hello");
    stage.setScene(scene);
    stage.show();
    }
}