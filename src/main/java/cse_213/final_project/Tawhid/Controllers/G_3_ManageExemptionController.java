package cse_213.final_project.Tawhid.Controllers;
import cse_213.final_project.SceneSwitcher;
import cse_213.final_project.Tawhid.Exemption;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.*;
import java.time.LocalDate;

public class G_3_ManageExemptionController
{
    @javafx.fxml.FXML
    private TextField manageExemptionReasonTF;
    @javafx.fxml.FXML
    private Label errorlabelmanageExemption;
    @javafx.fxml.FXML
    private TextField manageExemptionVehiRegNoTF;
    @javafx.fxml.FXML
    private TextField manageExemptionDrivingLicenceTF;
    @javafx.fxml.FXML
    private DatePicker manageExemptionTravelDP;
    @javafx.fxml.FXML
    private Label regNoValidationmassagelabelManageEXMP;
    @javafx.fxml.FXML
    private RadioButton vipRadio;
    @javafx.fxml.FXML
    private RadioButton ambulanceRadio;
    @javafx.fxml.FXML
    private RadioButton govtCarRadio;
    @javafx.fxml.FXML
    private ToggleGroup exemption;
    @javafx.fxml.FXML
    private RadioButton govtOfficerRadio;
    @javafx.fxml.FXML
    private RadioButton fireServiceRadio;

    @javafx.fxml.FXML
    public void initialize() {
        manageExemptionTravelDP.setValue(LocalDate.now());
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/Dashboard_TCO.fxml");
    }



    @javafx.fxml.FXML
    public void ExemptionOA(ActionEvent actionEvent) {
        String vehicleType = getSelectedVehicleType();
        String licenceNo = manageExemptionDrivingLicenceTF.getText().trim();
        String regNo = manageExemptionVehiRegNoTF.getText().trim();
        String reason = manageExemptionReasonTF.getText().trim();
        LocalDate date = manageExemptionTravelDP.getValue();
    }
    private String getSelectedVehicleType() {
        if (govtCarRadio.isSelected()) return "Govt Car";
        if (vipRadio.isSelected()) return "VIP";
        if (ambulanceRadio.isSelected()) return "Ambulance";
        if (fireServiceRadio.isSelected()) return "Fire Service";
        if (govtOfficerRadio.isSelected()) return "Govt. Officer";
        return "";
    }
//    private void saveToBinary(Exemption exemption) {
//        try {
//            File file = new File("exemptions.bin");
//            boolean append = file.exists() && file.length() > 0;
//
//            ObjectOutputStream oos = append ?
//                    new AppendableObjectOutputStream(new FileOutputStream(file, true)) :
//                    new ObjectOutputStream(new FileOutputStream(file, true));
//
//            oos.writeObject(exemption);
//            oos.close();
//        } catch (IOException e) {
//            regNoValidationmassagelabelManageEXMP.setText("Successfully saved"+ e.getMessage());
//        }
//    }
//
//    private void saveToText(Exemption exemption) {
//        try (FileWriter writer = new FileWriter("exemptions.txt", true)) {
//            writer.write(exemption.toString() + "\n");
//            writer.write("---------------------------------\n");
//        } catch (IOException e) {
//            regNoValidationmassagelabelManageEXMP.setText("Failed to save text file: " + e.getMessage());
//        }
//    }
//
//    private void clearForm() {
//        // Clear radio buttons
//        govtCarRadio.setSelected(false);
//        vipRadio.setSelected(false);
//        ambulanceRadio.setSelected(false);
//        fireServiceRadio.setSelected(false);
//        govtOfficerRadio.setSelected(false);
//
//        // Clear other fields
//        manageExemptionDrivingLicenceTF.clear();
//        manageExemptionVehiRegNoTF.clear();
//        manageExemptionReasonTF.clear();
//        manageExemptionTravelDP.setValue(LocalDate.now());
//    }
//
//
//    // Required for appending to binary file
//    private static class AppendableObjectOutputStream extends ObjectOutputStream {
//        public AppendableObjectOutputStream(OutputStream out) throws IOException {
//            super(out);
//        }
//
//        @Override
//        protected void writeStreamHeader() throws IOException {
//            reset();
////    @javafx.fxml.FXML
////    public void backOA(ActionEvent actionEvent) throws IOException {
////        SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/Dashboard_TCO.fxml");
//    }
}
