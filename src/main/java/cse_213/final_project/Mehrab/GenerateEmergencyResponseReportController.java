package cse_213.final_project.Mehrab;

public class GenerateEmergencyResponseReportController
{
    @javafx.fxml.FXML
    private PieChart incidentPieChart;
    @javafx.fxml.FXML
    private NumberAxis yAxis;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private CategoryAxis xAxis;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private Label errorMessage;
    @javafx.fxml.FXML
    private ComboBox incidentTypeComboBox;
    @javafx.fxml.FXML
    private Button generateReportButton;
    @javafx.fxml.FXML
    private BarChart responseBarChart;
    @javafx.fxml.FXML
    private TextArea responseDataArea;
    @javafx.fxml.FXML
    private Label confirmationMessage;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleGenerateReport(ActionEvent actionEvent) {
    }
}