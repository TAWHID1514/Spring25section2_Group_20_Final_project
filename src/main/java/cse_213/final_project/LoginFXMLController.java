package cse_213.final_project;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LoginFXMLController
{
//    public static List<User> userList = new ArrayList<>();

    static {

//        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("data/user.bin"))) {
//            userList.clear();
//            List< User > loadedList = (List<User>) inputStream.readObject();
//            userList.addAll(loadedList);
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
    @javafx.fxml.FXML
    private TextField userIDtf;
    @javafx.fxml.FXML
    private PasswordField passwordTF;
    @javafx.fxml.FXML
    private Label errormassageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> UsertypeCB;


    @javafx.fxml.FXML
    public void initialize() {
        UsertypeCB.getItems().addAll("Toll Plaza Administrator", "Vehicle Owner", "Police Authority",
                "Traffic control officer", "Liaison Officer", "Toll booth operator",
                "Finance Officer", "Emergency response Officer");
    }

    @javafx.fxml.FXML
    public void loginOA(ActionEvent actionEvent) throws IOException {
        String UserType = UsertypeCB.getValue();
        String userID = userIDtf.getText();
        String password = passwordTF.getText();
        if (UserType==null||UserType.isEmpty()){
            errormassageLabel.setText("Select user Type");
        }
        if ((UsertypeCB.getValue().equals("Traffic control officer"))){
            SceneSwitcher.switchTo("Tawhid/TrafficControlOfficer/Dashboard_TCO.fxml");
        }
        if ((UsertypeCB.getValue().equals("Police Authority"))){
            SceneSwitcher.switchTo("Tawhid/PoliceAuthurity/Dashboard_PA.fxml");
        }




    }

    @javafx.fxml.FXML
    public void addEmployeeOA(ActionEvent actionEvent) throws IOException {

    }
}