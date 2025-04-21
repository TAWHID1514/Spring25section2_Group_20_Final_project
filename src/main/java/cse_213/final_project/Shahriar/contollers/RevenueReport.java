package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.*;

public class RevenueReport
{
    @javafx.fxml.FXML
    private TableColumn vehiclesTypecolum;
    @javafx.fxml.FXML
    private ComboBox vehiclesTypecombobox;
    @javafx.fxml.FXML
    private TableColumn vehiclescountcolum;
    @javafx.fxml.FXML
    private TableView Tableviewfxid;
    @javafx.fxml.FXML
    private TextField vehiclescountfxid;
    @javafx.fxml.FXML
    private TableColumn datepickercolum;
    @javafx.fxml.FXML
    private DatePicker datepickerfxid;
    @javafx.fxml.FXML
    private TableColumn amountcollectcolum;
    @javafx.fxml.FXML
    private TextField amountcollectfxid;
    @javafx.fxml.FXML
    private Label revenuereportfxid;
    @javafx.fxml.FXML
    private TableColumn totalcolum;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void downloadReportpdfonAction(ActionEvent actionEvent) {
    }
}