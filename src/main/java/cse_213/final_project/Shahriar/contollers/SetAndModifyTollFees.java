package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.*;

public class SetAndModifyTollFees {

    @FXML
    private Label labelStatusfxid;
    @FXML
    private ComboBox<String> vehicletypecombobox;
    @FXML
    private TextField tollAmountfxid;
    @FXML
    private Label setMOdifyTollFeesfxid;
    @FXML
    private DatePicker datepicker;

    @FXML
    public void initialize() {
        vehicletypecombobox.getItems().addAll("Car", "Bus", "Truck", "Bike", "CNG", "Emergency Vehicle");
        vehicletypecombobox.setPromptText("Select Vehicle Type");
    }

    @FXML
    public void updateTollRateonaction(ActionEvent actionEvent) {
        String vehicleType = vehicletypecombobox.getValue();
        String amountText = tollAmountfxid.getText().trim();
        String date = (datepicker.getValue() != null) ? datepicker.getValue().toString() : null;

        if (vehicleType == null || amountText.isEmpty() || date == null) {
            labelStatusfxid.setText("Please fill in all fields.");
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);
            // Simulate toll rate being set
            labelStatusfxid.setText("Toll rate for " + vehicleType + " set to " + amount + " BDT on " + date + ".");
        } catch (NumberFormatException e) {
            labelStatusfxid.setText("Please enter a valid number for toll amount.");
        }
    }

    @FXML
    public void homeOnaction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/admin_dashboard.fxml")); // Adjust if different
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}