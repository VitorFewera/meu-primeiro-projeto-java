module com.example.functioninterfaceexamples {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.functioninterfaceexamples to javafx.fxml;
    exports com.example.functioninterfaceexamples;
}