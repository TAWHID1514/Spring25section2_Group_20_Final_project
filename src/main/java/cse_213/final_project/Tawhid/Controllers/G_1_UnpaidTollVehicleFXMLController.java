package cse_213.final_project.Tawhid.Controllers;

import cse_213.final_project.SceneSwitcher;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class G_1_UnpaidTollVehicleFXMLController
{
    @javafx.fxml.FXML
    private TextField carRegNOTF;
    @javafx.fxml.FXML
    private DatePicker ruleBreakDateDP;
    @javafx.fxml.FXML
    private TextField tollAmountTF;
    @javafx.fxml.FXML
    private ComboBox<String> vehicleTypeCB;
    @javafx.fxml.FXML
    private Label massagelabe;
    @FXML
    private Button regestrationbutton;

    @Deprecated
    public void initialize() {
        vehicleTypeCB.getItems().addAll("2 wheeler","3 wheeler","4 wheeler","6 wheeler","10 wheeler","14 wheeler", "18 wheeler","22 wheeler","26 wheeler");
        vehicleTypeCB.setOnAction(e -> {
            String selected = vehicleTypeCB.getSelectionModel().getSelectedItem();
            int toll = switch (selected) {
                case "2 wheeler" -> 90;
                case "3 wheeler" -> 100;
                case "4 wheeler" -> 150;
                case "6 wheeler" -> 200;
                case "10 wheeler" -> 300;
                case "14 wheeler" -> 400;
                case "18 wheeler" -> 500;
                case "22 wheeler" -> 800;
                case "26 wheeler" -> 1000;
                default -> 0;
            };

            tollAmountTF.setText(toll + " Taka");
        });
    }

    @javafx.fxml.FXML
    public void registerOA(ActionEvent actionEvent) {
        String vehicleType = vehicleTypeCB.getValue();
        String registration = carRegNOTF.getText();
        LocalDate date = ruleBreakDateDP.getValue();
        String tollAmount = tollAmountTF.getText();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("unpaidTollInfo.bin", true))) {
            oos.writeObject("Vehicle Type: " + vehicleType);
            oos.writeObject("Registration No: " + registration);
            oos.writeObject("Date: " + date);
            oos.writeObject("Toll Amount: " + tollAmount);
            System.out.println("Saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
    @FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/Dashboard_TCO.fxml");

    }
}