package cse_213.final_project.Fima.Controllers;

import cse_213.final_project.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class InformationSupport {

    @FXML
    private ComboBox<String> VehicleTypecombobox;

    @FXML
    private ComboBox<String> Wheelcombobox;

    @FXML
    private Label showmassagelable1;

    @FXML
    private Label showmassagelable2;

    @FXML
    private TextField takatextfield;

    @FXML
    private TextField totalamounttextfield;

    @FXML
    private TextField vattextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void homeonactionbutton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TollBoothOperator_Dashboard_V1.fxml"));
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
