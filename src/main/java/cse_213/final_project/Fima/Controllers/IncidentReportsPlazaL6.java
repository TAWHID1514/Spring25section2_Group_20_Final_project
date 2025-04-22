package cse_213.final_project.Fima.Controllers;

import cse_213.final_project.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class IncidentReportsPlazaL6 {

    @FXML
    private ComboBox<String> BoothNumbercombobox;

    @FXML
    private TableColumn<String, IncidentReportsPlazaL6> BoothNumbertablecolumn;

    @FXML
    private TableColumn<String, IncidentReportsPlazaL6> IncidentDetailstablecolumn;

    @FXML
    private TextArea IncidentDetailstextarea;

    @FXML
    private DatePicker ReportDatedatepicker;

    @FXML
    private TableColumn<String, IncidentReportsPlazaL6> ReportDatetablecolumn;

    @FXML
    private TableColumn<String, IncidentReportsPlazaL6> ReportTimetablecolumn;

    @FXML
    private TextField reporttimetextfield;

    @FXML
    private TableView<IncidentReportsPlazaL6> showdatatableview;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void Submitonactionbutton(ActionEvent event) {


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

}
