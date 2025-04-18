package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.IOException;

public class G_8_VIPmovementController
{

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void OpenLaneOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void closeLaneOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/Dashboard_TCO.fxml");
    }
}