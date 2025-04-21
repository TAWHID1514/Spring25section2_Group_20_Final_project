package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import cse_213.final_project.Tawhid.FlaggedCar;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;

public class G1HandleSecurity
{
    @javafx.fxml.FXML
    private TableView<FlaggedCar> tableView;
    @javafx.fxml.FXML
    private TableColumn<FlaggedCar, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TextField searchField;
    @javafx.fxml.FXML
    private TableColumn<FlaggedCar, String> reasonCol;
    @javafx.fxml.FXML
    private TextField fineAmountField;
    @javafx.fxml.FXML
    private TableColumn<FlaggedCar, String> licenceNoCol;
    @javafx.fxml.FXML
    private DatePicker fineDueDatePicker;
    @javafx.fxml.FXML
    private TableColumn<FlaggedCar, String> regNoCol;
    private ObservableList<FlaggedCar> flaggedCars = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {
        regNoCol.setCellValueFactory(new PropertyValueFactory<>("regNo"));
        reasonCol.setCellValueFactory(cellData -> new SimpleStringProperty(String.join(", ", cellData.getValue().getReasons())));
        licenceNoCol.setCellValueFactory(new PropertyValueFactory<>("licenceNo"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("flaggedDate"));

        loadFlaggedCars();
        tableView.setItems(flaggedCars);
    }

    private void readFlaggedCars() {
        try (ObjectInputStream inputStream= new ObjectInputStream(new FileInputStream("flagged_cars.bin"))) {
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void loadFlaggedCars() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("flagged_cars.bin"))) {
            while (true) {
                try {
                    FlaggedCar car = (FlaggedCar) ois.readObject();
                    flaggedCars.add(car);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void SecurityIncidentOA(ActionEvent actionEvent) {
        FlaggedCar selected = tableView.getSelectionModel().getSelectedItem();
        if (selected == null) return;

        try {
            double fine = Double.parseDouble(fineAmountField.getText());
            LocalDate dueDate = fineDueDatePicker.getValue();

            selected.setFineAmount(fine);
            selected.setFineDueDate(dueDate);

            try (ObjectOutputStream oos = new AppendableObjectOutputStream(new FileOutputStream("fined_cars.bin", true))) {
                oos.writeObject(selected);
                System.out.println("Fine saved.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void searchOA(ActionEvent actionEvent) {
        String query = searchField.getText().trim().toLowerCase();
        if (query.isEmpty()) {
            tableView.setItems(flaggedCars);
            return;
        }

        ObservableList<FlaggedCar> filtered = FXCollections.observableArrayList();
        for (FlaggedCar car : flaggedCars) {
            if (car.getRegNo().toLowerCase().contains(query)) {
                filtered.add(car);
            }
        }
        tableView.setItems(filtered);
    }

    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/PoliceAuthurity/Dashboard_PA.fxml");
    }

    @javafx.fxml.FXML
    public void loadOA(ActionEvent actionEvent) throws FileNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("fined_cars.bin"))) {
            flaggedCars.clear();
            tableView.getItems().clear();
    } catch (IOException e) {
            e.printStackTrace();;
        }}
     static class AppendableObjectOutputStream extends ObjectOutputStream {
        public AppendableObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }
        @Override
        protected void writeStreamHeader() throws IOException {
            reset();
}}}

