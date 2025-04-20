package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import cse_213.final_project.Tawhid.FlaggedCar;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class G_7_FlagVehicle {
    @javafx.fxml.FXML
    private CheckBox overSpeedingCheckBox;
    @javafx.fxml.FXML
    private CheckBox illegalParkingCheckBox;
    @javafx.fxml.FXML
    private CheckBox licenceExpiredCheckBox;
    @javafx.fxml.FXML
    private CheckBox stolenCarCheckBox;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextField regNoField;
    @javafx.fxml.FXML
    private TextField licenceNoField;

    @javafx.fxml.FXML
    public void initialize() {
        datePicker.setValue(LocalDate.now());
    }

    @javafx.fxml.FXML
    public void flagCarOA(ActionEvent actionEvent) {
        String regNo = regNoField.getText().trim();
        String licenceNo = licenceNoField.getText().trim();
        LocalDate date = datePicker.getValue();

        List<String> reasons = new ArrayList<>();
        if (stolenCarCheckBox.isSelected()) reasons.add("Stolen Car");
        if (overSpeedingCheckBox.isSelected()) reasons.add("Over Speeding");
        if (illegalParkingCheckBox.isSelected()) reasons.add("Illegal Parking");
        if (licenceExpiredCheckBox.isSelected()) reasons.add("Licence Expired");

        if (regNo.isEmpty() || reasons.isEmpty()) {
            System.out.println("RegNo and reasons are required!");
            return;
        }

        FlaggedCar flaggedCar = new FlaggedCar(regNo, reasons,licenceNo, date);

        try (ObjectOutputStream oos = new AppendableObjectOutputStream(new FileOutputStream("flagged_cars.bin", true))) {
            oos.writeObject(flaggedCar);
            System.out.println("Car flagged successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static class AppendableObjectOutputStream extends ObjectOutputStream {
        public AppendableObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }

        @Override
        protected void writeStreamHeader() throws IOException {
            reset();
        }
    }


    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/Dashboard_TCO.fxml");
    }

}