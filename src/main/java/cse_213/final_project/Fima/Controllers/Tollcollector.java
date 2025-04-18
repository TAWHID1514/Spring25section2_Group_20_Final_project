package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Tollcollector {

    @FXML
    private TableColumn<String, Tollcollector> RegNumtablecolumn;

    @FXML
    private TableColumn<String, Tollcollector> amounttablecolumn;

    @FXML
    private TextField amounttextfield;

    @FXML
    private DatePicker datedatepicker;

    @FXML
    private TableColumn<String, Tollcollector> datetablecolumn;

    @FXML
    private TextField regnumtextfield;

    @FXML
    private TableView<Tollcollector> showdatatableview;

    @FXML
    private Label showmassagelable;

    @FXML
    private ComboBox<String> vehicleTypecombobox;

    @FXML
    private TableColumn<String, Tollcollector> vehicleTypetablecolumn;


    @javafx.fxml.FXML
    public void initialize() {


        vehicleTypecombobox.getItems().addAll("BUS","TRUCK","MICROBUS");




        vehicleTypetablecolumn.setCellValueFactory(new PropertyValueFactory<String,Tollcollector>(" vehicle Type"));
        RegNumtablecolumn.setCellValueFactory(new PropertyValueFactory<String,Tollcollector>("Reg Num"));
        datetablecolumn.setCellValueFactory(new PropertyValueFactory<String,Tollcollector>(" date "));
        amounttablecolumn.setCellValueFactory(new PropertyValueFactory<String,Tollcollector>(" amount "));

    }

    @FXML
    void generateOnActionButton(ActionEvent event) {

    }

    @FXML
    void paymentOnActionButton(ActionEvent event) {

    }

    @FXML
    void retryOnActionButton(ActionEvent event) {

    }

}
