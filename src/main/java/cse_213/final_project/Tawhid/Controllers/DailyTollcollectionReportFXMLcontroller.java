package cse_213.final_project.Tawhid.Controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class DailyTollcollectionReportFXMLcontroller
{
    @javafx.fxml.FXML
    private DatePicker todaysDateDP;
    @javafx.fxml.FXML
    private Label AmountLabel;
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private ComboBox VehicleTypeCB;
    @javafx.fxml.FXML
    private TableColumn ratePerVehicle;
    @javafx.fxml.FXML
    private TableColumn vehicleTypeCOL;
    @javafx.fxml.FXML
    private TextField noOfVehicleTF;
    @javafx.fxml.FXML
    private TableView tollamountTV;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitAmountOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void canculateTotalOA(ActionEvent actionEvent) {
    }
}