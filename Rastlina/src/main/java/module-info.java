module com.example.demo7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.Rastlina to javafx.fxml;
    exports com.example.Rastlina;
}