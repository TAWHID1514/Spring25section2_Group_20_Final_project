package cse_213.final_project.Fima.Controllers;

import cse_213.final_project.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class DailyShiftReports {

    @FXML
    private TableColumn<String, DailyShiftReports> BoothIDtablecolumn;

    @FXML
    private TextField BoothIDtextfield;

    @FXML
    private TableColumn<String, DailyShiftReports> Issuetablecolumn;

    @FXML
    private TableColumn<String, DailyShiftReports> TollOperatortablecolumn;

    @FXML
    private TextField TollOperatortextfield;

    @FXML
    private TableColumn<String, DailyShiftReports> VehicleCounttablecolumn;

    @FXML
    private TextArea describeissuetextarea;

    @FXML
    private TableView<DailyShiftReports> showdatatableview;

    @FXML
    private TextField vehiclecounttextfield;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void homeonactionbutton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LiaisonOfficer_Dashboard_V2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setTitle("Hello");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void submitonactionbutton(ActionEvent event) {

    }

}
