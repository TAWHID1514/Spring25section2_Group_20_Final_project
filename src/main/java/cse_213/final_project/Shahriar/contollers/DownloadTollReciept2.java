package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class DownloadTollReciept2 {

    @FXML
    private DatePicker Datepickerfxid;
    @FXML
    private Button Downloadrecieptfxid;
    @FXML
    private Label DownloadTollRecieptFxid;
    @FXML
    private Button SearchRecieptfxid;
    @FXML
    private ComboBox<String> paymentmethodfxid;
    @FXML
    private TextField Transactionfxidd;
    @FXML
    private TextField Amountfxid;
    @FXML
    private TextArea textAreafxid;
    @FXML
    private TextField vehicleNofxid;
    @FXML
    private Label recipetfoundlabel;

    @FXML
    public void initialize() {
        paymentmethodfxid.getItems().addAll("Card", "Mobile Banking", "Cash", "E-Tag Balance");
        paymentmethodfxid.setPromptText("Select Method");

        Amountfxid.setEditable(false);
        vehicleNofxid.setEditable(false);
        textAreafxid.setEditable(false);
    }

    @FXML
    public void searchRecieptOnaction(ActionEvent actionEvent) {
        String txnId = Transactionfxidd.getText().trim();
        LocalDate date = Datepickerfxid.getValue();

        // Simulated match
        if (txnId.equals("TXN20250415") || (date != null && date.equals(LocalDate.of(2025, 4, 15)))) {
            vehicleNofxid.setText("DHK-ABC123");
            Amountfxid.setText("200.00 BDT");
            paymentmethodfxid.setValue("E-Tag Balance");
            textAreafxid.setText("Payment confirmed. Thank you for using Padma Bridge Toll System.");
            recipetfoundlabel.setText("Receipt found.");
        } else {
            vehicleNofxid.clear();
            Amountfxid.clear();
            textAreafxid.clear();
            paymentmethodfxid.getSelectionModel().clearSelection();
            recipetfoundlabel.setText("No receipt found for given input.");
        }
    }

    @FXML
    public void DownloadRecieptOnaction(ActionEvent actionEvent) {
        if (vehicleNofxid.getText().isEmpty()) {
            DownloadTollRecieptFxid.setText("Search for a receipt first.");
        } else {
            // In a real project, you'd generate a PDF file here
            DownloadTollRecieptFxid.setText("Receipt downloaded as PDF.");
        }
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