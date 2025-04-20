package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.IOException;

public class G4UnpaidtollListController
{
    @javafx.fxml.FXML
    private TableColumn tollUnpaidVehicleTypeCol;
    @javafx.fxml.FXML
    private RadioButton paidRadioButton;
    @javafx.fxml.FXML
    private TableColumn tollUnpaidVehicleRegNoCol;
    @javafx.fxml.FXML
    private Label regNolabel;
    @javafx.fxml.FXML
    private Label tollAmountLabel;
    @javafx.fxml.FXML
    private TableView tollUnpaidTableView;
    @javafx.fxml.FXML
    private RadioButton unpaidRadioButton;
    @javafx.fxml.FXML
    private TableColumn unpaidtollAmountCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void fileCaseOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void collectAmountOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ViewDetailsOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/PoliceAuthurity/Dashboard_PA.fxml");
    }
}