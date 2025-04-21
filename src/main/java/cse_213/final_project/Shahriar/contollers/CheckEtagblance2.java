package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class CheckEtagblance2 {

    @FXML
    private TextField namefxid;
    @FXML
    private TextArea textareafxid;
    @FXML
    private TextField Etagfxid;
    @FXML
    private TextField Blancefxid;
    @FXML
    private Label checkEtagblancefxid;

    @FXML
    public void initialize() {
        Blancefxid.setEditable(false);
        namefxid.setEditable(false);
        textareafxid.setEditable(false);
    }

    @FXML
    public void checkBlancebuttonOnaction(ActionEvent actionEvent) {
        String etag = Etagfxid.getText().trim();

        if (etag.isEmpty()) {
            checkEtagblancefxid.setText("Please enter E-Tag ID.");
            return;
        }

        // Dummy/mock data for simulation — you can replace this with a file or DB lookup
        if (etag.equals("ET12345")) {
            namefxid.setText("Tawhid Bin Moslim");
            Blancefxid.setText("500.00 BDT");
            textareafxid.setText("Active account. Last top-up: 15 April 2025.");
            checkEtagblancefxid.setText("E-Tag Balance Retrieved.");
        } else {
            namefxid.clear();
            Blancefxid.clear();
            textareafxid.clear();
            checkEtagblancefxid.setText("E-Tag not found.");
        }
    }

    @FXML
    public void backOnaction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/vehicle_owner_dashboard.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}