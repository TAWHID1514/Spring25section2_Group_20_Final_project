package cse_213.final_project.Shahriar.contollers;

import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ViewTollPaymentHistory2 {

    @FXML
    private DatePicker FromDatefxid;
    @FXML
    private Label messageLabelfxid;
    @FXML
    private TableColumn<PaymentRecord, String> vehiclescolum;
    @FXML
    private TextField Vehiclesfxid;
    @FXML
    private TableColumn<PaymentRecord, String> amountcolum;
    @FXML
    private TextField Amountfxid;
    @FXML
    private TableView<Object> tablefxid;
    @FXML
    private TableColumn<PaymentRecord, String> datecolum;
    @FXML
    private TableColumn<PaymentRecord, String> namecolum;
    @FXML
    private DatePicker TodateFxid;
    @FXML
    private TextField Namefxid;

    private final ObservableList<Object> allRecords = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Set up table columns
        namecolum.setCellValueFactory(new PropertyValueFactory<>("name"));
        vehiclescolum.setCellValueFactory(new PropertyValueFactory<>("vehicle"));
        amountcolum.setCellValueFactory(new PropertyValueFactory<>("amount"));
        datecolum.setCellValueFactory(new PropertyValueFactory<>("date"));

        tablefxid.setItems(allRecords);

        // Sample data
        allRecords.addAll(
                new PaymentRecord("Tawhid Bin Moslim", "Car", "200.00", "2025-04-15"),
                new PaymentRecord("Tawhid Bin Moslim", "Car", "300.00", "2025-04-18"),
                new PaymentRecord("Tawhid Bin Moslim", "Truck", "600.00", "2025-04-20")
        );
    }

    @FXML
    public <PaymentRecord> void SearchbuttonOnaction(ActionEvent actionEvent) {
        LocalDate from = FromDatefxid.getValue();
        LocalDate to = TodateFxid.getValue();

        if (from == null || to == null) {
            messageLabelfxid.setText("Please select a date range.");
            return;
        }

        ObservableList<Object> filtered = FXCollections.observableArrayList();
        for (PaymentRecord record : allRecords) {
            LocalDate recordDate = LocalDate.parse(record.getDate());
            if ((recordDate.isEqual(from) || recordDate.isAfter(from)) &&
                    (recordDate.isEqual(to) || recordDate.isBefore(to))) {
                filtered.add(record);
            }
        }

        tablefxid.setItems(filtered);
        messageLabelfxid.setText(filtered.isEmpty() ? "No records found." : "Showing results...");

        if (!filtered.isEmpty()) {
            PaymentRecord first = filtered.get(0);
            Namefxid.setText(String.valueOf(first.getClass()));
            Vehiclesfxid.setText(String.valueOf(first.getClass()));
            Amountfxid.setText(String.valueOf(first.getClass()));
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
