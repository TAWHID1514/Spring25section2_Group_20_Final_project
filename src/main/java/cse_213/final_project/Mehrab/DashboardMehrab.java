package cse_213.final_project.Mehrab;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class DashboardMehrab
{
    @javafx.fxml.FXML
    private BorderPane dashboardBP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void signOutOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene("login.fxml",actionEvent, "DashBoard");

    }

    @javafx.fxml.FXML
    public void manageTollOnClick(ActionEvent actionEvent)throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("manageToll.fxml"));
    Node node = fxmlLoader.load() ;
    dashboardBP.setCenter(node);
}

    @javafx.fxml.FXML
    public void prepareSalariesOnClick (ActionEvent actionEvent)throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PrepareSalaries.fxml"));
    Node node = fxmlLoader.load() ;
    dashboardBP.setCenter(node);
}

    @javafx.fxml.FXML
    public void financialRecommendationOnClick (ActionEvent actionEvent)throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sendrecomdation.fxml"));
    Node node = fxmlLoader.load() ;
    dashboardBP.setCenter(node);
}

    @javafx.fxml.FXML
    public void monthlyRevenueOnClick (ActionEvent actionEvent)throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("monthlySummary.fxml"));
    Node node = fxmlLoader.load() ;
    dashboardBP.setCenter(node);
}

    @javafx.fxml.FXML
    public void OverviewOA(ActionEvent actionEvent)throws IOException {
}

    @javafx.fxml.FXML
    public void dailyRevenueOnClick(ActionEvent actionEvent)throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DailyRevenue.fxml"));
    Node node = fxmlLoader.load() ;
    dashboardBP.setCenter(node);
}

    @javafx.fxml.FXML
    public void generateReportAnalysisOA(ActionEvent actionEvent)throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Generate Revenue Report.fxml"));
    Node node = fxmlLoader.load() ;
    dashboardBP.setCenter(node);
}

    @javafx.fxml.FXML
    public void paytaxOA(ActionEvent actionEvent)throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Pay TAx.fxml"));
    Node node = fxmlLoader.load() ;
    dashboardBP.setCenter(node);
}
}