package cse_213.final_project.Tawhid.Controllers;

import cse_213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class G_2_UpdateTollviolationRecordFXMLController {
    @javafx.fxml.FXML
    private RadioButton paidRadioButton;
    @javafx.fxml.FXML
    private TextField TotalAmountTF;
    @javafx.fxml.FXML
    private ComboBox<String> vehicleTypeCB;
    @javafx.fxml.FXML
    private TextField registrationNoTF;
    @javafx.fxml.FXML
    private ToggleGroup paid;
    @javafx.fxml.FXML
    private RadioButton unpaidRadioButton;
    @javafx.fxml.FXML
    private DatePicker DateOfUpdateDP;

    @javafx.fxml.FXML
    public void initialize() {
        vehicleTypeCB.getItems().addAll(
                "2 wheeler", "3 wheeler", "4 wheeler", "6 wheeler",
                "10 wheeler", "14 wheeler", "18 wheeler", "22 wheeler", "26 wheeler"
        );


        DateOfUpdateDP.setDisable(true);
        TotalAmountTF.setDisable(true);


        paidRadioButton.setOnAction(event -> {
            DateOfUpdateDP.setDisable(true);
            TotalAmountTF.setDisable(true);
            TotalAmountTF.clear();
        });

        unpaidRadioButton.setOnAction(event -> {
            DateOfUpdateDP.setDisable(false);
            TotalAmountTF.setDisable(false);
            updateTollAmount();
        });


        vehicleTypeCB.setOnAction(event -> {
            if (unpaidRadioButton.isSelected()) {
                updateTollAmount();
            }
        });

    }

    private void updateTollAmount() {
        String selected = vehicleTypeCB.getSelectionModel().getSelectedItem();
        int toll = 0;

        switch (selected) {
            case "2 wheeler":
                toll = 90;
                break;
            case "3 wheeler":
                toll = 100;
                break;
            case "4 wheeler":
                toll = 150;
                break;
            case "6 wheeler":
                toll = 200;
                break;
            case "10 wheeler":
                toll = 300;
                break;
            case "14 wheeler":
                toll = 400;
                break;
            case "18 wheeler":
                toll = 500;
                break;
            case "22 wheeler":
                toll = 800;
                break;
            case "26 wheeler":
                toll = 1000;
                break;
        }

        TotalAmountTF.setText(toll + " Taka");
    }


    @javafx.fxml.FXML
    public void unpaidFineListOA(ActionEvent actionEvent) {
        String vehicleType = vehicleTypeCB.getValue();
        String registration = registrationNoTF.getText();
        String status = paidRadioButton.isSelected() ? "Paid" : "Unpaid";
        LocalDate date = DateOfUpdateDP.getValue();
        String amount = TotalAmountTF.getText();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("violationUpdate.bin", true))) {
            oos.writeObject("Vehicle Type: " + vehicleType);
            oos.writeObject("Registration No: " + registration);
            oos.writeObject("Status: " + status);
            oos.writeObject("Update Date: " + date);
            oos.writeObject("Amount: " + amount);
            System.out.println("Violation update saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving violation data: " + e.getMessage());
        }
    }


    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/Dashboard_TCO.fxml");
    }

    @javafx.fxml.FXML
    public void paidFineListOA(ActionEvent actionEvent) {
    }
}