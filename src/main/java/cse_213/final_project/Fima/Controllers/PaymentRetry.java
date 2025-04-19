package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class PaymentRetry {

    @FXML
    private TextField BOOTHOPERATORNAMETEXTFIELD;

    @FXML
    private TableColumn<String, PaymentRetry> BoothOperatorNameTABLECOLUMN;

    @FXML
    private Label IssueTypeLABLE;

    @FXML
    private TableColumn<String, PaymentRetry> IssueTypeTABLECOLUMN;

    @FXML
    private RadioButton PaymentIssueRADIOBUTTON;

    @FXML
    private TextField REGNUMBERTEXTFIELD;

    @FXML
    private TableColumn<String, PaymentRetry> RegNumTABLECOLUMN;

    @FXML
    private TableView<PaymentRetry> SHOWDATATABLEVIEW;

    @FXML
    private Label SHOWMASAGGELABLE;

    @FXML
    private TextField TOLLBOOTHNUMBERTEXTFIELD;

    @FXML
    private TableColumn<String, PaymentRetry> TollBoothNumberTABLECOLUMN;

    @FXML
    private RadioButton VehicleIssueRADIOBUTTON;

    @FXML
    private ComboBox<String> VehicleTypeCOMBOBOX;

    @FXML
    private TableColumn<String, PaymentRetry> VehicleTypeTABLECOLUMN;



    @javafx.fxml.FXML
    public void initialize() {


        VehicleTypeCOMBOBOX.getItems().addAll("BUS","TRUCK","BIKE","MICROBUS");


        IssueTypeTABLECOLUMN.setCellValueFactory(new PropertyValueFactory<String,PaymentRetry>("Issue Type"));
        VehicleTypeTABLECOLUMN.setCellValueFactory(new PropertyValueFactory<String,PaymentRetry>("Vehicle Type"));
        RegNumTABLECOLUMN.setCellValueFactory(new PropertyValueFactory<String,PaymentRetry>(" Reg Num"));
        TollBoothNumberTABLECOLUMN.setCellValueFactory(new PropertyValueFactory<String,PaymentRetry>("Toll Booth Number"));
        BoothOperatorNameTABLECOLUMN.setCellValueFactory(new PropertyValueFactory<String,PaymentRetry>("Booth Operator Name"));


        ArrayList<PaymentRetry> paymentRetryList;
        ToggleGroup tg;

        String IssueType="";
        if(PaymentIssueRADIOBUTTON.isSelected())
            IssueType="paymentissue";
        else if (VehicleIssueRADIOBUTTON.isSelected())
            IssueType="vehicleissue";


    }

    @FXML
    void HOMEONACTIONBUTTON(ActionEvent event) {

    }

    @FXML
    void SUBMITONACTIONBUTTON(ActionEvent event) {

    }

}
