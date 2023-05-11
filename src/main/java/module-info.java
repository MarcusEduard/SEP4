module com.example.sep4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sep4 to javafx.fxml;
    exports com.example.sep4;
}