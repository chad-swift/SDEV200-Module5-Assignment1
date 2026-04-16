module org.example.sdev200module5assignment1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.sdev200module5assignment1 to javafx.fxml;
    exports org.example.sdev200module5assignment1;
}