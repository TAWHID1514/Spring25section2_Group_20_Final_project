package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.IOException;

public class G_3_1_exemptionFxmlController
{
    @javafx.fxml.FXML
    private TableColumn exemptionVehicleTypeCol;
    @javafx.fxml.FXML
    private TableView exemptionTableView;
    @javafx.fxml.FXML
    private TableColumn exemptiondrivingLicenceNoCol;
    @javafx.fxml.FXML
    private TableColumn exemptionReasonCol;
    @javafx.fxml.FXML
    private TableColumn exemptionRegNoCol;
    @javafx.fxml.FXML
    private TableColumn exemptionDateCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void rejectExemptionOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/Controllers/TrafficControlOfficer/G_3_ManageExemption.fxml");
    }

    @javafx.fxml.FXML
    public void acceptExemptionOA(ActionEvent actionEvent) {
    }
}