package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.HashMap;
import java.util.Map;


public class RechargeEtageBlance2 {

    @FXML
    private TextField rechargefxid; // E-Tag ID

    @FXML
    private TextField rechargeamountfxid; // Amount to recharge

    @FXML
    private ComboBox<String> rechargeMethodfxid;

    @FXML
    private Label labelStatusfxid;

    @FXML
    private Label rechargeEtagblancefxid;

    @FXML
    private AnchorPane Recharge;

    private Map<String, Double> etagBalances; // Simulated data storage

    @FXML
    public void initialize() {
        // Simulate recharge methods
        rechargeMethodfxid.getItems().addAll("Credit Card", "bKash", "Rocket", "Nagad");

        // Simulated existing E-Tag balances
        etagBalances = new HashMap<>();
        etagBalances.put("ET123", 100.0);
        etagBalances.put("ET456", 250.0);
        etagBalances.put("ET789", 400.0);
    }

    @FXML
    public void rechargeButtOnonAction(ActionEvent actionEvent) {
        String tagId = rechargefxid.getText();
        String amountText = rechargeamountfxid.getText();
        String method = rechargeMethodfxid.getValue();

        if (tagId.isEmpty() || amountText.isEmpty() || method == null) {
            labelStatusfxid.setText("Please fill all fields.");
            return;
        }

        double amount;
        try {
            amount = Double.parseDouble(amountText);
            if (amount <= 0) {
                labelStatusfxid.setText("Amount must be positive.");
                return;
            }
        } catch (NumberFormatException e) {
            labelStatusfxid.setText("Invalid amount entered.");
            return;
        }

        if (!etagBalances.containsKey(tagId)) {
            rechargeEtagblancefxid.setText("E-Tag not found.");
            return;
        }

        // Simulate balance update
        double currentBalance = etagBalances.get(tagId);
        double newBalance = currentBalance + amount;
        etagBalances.put(tagId, newBalance);

        labelStatusfxid.setText("Recharge successful via " + method + "!");
        rechargeEtagblancefxid.setText("New Balance: Tk " + newBalance);
    }

    @FXML
    public void backOnaction(ActionEvent actionEvent) {
        // Navigation logic here
    }
}
