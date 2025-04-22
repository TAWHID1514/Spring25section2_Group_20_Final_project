package cse_213.final_project.Fima.Controllers;

import cse_213.final_project.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class VipEmergencyVehicles {

    @FXML
    private Label PriorityPassageLable;

    @FXML
    private TableColumn<String, VipEmergencyVehicles> PriorityPassagetablecolumn;

    @FXML
    private TextField RegNumTextfield;

    @FXML
    private TableColumn<String, VipEmergencyVehicles> RegNumtablecolumn;

    @FXML
    private TableColumn<String, VipEmergencyVehicles> VehicleModeltablecolumn;

    @FXML
    private ComboBox<String> VehicleTypecombobox;

    @FXML
    private TableColumn<String, VipEmergencyVehicles> VehicleTypetablecolumn;

    @FXML
    private RadioButton noradiobutton;

    @FXML
    private TableView<VipEmergencyVehicles> showdatatableview;

    @FXML
    private TextField vehiclemodeltextfield;

    @FXML
    private RadioButton yesradiobutton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void generateOnActionButton(ActionEvent event) {

    }

    @FXML
    public void homeonactionbutton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TollBoothOperator_Dashboard_V1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setTitle("Hello");
        stage.setScene(scene);
        stage.show();
    }
}
