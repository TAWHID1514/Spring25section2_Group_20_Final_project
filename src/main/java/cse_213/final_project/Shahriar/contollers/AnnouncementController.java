package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

import java.awt.*;

public class AnnouncementController
{
    @javafx.fxml.FXML
    private TableColumn audiencecolum;
    @javafx.fxml.FXML
    private TextArea areamessage;
    @javafx.fxml.FXML
    private TableColumn titlecolum;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TableColumn datecolum;
    @javafx.fxml.FXML
    private TextField titlefxid;
    @javafx.fxml.FXML
    private ComboBox audiencecombobox;
    @javafx.fxml.FXML
    private Label AnnounceementControllerfxid;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSendOnaction(ActionEvent actionEvent) {
    }
}