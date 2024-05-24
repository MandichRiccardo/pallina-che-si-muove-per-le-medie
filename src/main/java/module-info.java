module com.example.pallinachesimuoveperlemedie {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pallinachesimuoveperlemedie to javafx.fxml;
    exports com.example.pallinachesimuoveperlemedie;
}