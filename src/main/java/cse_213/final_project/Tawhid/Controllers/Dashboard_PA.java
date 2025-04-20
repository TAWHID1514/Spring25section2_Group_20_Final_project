package cse_213.final_project.Tawhid.Controllers;

import cse_213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Dashboard_PA
{
    @javafx.fxml.FXML
    private AnchorPane PoliceAuthurityAP;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void DashboardOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/PoliceAuthurity/Dashboar_PA.fxml");
    }

    @javafx.fxml.FXML
    public void reportAccidentOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/PoliceAuthurity/G_6_InvastigateAccident.fxml");
    }

    @javafx.fxml.FXML
    public void SecurityThreadOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/PoliceAuthurity/G_1_HandleSecurity.fxml");
    }


    @javafx.fxml.FXML
    public void logOutOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("login.fxml");
    }

    @javafx.fxml.FXML
    public void unpaidtollStatusOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/PoliceAuthurity/G_4_unpaidtollList.fxml");
    }

    @javafx.fxml.FXML
    public void EnforceTafficeLawOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/PoliceAuthurity/G_5_EnforceTrafficLaw.fxml");
    }

    @javafx.fxml.FXML
    public void unpaidFineStatusOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/PoliceAuthurity/G_3_unpaidFollList.fxml");
    }

    @javafx.fxml.FXML
    public void FoundOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/PoliceAuthurity/G_8_Found.fxml");
    }

    @javafx.fxml.FXML
    public void fineVehicleOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/PoliceAuthurity/G_2_fineCar.fxml");
    }

    @javafx.fxml.FXML
    public void lostOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Tawhid/PoliceAuthurity/G_7_lost.fxml");
    }
}