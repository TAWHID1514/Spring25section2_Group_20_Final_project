package cse_213.final_project.Fima.Controllers;

import cse_213.final_project.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class VehicleInformation
{
    @javafx.fxml.FXML
    private ComboBox VehicleTypecombobox;
    @javafx.fxml.FXML
    private TableColumn VehicleTypetablecolumn;
    @javafx.fxml.FXML
    private TableColumn RegNumtablecolumn;
    @javafx.fxml.FXML
    private RadioButton noradiobutton;
    @javafx.fxml.FXML
    private ComboBox VehicleTollcombobox;
    @javafx.fxml.FXML
    private TextField regnumtextfield;
    @javafx.fxml.FXML
    private TableColumn OwnerNametablecolumn;
    @javafx.fxml.FXML
    private RadioButton Yesradiobutton;
    @javafx.fxml.FXML
    private TableColumn Regestrationtablecolumn;
    @javafx.fxml.FXML
    private TableColumn Datetablecolumn;
    @javafx.fxml.FXML
    private DatePicker datedatepicker;
    @javafx.fxml.FXML
    private TextField ownernametextfield;
    @javafx.fxml.FXML
    private Label Regestrationlable;
    @javafx.fxml.FXML
    private TableView tableview;
    @javafx.fxml.FXML
    private TableColumn VehicleTolltablecolumn;
    ArrayList<VehicleInformation> vehicleInformationArrayList;
    ToggleGroup tg;

    @javafx.fxml.FXML
    public void initialize() {
        tg = new ToggleGroup();
        noradiobutton.setToggleGroup(tg);
        Yesradiobutton.setToggleGroup(tg);

    }

    @javafx.fxml.FXML
    public void backOnActionButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TollBoothOperator_Dashboard_V1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setTitle("Hello");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void saveOnActionButton(ActionEvent actionEvent) {

        String Regestration="";
        if(noradiobutton.isSelected())
            Regestration="Yes";
        else if (Yesradiobutton.isSelected())
            Regestration="No";
    }
}