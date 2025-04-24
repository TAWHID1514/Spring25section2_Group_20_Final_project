package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;


public class RegisterVehicles2 {

    @FXML
    private Label filelablefxid;

    @FXML
    private TextField laicensefxid;

    private List<String> registeredVehicles; // Simulate saved vehicles

    @FXML
    public void initialize() {
        registeredVehicles = new ArrayList<>();
    }

    @FXML
    public void SubmittbuttonOnaction(ActionEvent actionEvent) {
        String licenseNo = laicensefxid.getText().trim();

        if (licenseNo.isEmpty()) {
            filelablefxid.setText("License number is required.");
            return;
        }

        // Simulate simple license format check
        if (!licenseNo.matches("[A-Z]{2}-\\d{4}")) {
            filelablefxid.setText("Invalid license format. Use format: AB-1234");
            return;
        }

        // Simulate saving to file or database (here, just a list)
        if (registeredVehicles.contains(licenseNo)) {
            filelablefxid.setText("Vehicle already registered.");
        } else {
            registeredVehicles.add(licenseNo);
            filelablefxid.setText("Vehicle " + licenseNo + " registered successfully.");
            laicensefxid.clear();
        }
    }

    @FXML
    public void backOnaction(ActionEvent actionEvent) {
        // Navigation logic here
    }
}