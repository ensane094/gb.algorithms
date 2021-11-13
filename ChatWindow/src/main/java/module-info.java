module com.example.chatwindow {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatwindow to javafx.fxml;
    exports com.example.chatwindow;
}