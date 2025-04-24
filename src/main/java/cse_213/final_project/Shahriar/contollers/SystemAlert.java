package cse_213.final_project.Shahriar.contollers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class SystemAlert {

    @FXML
    private TableColumn<AlertEntry, String> issuecolum;
    @FXML
    private TableColumn<AlertEntry, String> lanecolum;
    @FXML
    private TableColumn<AlertEntry, String> componentcolum;
    @FXML
    private TableColumn<AlertEntry, String> timecolum;
    @FXML
    private TableView<AlertEntry> tableView;
    @FXML
    private Label satusLabelfxid;
    @FXML
    private Label SystemAlertfxid;

    private final ObservableList<AlertEntry> alertData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        issuecolum.setCellValueFactory(new PropertyValueFactory<>("issue"));
        lanecolum.setCellValueFactory(new PropertyValueFactory<>("lane"));
        componentcolum.setCellValueFactory(new PropertyValueFactory<>("component"));
        timecolum.setCellValueFactory(new PropertyValueFactory<>("time"));

        tableView.setItems(alertData);
    }

    @FXML
    public void refreshAlertOnaction(ActionEvent actionEvent) {
        // Simulated system alerts — in real system this would fetch live data
        alertData.clear();
        alertData.addAll(
                new AlertEntry("Barrier Jammed", "Lane 1", "Barrier Motor", "2025-04-21 09:32"),
                new AlertEntry("RFID Scanner Offline", "Lane 3", "RFID Reader", "2025-04-21 10:05"),
                new AlertEntry("Camera Feed Lost", "Lane 2", "CCTV Camera", "2025-04-21 10:15")
        );
        satusLabelfxid.setText("System alerts refreshed.");
    }
}   