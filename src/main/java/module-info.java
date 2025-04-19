module com.example.job {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.job to javafx.fxml;
    exports com.example.job;
}