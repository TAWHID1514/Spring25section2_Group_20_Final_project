package cse_213.final_project.Shahriar.contollers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;


public class ManageTollCollector {

    @FXML
    private Label manageTollCollectorfxid;
    @FXML
    private ComboBox<String> selectLanecombobox;
    @FXML
    private TextField collectorNamefxid;
    @FXML
    private TableColumn<Collector, String> selectlanecolum;
    @FXML
    private TableColumn<Collector, String> collectNamecolum;
    @FXML
    private ComboBox<String> selectRolecombobox;
    @FXML
    private TableColumn<Collector, String> selectRollcolum;
    @FXML
    private TableView<Collector> tableview;
    @FXML
    private TextField labelStatusfixid;

    private final ObservableList<Collector> collectorList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Populate combo boxes
        selectLanecombobox.setItems(FXCollections.observableArrayList("Lane 1", "Lane 2", "Lane 3", "Lane 4"));
        selectRolecombobox.setItems(FXCollections.observableArrayList("Supervisor", "Operator", "Assistant"));

        // Setup table columns
        collectNamecolum.setCellValueFactory(new PropertyValueFactory<>("name"));
        selectlanecolum.setCellValueFactory(new PropertyValueFactory<>("lane"));
        selectRollcolum.setCellValueFactory(new PropertyValueFactory<>("role"));

        tableview.setItems(collectorList);
    }

    @FXML
    public void addcollectorOnaction(ActionEvent actionEvent) {
        String name = collectorNamefxid.getText().trim();
        String lane = selectLanecombobox.getValue();
        String role = selectRolecombobox.getValue();

        if (name.isEmpty() || lane == null || role == null) {
            labelStatusfixid.setText("Fill in all fields to add a collector.");
            return;
        }

        Collector collector = new Collector() {
            @Override
            public Supplier supplier() {
                return null;
            }

            @Override
            public BiConsumer accumulator() {
                return null;
            }

            @Override
            public BinaryOperator combiner() {
                return null;
            }

            @Override
            public Function finisher() {
                return null;
            }

            @Override
            public Set<Characteristics> characteristics() {
                return Set.of();
            }
        };
        collectorList.add(collector);
        labelStatusfixid.setText("Collector added successfully.");


        selectLanecombobox.getSelectionModel().clearSelection();
        selectRolecombobox.getSelectionModel().clearSelection();
    }

    @FXML
    public void removeCollectorOnaction(ActionEvent actionEvent) {
        Collector selected = tableview.getSelectionModel().getSelectedItem();
        if (selected != null) {
            collectorList.remove(selected);
            labelStatusfixid.setText("Collector removed.");
        } else {
            labelStatusfixid.setText("Select a collector to remove.");
        }
    }

    @FXML
    public void backOnaction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/admin_dashboard.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

