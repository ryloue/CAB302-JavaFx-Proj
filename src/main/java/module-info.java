module com.example.cabjavafxproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cabjavafxproject to javafx.fxml;
    exports com.example.cabjavafxproject;
    exports com.example.cabjavafxproject.controller;
    opens com.example.cabjavafxproject.controller to javafx.fxml;
    exports com.example.cabjavafxproject.model;
    opens com.example.cabjavafxproject.model to javafx.fxml;
}