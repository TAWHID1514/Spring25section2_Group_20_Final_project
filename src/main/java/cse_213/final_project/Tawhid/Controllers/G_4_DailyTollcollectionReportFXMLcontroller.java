package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import cse_213.final_project.Tawhid.vehicleDataDeposite;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Map;

public class G_4_DailyTollcollectionReportFXMLcontroller
{
    @javafx.fxml.FXML
    private DatePicker todaysDateDP;
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private ComboBox VehicleTypeCB;
    @javafx.fxml.FXML
    private TableColumn ratePerVehicle;
    @javafx.fxml.FXML
    private TableColumn vehicleTypeCOL;
    @javafx.fxml.FXML
    private TextField noOfVehicleTF;
    @javafx.fxml.FXML
    private TableView tollamountTV;
    @javafx.fxml.FXML
    private TableColumn NoOfvehicleCol;
    @javafx.fxml.FXML
    private TextField ratePerVehicleField;

    private ObservableList<vehicleDataDeposite> vehicleList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        ObservableList<String> vehicleTypes = FXCollections.observableArrayList(
                "2 wheeler", "3 wheeler", "4 wheeler", "6 wheeler",
                "10 wheeler", "14 wheeler", "18 wheeler", "22 wheeler", "26 wheeler"
        );

        Map<String, Integer> vehicleRates = Map.of(
                "2 wheeler", 90,
                "3 wheeler", 100,
                "4 wheeler", 150,
                "6 wheeler", 200,
                "10 wheeler", 300,
                "14 wheeler", 400,
                "18 wheeler", 500,
                "22 wheeler", 800,
                "26 wheeler", 1000
        );

        VehicleTypeCB.setItems(vehicleTypes);
        todaysDateDP.setValue(LocalDate.now());
        VehicleTypeCB.setOnAction(e -> {
            String selected = (String) VehicleTypeCB.getSelectionModel().getSelectedItem();
            if (selected != null) {
                ratePerVehicleField.setText(String.valueOf(vehicleRates.getOrDefault(selected, 0)));
            }
        });
    }
    @javafx.fxml.FXML
    public void canculateTotalOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/Dashboard_TCO.fxml");
    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("toll_data.bin"))) {
            for (vehicleDataDeposite data : vehicleList) {
                oos.writeObject(data);
            }
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}