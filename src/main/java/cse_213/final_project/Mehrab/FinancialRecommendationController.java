package cse_213.final_project.Mehrab;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class FinancialRecommendationController
{
    @javafx.fxml.FXML
    private TextField recommendationTitleField;
    @javafx.fxml.FXML
    private DatePicker projectTimelineDatePicker;
    @javafx.fxml.FXML
    private ComboBox recommendationTypeComboBox;
    @javafx.fxml.FXML
    private TextField budgetAllocationField;
    @javafx.fxml.FXML
    private Label errorMessage;
    @javafx.fxml.FXML
    private TextArea recommendationDescriptionField;
    @javafx.fxml.FXML
    private TextArea recommendationDataArea;
    @javafx.fxml.FXML
    private TextField financialAmountField;
    @javafx.fxml.FXML
    private DatePicker recommendationDatePicker;
    @javafx.fxml.FXML
    private Button sendRecommendationButton;
    @javafx.fxml.FXML
    private Label confirmationMessage;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSendRecommendation(ActionEvent actionEvent) {
    }
}