module com.example.sudokusolver3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sudokusolver3 to javafx.fxml;
    exports com.example.sudokusolver3;
}