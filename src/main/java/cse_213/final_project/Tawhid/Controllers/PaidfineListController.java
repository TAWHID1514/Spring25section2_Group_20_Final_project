package cse_213.final_project.Tawhid.Controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PaidfineListController
{
    @javafx.fxml.FXML
    private TableColumn dateOfPayingFineCol;
    @javafx.fxml.FXML
    private TableColumn paidAmountCol;
    @javafx.fxml.FXML
    private TableColumn paidFineregNoCol;
    @javafx.fxml.FXML
    private TableColumn paidVehicleTpyeCol;
    @javafx.fxml.FXML
    private TableColumn paidFineStatusCol;
    @javafx.fxml.FXML
    private TableView paidFineTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void paidbackToUpdateViolationOA(ActionEvent actionEvent) {
    }
}