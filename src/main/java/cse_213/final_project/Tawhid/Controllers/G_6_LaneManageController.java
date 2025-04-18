package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.IOException;

public class G_6_LaneManageController
{
    @javafx.fxml.FXML
    private TableColumn LanetwoCOL;
    @javafx.fxml.FXML
    private TableColumn LanethreeCOL;
    @javafx.fxml.FXML
    private TableColumn LanetfourCOL;
    @javafx.fxml.FXML
    private TableColumn laneSixCOL;
    @javafx.fxml.FXML
    private TableView alortedTV;
    @javafx.fxml.FXML
    private TableColumn laneFiveCol;
    @javafx.fxml.FXML
    private TableColumn LaneoneCOL;
    @javafx.fxml.FXML
    private ComboBox Lane5CB;
    @javafx.fxml.FXML
    private ComboBox Lane6CB;
    @javafx.fxml.FXML
    private ComboBox Lane1CB;
    @javafx.fxml.FXML
    private ComboBox Lane2CB;
    @javafx.fxml.FXML
    private ComboBox Lane3CB;
    @javafx.fxml.FXML
    private ComboBox Lane4CB;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void SaveOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AllowRouteOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/Dashboard_TCO.fxml");
    }
}