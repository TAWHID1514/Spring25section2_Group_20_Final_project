package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RevenueReportGeneration
{
    @javafx.fxml.FXML
    private TableColumn datecloumfxid;
    @javafx.fxml.FXML
    private Label tofxid;
    @javafx.fxml.FXML
    private TableView tableviewfxid;
    @javafx.fxml.FXML
    private DatePicker toDatefxid;
    @javafx.fxml.FXML
    private Label revenueReportfxid;
    @javafx.fxml.FXML
    private TableColumn revenueAmountcolumfxid;
    @javafx.fxml.FXML
    private DatePicker fromDatefxid;

    @javafx.fxml.FXML
    public void initialize() {
        // Initialize DB connection
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tollplaza", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Link table columns to RevenueData properties
//        dateColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
//        amountColumn.setCellValueFactory(cellData -> cellData.getValue().amountProperty().asObject());
    }

    @javafx.fxml.FXML
    public void revenueReportOnaction(ActionEvent actionEvent) {
    }
}