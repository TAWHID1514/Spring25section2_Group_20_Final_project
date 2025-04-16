package cse_213.final_project.Fima.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Tollcollector {

    @FXML
    private TableColumn<?, ?> RegNumtablecolumn;

    @FXML
    private TableColumn<?, ?> amounttablecolumn;

    @FXML
    private TextField amounttextfield;

    @FXML
    private DatePicker datedatepicker;

    @FXML
    private TableColumn<?, ?> datetablecolumn;

    @FXML
    private TextField regnumtextfield;

    @FXML
    private TableView<?> showdatatableview;

    @FXML
    private Label showmassagelable;

    @FXML
    private ComboBox<?> vehicleTypecombobox;

    @FXML
    private TableColumn<?, ?> vehicleTypetablecolumn;

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
