module com.example.cabjavafxproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cabjavafxproject to javafx.fxml;
    exports com.example.cabjavafxproject;
}