package cse_213.final_project.Fima.Controllers;

import cse_213.final_project.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class CrisisResponseCoordinationL8 {

    @FXML
    private TextArea Situationdetailstextarea;

    @FXML
    private Label showmassagelable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void homeonactionbutton(ActionEvent actionEvent ) throws IOException {

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
