module cse_213.final_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse_213.final_project to javafx.fxml;
    exports cse_213.final_project;
    exports cse_213.final_project.Tawhid.Controllers;
    opens cse_213.final_project.Tawhid.Controllers to javafx.fxml;
}