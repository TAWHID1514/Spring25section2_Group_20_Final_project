package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import cse_213.final_project.Tawhid.EmergancyData;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class G_5_EmergencyModeController
{
    @javafx.fxml.FXML
    private RadioButton lane6;
    @javafx.fxml.FXML
    private RadioButton lane5;
    @javafx.fxml.FXML
    private RadioButton lane4;
    @javafx.fxml.FXML
    private RadioButton lane3;
    @javafx.fxml.FXML
    private RadioButton lane2;
    @javafx.fxml.FXML
    private RadioButton lane1;
    @javafx.fxml.FXML
    private ToggleGroup lane;
    @javafx.fxml.FXML
    private TextField regNoTF;
    @javafx.fxml.FXML
    private ComboBox<String> reasonComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        reasonComboBox.getItems().addAll(
                "Emergency patient",
                "Student - May miss exam",
                "Expatriate - May miss flight"
        );
    }


    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {
        RadioButton selectedLane = (RadioButton) lane.getSelectedToggle();
        String lane = selectedLane != null ? selectedLane.getText() : "No lane selected";
        String reason = reasonComboBox.getValue();
        String registrationNo = regNoTF.getText();
        EmergancyData data = new EmergancyData(lane, reason, registrationNo);
        try (FileOutputStream fileOutputStream = new FileOutputStream("data.bin");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(data);
        } catch (IOException e) {
            e.getMessage();
        }


    }


    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/Dashboard_TCO.fxml");

    }


}