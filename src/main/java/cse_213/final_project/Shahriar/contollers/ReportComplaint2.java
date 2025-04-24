package cse_213.final_project.Shahriar.contollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

import java.io.File;


public class ReportComplaint2 {

    @FXML
    private TextArea TextAreafxid;

    @FXML
    private ComboBox<String> IssuTypecombobox;

    @FXML
    private Label ReportComPlaintFxid;

    @FXML
    private Label Filemessagefxid;

    private File uploadedFile;

    @FXML
    public void initialize() {
        // Populate issue types
        IssuTypecombobox.getItems().addAll(
                "Incorrect Toll Charge",
                "E-Tag Not Working",
                "Lane Barrier Issue",
                "Other"
        );
    }

    @FXML
    public void SubmitedOnAction(ActionEvent actionEvent) {
        String issueType = IssuTypecombobox.getValue();
        String description = TextAreafxid.getText();

        if (issueType == null || issueType.isEmpty()) {
            ReportComPlaintFxid.setText("Please select an issue type.");
            return;
        }

        if (description.isEmpty()) {
            ReportComPlaintFxid.setText("Please describe the issue.");
            return;
        }

        // Simulate saving complaint
        String complaintSummary = "Issue: " + issueType + "\nDetails: " + description;
        if (uploadedFile != null) {
            complaintSummary += "\nAttachment: " + uploadedFile.getName();
        }

        // Log to console or file — replace with actual persistence
        System.out.println("Complaint Submitted:\n" + complaintSummary);

        ReportComPlaintFxid.setText("Complaint submitted successfully!");
        TextAreafxid.clear();
        IssuTypecombobox.setValue(null);
        uploadedFile = null;
        Filemessagefxid.setText("");
    }

    @FXML
    public void UploadOnaction(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Upload Related File");
        uploadedFile = fileChooser.showOpenDialog(null);

        if (uploadedFile != null) {
            Filemessagefxid.setText("File uploaded: " + uploadedFile.getName());
        } else {
            Filemessagefxid.setText("No file selected.");
        }
    }

    @FXML
    public void backOnaction(ActionEvent actionEvent) {
        // Logic to go back to the main dashboard or previous screen
    }
}