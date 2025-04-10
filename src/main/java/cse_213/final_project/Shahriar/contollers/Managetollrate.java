package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Managetollrate
{
    @javafx.fxml.FXML
    private TextField tollamountfield;
    @javafx.fxml.FXML
    private Label managetollratelabelid;
    @javafx.fxml.FXML
    private TextField vehicletypefiled;
    @javafx.fxml.FXML
    private Label messagellabelid;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void savetollrateonaction(ActionEvent actionEvent) {
        String vehicleType = vehicletypefiled.getText();
        String tollAmount = tollamountfield.getText();

        if (vehicleType.isEmpty() || tollAmount.isEmpty()) {
            messagellabelid.setText("Please fill all fields.");
        } else {
            double amount = Double.parseDouble(tollAmount);
            if (amount > 0) {
                // Database insert logic here
                messagellabelid.setText("Toll Rate Saved Successfully!");
            } else {
                messagellabelid.setText("Invalid Toll Amount!");
            }
        }
    }

}