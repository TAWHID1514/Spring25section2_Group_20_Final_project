package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PayTollBooth2 {

    @FXML
    private ComboBox<String> vehiclesTypecombox;

    @FXML
    private Label TollAmountLabelfxid;

    @FXML
    private TextField tagidfxid;

    @FXML
    private Label PaymentStatusfxid;

    @FXML
    private Label PayTollBoothfxid;

    private Map<String, Double> tollRates;

    @FXML
    public void initialize() {
        // Initialize vehicle types
        vehiclesTypecombox.getItems().addAll("Car", "Truck", "Bus", "Motorcycle");

        // Simulated toll rates (could come from a database or admin config)
        tollRates = new HashMap<>();
        tollRates.put("Car", 50.0);
        tollRates.put("Truck", 100.0);
        tollRates.put("Bus", 80.0);
        tollRates.put("Motorcycle", 30.0);
    }

    @FXML
    public void CalculateOnaction(ActionEvent actionEvent) {
        String selectedType = vehiclesTypecombox.getValue();
        if (selectedType != null && tollRates.containsKey(selectedType)) {
            double amount = tollRates.get(selectedType);
            TollAmountLabelfxid.setText("Tk " + amount);
            PaymentStatusfxid.setText("");
        } else {
            TollAmountLabelfxid.setText("N/A");
            PaymentStatusfxid.setText("Please select a valid vehicle type.");
        }
    }

    @FXML
    public void HandlePaymentOnaction(ActionEvent actionEvent) {
        String tagId = tagidfxid.getText();
        String selectedType = vehiclesTypecombox.getValue();

        if (tagId.isEmpty() || selectedType == null) {
            PaymentStatusfxid.setText("Please enter E-Tag ID and select a vehicle type.");
            return;
        }

        // Simulate tag validation and balance check (can be replaced with DB logic)
        boolean isTagValid = tagId.startsWith("ET"); // basic validation
        double toll = tollRates.getOrDefault(selectedType, 0.0);

        if (isTagValid) {
            // Simulate successful payment
            PaymentStatusfxid.setText("Payment of Tk " + toll + " successful for " + tagId);
        } else {
            PaymentStatusfxid.setText("Invalid E-Tag ID.");
        }
    }

    @FXML
    public void backOnaction(ActionEvent actionEvent) {
        // Navigation logic to go back
    }
}