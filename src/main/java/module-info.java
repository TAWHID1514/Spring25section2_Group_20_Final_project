module cse_213.final_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens cse_213.final_project to javafx.fxml;
    exports cse_213.final_project;

    opens cse_213.final_project.Tawhid.Controllers to javafx.fxml;
    opens cse_213.final_project.Tawhid.TrafficControlOfficer to javafx.fxml;
    opens cse_213.final_project.Tawhid.PoliceAuthurity to javafx.fxml;
    exports cse_213.final_project.Tawhid.Controllers;
    opens cse_213.final_project.Tawhid to javafx.fxml;
}
