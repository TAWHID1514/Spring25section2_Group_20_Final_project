package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UpdateVehiclesInfo2 {

    @FXML
    private ComboBox<String> vehiclesTypecombox;
    @FXML
    private TextField uploaddocumentfxid;
    @FXML
    private Label UpdateVehicleInfofxid;
    @FXML
    private TextField licensePlatefxid;
    @FXML
    private TextField vehiclesIdfxid;

    @FXML
    public void initialize() {
        vehiclesTypecombox.getItems().addAll("Car", "Bus", "Truck", "CNG", "Motorbike");
        vehiclesTypecombox.setPromptText("Select Vehicle Type");
    }

    @FXML
    public void updateProfileOnaction(ActionEvent actionEvent) {
        String id = vehiclesIdfxid.getText().trim();

        if (id.isEmpty()) {
            UpdateVehicleInfofxid.setText("Please enter a valid Vehicle ID to load data.");
            return;
        }

        // Simulate loading vehicle info — you can fetch real data from DB or file here
        licensePlatefxid.setText("DHK-1234");
        vehiclesTypecombox.setValue("Car");
        uploaddocumentfxid.setText("updated_registration_doc.pdf");
        UpdateVehicleInfofxid.setText("Loaded info for Vehicle ID: " + id);
    }

    @FXML
    public void SaveClickOnaction(ActionEvent actionEvent) {
        String id = vehiclesIdfxid.getText().trim();
        String license = licensePlatefxid.getText().trim();
        String type = vehiclesTypecombox.getValue();
        String document = uploaddocumentfxid.getText().trim();

        if (id.isEmpty() || license.isEmpty() || type == null || document.isEmpty()) {
            UpdateVehicleInfofxid.setText("Please fill all fields before saving.");
            return;
        }

        // Simulate saving the updated vehicle info
        UpdateVehicleInfofxid.setText("Vehicle info updated successfully for ID: " + id);
    }

    @FXML
    public void backOnaction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/vehicle_owner_dashboard.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}