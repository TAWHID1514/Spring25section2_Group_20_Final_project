package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import cse_213.final_project.Tawhid.TollData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Map;

public class G_4_DailyTollcollectionReportFXMLcontroller
{
    @javafx.fxml.FXML
    private DatePicker todaysDateDP;
    @javafx.fxml.FXML
    private TableColumn<TollData,Float> amountCol;
    @javafx.fxml.FXML
    private ComboBox<String> VehicleTypeCB;
    @javafx.fxml.FXML
    private TableColumn<TollData,Float> ratePerVehicle;
    @javafx.fxml.FXML
    private TableColumn<TollData,String> vehicleTypeCOL;
    @javafx.fxml.FXML
    private TextField noOfVehicleTF;
    @javafx.fxml.FXML
    private TableView<TollData> tollamountTV;
    @javafx.fxml.FXML
    private TableColumn<TollData,LocalDate> DateCOL;
    @javafx.fxml.FXML
    private TextField ratePerVehicleField;


    private ObservableList<TollData> tollList = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {
        VehicleTypeCB.setItems(FXCollections.observableArrayList(
                "2 wheeler", "3 wheeler", "4 wheeler", "6 wheeler",
                "10 wheeler", "14 wheeler", "18 wheeler", "22 wheeler", "26 wheeler"
        ));

        // Set today's date by default
        todaysDateDP.setValue(LocalDate.now());

        // Fill toll rate when vehicle selected
        VehicleTypeCB.setOnAction(event -> {
            String type = VehicleTypeCB.getValue();
            int rate = getRate(type);
            ratePerVehicleField.setText(String.valueOf(rate));
        });


        vehicleTypeCOL.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
        ratePerVehicle.setCellValueFactory(new PropertyValueFactory<>("ratePerVehicle"));
        amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        DateCOL.setCellValueFactory(new PropertyValueFactory<>("date"));

        tollamountTV.setItems(tollList);
    }

    private int getRate(String type) {
        if (type == null) return 0;
        switch (type) {
            case "2 wheeler": return 90;
            case "3 wheeler": return 100;
            case "4 wheeler": return 150;
            case "6 wheeler": return 200;
            case "10 wheeler": return 300;
            case "14 wheeler": return 400;
            case "18 wheeler": return 500;
            case "22 wheeler": return 800;
            case "26 wheeler": return 1000;
            default: return 0;
        }
    }
    @javafx.fxml.FXML
    public void canculateTotalOA(ActionEvent actionEvent) {
        try {
            String type = VehicleTypeCB.getValue();
            int rate = Integer.parseInt(ratePerVehicleField.getText());
            int number = Integer.parseInt(noOfVehicleTF.getText());
            int total = rate * number;
            String date = todaysDateDP.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            TollData entry = new TollData(type, rate, total, date);
            tollList.add(entry);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }








    @javafx.fxml.FXML
    public void SaveOA(ActionEvent actionEvent) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("toll_data.bin"))) {
            out.writeObject(new java.util.ArrayList<>(tollList));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/Dashboard_TCO.fxml");
    }
}