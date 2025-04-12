package cse_213.final_project.Tawhid.Controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class UnpaidtollListController
{

    @javafx.fxml.FXML
    private TableColumn tollUnpaidVehicleTypeCol;
    @javafx.fxml.FXML
    private TableColumn tollUnpaidVehicleRegNoCol;
    @javafx.fxml.FXML
    private TableView tollUnpaidTableView;
    @javafx.fxml.FXML
    private TableColumn unpaidtollAmountCol;
    @javafx.fxml.FXML
    private TableColumn tollUnpaidDateCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backtounpaidTollInfoOA(ActionEvent actionEvent) {
    }

    public static class VIPmovement
    {
        @javafx.fxml.FXML
        private ComboBox vehicleTypeCB;
        @javafx.fxml.FXML
        private TextField VIP_EmergencyTF;

        @javafx.fxml.FXML
        public void initialize() {
        }

        @javafx.fxml.FXML
        public void OpenLaneOA(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void closeLaneOA(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void lane_4OA(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void lane_3OA(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void lane_2OA(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void lane_1OA(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void lane_6OA(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void lane_5OA(ActionEvent actionEvent) {
        }
    }
}