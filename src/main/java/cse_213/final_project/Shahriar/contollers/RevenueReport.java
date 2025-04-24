package cse_213.final_project.Shahriar.contollers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.awt.*;
import java.time.LocalDate;



public class RevenueReport<RevenueEntry> {

    @FXML
    private TableColumn<RevenueEntry, String> vehiclesTypecolum;
    @FXML
    private ComboBox<String> vehiclesTypecombobox;
    @FXML
    private TableColumn<RevenueEntry, String> vehiclescountcolum;
    @FXML
    private TableView<Object> Tableviewfxid;
    @FXML
    private TextField vehiclescountfxid;
    @FXML
    private TableColumn<RevenueEntry, String> datepickercolum;
    @FXML
    private DatePicker datepickerfxid;
    @FXML
    private TableColumn<RevenueEntry, String> amountcollectcolum;
    @FXML
    private TextField amountcollectfxid;
    @FXML
    private Label revenuereportfxid;
    @FXML
    private TableColumn<RevenueEntry, String> totalcolum;

    private final ObservableList<Object> reportData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        vehiclesTypecombobox.setItems(FXCollections.observableArrayList("Car", "Bus", "Truck", "Bike", "CNG"));

        vehiclesTypecolum.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
        vehiclescountcolum.setCellValueFactory(new PropertyValueFactory<>("vehicleCount"));
        amountcollectcolum.setCellValueFactory(new PropertyValueFactory<>("amountCollected"));
        datepickercolum.setCellValueFactory(new PropertyValueFactory<>("date"));
        totalcolum.setCellValueFactory(new PropertyValueFactory<>("total"));

        Tableviewfxid.setItems(reportData);
    }

    @FXML
    public void downloadReportpdfonAction(ActionEvent event) {
        String type = vehiclesTypecombobox.getValue();
        String countStr = vehiclescountfxid.getText();
        String amountStr = amountcollectfxid.getText();
        LocalDate date = datepickerfxid.getValue();

        if (type == null || countStr.isEmpty() || amountStr.isEmpty() || date == null) {
            revenuereportfxid.setText("Please fill in all fields.");
            return;
        }

        try {
            int count = Integer.parseInt(countStr);
            double amount = Double.parseDouble(amountStr);
            double total = count * amount;

            rebenueentry entry = new rebenueentry(type, countStr, amountStr, date.toString(), String.valueOf(total));
            reportData.add(entry);

            revenuereportfxid.setText("Report added. (Simulated download)");

            // Simulated PDF generation
            // In real use: generate PDF using iText, Apache PDFBox, etc.
        } catch (NumberFormatException e) {
            revenuereportfxid.setText("Invalid number format.");
        }
    }

    @FXML
    public void backOnaction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/admin_dashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

