package cse_213.final_project.Shahriar.contollers;

import cse_213.final_project.Shahriar.modelclass2.Announcement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.awt.*;
import java.time.LocalDate;

public class AnnouncementController {

    @FXML
    private TableColumn<Announcement, String> titlecolum;
    @FXML
    private TableColumn<Announcement, String> audiencecolum;
    @FXML
    private TableColumn<Announcement, String> datecolum;
    @FXML
    private TableView<Announcement> tableView;
    @FXML
    private TextField titlefxid;
    @FXML
    private TextArea areamessage;
    @FXML
    private ComboBox<String> audiencecombobox;
    @FXML
    private Label AnnounceementControllerfxid;

    private ObservableList<Announcement> announcements = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize table columns
        titlecolum.setCellValueFactory(new PropertyValueFactory<>("title"));
        audiencecolum.setCellValueFactory(new PropertyValueFactory<>("audience"));
        datecolum.setCellValueFactory(new PropertyValueFactory<>("date"));

        tableView.setItems(announcements);

        // Populate combo box
        audiencecombobox.setItems(FXCollections.observableArrayList("All Users", "Vehicle Owners", "Toll Operators", "Police", "Finance Officer"));
    }

    @FXML
    public void handleSendOnaction(ActionEvent actionEvent) {
        String title = titlefxid.getText();
        String message = areamessage.getText();
        String audience = audiencecombobox.getValue();
        String date = LocalDate.now().toString();

        if (title.isEmpty() || message.isEmpty() || audience == null) {
            AnnounceementControllerfxid.setText("Please fill in all fields.");
            return;
        }

        announcements.add(new Announcement(title, audience, date, message));
        AnnounceementControllerfxid.setText("Announcement sent!");


        audiencecombobox.getSelectionModel().clearSelection();
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