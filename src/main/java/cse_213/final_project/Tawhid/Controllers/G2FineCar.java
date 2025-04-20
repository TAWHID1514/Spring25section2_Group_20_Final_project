package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.IOException;

public class G2FineCar
{
    @javafx.fxml.FXML
    private DatePicker DuedateDP;
    @javafx.fxml.FXML
    private TextField fineAmountTF;
    @javafx.fxml.FXML
    private ComboBox flaggedReasonCB;
    @javafx.fxml.FXML
    private TableColumn regNoCol;
    @javafx.fxml.FXML
    private TableColumn licenceNoCol;
    @javafx.fxml.FXML
    private TableView flaggedCarTV;
    @javafx.fxml.FXML
    private TableColumn flaggedReasonCOl;
    @javafx.fxml.FXML
    private TextField searchTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/PoliceAuthurity/Dashboard_PA.fxml");
    }
}