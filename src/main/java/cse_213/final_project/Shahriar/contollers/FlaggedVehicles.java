package cse_213.final_project.Shahriar.contollers;

import com.sun.javafx.charts.Legend;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import jdk.internal.icu.text.NormalizerBase;

import java.awt.*;
import java.text.BreakIterator;

public class FlaggedVehicles
{
    private TableView<FlaggedVehicle> tableview;

    @FXML
    private TableColumn<FlaggedVehicle, String> vehiclesNocolum;
    @FXML
    private TableColumn<FlaggedVehicles, String> statuscolum;
    @FXML
    private TableColumn<FlaggedVehicles, String> reasoncolum;
    @FXML
    private TableColumn<FlaggedVehicles, String> finecolum;
    @FXML
    private TableColumn<FlaggedVehicles, String> flaggedDatecolum;

    @FXML
    public void initialize() {
        vehiclesNocolum.setCellValueFactory(new PropertyValueFactory<>("vehicleNo"));
        statuscolum.setCellValueFactory(new PropertyValueFactory<>("status"));
        reasoncolum.setCellValueFactory(new PropertyValueFactory<>("reason"));
        finecolum.setCellValueFactory(new PropertyValueFactory<>("fine"));
        flaggedDatecolum.setCellValueFactory(new PropertyValueFactory<>("flaggedDate"));

        // Sample data (replace with actual DB or logic)
        ObservableList<FlaggedVehicle> flaggedList = FXCollections.observableArrayList(
                new FlaggedVehicle("ABC123",
                        "Pending",
                        "Unpaid Toll",
                        "$50",
                        "2025-04-20"),
                new FlaggedVehicle("XYZ789", "Confirmed", "Speeding", "$100", "2025-04-18")
        );
        tableview.setItems(flaggedList);
    }

    @FXML
    public void confirmedFlagOnaction(ActionEvent actionEvent) {
        FlaggedVehicle selected = (FlaggedVehicle) tableview.getSelectionModel().getSelectedItem();
        if (selected != null) {
            tableview.getItems();
            // Logic to update status in DB (if connected)
        }
    }

    @FXML
    public void forwardtoflagOnaction(ActionEvent actionEvent) {
    FlaggedVehicle selected = (FlaggedVehicle) tableview.getSelectionModel().getSelectedItem();
    if (selected != null) {
        NormalizerBase textArea = null;
        textArea.setText("Forwarded flag for vehicle: " + selected.getVehicleNo());
    }
}

    @FXML
    public void removeFlagOnaction(ActionEvent actionEvent) {
        FlaggedVehicle selected = (FlaggedVehicle) tableview.getSelectionModel().getSelectedItem();
        if (selected != null) {
            tableview.getItems().remove(selected);
            Legend.LegendItem textArea = null;
            textArea.setText("Removed flag for vehicle: " + selected.getVehicleNo());
        }
    }

    @FXML
    public void backOnaction(ActionEvent actionEvent) {
    }
}