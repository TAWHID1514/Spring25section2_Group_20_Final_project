package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import cse_213.final_project.Tawhid.laneManagement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class G_6_LaneManageController
{
    @javafx.fxml.FXML
    private TableColumn<laneManagement,String> LaneoneCOL;
    @javafx.fxml.FXML
    private TableColumn<laneManagement,String> LanetwoCOL;
    @javafx.fxml.FXML
    private TableColumn<laneManagement,String> LanethreeCOL;
    @javafx.fxml.FXML
    private TableColumn<laneManagement,String> LanetfourCOL;
    @javafx.fxml.FXML
    private TableColumn<laneManagement,String> laneFiveCol;
    @javafx.fxml.FXML
    private TableColumn<laneManagement,String> laneSixCOL;
    @javafx.fxml.FXML
    private TableView<laneManagement> alortedTV;
    @javafx.fxml.FXML
    private ComboBox<String> Lane5CB;
    @javafx.fxml.FXML
    private ComboBox<String>  Lane6CB;
    @javafx.fxml.FXML
    private ComboBox<String>  Lane1CB;
    @javafx.fxml.FXML
    private ComboBox<String>  Lane2CB;
    @javafx.fxml.FXML
    private ComboBox<String>  Lane3CB;
    @javafx.fxml.FXML
    private ComboBox<String>  Lane4CB;

    private final ObservableList<laneManagement> laneDataList = FXCollections.observableArrayList();
    private final ObservableList<String> vehicleOptions = FXCollections.observableArrayList("Bus", "Truck", "Car", "Cng", "Bike", "close");

    @javafx.fxml.FXML
    public void initialize() {
        Lane1CB.setItems(vehicleOptions);
        Lane2CB.setItems(vehicleOptions);
        Lane3CB.setItems(vehicleOptions);
        Lane4CB.setItems(vehicleOptions);
        Lane5CB.setItems(vehicleOptions);
        Lane6CB.setItems(vehicleOptions);

        LaneoneCOL.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getLane1()));
        LanetwoCOL.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getLane2()));
        LanethreeCOL.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getLane3()));
        LanetfourCOL.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getLane4()));
        laneFiveCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getLane5()));
        laneSixCOL.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getLane6()));
        alortedTV.setItems(laneDataList);
    }


    @javafx.fxml.FXML
    public void AllowRouteOA(ActionEvent actionEvent) {
        String lane1 = Lane1CB.getValue();
        String lane2 = Lane2CB.getValue();
        String lane3 = Lane3CB.getValue();
        String lane4 = Lane4CB.getValue();
        String lane5 = Lane5CB.getValue();
        String lane6 = Lane6CB.getValue();

        if (lane1 == null || lane2 == null || lane3 == null || lane4 == null || lane5 == null || lane6 == null) {
            return;
        }

        laneManagement laneData = new laneManagement(lane1, lane2, lane3, lane4, lane5, lane6);
        laneDataList.add(laneData);


    }

    @javafx.fxml.FXML
    public void SaveOA(ActionEvent actionEvent) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lanedata.bin"))) {
            List<laneManagement> dataToSave = alortedTV.getItems();
            oos.writeObject(dataToSave);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/Dashboard_TCO.fxml");
    }

    @javafx.fxml.FXML
    public void deleteFromListOA(ActionEvent actionEvent) {
        laneManagement selected = alortedTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            laneDataList.remove(selected);
    }
}
}